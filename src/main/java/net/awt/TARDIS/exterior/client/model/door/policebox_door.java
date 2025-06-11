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
public class policebox_door extends DoorModel {
	private final ModelPart bone;
	private final ModelPart doors;
	private final ModelPart leftdoor;
	private final ModelPart phone;
	private final ModelPart rightdoor;
	private final ModelPart PCB;
	private final ModelPart posts;
	public policebox_door(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doors = this.bone.getChild("doors");
		this.leftdoor = this.doors.getChild("leftdoor");
		this.phone = this.leftdoor.getChild("phone");
		this.rightdoor = this.doors.getChild("rightdoor");
		this.PCB = this.bone.getChild("PCB");
		this.posts = this.bone.getChild("posts");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 26.0F, 6.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftdoor = doors.addChild("leftdoor", ModelPartBuilder.create().uv(182, 170).cuboid(1.8571F, -0.7786F, -0.0524F, 10.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 234).cuboid(9.8571F, -8.7786F, -0.0524F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(190, 99).cuboid(10.8571F, -18.4786F, -0.6524F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 193).cuboid(11.8571F, -20.4786F, -0.9524F, 1.0F, 42.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 195).cuboid(0.8571F, -18.4786F, -0.6524F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(192, 144).cuboid(1.8571F, 19.5214F, -0.6524F, 11.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 230).cuboid(2.8571F, 9.5214F, -0.6524F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(2.8571F, -0.4786F, -0.6524F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 200).cuboid(2.8571F, -10.4786F, -0.6524F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 71).cuboid(0.8571F, -21.4786F, -0.6524F, 12.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 193).cuboid(0.8571F, -18.4786F, -0.6524F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 230).cuboid(0.8571F, 19.5214F, -0.6524F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(238, 248).cuboid(2.8571F, -18.4786F, 0.3476F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.3571F, -24.2214F, -12.7476F));

		ModelPartData cube_r1 = leftdoor.addChild("cube_r1", ModelPartBuilder.create().uv(110, 233).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -18.125F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = leftdoor.addChild("cube_r2", ModelPartBuilder.create().uv(136, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 174).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 239).cuboid(0.0F, 26.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.5042F, -14.4786F, -0.2981F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r3 = leftdoor.addChild("cube_r3", ModelPartBuilder.create().uv(232, 37).cuboid(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -14.4786F, 0.0548F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = leftdoor.addChild("cube_r4", ModelPartBuilder.create().uv(234, 168).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -10.8321F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r5 = leftdoor.addChild("cube_r5", ModelPartBuilder.create().uv(114, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.1571F, -14.4786F, 0.0547F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r6 = leftdoor.addChild("cube_r6", ModelPartBuilder.create().uv(110, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5571F, -14.4786F, 0.0547F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r7 = leftdoor.addChild("cube_r7", ModelPartBuilder.create().uv(22, 241).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 131).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 241).cuboid(-0.5F, 26.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.2106F, -14.4786F, -0.2988F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = leftdoor.addChild("cube_r8", ModelPartBuilder.create().uv(0, 233).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 1.875F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = leftdoor.addChild("cube_r9", ModelPartBuilder.create().uv(234, 167).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 9.1679F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = leftdoor.addChild("cube_r10", ModelPartBuilder.create().uv(232, 43).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 11.875F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = leftdoor.addChild("cube_r11", ModelPartBuilder.create().uv(234, 166).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 19.1679F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData phone = leftdoor.addChild("phone", ModelPartBuilder.create().uv(216, 160).cuboid(-4.7336F, -3.7967F, -1.0183F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(164, 210).cuboid(-3.7336F, -3.2967F, -1.2183F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(172, 23).cuboid(2.2664F, -0.0967F, -1.6182F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(180, 235).cuboid(-3.2336F, -2.7967F, -0.0183F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(152, 237).cuboid(-3.2336F, -0.7967F, 0.9817F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 241).cuboid(-0.5336F, -2.6967F, -0.1182F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.5906F, -4.6819F, 0.6659F));

		ModelPartData cube_r12 = phone.addChild("cube_r12", ModelPartBuilder.create().uv(156, 241).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5478F, -1.2967F, 1.2746F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r13 = phone.addChild("cube_r13", ModelPartBuilder.create().uv(242, 14).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.9478F, -1.2967F, 1.2746F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r14 = phone.addChild("cube_r14", ModelPartBuilder.create().uv(180, 241).cuboid(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.3359F, 0.2659F, 0.2817F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r15 = phone.addChild("cube_r15", ModelPartBuilder.create().uv(242, 10).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7664F, 2.6104F, -0.9112F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r16 = phone.addChild("cube_r16", ModelPartBuilder.create().uv(242, 8).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7664F, -0.8031F, -0.9104F, 0.7854F, 0.0F, 0.0F));

		ModelPartData rightdoor = doors.addChild("rightdoor", ModelPartBuilder.create().uv(104, 194).cuboid(-11.6563F, -17.5406F, -0.503F, 1.0F, 40.0F, 2.0F, new Dilation(0.0F))
		.uv(198, 59).cuboid(-11.6563F, -20.5406F, -0.503F, 11.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(199, 134).cuboid(-11.6563F, 20.4594F, -0.503F, 11.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(51, 110).cuboid(-11.6563F, -8.8406F, 0.097F, 11.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(190, 99).cuboid(-2.6563F, -17.5406F, -0.503F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 208).cuboid(-10.6563F, 0.4594F, -0.503F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 212).cuboid(-10.6563F, -9.5406F, -0.503F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 204).cuboid(-10.6563F, 10.4594F, -0.503F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 82).cuboid(-11.6563F, -3.8406F, -1.403F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 230).cuboid(-10.6563F, 20.4594F, -0.503F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(238, 248).cuboid(-10.6563F, -17.5406F, 0.497F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(12.1563F, -25.1594F, -12.897F));

		ModelPartData cube_r17 = rightdoor.addChild("cube_r17", ModelPartBuilder.create().uv(242, 2).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.1563F, -1.1335F, -0.6959F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r18 = rightdoor.addChild("cube_r18", ModelPartBuilder.create().uv(242, 0).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.1563F, -4.547F, -0.6952F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r19 = rightdoor.addChild("cube_r19", ModelPartBuilder.create().uv(240, 0).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 175).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(178, 239).cuboid(0.0F, -24.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(176, 239).cuboid(0.0F, -34.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0092F, 16.4594F, -0.1487F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r20 = rightdoor.addChild("cube_r20", ModelPartBuilder.create().uv(84, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 20.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r21 = rightdoor.addChild("cube_r21", ModelPartBuilder.create().uv(84, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 12.8129F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r22 = rightdoor.addChild("cube_r22", ModelPartBuilder.create().uv(196, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.9563F, -13.5406F, 0.2041F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r23 = rightdoor.addChild("cube_r23", ModelPartBuilder.create().uv(232, 39).cuboid(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -13.5406F, 0.2041F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = rightdoor.addChild("cube_r24", ModelPartBuilder.create().uv(200, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.3563F, -13.5406F, 0.2041F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r25 = rightdoor.addChild("cube_r25", ModelPartBuilder.create().uv(148, 241).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 9).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(146, 241).cuboid(-0.5F, -24.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 241).cuboid(-0.5F, -34.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-10.3028F, 16.4594F, -0.1494F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r26 = rightdoor.addChild("cube_r26", ModelPartBuilder.create().uv(44, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 10.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r27 = rightdoor.addChild("cube_r27", ModelPartBuilder.create().uv(46, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 2.8129F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r28 = rightdoor.addChild("cube_r28", ModelPartBuilder.create().uv(28, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 0.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r29 = rightdoor.addChild("cube_r29", ModelPartBuilder.create().uv(28, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -7.1871F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = rightdoor.addChild("cube_r30", ModelPartBuilder.create().uv(0, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -17.1871F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = rightdoor.addChild("cube_r31", ModelPartBuilder.create().uv(0, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -9.8942F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData PCB = bone.addChild("PCB", ModelPartBuilder.create().uv(156, 30).cuboid(-13.5F, -1.516F, -14.5F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2349F, -45.9227F, 0.2349F));

		ModelPartData posts = bone.addChild("posts", ModelPartBuilder.create(), ModelTransform.pivot(-0.2349F, -24.6145F, 0.2349F));

		ModelPartData cube_r32 = posts.addChild("cube_r32", ModelPartBuilder.create().uv(62, 154).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.6F, 0.0F, -12.6F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r33 = posts.addChild("cube_r33", ModelPartBuilder.create().uv(50, 154).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.6F, 0.0F, -12.6F, 0.0F, -1.5708F, 0.0F));
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
			leftdoor.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			rightdoor.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = -70.0F;
			leftdoor.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			rightdoor.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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