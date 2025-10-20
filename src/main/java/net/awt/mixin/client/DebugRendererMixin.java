package net.awt.mixin.client;

import net.awt.item.custom.sonicglasses.SonicGlassesModeRenderer;
import net.awt.item.custom.dbzscouter.DBZScouterModeRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.debug.DebugRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DebugRenderer.class)
public class DebugRendererMixin {

    @Inject(method = "render", at = @At("TAIL"))
    private void awt$renderWorld(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ, CallbackInfo ci) {
        SonicGlassesModeRenderer.getInstance().render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
        DBZScouterModeRenderer.getInstance().render(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
    }


}
