package net.awt.events;

import dev.amble.ait.core.item.sonic.SonicMode;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.awt.AdventuresWithTARDISes;
import net.awt.item.ModItems;
import net.awt.item.custom.sonicglasses.SonicGlasses;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

import java.util.Optional;

public class UseEvent implements UseBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity playerEntity, World world, Hand hand, BlockHitResult blockHitResult) {
        if (playerEntity.isSneaking() && SonicGlasses.hasEquipped(playerEntity, ModItems.SONIC_GLASSES) && playerEntity.getStackInHand(hand).isEmpty()) {
            ItemStack itemStack = getEquippedStack(playerEntity);
            if (itemStack.isOf(ModItems.SONIC_GLASSES)) {
                SonicGlasses.setMode(itemStack, SonicMode.Modes.next(SonicGlasses.mode(itemStack)));
                playerEntity.sendMessage(Text.literal(SonicGlasses.mode(itemStack).toString()));
            }
            playerEntity.sendMessage(Text.literal(itemStack.toString()));
        }
        playerEntity.sendMessage(Text.literal(playerEntity.getStackInHand(hand).toString()));
        AdventuresWithTARDISes.LOGGER.info("e");
        return ActionResult.PASS;
    }

    public static ItemStack getEquippedStack(PlayerEntity player) {
        Optional<TrinketComponent> trinketComponent = TrinketsApi.getTrinketComponent(player);

        if (trinketComponent.isPresent()) {
            return trinketComponent.get().getEntity().getEquippedStack(LivingEntity.getPreferredEquipmentSlot(new ItemStack(ModItems.SONIC_GLASSES)));
        }

        return ItemStack.EMPTY;
    }

}
