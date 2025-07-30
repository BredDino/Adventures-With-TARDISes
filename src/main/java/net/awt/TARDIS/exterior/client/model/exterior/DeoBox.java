package net.awt.TARDIS.exterior.client.model.exterior;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DeoBox extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart lantern;
	private final ModelPart wall;
	private final ModelPart posts2;
	private final ModelPart pcb;
	private final ModelPart doors;
	private final ModelPart L;
	private final ModelPart R;
	public DeoBox(ModelPart root) {
		this.bone = root.getChild("bone");
		this.lantern = this.bone.getChild("lantern");
		this.wall = this.bone.getChild("wall");
		this.posts2 = this.bone.getChild("posts2");
		this.pcb = this.bone.getChild("pcb");
		this.doors = this.bone.getChild("doors");
		this.L = this.doors.getChild("L");
		this.R = this.doors.getChild("R");
	}

	public DeoBox()  {
		this(getTexturedModelData().createModel());
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-14.0F, -2.0F, -14.0F, 28.0F, 2.0F, 28.0F, new Dilation(0.0F))
		.uv(0, 30).cuboid(-11.0F, -43.0F, -11.0F, 22.0F, 2.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 54).cuboid(-10.0F, -44.0F, -10.0F, 20.0F, 1.0F, 20.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData lantern = bone.addChild("lantern", ModelPartBuilder.create().uv(128, 45).cuboid(-2.0F, -45.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 59).cuboid(-1.0F, -50.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 50).cuboid(-2.0F, -49.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 54).cuboid(-1.0F, -48.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = lantern.addChild("cube_r1", ModelPartBuilder.create().uv(80, 54).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -46.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData wall = bone.addChild("wall", ModelPartBuilder.create().uv(0, 75).cuboid(9.0F, -41.0F, -9.0F, 1.0F, 39.0F, 18.0F, new Dilation(0.0F))
		.uv(38, 75).cuboid(-10.0F, -41.0F, -9.0F, 1.0F, 39.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 132).cuboid(10.0F, -38.0F, -1.0F, 1.0F, 36.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 132).cuboid(-11.0F, -38.0F, -1.0F, 1.0F, 36.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = wall.addChild("cube_r2", ModelPartBuilder.create().uv(12, 132).cuboid(-1.0F, -36.0F, -1.0F, 1.0F, 36.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData wall_r1 = wall.addChild("wall_r1", ModelPartBuilder.create().uv(112, 0).cuboid(-2.0F, -39.0F, -2.0F, 1.0F, 3.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -2.0F, -9.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData wall_r2 = wall.addChild("wall_r2", ModelPartBuilder.create().uv(76, 75).cuboid(-2.0F, -39.0F, -2.0F, 1.0F, 39.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -2.0F, 11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData posts2 = bone.addChild("posts2", ModelPartBuilder.create().uv(114, 117).cuboid(-23.0F, -39.0F, -2.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F))
		.uv(114, 75).cuboid(-2.0F, -39.0F, -2.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F))
		.uv(126, 75).cuboid(-2.0F, -39.0F, -23.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F))
		.uv(126, 117).cuboid(-23.0F, -39.0F, -23.0F, 3.0F, 39.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -2.0F, 11.0F));

		ModelPartData pcb = bone.addChild("pcb", ModelPartBuilder.create().uv(112, 21).cuboid(-10.0F, -41.0F, -13.0F, 20.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(128, 27).cuboid(-10.0F, -41.0F, 10.0F, 20.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = pcb.addChild("cube_r3", ModelPartBuilder.create().uv(128, 39).cuboid(-10.0F, -3.0F, -2.0F, 20.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = pcb.addChild("cube_r4", ModelPartBuilder.create().uv(128, 33).cuboid(-10.0F, -3.0F, -1.0F, 20.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -19.0F));

		ModelPartData L = doors.addChild("L", ModelPartBuilder.create().uv(1, 1).cuboid(6.0F, -25.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -2.0F, 10.0F));

		ModelPartData doorL_r1 = L.addChild("doorL_r1", ModelPartBuilder.create().uv(88, 30).cuboid(-2.0F, -36.0F, 7.0F, 1.0F, 36.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData R = doors.addChild("R", ModelPartBuilder.create().uv(1, 1).cuboid(-8.0F, -25.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -2.0F, 10.0F));

		ModelPartData cube_r5 = R.addChild("cube_r5", ModelPartBuilder.create().uv(18, 132).cuboid(-1.0F, -36.0F, -1.0F, 1.0F, 36.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData doorR_r1 = R.addChild("doorR_r1", ModelPartBuilder.create().uv(108, 30).cuboid(-2.0F, -36.0F, 0.0F, 1.0F, 36.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.push();
		matrices.scale(0f, 0f, 0f);
		matrices.pop();
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = exterior.tardis().get().door();

		if (!AITModClient.CONFIG.animateDoors) {
			this.doors.getChild("L").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.doors.getChild("R").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = -90f;
			this.doors.getChild("L").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.doors.getChild("R").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
		}

		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0, -1.5f, 0);
		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}

	@Override
	public net.minecraft.client.render.entity.animation.Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}
}