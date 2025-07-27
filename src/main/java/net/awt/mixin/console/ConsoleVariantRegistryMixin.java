package net.awt.mixin.console;

import dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.awt.TARDIS.console.variants.BlockVariant;
import net.awt.TARDIS.console.variants.DiceVariant;
import net.awt.TARDIS.console.variants.JunkGlassVariant;
import net.awt.TARDIS.console.variants.TestVariant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry.registerStatic;

@Mixin(ConsoleVariantRegistry.class)
public class ConsoleVariantRegistryMixin {

    @Inject(method = "defaults", at = @At("HEAD"), remap = false)
    private void defaults(CallbackInfo ci) {
        AWTConsoleVariantRegistry.registerConsoleVariants();

    }
}
