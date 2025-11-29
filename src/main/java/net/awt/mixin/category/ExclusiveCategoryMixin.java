package net.awt.mixin.category;

import dev.amble.ait.data.schema.exterior.category.ExclusiveCategory;
import net.awt.AWTDevTeam;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

@Mixin(ExclusiveCategory.class)
public class ExclusiveCategoryMixin {

    @Inject(method = "isUnlocked", at = @At("HEAD"), remap = false, cancellable = true)
    private static void isUnlocked(UUID uuid, CallbackInfoReturnable<Boolean> cir) {
        if (AWTDevTeam.isDev(uuid)) {
            cir.setReturnValue(AWTDevTeam.isDev(uuid));
            cir.cancel();
        }
    }
}
