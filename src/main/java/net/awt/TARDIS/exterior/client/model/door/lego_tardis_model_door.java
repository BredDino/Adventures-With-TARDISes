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
public class lego_tardis_model_door extends DoorModel {
	private final ModelPart bone;
	private final ModelPart Hinges;
	private final ModelPart right_door;
	private final ModelPart left_door;
	public lego_tardis_model_door(ModelPart root) {
		this.bone = root.getChild("bone");
		this.Hinges = this.bone.getChild("Hinges");
		this.right_door = this.bone.getChild("right_door");
		this.left_door = this.bone.getChild("left_door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 24.0F, 5.0F));

		ModelPartData Hinges = bone.addChild("Hinges", ModelPartBuilder.create().uv(0, 125).cuboid(0.0F, 20.9F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 125).cuboid(0.0F, 20.9F, -15.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -22.0F, 2.0F));

		ModelPartData right_door = bone.addChild("right_door", ModelPartBuilder.create().uv(56, 36).cuboid(0.0F, -23.0F, 0.0F, 5.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 52).cuboid(5.0F, -23.0F, 2.0F, 2.0F, 23.0F, 5.0F, new Dilation(0.0F))
		.uv(70, 78).cuboid(4.0F, -23.0F, -1.0F, 3.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 0).cuboid(5.99F, -23.0F, 0.01F, 2.0F, 23.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 0.0F, -12.0F));

		ModelPartData left_door = bone.addChild("left_door", ModelPartBuilder.create().uv(42, 52).cuboid(5.0F, -23.0F, -7.0F, 2.0F, 23.0F, 5.0F, new Dilation(0.0F))
		.uv(54, 61).cuboid(0.0F, -23.0F, -2.01F, 6.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 80).cuboid(4.0F, -23.0F, -1.0F, 3.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 0).cuboid(6.0F, -23.0F, -3.0F, 2.0F, 23.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 0.0F, 2.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, DoorBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, float tickDelta) {
		if (!AITModClient.CONFIG.animateDoors) {
			DoorHandler door = doorEntity.tardis().get().door();
			left_door.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			right_door.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = -50.0F;
			left_door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			right_door.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
		}

		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0.0F, -1.5F, 0.0F);
		matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90.0F));
		super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, tickDelta);
		matrices.pop();
	}


	@Override
	public ModelPart getPart() {
		return bone;
	}
}