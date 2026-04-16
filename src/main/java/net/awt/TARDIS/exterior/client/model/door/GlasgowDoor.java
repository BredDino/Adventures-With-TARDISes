package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.DoorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GlasgowDoor extends DoorModel {
	private final ModelPart tardis;
	private final ModelPart right_door;
	private final ModelPart left_door;
	private final ModelPart roof;
	public GlasgowDoor(ModelPart root) {
		this.tardis = root.getChild("tardis");
		this.right_door = this.tardis.getChild("right_door");
		this.left_door = this.tardis.getChild("left_door");
		this.roof = this.tardis.getChild("roof");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData tardis = modelPartData.addChild("tardis", ModelPartBuilder.create().uv(0, 157).cuboid(-12.0F, -43.0F, -12.0F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 27.3F, 4.0F));

		ModelPartData cube_r1 = tardis.addChild("cube_r1", ModelPartBuilder.create().uv(12, 157).cuboid(-1.5F, -20.0F, -1.5F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.5F, -23.0F, -10.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData right_door = tardis.addChild("right_door", ModelPartBuilder.create(), ModelTransform.pivot(-9.0F, -4.0F, -10.0F));

		ModelPartData cube_r2 = right_door.addChild("cube_r2", ModelPartBuilder.create().uv(156, 148).cuboid(0.25F, -15.0F, -0.4F, 1.0F, 35.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(8.6F, -19.5F, -1.25F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r3 = right_door.addChild("cube_r3", ModelPartBuilder.create().uv(48, 157).cuboid(-11.2F, -17.5F, -0.5F, 0.0F, 35.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -17.0F, 10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData left_door = tardis.addChild("left_door", ModelPartBuilder.create().uv(154, 128).cuboid(-8.1F, -19.8F, -1.6F, 0.6F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(154, 128).cuboid(-8.1F, -16.8F, -1.6F, 0.6F, 0.0F, 0.6F, new Dilation(0.0F))
		.uv(154, 128).cuboid(-8.1F, -19.8F, -1.6F, 0.6F, 0.0F, 0.6F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -4.0F, -10.0F));

		ModelPartData cube_r4 = left_door.addChild("cube_r4", ModelPartBuilder.create().uv(156, 104).cuboid(0.25F, -34.0F, -0.4F, 1.0F, 35.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-0.4F, -0.5F, -1.25F, 0.0F, -1.5708F, 0.0F));

		ModelPartData roof = tardis.addChild("roof", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = roof.addChild("cube_r5", ModelPartBuilder.create().uv(108, 150).cuboid(-13.0F, -2.0F, -10.0F, 4.0F, 3.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -39.5F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
    @Override
    public void renderWithAnimations(ClientTardis tardis, DoorBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, float tickDelta) {
        if (!AITModClient.CONFIG.animateDoors) {
            DoorHandler door = doorEntity.tardis().get().door();
            left_door.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
            right_door.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
        } else {
            float maxRot = 85.0F;
            left_door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
            right_door.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
        }

        matrices.push();
        matrices.scale(1, 1, 1);
        matrices.translate(0.0F, -1.5F, 0.0F);
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180.0F));
        super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, tickDelta);
        matrices.pop();
    }

    @Override
    public ModelPart getPart() {
        return tardis;
    }
}