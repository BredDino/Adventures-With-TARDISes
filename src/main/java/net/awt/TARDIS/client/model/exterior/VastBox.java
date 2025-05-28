package net.awt.TARDIS.client.model.exterior;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
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
public class VastBox extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart doors;
	private final ModelPart doorLeft;
	private final ModelPart bone10;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart doorRight;
	private final ModelPart bone2;
	private final ModelPart bone9;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart roof;
	private final ModelPart lamp;
	private final ModelPart lampT;
	private final ModelPart signs;
	private final ModelPart signnorth;
	private final ModelPart signwest;
	private final ModelPart signsouth;
	private final ModelPart signeast;
	private final ModelPart walls;
	private final ModelPart walleast;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart wallsouth;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone34;
	private final ModelPart bone35;
	private final ModelPart bone36;
	private final ModelPart bone37;
	private final ModelPart bone38;
	private final ModelPart bone39;
	private final ModelPart wallwest;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart bone33;
	private final ModelPart pillars;
	private final ModelPart base;
	public VastBox(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doors = this.bone.getChild("doors");
		this.doorLeft = this.doors.getChild("doorLeft");
		this.bone10 = this.doorLeft.getChild("bone10");
		this.bone19 = this.doorLeft.getChild("bone19");
		this.bone20 = this.doorLeft.getChild("bone20");
		this.bone21 = this.doorLeft.getChild("bone21");
		this.doorRight = this.doors.getChild("doorRight");
		this.bone2 = this.doorRight.getChild("bone2");
		this.bone9 = this.doorRight.getChild("bone9");
		this.bone17 = this.doorRight.getChild("bone17");
		this.bone18 = this.doorRight.getChild("bone18");
		this.roof = this.bone.getChild("roof");
		this.lamp = this.roof.getChild("lamp");
		this.lampT = this.roof.getChild("lampT");
		this.signs = this.roof.getChild("signs");
		this.signnorth = this.signs.getChild("signnorth");
		this.signwest = this.signs.getChild("signwest");
		this.signsouth = this.signs.getChild("signsouth");
		this.signeast = this.signs.getChild("signeast");
		this.walls = this.bone.getChild("walls");
		this.walleast = this.walls.getChild("walleast");
		this.bone11 = this.walleast.getChild("bone11");
		this.bone12 = this.walleast.getChild("bone12");
		this.bone22 = this.walleast.getChild("bone22");
		this.bone23 = this.walleast.getChild("bone23");
		this.bone24 = this.walleast.getChild("bone24");
		this.bone25 = this.walleast.getChild("bone25");
		this.bone26 = this.walleast.getChild("bone26");
		this.bone27 = this.walleast.getChild("bone27");
		this.wallsouth = this.walls.getChild("wallsouth");
		this.bone13 = this.wallsouth.getChild("bone13");
		this.bone14 = this.wallsouth.getChild("bone14");
		this.bone34 = this.wallsouth.getChild("bone34");
		this.bone35 = this.wallsouth.getChild("bone35");
		this.bone36 = this.wallsouth.getChild("bone36");
		this.bone37 = this.wallsouth.getChild("bone37");
		this.bone38 = this.wallsouth.getChild("bone38");
		this.bone39 = this.wallsouth.getChild("bone39");
		this.wallwest = this.walls.getChild("wallwest");
		this.bone15 = this.wallwest.getChild("bone15");
		this.bone16 = this.wallwest.getChild("bone16");
		this.bone28 = this.wallwest.getChild("bone28");
		this.bone29 = this.wallwest.getChild("bone29");
		this.bone30 = this.wallwest.getChild("bone30");
		this.bone31 = this.wallwest.getChild("bone31");
		this.bone32 = this.wallwest.getChild("bone32");
		this.bone33 = this.wallwest.getChild("bone33");
		this.pillars = this.walls.getChild("pillars");
		this.base = this.bone.getChild("base");
	}

	public VastBox()  {
		this(getTexturedModelData().createModel());
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData doorLeft = doors.addChild("doorLeft", ModelPartBuilder.create().uv(26, 85).cuboid(0.0F, -16.5F, 0.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 72).cuboid(6.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 70).cuboid(1.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 18).cuboid(2.0F, -6.5F, 0.25F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 119).cuboid(8.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -18.5F, -11.0F));

		ModelPartData bone10 = doorLeft.addChild("bone10", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -8.0F, -0.075F));

		ModelPartData cube_r1 = bone10.addChild("cube_r1", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone10.addChild("cube_r2", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bone10.addChild("cube_r3", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone10.addChild("cube_r4", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = bone10.addChild("cube_r5", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = bone10.addChild("cube_r6", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r7 = bone10.addChild("cube_r7", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone19 = doorLeft.addChild("bone19", ModelPartBuilder.create().uv(85, 5).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 16.5F, 11.0F));

		ModelPartData bone20 = doorLeft.addChild("bone20", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 24.5F, 11.0F));

		ModelPartData bone21 = doorLeft.addChild("bone21", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 32.5F, 11.0F));

		ModelPartData doorRight = doors.addChild("doorRight", ModelPartBuilder.create().uv(86, 81).cuboid(-8.0F, -16.5F, 0.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(89, 50).cuboid(-5.0F, -5.0F, 0.25F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 29).cuboid(-8.0F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 29).cuboid(-8.0F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 119).cuboid(-9.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -18.5F, -11.0F));

		ModelPartData bone2 = doorRight.addChild("bone2", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 16.5F, 11.0F));

		ModelPartData bone9 = doorRight.addChild("bone9", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -8.0F, -0.075F));

		ModelPartData cube_r8 = bone9.addChild("cube_r8", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = bone9.addChild("cube_r9", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = bone9.addChild("cube_r10", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = bone9.addChild("cube_r11", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r12 = bone9.addChild("cube_r12", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r13 = bone9.addChild("cube_r13", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r14 = bone9.addChild("cube_r14", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone17 = doorRight.addChild("bone17", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.5F, 11.0F));

		ModelPartData bone18 = doorRight.addChild("bone18", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 32.5F, 11.0F));

		ModelPartData roof = bone.addChild("roof", ModelPartBuilder.create().uv(0, 29).cuboid(-11.0F, 1.5F, -11.0F, 22.0F, 2.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 54).cuboid(-10.0F, -0.5F, -10.0F, 20.0F, 2.0F, 20.0F, new Dilation(0.0F))
		.uv(0, 155).cuboid(-10.0F, 0.5F, -10.0F, 20.0F, 2.0F, 20.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.5F, 0.0F));

		ModelPartData lamp = roof.addChild("lamp", ModelPartBuilder.create().uv(45, 114).cuboid(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.5F, 0.0F));

		ModelPartData cube_r15 = lamp.addChild("cube_r15", ModelPartBuilder.create().uv(124, 24).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 5).cuboid(-2.0F, -4.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(45, 107).cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(45, 85).cuboid(0.0F, -4.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r16 = lamp.addChild("cube_r16", ModelPartBuilder.create().uv(45, 96).cuboid(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData cube_r17 = lamp.addChild("cube_r17", ModelPartBuilder.create().uv(124, 12).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData lampT = roof.addChild("lampT", ModelPartBuilder.create().uv(164, 24).cuboid(-1.5F, -3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.5F, 0.0F));

		ModelPartData cube_r18 = lampT.addChild("cube_r18", ModelPartBuilder.create().uv(145, 24).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F))
		.uv(145, 5).cuboid(-2.0F, -5.5F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(164, 17).cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(165, 0).cuboid(0.0F, -4.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r19 = lampT.addChild("cube_r19", ModelPartBuilder.create().uv(165, 6).cuboid(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData cube_r20 = lampT.addChild("cube_r20", ModelPartBuilder.create().uv(145, 12).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData signs = roof.addChild("signs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		ModelPartData signnorth = signs.addChild("signnorth", ModelPartBuilder.create().uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(13, 76).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData signwest = signs.addChild("signwest", ModelPartBuilder.create().uv(81, 54).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData signsouth = signs.addChild("signsouth", ModelPartBuilder.create().uv(81, 63).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData signeast = signs.addChild("signeast", ModelPartBuilder.create().uv(86, 72).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData walls = bone.addChild("walls", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData walleast = walls.addChild("walleast", ModelPartBuilder.create().uv(105, 0).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 120).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 81).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bone11 = walleast.addChild("bone11", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r21 = bone11.addChild("cube_r21", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r22 = bone11.addChild("cube_r22", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r23 = bone11.addChild("cube_r23", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = bone11.addChild("cube_r24", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r25 = bone11.addChild("cube_r25", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r26 = bone11.addChild("cube_r26", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r27 = bone11.addChild("cube_r27", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone12 = walleast.addChild("bone12", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r28 = bone12.addChild("cube_r28", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r29 = bone12.addChild("cube_r29", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = bone12.addChild("cube_r30", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = bone12.addChild("cube_r31", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r32 = bone12.addChild("cube_r32", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r33 = bone12.addChild("cube_r33", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r34 = bone12.addChild("cube_r34", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone22 = walleast.addChild("bone22", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone23 = walleast.addChild("bone23", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone24 = walleast.addChild("bone24", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone25 = walleast.addChild("bone25", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone26 = walleast.addChild("bone26", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone27 = walleast.addChild("bone27", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData wallsouth = walls.addChild("wallsouth", ModelPartBuilder.create().uv(86, 116).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 120).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 116).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone13 = wallsouth.addChild("bone13", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r35 = bone13.addChild("cube_r35", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r36 = bone13.addChild("cube_r36", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r37 = bone13.addChild("cube_r37", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r38 = bone13.addChild("cube_r38", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r39 = bone13.addChild("cube_r39", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r40 = bone13.addChild("cube_r40", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r41 = bone13.addChild("cube_r41", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone14 = wallsouth.addChild("bone14", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r42 = bone14.addChild("cube_r42", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r43 = bone14.addChild("cube_r43", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r44 = bone14.addChild("cube_r44", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r45 = bone14.addChild("cube_r45", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r46 = bone14.addChild("cube_r46", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r47 = bone14.addChild("cube_r47", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r48 = bone14.addChild("cube_r48", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone34 = wallsouth.addChild("bone34", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone35 = wallsouth.addChild("bone35", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone36 = wallsouth.addChild("bone36", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone37 = wallsouth.addChild("bone37", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone38 = wallsouth.addChild("bone38", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone39 = wallsouth.addChild("bone39", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData wallwest = walls.addChild("wallwest", ModelPartBuilder.create().uv(45, 119).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(124, 81).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 119).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone15 = wallwest.addChild("bone15", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r49 = bone15.addChild("cube_r49", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r50 = bone15.addChild("cube_r50", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r51 = bone15.addChild("cube_r51", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r52 = bone15.addChild("cube_r52", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r53 = bone15.addChild("cube_r53", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r54 = bone15.addChild("cube_r54", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r55 = bone15.addChild("cube_r55", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone16 = wallwest.addChild("bone16", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r56 = bone16.addChild("cube_r56", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r57 = bone16.addChild("cube_r57", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r58 = bone16.addChild("cube_r58", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r59 = bone16.addChild("cube_r59", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r60 = bone16.addChild("cube_r60", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r61 = bone16.addChild("cube_r61", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r62 = bone16.addChild("cube_r62", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone28 = wallwest.addChild("bone28", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone29 = wallwest.addChild("bone29", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone30 = wallwest.addChild("bone30", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone31 = wallwest.addChild("bone31", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone32 = wallwest.addChild("bone32", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone33 = wallwest.addChild("bone33", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData pillars = walls.addChild("pillars", ModelPartBuilder.create().uv(0, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData cube_r63 = pillars.addChild("cube_r63", ModelPartBuilder.create().uv(13, 85).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r64 = pillars.addChild("cube_r64", ModelPartBuilder.create().uv(73, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r65 = pillars.addChild("cube_r65", ModelPartBuilder.create().uv(60, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData base = bone.addChild("base", ModelPartBuilder.create().uv(0, 0).cuboid(-13.0F, -2.0F, -13.0F, 26.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
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

        if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
            this.doors.getChild("doorLeft").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
            this.doors.getChild("doorRight").yaw = (door.isRightOpen() || door.areBothOpen())
                    ? 5.0F
                    : 0.0F;
        } else {
            float maxRot = -80f;
            this.doors.getChild("doorLeft").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
            this.doors.getChild("doorRight").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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