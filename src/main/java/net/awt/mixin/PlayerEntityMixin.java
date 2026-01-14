package net.awt.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.awt.item.spoon.Spoon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    /**
     * Intercepts damage to allow Spoon to block/reduce it.
     */
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        ItemStack stack = player.getActiveItem();

        if (!stack.isEmpty() && stack.getItem() instanceof Spoon && player.isUsingItem()) {
            float newDamage = Spoon.handleDamage(player, source, amount);

            if (newDamage <= 0f) {
                cir.setReturnValue(false); // fully blocked
            } else if (newDamage < amount) {
                player.setHealth(player.getHealth() - newDamage);
                cir.setReturnValue(true); // partial damage applied
            }
        }
    }
}
