package net.awt.mixin.client;

import dev.amble.ait.client.renderers.entities.ControlEntityRenderer;
import dev.amble.ait.core.entities.ConsoleControlEntity;
import dev.amble.ait.core.item.sonic.SonicMode;
import net.awt.components.ModComponents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ControlEntityRenderer.class)
public class ControlEntityRendererMixin {
    @Inject(method = "isPlayerLookingAtControlWithSonic", at = @At("HEAD"), remap = false, cancellable = true)
    private static void awt$isPlayerLookingAtControlWithSonic(HitResult hitResult, ConsoleControlEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (ModComponents.SONIC_GLASSES.maybeGet(MinecraftClient.getInstance().player).isPresent() && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).sonicMode == SonicMode.Modes.SCANNING && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).equipped && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).fuel > 0) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "isScanningSonicInConsole", at = @At("HEAD"), remap = false, cancellable = true)
    private static void awt$isScanningSonicInConsole(ConsoleControlEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (ModComponents.SONIC_GLASSES.maybeGet(MinecraftClient.getInstance().player).isPresent() && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).sonicMode == SonicMode.Modes.SCANNING && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).equipped && ModComponents.SONIC_GLASSES.get(MinecraftClient.getInstance().player).fuel > 0) {
            cir.setReturnValue(true);
        }
    }
}
