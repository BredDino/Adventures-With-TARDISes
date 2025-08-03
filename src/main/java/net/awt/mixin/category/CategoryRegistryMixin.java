package net.awt.mixin.category;

import dev.amble.ait.registry.impl.CategoryRegistry;
import net.awt.TARDIS.exterior.category.AWTCategoryRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CategoryRegistry.class)
public class CategoryRegistryMixin {

    @Inject(method = "defaults", at = @At("TAIL"), remap = false)
    private void defaults(CallbackInfo ci) {
        AWTCategoryRegistry.defaults();
    }
}
