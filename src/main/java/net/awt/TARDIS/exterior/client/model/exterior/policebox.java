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
public class policebox extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart lantern;
	private final ModelPart bulb;
	private final ModelPart lanternbase;
	private final ModelPart roof;
	private final ModelPart doors;
	private final ModelPart leftdoor;
	private final ModelPart phone;
	private final ModelPart rightdoor;
	private final ModelPart base;
	private final ModelPart PCB;
	private final ModelPart posts;
	private final ModelPart wall;
	private final ModelPart right;
	private final ModelPart back;
	private final ModelPart left2;
	public policebox(ModelPart root) {
		this.bone = root.getChild("bone");
		this.lantern = this.bone.getChild("lantern");
		this.bulb = this.lantern.getChild("bulb");
		this.lanternbase = this.lantern.getChild("lanternbase");
		this.roof = this.bone.getChild("roof");
		this.doors = this.bone.getChild("doors");
		this.leftdoor = this.doors.getChild("leftdoor");
		this.phone = this.leftdoor.getChild("phone");
		this.rightdoor = this.doors.getChild("rightdoor");
		this.base = this.bone.getChild("base");
		this.PCB = this.bone.getChild("PCB");
		this.posts = this.bone.getChild("posts");
		this.wall = this.bone.getChild("wall");
		this.right = this.wall.getChild("right");
		this.back = this.wall.getChild("back");
		this.left2 = this.wall.getChild("left2");
	}

	public policebox()  {
		this(getTexturedModelData().createModel());
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData lantern = bone.addChild("lantern", ModelPartBuilder.create().uv(236, 129).cuboid(-1.4936F, -0.9333F, 1.9186F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(236, 149).cuboid(-1.4936F, -0.9333F, -2.9098F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(236, 235).cuboid(1.9206F, -0.9333F, -1.4956F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 237).cuboid(-2.9078F, -0.9333F, -1.4956F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(238, 112).cuboid(1.1993F, -1.2333F, -1.5027F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(126, 235).cuboid(-1.5149F, -1.4333F, -1.5027F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(238, 116).cuboid(-2.2149F, -1.2333F, -1.5027F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(240, 60).cuboid(-1.5078F, -1.2333F, -2.2098F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(240, 185).cuboid(-1.5078F, -1.2333F, 1.2044F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.0806F, -56.096F, 0.3916F));

		ModelPartData cube_r1 = lantern.addChild("cube_r1", ModelPartBuilder.create().uv(102, 68).cuboid(-0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.0542F, 2.5667F, 2.0579F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r2 = lantern.addChild("cube_r2", ModelPartBuilder.create().uv(186, 71).cuboid(-0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.0671F, 2.5667F, -2.0634F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r3 = lantern.addChild("cube_r3", ModelPartBuilder.create().uv(184, 71).cuboid(-0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.0542F, 2.5667F, -2.0634F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r4 = lantern.addChild("cube_r4", ModelPartBuilder.create().uv(104, 68).cuboid(-0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.0671F, 2.5667F, 2.0579F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r5 = lantern.addChild("cube_r5", ModelPartBuilder.create().uv(242, 4).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.8471F, -0.4333F, -1.8492F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = lantern.addChild("cube_r6", ModelPartBuilder.create().uv(218, 131).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.86F, -0.4333F, 1.8579F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = lantern.addChild("cube_r7", ModelPartBuilder.create().uv(160, 228).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.5078F, -0.7333F, -1.5027F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = lantern.addChild("cube_r8", ModelPartBuilder.create().uv(226, 196).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.4922F, -0.7333F, -1.5027F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r9 = lantern.addChild("cube_r9", ModelPartBuilder.create().uv(160, 232).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.5078F, -0.7333F, 1.4973F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r10 = lantern.addChild("cube_r10", ModelPartBuilder.create().uv(160, 230).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.4922F, -0.7333F, 1.4973F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r11 = lantern.addChild("cube_r11", ModelPartBuilder.create().uv(242, 6).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.86F, -0.4333F, -1.8492F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r12 = lantern.addChild("cube_r12", ModelPartBuilder.create().uv(242, 12).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.8471F, -0.4333F, 1.8579F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bulb = lantern.addChild("bulb", ModelPartBuilder.create().uv(28, 236).cuboid(-1.0F, -3.0F, -2.4142F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 236).cuboid(-1.0F, -3.0F, 1.4142F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 233).cuboid(-2.4142F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(138, 235).cuboid(1.4142F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.0007F, 3.0667F, -0.0027F));

		ModelPartData cube_r13 = bulb.addChild("cube_r13", ModelPartBuilder.create().uv(52, 236).cuboid(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.3536F, 0.0F, 1.3536F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r14 = bulb.addChild("cube_r14", ModelPartBuilder.create().uv(34, 236).cuboid(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.3536F, 0.0F, -1.3536F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r15 = bulb.addChild("cube_r15", ModelPartBuilder.create().uv(46, 236).cuboid(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.3536F, 0.0F, 1.3536F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r16 = bulb.addChild("cube_r16", ModelPartBuilder.create().uv(40, 236).cuboid(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.3536F, 0.0F, -1.3536F, 0.0F, -0.7854F, 0.0F));

		ModelPartData lanternbase = lantern.addChild("lanternbase", ModelPartBuilder.create().uv(90, 236).cuboid(-1.2155F, -0.5556F, 1.8273F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(100, 236).cuboid(-1.2155F, -0.5556F, -3.4154F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(160, 235).cuboid(1.9058F, -0.5556F, -1.294F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(170, 235).cuboid(-3.3368F, -0.5556F, -1.294F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2781F, 5.5222F, -0.2087F));

		ModelPartData cube_r17 = lanternbase.addChild("cube_r17", ModelPartBuilder.create().uv(236, 146).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.569F, 0.0444F, 2.0595F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r18 = lanternbase.addChild("cube_r18", ModelPartBuilder.create().uv(236, 143).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.1381F, 0.0444F, -1.6476F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r19 = lanternbase.addChild("cube_r19", ModelPartBuilder.create().uv(236, 126).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.569F, 0.0444F, -1.6476F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r20 = lanternbase.addChild("cube_r20", ModelPartBuilder.create().uv(236, 123).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.1381F, 0.0444F, 2.0595F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r21 = lanternbase.addChild("cube_r21", ModelPartBuilder.create().uv(224, 18).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2761F, 0.0444F, -1.6476F, 0.0F, 0.7854F, 0.0F));

		ModelPartData roof = bone.addChild("roof", ModelPartBuilder.create().uv(0, 31).cuboid(-13.3976F, 0.3596F, -12.7024F, 27.0F, 2.0F, 26.0F, new Dilation(0.0F))
		.uv(66, 217).cuboid(-12.0512F, -1.2548F, -12.0488F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(204, 236).cuboid(9.9488F, -1.2548F, -12.0488F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(212, 236).cuboid(9.9488F, -1.2548F, 9.9512F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(236, 219).cuboid(-12.0512F, -1.2548F, 9.9512F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 84).cuboid(-11.3976F, -1.3404F, -11.6024F, 23.0F, 2.0F, 23.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.1837F, -48.8596F, 0.2837F));

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

		ModelPartData cube_r22 = leftdoor.addChild("cube_r22", ModelPartBuilder.create().uv(110, 233).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -18.125F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r23 = leftdoor.addChild("cube_r23", ModelPartBuilder.create().uv(136, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 174).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 239).cuboid(0.0F, 26.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.5042F, -14.4786F, -0.2981F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r24 = leftdoor.addChild("cube_r24", ModelPartBuilder.create().uv(232, 37).cuboid(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -14.4786F, 0.0548F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r25 = leftdoor.addChild("cube_r25", ModelPartBuilder.create().uv(234, 168).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, -10.8321F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r26 = leftdoor.addChild("cube_r26", ModelPartBuilder.create().uv(114, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.1571F, -14.4786F, 0.0547F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r27 = leftdoor.addChild("cube_r27", ModelPartBuilder.create().uv(110, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.5571F, -14.4786F, 0.0547F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r28 = leftdoor.addChild("cube_r28", ModelPartBuilder.create().uv(22, 241).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 131).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 241).cuboid(-0.5F, 26.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.2106F, -14.4786F, -0.2988F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r29 = leftdoor.addChild("cube_r29", ModelPartBuilder.create().uv(0, 233).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 1.875F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = leftdoor.addChild("cube_r30", ModelPartBuilder.create().uv(234, 167).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 9.1679F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = leftdoor.addChild("cube_r31", ModelPartBuilder.create().uv(232, 43).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 11.875F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r32 = leftdoor.addChild("cube_r32", ModelPartBuilder.create().uv(234, 166).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.8571F, 19.1679F, -0.2988F, -0.7854F, 0.0F, 0.0F));

		ModelPartData phone = leftdoor.addChild("phone", ModelPartBuilder.create().uv(216, 160).cuboid(-4.7336F, -3.7967F, -1.0183F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(164, 210).cuboid(-3.7336F, -3.2967F, -1.2183F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(172, 23).cuboid(2.2664F, -0.0967F, -1.6182F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(180, 235).cuboid(-3.2336F, -2.7967F, -0.0183F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(152, 237).cuboid(-3.2336F, -0.7967F, 0.9817F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 241).cuboid(-0.5336F, -2.6967F, -0.1182F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.5906F, -4.6819F, 0.6659F));

		ModelPartData cube_r33 = phone.addChild("cube_r33", ModelPartBuilder.create().uv(156, 241).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5478F, -1.2967F, 1.2746F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r34 = phone.addChild("cube_r34", ModelPartBuilder.create().uv(242, 14).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.9478F, -1.2967F, 1.2746F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r35 = phone.addChild("cube_r35", ModelPartBuilder.create().uv(180, 241).cuboid(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.3359F, 0.2659F, 0.2817F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r36 = phone.addChild("cube_r36", ModelPartBuilder.create().uv(242, 10).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7664F, 2.6104F, -0.9112F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r37 = phone.addChild("cube_r37", ModelPartBuilder.create().uv(242, 8).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7664F, -0.8031F, -0.9104F, 0.7854F, 0.0F, 0.0F));

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

		ModelPartData cube_r38 = rightdoor.addChild("cube_r38", ModelPartBuilder.create().uv(242, 2).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.1563F, -1.1335F, -0.6959F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r39 = rightdoor.addChild("cube_r39", ModelPartBuilder.create().uv(242, 0).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.1563F, -4.547F, -0.6952F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r40 = rightdoor.addChild("cube_r40", ModelPartBuilder.create().uv(240, 0).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 175).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(178, 239).cuboid(0.0F, -24.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(176, 239).cuboid(0.0F, -34.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0092F, 16.4594F, -0.1487F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r41 = rightdoor.addChild("cube_r41", ModelPartBuilder.create().uv(84, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 20.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r42 = rightdoor.addChild("cube_r42", ModelPartBuilder.create().uv(84, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 12.8129F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r43 = rightdoor.addChild("cube_r43", ModelPartBuilder.create().uv(196, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.9563F, -13.5406F, 0.2041F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r44 = rightdoor.addChild("cube_r44", ModelPartBuilder.create().uv(232, 39).cuboid(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -13.5406F, 0.2041F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r45 = rightdoor.addChild("cube_r45", ModelPartBuilder.create().uv(200, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.3563F, -13.5406F, 0.2041F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r46 = rightdoor.addChild("cube_r46", ModelPartBuilder.create().uv(148, 241).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 9).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(146, 241).cuboid(-0.5F, -24.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 241).cuboid(-0.5F, -34.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-10.3028F, 16.4594F, -0.1494F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r47 = rightdoor.addChild("cube_r47", ModelPartBuilder.create().uv(44, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 10.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r48 = rightdoor.addChild("cube_r48", ModelPartBuilder.create().uv(46, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 2.8129F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r49 = rightdoor.addChild("cube_r49", ModelPartBuilder.create().uv(28, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, 0.1058F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r50 = rightdoor.addChild("cube_r50", ModelPartBuilder.create().uv(28, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -7.1871F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r51 = rightdoor.addChild("cube_r51", ModelPartBuilder.create().uv(0, 234).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -17.1871F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r52 = rightdoor.addChild("cube_r52", ModelPartBuilder.create().uv(0, 235).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.6563F, -9.8942F, -0.1494F, -0.7854F, 0.0F, 0.0F));

		ModelPartData base = bone.addChild("base", ModelPartBuilder.create().uv(0, 0).cuboid(-14.55F, -0.1237F, -14.2667F, 29.0F, 2.0F, 29.0F, new Dilation(0.0F))
		.uv(10, 5).cuboid(-11.35F, -0.8237F, -12.9667F, 23.0F, 1.0F, 24.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2314F, -1.8763F, 0.048F));

		ModelPartData cube_r53 = base.addChild("cube_r53", ModelPartBuilder.create().uv(76, 150).cuboid(-0.5F, -0.5F, -11.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(13.1035F, -0.1381F, 0.1869F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r54 = base.addChild("cube_r54", ModelPartBuilder.create().uv(122, 151).cuboid(-0.5F, -0.5F, -11.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(-13.1965F, -0.1381F, 0.1869F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r55 = base.addChild("cube_r55", ModelPartBuilder.create().uv(94, 82).cuboid(-11.0F, -0.5F, -0.5F, 22.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0036F, -0.1381F, 13.3798F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r56 = base.addChild("cube_r56", ModelPartBuilder.create().uv(156, 65).cuboid(-11.0F, -0.5F, -0.5F, 22.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0036F, -0.1381F, -13.0202F, 0.7854F, 0.0F, 0.0F));

		ModelPartData PCB = bone.addChild("PCB", ModelPartBuilder.create().uv(156, 30).cuboid(-13.5F, -1.516F, -14.5F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 35).cuboid(-13.5F, -1.516F, 12.5F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2349F, -45.9227F, 0.2349F));

		ModelPartData cube_r57 = PCB.addChild("cube_r57", ModelPartBuilder.create().uv(156, 40).cuboid(-13.5F, -1.5F, -1.0F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-13.5F, 0.016F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r58 = PCB.addChild("cube_r58", ModelPartBuilder.create().uv(116, 25).cuboid(-13.5F, -1.5F, -1.0F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(13.5F, 0.016F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData posts = bone.addChild("posts", ModelPartBuilder.create(), ModelTransform.pivot(-0.2349F, -24.6145F, 0.2349F));

		ModelPartData cube_r59 = posts.addChild("cube_r59", ModelPartBuilder.create().uv(62, 154).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.6F, 0.0F, -12.6F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r60 = posts.addChild("cube_r60", ModelPartBuilder.create().uv(168, 151).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.6F, 0.0F, 12.6F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r61 = posts.addChild("cube_r61", ModelPartBuilder.create().uv(74, 173).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.6F, 0.0F, 12.6F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r62 = posts.addChild("cube_r62", ModelPartBuilder.create().uv(50, 154).cuboid(-1.5F, -23.0F, -1.5F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.6F, 0.0F, -12.6F, 0.0F, -1.5708F, 0.0F));

		ModelPartData wall = bone.addChild("wall", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right = wall.addChild("right", ModelPartBuilder.create().uv(0, 109).cuboid(-2.1537F, -19.5486F, -11.9901F, 2.0F, 43.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 101).cuboid(-0.5537F, 20.7514F, -11.4901F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 126).cuboid(-0.5537F, -19.2486F, -11.4901F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(212, 209).cuboid(-0.5537F, -9.2486F, -9.4901F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(212, 199).cuboid(-0.5537F, -9.2486F, 1.5099F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(98, 194).cuboid(-0.5537F, -17.2486F, 9.5099F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(146, 210).cuboid(-0.5537F, 0.7514F, 1.5099F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(194, 208).cuboid(-0.5537F, 0.7514F, -9.4901F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(92, 194).cuboid(-0.5537F, -17.2486F, -11.4901F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(208, 189).cuboid(-0.5537F, 10.7514F, -9.4901F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(176, 208).cuboid(-0.5537F, 10.7514F, 1.5099F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(44, 175).cuboid(-0.2544F, -19.2493F, -0.4901F, 1.0F, 43.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 109).cuboid(-0.5537F, -17.2486F, -1.4901F, 1.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0537F, -25.4514F, 0.4901F));

		ModelPartData cube_r63 = right.addChild("cube_r63", ModelPartBuilder.create().uv(0, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2473F, -13.2493F, 6.8099F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r64 = right.addChild("cube_r64", ModelPartBuilder.create().uv(232, 235).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2473F, -13.2493F, 4.2099F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r65 = right.addChild("cube_r65", ModelPartBuilder.create().uv(216, 151).cuboid(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(214, 35).cuboid(-0.5F, -0.5F, -15.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.2466F, -13.2486F, 5.5099F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r66 = right.addChild("cube_r66", ModelPartBuilder.create().uv(228, 235).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2473F, -13.2493F, -6.7901F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r67 = right.addChild("cube_r67", ModelPartBuilder.create().uv(192, 235).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2473F, -13.2493F, -4.1901F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r68 = right.addChild("cube_r68", ModelPartBuilder.create().uv(222, 80).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 88).cuboid(-0.5F, 0.0F, -15.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, 0.3978F, 5.5099F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r69 = right.addChild("cube_r69", ModelPartBuilder.create().uv(96, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 239).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 239).cuboid(0.0F, 6.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 236).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, -3.2493F, 9.1564F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r70 = right.addChild("cube_r70", ModelPartBuilder.create().uv(226, 187).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(196, 227).cuboid(0.0F, -0.5F, -15.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, -6.8958F, 5.5099F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r71 = right.addChild("cube_r71", ModelPartBuilder.create().uv(208, 240).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(214, 240).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(206, 240).cuboid(-0.5F, 6.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 177).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, -3.2493F, 1.8628F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r72 = right.addChild("cube_r72", ModelPartBuilder.create().uv(98, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 239).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 239).cuboid(0.0F, 6.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 239).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, -3.2493F, -1.8436F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r73 = right.addChild("cube_r73", ModelPartBuilder.create().uv(210, 240).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(212, 240).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(204, 240).cuboid(-0.5F, 6.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 169).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, -3.2493F, -9.1372F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r74 = right.addChild("cube_r74", ModelPartBuilder.create().uv(212, 227).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(144, 228).cuboid(0.0F, -0.5F, 7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, -16.8958F, -5.4901F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r75 = right.addChild("cube_r75", ModelPartBuilder.create().uv(222, 96).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 104).cuboid(-0.5F, 0.0F, 7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, -9.6022F, -5.4901F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r76 = right.addChild("cube_r76", ModelPartBuilder.create().uv(164, 226).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(180, 226).cuboid(0.0F, -0.5F, 7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, 3.1042F, -5.4901F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r77 = right.addChild("cube_r77", ModelPartBuilder.create().uv(222, 64).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 72).cuboid(-0.5F, 0.0F, 7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, 10.3978F, -5.4901F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r78 = right.addChild("cube_r78", ModelPartBuilder.create().uv(52, 222).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(34, 222).cuboid(-0.5F, 0.0F, -15.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0928F, 20.3978F, 5.5099F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r79 = right.addChild("cube_r79", ModelPartBuilder.create().uv(226, 131).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(128, 226).cuboid(0.0F, -0.5F, -15.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0935F, 13.1042F, 5.5099F, 0.0F, 0.0F, 0.7854F));

		ModelPartData back = wall.addChild("back", ModelPartBuilder.create().uv(106, 31).cuboid(-11.893F, -20.7591F, -2.0413F, 23.0F, 43.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 76).cuboid(-11.893F, 19.5409F, -0.5413F, 23.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(226, 140).cuboid(1.107F, 9.5409F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(230, 216).cuboid(-9.893F, 9.5409F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 26).cuboid(-9.893F, -0.4591F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 231).cuboid(1.107F, -0.4591F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 32).cuboid(-9.893F, -10.4591F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 29).cuboid(1.107F, -10.4591F, -0.5413F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 79).cuboid(-11.893F, -20.4591F, -0.5413F, 23.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(110, 194).cuboid(-11.893F, -18.4591F, -0.5413F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 194).cuboid(9.107F, -18.4591F, -0.5413F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 193).cuboid(-1.893F, -18.4591F, -0.5413F, 3.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 175).cuboid(-0.893F, -22.4591F, -0.2414F, 1.0F, 45.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 193).cuboid(-1.893F, -18.4591F, -1.5413F, 3.0F, 38.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.393F, -24.2409F, 13.4413F));

		ModelPartData cube_r80 = back.addChild("cube_r80", ModelPartBuilder.create().uv(12, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.293F, -14.4591F, -0.2485F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r81 = back.addChild("cube_r81", ModelPartBuilder.create().uv(24, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.493F, -14.4591F, -0.2485F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r82 = back.addChild("cube_r82", ModelPartBuilder.create().uv(232, 35).cuboid(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(224, 62).cuboid(7.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.893F, -14.4584F, -0.2492F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r83 = back.addChild("cube_r83", ModelPartBuilder.create().uv(8, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.707F, -14.4591F, -0.2485F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r84 = back.addChild("cube_r84", ModelPartBuilder.create().uv(4, 236).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.507F, -14.4591F, -0.2485F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r85 = back.addChild("cube_r85", ModelPartBuilder.create().uv(134, 30).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(122, 150).cuboid(-15.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 30).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, 11.8945F, 0.1051F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r86 = back.addChild("cube_r86", ModelPartBuilder.create().uv(106, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 163).cuboid(0.0F, -24.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(130, 239).cuboid(0.0F, -34.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 239).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 239).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.4606F, 15.5409F, 0.1051F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r87 = back.addChild("cube_r87", ModelPartBuilder.create().uv(8, 232).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 159).cuboid(-15.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 230).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, 19.1881F, 0.1044F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r88 = back.addChild("cube_r88", ModelPartBuilder.create().uv(218, 240).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(178, 200).cuboid(-0.5F, -24.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(226, 240).cuboid(-0.5F, -34.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(222, 240).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(216, 240).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(8.7542F, 15.5409F, 0.1044F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r89 = back.addChild("cube_r89", ModelPartBuilder.create().uv(202, 66).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(206, 22).cuboid(7.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.893F, -8.1055F, 0.1051F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r90 = back.addChild("cube_r90", ModelPartBuilder.create().uv(74, 154).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 239).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(128, 239).cuboid(0.0F, 6.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 239).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.5394F, -4.4591F, 0.1051F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r91 = back.addChild("cube_r91", ModelPartBuilder.create().uv(176, 200).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 241).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 240).cuboid(-0.5F, 6.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(220, 240).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.2458F, -4.4591F, 0.1044F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r92 = back.addChild("cube_r92", ModelPartBuilder.create().uv(234, 162).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 163).cuboid(7.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.893F, -0.8119F, 0.1044F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r93 = back.addChild("cube_r93", ModelPartBuilder.create().uv(232, 41).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 42).cuboid(-15.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, -18.1055F, 0.1051F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r94 = back.addChild("cube_r94", ModelPartBuilder.create().uv(234, 164).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 165).cuboid(-15.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, -10.8119F, 0.1044F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r95 = back.addChild("cube_r95", ModelPartBuilder.create().uv(86, 173).cuboid(-4.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 173).cuboid(-15.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, 1.8945F, 0.1051F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r96 = back.addChild("cube_r96", ModelPartBuilder.create().uv(234, 160).cuboid(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 161).cuboid(-15.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.107F, 9.1881F, 0.1044F, 0.7854F, 0.0F, 0.0F));

		ModelPartData left2 = wall.addChild("left2", ModelPartBuilder.create().uv(92, 84).cuboid(0.052F, -19.5487F, -11.9803F, 2.0F, 43.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 76).cuboid(-0.448F, 20.7513F, -11.4803F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(48, 203).cuboid(-0.448F, 10.7513F, -9.4803F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 0).cuboid(-0.448F, 0.7513F, -9.4803F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 10).cuboid(-0.448F, 0.7513F, 1.5197F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 169).cuboid(-0.448F, -9.2487F, -9.4803F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 179).cuboid(-0.448F, -9.2487F, 1.5197F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(128, 208).cuboid(-0.448F, 10.7513F, 1.5197F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(76, 109).cuboid(-0.448F, -17.2487F, -1.4803F, 1.0F, 38.0F, 3.0F, new Dilation(0.0F))
		.uv(28, 193).cuboid(-0.448F, -17.2487F, -11.4803F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 194).cuboid(-0.448F, -17.2487F, 9.5197F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(116, 0).cuboid(-0.448F, -19.2487F, -11.9803F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(40, 175).cuboid(-0.6487F, -19.2494F, -0.4803F, 1.0F, 43.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-13.452F, -25.4513F, 0.4803F));

		ModelPartData cube_r97 = left2.addChild("cube_r97", ModelPartBuilder.create().uv(240, 104).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 96).cuboid(-0.5F, 6.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 88).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 80).cuboid(-0.5F, -24.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.0951F, 6.7506F, -1.8338F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r98 = left2.addChild("cube_r98", ModelPartBuilder.create().uv(16, 235).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 211).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 202).cuboid(0.0F, -24.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 193).cuboid(0.0F, -34.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 16.7506F, 1.8726F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r99 = left2.addChild("cube_r99", ModelPartBuilder.create().uv(34, 193).cuboid(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(188, 67).cuboid(0.0F, -14.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 184).cuboid(0.0F, 6.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 183).cuboid(0.0F, 16.0F, -0.5F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, -3.2494F, -9.1274F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r100 = left2.addChild("cube_r100", ModelPartBuilder.create().uv(188, 235).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2584F, -13.2494F, 6.8197F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r101 = left2.addChild("cube_r101", ModelPartBuilder.create().uv(60, 235).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2584F, -13.2494F, 4.2197F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r102 = left2.addChild("cube_r102", ModelPartBuilder.create().uv(208, 199).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2584F, -13.2494F, -6.7803F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r103 = left2.addChild("cube_r103", ModelPartBuilder.create().uv(102, 59).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2584F, -13.2494F, -4.1803F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r104 = left2.addChild("cube_r104", ModelPartBuilder.create().uv(240, 72).cuboid(-0.5F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 64).cuboid(-0.5F, -14.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 52).cuboid(-0.5F, 6.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 44).cuboid(-0.5F, 16.0F, 0.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.0951F, -3.2494F, 9.1662F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r105 = left2.addChild("cube_r105", ModelPartBuilder.create().uv(224, 178).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 169).cuboid(0.0F, -0.5F, -15.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 0.3977F, 5.5197F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r106 = left2.addChild("cube_r106", ModelPartBuilder.create().uv(224, 53).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 44).cuboid(0.0F, -0.5F, 7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, -9.6023F, -5.4803F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r107 = left2.addChild("cube_r107", ModelPartBuilder.create().uv(214, 26).cuboid(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(48, 213).cuboid(-0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.2591F, -13.2487F, -5.4803F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r108 = left2.addChild("cube_r108", ModelPartBuilder.create().uv(224, 9).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 0).cuboid(0.0F, -0.5F, -15.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 10.3977F, 5.5197F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r109 = left2.addChild("cube_r109", ModelPartBuilder.create().uv(222, 112).cuboid(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(70, 222).cuboid(0.0F, -0.5F, 7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 20.3977F, -5.4803F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r110 = left2.addChild("cube_r110", ModelPartBuilder.create().uv(146, 220).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 219).cuboid(-0.5F, 0.0F, 7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, -6.8952F, -5.4803F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r111 = left2.addChild("cube_r111", ModelPartBuilder.create().uv(200, 219).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(182, 218).cuboid(-0.5F, 0.0F, -15.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, -16.8952F, 5.5197F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r112 = left2.addChild("cube_r112", ModelPartBuilder.create().uv(164, 218).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 143).cuboid(-0.5F, 0.0F, -15.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 3.1048F, 5.5197F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r113 = left2.addChild("cube_r113", ModelPartBuilder.create().uv(128, 218).cuboid(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 123).cuboid(-0.5F, 0.0F, 7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.0944F, 13.1048F, -5.4803F, 0.0F, 0.0F, 0.7854F));
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
			this.doors.getChild("leftdoor").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.doors.getChild("rightdoor").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = -70f;
			this.doors.getChild("leftdoor").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.doors.getChild("rightdoor").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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