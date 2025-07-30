package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
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
public class DeoBoxDoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart wall;
	private final ModelPart posts2;
	private final ModelPart pcb;
	private final ModelPart doors;
	private final ModelPart L;
	private final ModelPart R;
	public DeoBoxDoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.wall = this.bone.getChild("wall");
		this.posts2 = this.bone.getChild("posts2");
		this.pcb = this.bone.getChild("pcb");
		this.doors = this.bone.getChild("doors");
		this.L = this.doors.getChild("L");
		this.R = this.doors.getChild("R");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 26.0F, 4.0F));

		ModelPartData wall = bone.addChild("wall", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData posts2 = bone.addChild("posts2", ModelPartBuilder.create().uv(126, 75).cuboid(-2.0F, -39.0F, -23.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F))
		.uv(126, 117).cuboid(-23.0F, -39.0F, -23.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -2.0F, 11.0F));

		ModelPartData pcb = bone.addChild("pcb", ModelPartBuilder.create().uv(112, 21).cuboid(-10.0F, -41.0F, -13.0F, 20.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -19.0F));

		ModelPartData L = doors.addChild("L", ModelPartBuilder.create().uv(1, 1).cuboid(6.0F, -25.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -2.0F, 10.0F));

		ModelPartData doorL_r1 = L.addChild("doorL_r1", ModelPartBuilder.create().uv(88, 30).cuboid(-2.0F, -36.0F, 7.0F, 1.0F, 36.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData R = doors.addChild("R", ModelPartBuilder.create().uv(1, 1).cuboid(-8.0F, -25.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -2.0F, 10.0F));

		ModelPartData cube_r1 = R.addChild("cube_r1", ModelPartBuilder.create().uv(18, 132).cuboid(-1.0F, -36.0F, -1.0F, 1.0F, 36.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData doorR_r1 = R.addChild("doorR_r1", ModelPartBuilder.create().uv(108, 30).cuboid(-2.0F, -36.0F, 0.0F, 1.0F, 36.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (!AITModClient.CONFIG.animateDoors) {
			DoorHandler door = doorEntity.tardis().get().door();
			L.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			R.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = -90.0F;
			L.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			R.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
		}

		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0.0F, -1.5F, 0.0F);
		matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180.0F));
		super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}