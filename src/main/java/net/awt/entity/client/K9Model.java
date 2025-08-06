// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.awt.entity.client;

import net.awt.entity.custom.K9Entity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class K9Model<T extends K9Entity> extends SinglePartEntityModel<T> {
	private final ModelPart k9;
	private final ModelPart panels;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart bone8;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart tail;
	private final ModelPart label;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	public K9Model(ModelPart root) {
		this.k9 = root.getChild("k9");
		this.panels = root.getChild("panels");
		this.torso = root.getChild("torso");
		this.head = root.getChild("head");
		this.bone8 = root.getChild("bone8");
		this.bone7 = root.getChild("bone7");
		this.bone6 = root.getChild("bone6");
		this.tail = root.getChild("tail");
		this.label = root.getChild("label");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData k9 = modelPartData.addChild("k9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, -21.75F));

		ModelPartData panels = k9.addChild("panels", ModelPartBuilder.create().uv(46, 138).cuboid(2.0F, -3.0F, -1.0F, 8.0F, 1.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 163).cuboid(2.5F, -3.25F, 1.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 163).cuboid(5.0F, -3.25F, 1.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(36, 163).cuboid(5.0F, -3.25F, 4.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(74, 164).cuboid(5.0F, -3.25F, 6.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 75).cuboid(7.5F, -3.25F, 6.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(44, 163).cuboid(7.5F, -3.25F, 4.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 47).cuboid(2.5F, -3.25F, 4.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(82, 164).cuboid(2.5F, -3.25F, 6.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 163).cuboid(7.5F, -3.25F, 1.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, -10.9154F, 18.2172F));

		ModelPartData cube_r1 = panels.addChild("cube_r1", ModelPartBuilder.create().uv(164, 55).cuboid(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 51).cuboid(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -2.5429F, -0.7247F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r2 = panels.addChild("cube_r2", ModelPartBuilder.create().uv(92, 136).cuboid(-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -2.2929F, -1.2247F, -0.2618F, 0.0F, 0.0F));

		ModelPartData torso = k9.addChild("torso", ModelPartBuilder.create().uv(72, 29).cuboid(-6.0F, -12.0F, 11.0F, 12.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.9F, 4.1F, 8.7F, 20.0F, 2.0F, 27.0F, new Dilation(0.0F))
		.uv(0, 29).cuboid(-7.0F, -12.9154F, 10.2172F, 14.0F, 2.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 112).cuboid(-4.0F, -9.4201F, 10.0237F, 1.0F, 11.0F, 22.0F, new Dilation(0.0F))
		.uv(94, 0).cuboid(-6.1754F, -12.1894F, 11.0237F, 3.0F, 2.0F, 21.0F, new Dilation(0.0F))
		.uv(46, 115).cuboid(4.2004F, -11.215F, 11.0237F, 2.0F, 2.0F, 21.0F, new Dilation(0.0F))
		.uv(136, 23).cuboid(5.0F, -12.4201F, 11.0237F, 1.0F, 3.0F, 21.0F, new Dilation(0.0F))
		.uv(150, 146).cuboid(-7.0F, -1.4201F, 34.8237F, 14.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 164).cuboid(5.0F, -4.4F, 32.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(68, 162).cuboid(-4.0F, -4.4F, 32.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(162, 164).cuboid(-4.0F, -1.4F, 9.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 165).cuboid(-4.0F, -1.4F, 34.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 138).cuboid(5.0F, -5.4F, 32.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(140, 47).cuboid(-4.0F, -5.4F, 32.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 27).cuboid(-3.0F, -14.0F, 11.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 47).cuboid(2.0F, -14.0F, 11.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 83).cuboid(-3.0F, -15.0F, 11.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 85).cuboid(-7.4226F, 1.4862F, 9.0237F, 3.0F, 1.0F, 26.0F, new Dilation(0.0F))
		.uv(164, 59).cuboid(7.381F, 3.6563F, 7.2656F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 67).cuboid(-8.9662F, 3.4272F, 35.264F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 71).cuboid(6.9662F, 3.4272F, 35.264F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(164, 63).cuboid(-9.279F, 3.6706F, 7.2656F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 23).cuboid(-7.5F, 4.0F, 34.0F, 15.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 141).cuboid(-8.0F, 4.0F, 6.5F, 16.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 98).cuboid(4.4F, 5.0F, 10.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(156, 105).cuboid(-7.5F, 5.0F, 10.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(156, 112).cuboid(-7.5F, 5.0F, 30.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(156, 119).cuboid(4.5F, 5.0F, 30.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = torso.addChild("cube_r3", ModelPartBuilder.create().uv(72, 50).cuboid(-6.0F, -2.0F, 1.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 50).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 50).cuboid(-6.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.75F, 35.0F, 0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r4 = torso.addChild("cube_r4", ModelPartBuilder.create().uv(14, 83).cuboid(0.0F, -2.0F, 0.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, -0.1737F, 7.0152F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r5 = torso.addChild("cube_r5", ModelPartBuilder.create().uv(46, 112).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 83).cuboid(4.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 0.0F, 8.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r6 = torso.addChild("cube_r6", ModelPartBuilder.create().uv(112, 111).cuboid(1.0F, -4.0F, -23.0F, 0.0F, 8.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(6.1258F, -5.0926F, 33.0237F, 0.0F, 0.0F, -0.2269F));

		ModelPartData cube_r7 = torso.addChild("cube_r7", ModelPartBuilder.create().uv(112, 80).cuboid(1.0F, -5.0F, -23.0F, 0.0F, 9.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(-6.3508F, -5.0982F, 8.9F, 0.0F, 3.1416F, 0.2269F));

		ModelPartData cube_r8 = torso.addChild("cube_r8", ModelPartBuilder.create().uv(58, 85).cuboid(0.0F, 0.0F, -25.0F, 1.0F, 4.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(7.0341F, -1.6789F, 34.0237F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r9 = torso.addChild("cube_r9", ModelPartBuilder.create().uv(56, 53).cuboid(0.0F, -1.0F, -24.0F, 1.0F, 6.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.5799F, 33.0237F, 0.0F, 0.0F, -0.4363F));

		ModelPartData cube_r10 = torso.addChild("cube_r10", ModelPartBuilder.create().uv(0, 53).cuboid(0.0F, 1.0F, -24.0F, 1.0F, 3.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 0.5799F, 32.7237F, 0.0F, 0.0F, 0.4363F));

		ModelPartData cube_r11 = torso.addChild("cube_r11", ModelPartBuilder.create().uv(60, 162).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.5889F, 0.8127F, 35.7582F, 0.1745F, 0.0F, -0.1396F));

		ModelPartData cube_r12 = torso.addChild("cube_r12", ModelPartBuilder.create().uv(52, 162).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.5889F, 0.8127F, 35.7582F, 0.1745F, 0.0F, 0.1396F));

		ModelPartData cube_r13 = torso.addChild("cube_r13", ModelPartBuilder.create().uv(154, 160).cuboid(-11.0F, -14.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(17.1825F, 0.2081F, 33.7635F, 0.1745F, 0.0F, -0.0873F));

		ModelPartData cube_r14 = torso.addChild("cube_r14", ModelPartBuilder.create().uv(146, 160).cuboid(-11.0F, -14.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7414F, 1.9512F, 33.7635F, 0.1745F, 0.0F, 0.0873F));

		ModelPartData cube_r15 = torso.addChild("cube_r15", ModelPartBuilder.create().uv(150, 153).cuboid(-12.0F, -14.0F, -1.0F, 12.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 2.0868F, 32.9837F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r16 = torso.addChild("cube_r16", ModelPartBuilder.create().uv(52, 151).cuboid(-11.0F, -15.0F, -1.0F, 10.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 2.0304F, 8.5973F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r17 = torso.addChild("cube_r17", ModelPartBuilder.create().uv(158, 135).cuboid(1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.3743F, -0.5741F, 35.5087F, 0.48F, 0.0F, -0.1396F));

		ModelPartData cube_r18 = torso.addChild("cube_r18", ModelPartBuilder.create().uv(156, 126).cuboid(1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.3354F, -1.1308F, 35.5087F, 0.48F, 0.0F, 0.1396F));

		ModelPartData cube_r19 = torso.addChild("cube_r19", ModelPartBuilder.create().uv(120, 146).cuboid(-1.0F, -7.0F, 0.0F, 14.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -0.9583F, 34.9367F, 0.48F, 0.0F, 0.0F));

		ModelPartData cube_r20 = torso.addChild("cube_r20", ModelPartBuilder.create().uv(20, 155).cuboid(-1.8362F, -16.9992F, -0.028F, 2.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.2189F, 3.6831F, 7.2904F, -0.1745F, -0.0175F, -0.1396F));

		ModelPartData cube_r21 = torso.addChild("cube_r21", ModelPartBuilder.create().uv(138, 154).cuboid(-1.0F, -17.0F, -1.0F, 2.0F, 17.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-8.33F, 3.9793F, 8.2677F, -0.1745F, -0.0175F, 0.1396F));

		ModelPartData cube_r22 = torso.addChild("cube_r22", ModelPartBuilder.create().uv(142, 11).cuboid(-8.0F, -8.0F, 1.0F, 15.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 5.518F, 6.7164F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r23 = torso.addChild("cube_r23", ModelPartBuilder.create().uv(0, 145).cuboid(-7.0F, -8.0F, 1.0F, 13.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -3.3453F, 8.2792F, -0.1745F, 0.0F, 0.0F));

		ModelPartData head = k9.addChild("head", ModelPartBuilder.create().uv(142, 0).cuboid(-4.5F, -8.0F, 1.0F, 9.0F, 4.0F, 7.0F, new Dilation(0.0F))
		.uv(86, 141).cuboid(-4.5F, -4.0F, -1.0F, 9.0F, 5.0F, 8.0F, new Dilation(0.0F))
		.uv(28, 151).cuboid(-2.5F, -4.25F, -7.0F, 5.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.75F, -0.25F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r24 = head.addChild("cube_r24", ModelPartBuilder.create().uv(120, 154).cuboid(-1.0F, -4.0F, -5.0F, 2.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-2.8282F, 0.25F, -1.9115F, 0.0F, -0.2618F, 0.0F));

		ModelPartData cube_r25 = head.addChild("cube_r25", ModelPartBuilder.create().uv(92, 125).cuboid(-1.0F, -4.0F, -5.0F, 2.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(2.8282F, 0.35F, -1.9115F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r26 = head.addChild("cube_r26", ModelPartBuilder.create().uv(28, 145).cuboid(-4.0F, -4.0F, 6.0F, 8.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.948F, 0.2032F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r27 = head.addChild("cube_r27", ModelPartBuilder.create().uv(0, 155).cuboid(-3.0F, -7.0F, -1.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.109F, -1.5615F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r28 = head.addChild("cube_r28", ModelPartBuilder.create().uv(98, 154).cuboid(-4.0F, -8.0F, 0.0F, 8.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.609F, -2.0615F, -0.3927F, 0.0F, 0.0F));

		ModelPartData bone8 = head.addChild("bone8", ModelPartBuilder.create().uv(32, 83).cuboid(-0.85F, -12.0F, 1.1F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 83).cuboid(-0.4F, -11.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 1.25F, 3.0F, 0.0F, -0.3491F, 0.0F));

		ModelPartData cube_r29 = bone8.addChild("cube_r29", ModelPartBuilder.create().uv(110, 127).cuboid(0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.4429F, -11.0F, 0.3929F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r30 = bone8.addChild("cube_r30", ModelPartBuilder.create().uv(110, 125).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.1429F, -11.0F, 0.3929F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r31 = bone8.addChild("cube_r31", ModelPartBuilder.create().uv(110, 83).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -9.0F, 0.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r32 = bone8.addChild("cube_r32", ModelPartBuilder.create().uv(108, 50).cuboid(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -9.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData bone7 = head.addChild("bone7", ModelPartBuilder.create().uv(40, 83).cuboid(-0.85F, -12.0F, 1.1F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 83).cuboid(-0.4F, -11.5F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.25F, 3.0F, 0.0F, 0.3491F, 0.0F));

		ModelPartData cube_r33 = bone7.addChild("cube_r33", ModelPartBuilder.create().uv(110, 133).cuboid(0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.4429F, -11.0F, 0.3929F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r34 = bone7.addChild("cube_r34", ModelPartBuilder.create().uv(110, 131).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.1429F, -11.0F, 0.3929F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r35 = bone7.addChild("cube_r35", ModelPartBuilder.create().uv(110, 129).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -9.0F, 0.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r36 = bone7.addChild("cube_r36", ModelPartBuilder.create().uv(110, 80).cuboid(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -9.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData bone6 = head.addChild("bone6", ModelPartBuilder.create().uv(154, 19).cuboid(-1.0F, -2.0F, 12.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -2.0F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r37 = bone6.addChild("cube_r37", ModelPartBuilder.create().uv(90, 138).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 3.5F, 12.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r38 = bone6.addChild("cube_r38", ModelPartBuilder.create().uv(98, 50).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 11.75F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r39 = bone6.addChild("cube_r39", ModelPartBuilder.create().uv(92, 115).cuboid(-3.0F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.75F, 5.5F, -0.6981F, 0.0F, 0.0F));

		ModelPartData cube_r40 = bone6.addChild("cube_r40", ModelPartBuilder.create().uv(156, 80).cuboid(-4.0F, -6.0F, 1.0F, 7.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 1.9047F, 10.0292F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r41 = bone6.addChild("cube_r41", ModelPartBuilder.create().uv(76, 154).cuboid(-4.0F, -5.0F, -3.0F, 6.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 1.9047F, 10.0292F, 0.0436F, 0.0F, 0.0F));

		ModelPartData tail = k9.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -9.0F, 32.4F));

		ModelPartData cube_r42 = tail.addChild("cube_r42", ModelPartBuilder.create().uv(142, 19).cuboid(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -2.0365F, 10.0686F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r43 = tail.addChild("cube_r43", ModelPartBuilder.create().uv(156, 89).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 1.0F, 2.6F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r44 = tail.addChild("cube_r44", ModelPartBuilder.create().uv(162, 19).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.6F, 0.2618F, 0.0F, 0.0F));

		ModelPartData label = k9.addChild("label", ModelPartBuilder.create().uv(48, 83).cuboid(-6.0F, -11.4F, 32.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, -0.25F));

		ModelPartData cube_r45 = label.addChild("cube_r45", ModelPartBuilder.create().uv(110, 50).cuboid(-1.1196F, 0.4465F, -24.9763F, 1.0F, 4.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(-7.2341F, -8.1412F, 34.25F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r46 = label.addChild("cube_r46", ModelPartBuilder.create().uv(164, 130).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.3508F, -10.1182F, 34.2737F, 0.0F, 0.0F, -0.2269F));

		ModelPartData cube_r47 = label.addChild("cube_r47", ModelPartBuilder.create().uv(164, 126).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.5501F, -10.3487F, 34.15F, 0.0F, 0.0F, 0.2269F));

		ModelPartData cube_r48 = label.addChild("cube_r48", ModelPartBuilder.create().uv(106, 162).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.8007F, -8.1695F, 34.2737F, 0.0F, 0.0F, -0.2269F));

		ModelPartData cube_r49 = label.addChild("cube_r49", ModelPartBuilder.create().uv(98, 162).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -8.4F, 34.15F, 0.0F, 0.0F, 0.2269F));

		ModelPartData bone = label.addChild("bone", ModelPartBuilder.create().uv(26, 83).cuboid(-7.0F, -6.0F, 21.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, -5.0F, 0.25F, 0.0F, 0.0F, 0.2269F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create().uv(132, 23).cuboid(-3.75F, -8.4201F, 1.0237F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 112).cuboid(-3.75F, -6.4201F, 0.0237F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(114, 162).cuboid(-3.75F, -8.4201F, -0.9763F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 112).cuboid(-3.75F, -8.4201F, 0.0237F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, 18.0F));

		ModelPartData bone3 = bone.addChild("bone3", ModelPartBuilder.create().uv(104, 50).cuboid(-6.75F, -9.4201F, 24.0237F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(146, 154).cuboid(-6.75F, -6.4201F, 23.0237F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 163).cuboid(-6.75F, -9.4201F, 26.0237F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(162, 160).cuboid(-6.75F, -7.4201F, 23.0237F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		k9.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart getPart() {
        return k9;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}