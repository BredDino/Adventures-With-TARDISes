package net.awt.mixin;

import dev.amble.ait.registry.impl.console.ConsoleRegistry;
import dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import net.awt.TARDIS.console.AWTConsoleRegistry;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.awt.TARDIS.console.types.TestType;
import net.awt.TARDIS.console.variants.TestVariant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry.registerStatic;

@Mixin(ConsoleRegistry.class)
public class ConsoleRegistryMixin {

    @Inject(method = "init", at = @At("HEAD"), remap = false)
    private static void defaults(CallbackInfo ci) {
        AWTConsoleRegistry.TEST = ConsoleRegistry.register(new TestType());

    }
}
