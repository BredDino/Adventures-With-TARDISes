package net.awt.item.custom.dbzscouter;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.amble.ait.client.models.exteriors.PoliceBoxModel;
import net.awt.entity.client.K9Model;
import net.awt.entity.client.K9Renderer;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;

public class DBZScouterModeRenderer {

    private final MinecraftClient client;

    public DBZScouterModeRenderer(MinecraftClient client) {
        this.client = client;
    }

    public void render(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ) {
        this.renderTardis(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
    }

    private void renderTardis(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ) {
        if (client.player != null) {
            matrices.push();
            matrices.translate(0,1,0);
            Entity entity = MinecraftClient.getInstance().getCameraEntity();
            HitResult blockHit = entity.raycast(5.0, 0.0F, false);

            if (blockHit.getType() == HitResult.Type.BLOCK) {
                BlockPos hitblock = ((BlockHitResult) blockHit).getBlockPos();
                BlockPos posOfTargetedBlock = ((BlockHitResult) blockHit).getBlockPos().up();


                BlockState state = MinecraftClient.getInstance().world.getBlockState(posOfTargetedBlock);
                BlockState state2 = MinecraftClient.getInstance().world.getBlockState(hitblock);

                if (state.canPathfindThrough(client.world, posOfTargetedBlock, NavigationType.LAND) && ! state2.canPathfindThrough(client.world, posOfTargetedBlock.down(), NavigationType.LAND)) {
                    matrices.translate(
                            posOfTargetedBlock.getX() + 0.5 - cameraX,
                            posOfTargetedBlock.getY() - cameraY,
                            posOfTargetedBlock.getZ() + 0.5 - cameraZ
                    );
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));
                    matrices.scale(0.75f, 0.75f, 0.75f);
                    RenderSystem.enableBlend();
                    //PoliceBoxModel.getTexturedModelData().createModel().render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucentCull(new Identifier("ait", "textures/blockentities/exteriors/police_box/police_box_default.png"))), 250, OverlayTexture.DEFAULT_UV, 0f,0.41f,0.92f, (float)Math.max (0.75f*Math.random(), 0.5f));

                    RenderSystem.disableBlend();

                }
            }

            matrices.pop();

        }
    }

    private static DBZScouterModeRenderer INSTANCE;

    public static DBZScouterModeRenderer getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DBZScouterModeRenderer(MinecraftClient.getInstance());

        return INSTANCE;
    }
}
