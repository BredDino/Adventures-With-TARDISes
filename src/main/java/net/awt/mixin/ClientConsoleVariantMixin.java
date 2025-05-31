package net.awt.mixin;

import dev.amble.ait.data.schema.console.ClientConsoleVariantSchema;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import dev.amble.ait.registry.impl.console.variant.ClientConsoleVariantRegistry;
import dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import net.awt.TARDIS.console.client.AWTClientConsoleVariantRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientConsoleVariantRegistry.class)
public abstract class ClientConsoleVariantMixin {

    @Inject(method = "onClientInit", at = @At("TAIL"), remap = false)
    private void defaults(CallbackInfo ci) {


    }

}