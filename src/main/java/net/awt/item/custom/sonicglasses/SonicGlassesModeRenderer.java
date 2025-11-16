package net.awt.item.custom.sonicglasses;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.models.exteriors.PoliceBoxModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.item.SonicItem;
import dev.amble.ait.core.item.sonic.SonicMode;
import dev.amble.ait.core.tardis.Tardis;
import net.awt.components.ModComponents;
import net.awt.entity.client.K9Model;
import net.awt.entity.client.K9Renderer;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
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

public class SonicGlassesModeRenderer {

    private final MinecraftClient client;

    public SonicGlassesModeRenderer(MinecraftClient client) {
        this.client = client;
    }

    public void render(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ) {
        this.renderTardis(matrices, vertexConsumers, cameraX, cameraY, cameraZ);
    }

    private void renderTardis(MatrixStack matrices, VertexConsumerProvider.Immediate vertexConsumers, double cameraX, double cameraY, double cameraZ) {
        if (client.player != null && ModComponents.SONIC_GLASSES.maybeGet(client.player).isPresent() && ModComponents.SONIC_GLASSES.get(client.player).sonicMode == SonicMode.Modes.TARDIS && ModComponents.SONIC_GLASSES.get(client.player).equipped && ModComponents.SONIC_GLASSES.get(client.player).fuel>0 ) {
            if (ModComponents.SONIC_GLASSES.get(client.player).equippedStack != null) {
                Tardis tardis = SonicItem.getTardisStatic(client.world, ModComponents.SONIC_GLASSES.get(client.player).equippedStack);
                if (tardis != null) {
                    ClientTardis clientTardis = tardis.asClient();
                    matrices.push();
                    matrices.translate(0, 1.125, 0);
                    Entity entity = MinecraftClient.getInstance().getCameraEntity();
                    HitResult blockHit = entity.raycast(5.0, 0.0F, false);

                    if (blockHit.getType() == net.minecraft.util.hit.HitResult.Type.BLOCK) {
                        BlockPos hitblock = ((BlockHitResult) blockHit).getBlockPos();
                        BlockPos posOfTargetedBlock = ((BlockHitResult) blockHit).getBlockPos().up();


                        BlockState state = MinecraftClient.getInstance().world.getBlockState(posOfTargetedBlock);
                        BlockState state2 = MinecraftClient.getInstance().world.getBlockState(hitblock);

                        if (state.canPathfindThrough(client.world, posOfTargetedBlock, NavigationType.LAND) && !state2.canPathfindThrough(client.world, posOfTargetedBlock.down(), NavigationType.LAND)) {
                            matrices.translate(
                                    posOfTargetedBlock.getX() + 0.5 - cameraX,
                                    posOfTargetedBlock.getY() - cameraY,
                                    posOfTargetedBlock.getZ() + 0.5 - cameraZ
                            );
                            float tickdelta = client.getTickDelta();
                            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));
                            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(client.player.age + tickdelta));
                            matrices.scale(0.75f, 0.75f, 0.75f);
                            boolean isCooling = ModComponents.SONIC_GLASSES.get(client.player).cooldown > 0;
                            RenderSystem.enableBlend();

                            ExteriorModel modelPart = tardis.getExterior().getVariant().getClient().model();
                            Identifier texture = tardis.getExterior().getVariant().getClient().texture();
                            modelPart.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucentCull(texture)), 250, OverlayTexture.DEFAULT_UV, isCooling ? 169 : 0f, isCooling ? 169 : 0.41f, isCooling ? 169 : 0.92f, (float) Math.max(0.5f * Math.random(), 0.4f));

                            RenderSystem.disableBlend();

                        }
                    }

                    matrices.pop();
                }
            }
        }
    }

    private static SonicGlassesModeRenderer INSTANCE;

    public static SonicGlassesModeRenderer getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SonicGlassesModeRenderer(MinecraftClient.getInstance());

        return INSTANCE;
    }
}
