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
public class VastBoxDoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart doors;
	private final ModelPart doorLeft;
	private final ModelPart phone;
	private final ModelPart phoneCable;
	private final ModelPart bone10;
	private final ModelPart bone3;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart doorRight;
	private final ModelPart bonewhatever;
	private final ModelPart bone9;
	private final ModelPart bone2;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart roof;
	private final ModelPart signs;
	private final ModelPart signnorth;
	private final ModelPart walls;
	private final ModelPart pillars;
	public VastBoxDoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doors = this.bone.getChild("doors");
		this.doorLeft = this.doors.getChild("doorLeft");
		this.phone = this.doorLeft.getChild("phone");
		this.phoneCable = this.phone.getChild("phoneCable");
		this.bone10 = this.doorLeft.getChild("bone10");
		this.bone3 = this.doorLeft.getChild("bone3");
		this.bone19 = this.doorLeft.getChild("bone19");
		this.bone20 = this.doorLeft.getChild("bone20");
		this.bone21 = this.doorLeft.getChild("bone21");
		this.doorRight = this.doors.getChild("doorRight");
		this.bonewhatever = this.doorRight.getChild("bonewhatever");
		this.bone9 = this.doorRight.getChild("bone9");
		this.bone2 = this.doorRight.getChild("bone2");
		this.bone17 = this.doorRight.getChild("bone17");
		this.bone18 = this.doorRight.getChild("bone18");
		this.roof = this.bone.getChild("roof");
		this.signs = this.roof.getChild("signs");
		this.signnorth = this.signs.getChild("signnorth");
		this.walls = this.bone.getChild("walls");
		this.pillars = this.walls.getChild("pillars");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(0.0F, -16.5F, -17.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.of(0.0F, 42.5F, -10.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData doorLeft = doors.addChild("doorLeft", ModelPartBuilder.create().uv(32, 190).cuboid(0.0F, -16.5F, 0.0F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 72).cuboid(6.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 70).cuboid(1.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 18).cuboid(2.0F, -6.5F, 0.25F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 119).cuboid(8.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -18.5F, 0.0F));

		ModelPartData phone = doorLeft.addChild("phone", ModelPartBuilder.create().uv(53, 198).cuboid(-1.0F, -6.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 194).cuboid(-0.5F, -6.5F, 0.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 198).cuboid(-1.0F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 191).cuboid(0.0F, -6.5F, -0.5F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 192).cuboid(0.0F, -5.5F, 0.75F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 1.0F));

		ModelPartData phoneCable = phone.addChild("phoneCable", ModelPartBuilder.create().uv(52, 200).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, new Dilation(0.001F)), ModelTransform.pivot(0.5F, -1.5F, 0.025F));

		ModelPartData bone10 = doorLeft.addChild("bone10", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, -0.15F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-3.0F, -3.65F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-3.0F, 0.35F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -11.85F, 0.5F));

		ModelPartData cube_r1 = bone10.addChild("cube_r1", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.65F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone10.addChild("cube_r2", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.35F, 0.2F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bone10.addChild("cube_r3", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.15F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone10.addChild("cube_r4", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = bone10.addChild("cube_r5", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -0.15F, 0.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = bone10.addChild("cube_r6", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r7 = bone10.addChild("cube_r7", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone3 = doorLeft.addChild("bone3", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, -0.15F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-3.0F, -3.65F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-3.0F, 0.35F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -11.85F, 0.5F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r8 = bone3.addChild("cube_r8", ModelPartBuilder.create().uv(18, 240).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.65F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = bone3.addChild("cube_r9", ModelPartBuilder.create().uv(18, 244).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.35F, 0.2F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = bone3.addChild("cube_r10", ModelPartBuilder.create().uv(18, 242).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.15F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = bone3.addChild("cube_r11", ModelPartBuilder.create().uv(22, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r12 = bone3.addChild("cube_r12", ModelPartBuilder.create().uv(18, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -0.15F, 0.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r13 = bone3.addChild("cube_r13", ModelPartBuilder.create().uv(30, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r14 = bone3.addChild("cube_r14", ModelPartBuilder.create().uv(26, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone19 = doorLeft.addChild("bone19", ModelPartBuilder.create().uv(6, 232).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 16.5F, 11.0F));

		ModelPartData bone20 = doorLeft.addChild("bone20", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 24.5F, 11.0F));

		ModelPartData bone21 = doorLeft.addChild("bone21", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 32.5F, 11.0F));

		ModelPartData doorRight = doors.addChild("doorRight", ModelPartBuilder.create().uv(12, 190).cuboid(-9.0F, -16.5F, 0.0F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(89, 50).cuboid(-5.0F, -5.0F, 0.25F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 29).cuboid(-8.0F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 29).cuboid(-8.0F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 119).cuboid(-9.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -18.5F, 0.0F));

		ModelPartData cube_r15 = doorRight.addChild("cube_r15", ModelPartBuilder.create().uv(84, 29).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.5F, -4.0F, 1.5F, 0.0F, 0.0F, -1.5708F));

		ModelPartData bonewhatever = doorRight.addChild("bonewhatever", ModelPartBuilder.create().uv(6, 239).cuboid(-3.0F, -3.5F, 0.0F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-3.0F, 3.5F, -0.5F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-3.0F, -3.5F, -0.5F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-3.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(3.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 0.5F));

		ModelPartData bone9 = doorRight.addChild("bone9", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -8.0F, -0.075F));

		ModelPartData cube_r16 = bone9.addChild("cube_r16", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r17 = bone9.addChild("cube_r17", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r18 = bone9.addChild("cube_r18", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r19 = bone9.addChild("cube_r19", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r20 = bone9.addChild("cube_r20", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r21 = bone9.addChild("cube_r21", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r22 = bone9.addChild("cube_r22", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone2 = doorRight.addChild("bone2", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, 0.0F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-3.0F, -3.5F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-3.0F, 0.5F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -12.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r23 = bone2.addChild("cube_r23", ModelPartBuilder.create().uv(18, 240).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = bone2.addChild("cube_r24", ModelPartBuilder.create().uv(18, 244).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.2F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r25 = bone2.addChild("cube_r25", ModelPartBuilder.create().uv(18, 242).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.2F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r26 = bone2.addChild("cube_r26", ModelPartBuilder.create().uv(22, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r27 = bone2.addChild("cube_r27", ModelPartBuilder.create().uv(18, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 0.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r28 = bone2.addChild("cube_r28", ModelPartBuilder.create().uv(30, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r29 = bone2.addChild("cube_r29", ModelPartBuilder.create().uv(26, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone17 = doorRight.addChild("bone17", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.5F, 11.0F));

		ModelPartData bone18 = doorRight.addChild("bone18", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 32.5F, 11.0F));

		ModelPartData roof = bone.addChild("roof", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData signs = roof.addChild("signs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		ModelPartData signnorth = signs.addChild("signnorth", ModelPartBuilder.create().uv(89, 35).cuboid(-9.0F, -2.0F, -1.75F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 40).cuboid(-9.5F, -2.5F, -1.75F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 182).cuboid(-10.0F, -2.0F, -2.0F, 20.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 224).cuboid(-8.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.001F))
		.uv(12, 224).cuboid(8.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.001F))
		.uv(12, 224).cuboid(-10.0F, -2.0F, -2.0F, 20.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 228).cuboid(-7.5F, -1.0F, 0.0F, 15.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 182).cuboid(-10.0F, 1.0F, -2.0F, 20.0F, 0.0F, 4.0F, new Dilation(0.001F))
		.uv(8, 182).cuboid(-10.0F, -1.0F, -2.0F, 20.0F, 0.0F, 4.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, 0.0F, -10.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData walls = bone.addChild("walls", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 42.5F, 0.0F));

		ModelPartData pillars = walls.addChild("pillars", ModelPartBuilder.create().uv(0, 190).cuboid(-12.0F, -37.0F, -12.0F, 3.0F, 37.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData cube_r30 = pillars.addChild("cube_r30", ModelPartBuilder.create().uv(0, 190).cuboid(-12.0F, -37.0F, -12.0F, 3.0F, 37.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
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
			doorLeft.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			doorRight.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = -80.0F;
			doorLeft.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			doorRight.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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