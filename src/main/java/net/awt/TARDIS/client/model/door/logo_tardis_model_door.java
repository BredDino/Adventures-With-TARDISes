package net.awt.TARDIS.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class logo_tardis_model_door extends DoorModel {
	private final ModelPart bone;
	private final ModelPart right_door;
	private final ModelPart rd1;
	private final ModelPart rd2;
	private final ModelPart rd3;
	private final ModelPart rd4;
	private final ModelPart rd5;
	private final ModelPart rd6;
	private final ModelPart rd7;
	private final ModelPart rd8;
	private final ModelPart rd9;
	private final ModelPart rd10;
	private final ModelPart rd11;
	private final ModelPart left_door;
	private final ModelPart bon2;
	private final ModelPart bon3;
	private final ModelPart bon4;
	private final ModelPart bon5;
	private final ModelPart bon6;
	private final ModelPart bon7;
	private final ModelPart bon8;
	private final ModelPart bon9;
	private final ModelPart bon10;
	private final ModelPart bon11;
	private final ModelPart bon12;
	public logo_tardis_model_door(ModelPart root) {
		this.bone = root.getChild("bone");
		this.right_door = this.bone.getChild("right_door");
		this.rd1 = this.right_door.getChild("rd1");
		this.rd2 = this.right_door.getChild("rd2");
		this.rd3 = this.right_door.getChild("rd3");
		this.rd4 = this.right_door.getChild("rd4");
		this.rd5 = this.right_door.getChild("rd5");
		this.rd6 = this.right_door.getChild("rd6");
		this.rd7 = this.right_door.getChild("rd7");
		this.rd8 = this.right_door.getChild("rd8");
		this.rd9 = this.right_door.getChild("rd9");
		this.rd10 = this.right_door.getChild("rd10");
		this.rd11 = this.right_door.getChild("rd11");
		this.left_door = this.bone.getChild("left_door");
		this.bon2 = this.left_door.getChild("bon2");
		this.bon3 = this.left_door.getChild("bon3");
		this.bon4 = this.left_door.getChild("bon4");
		this.bon5 = this.left_door.getChild("bon5");
		this.bon6 = this.left_door.getChild("bon6");
		this.bon7 = this.left_door.getChild("bon7");
		this.bon8 = this.left_door.getChild("bon8");
		this.bon9 = this.left_door.getChild("bon9");
		this.bon10 = this.left_door.getChild("bon10");
		this.bon11 = this.left_door.getChild("bon11");
		this.bon12 = this.left_door.getChild("bon12");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(0.0F, -5.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData right_door = bone.addChild("right_door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 15.0F, -5.0F));

		ModelPartData rd1 = right_door.addChild("rd1", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 14.0F, 0.0F));

		ModelPartData cube_r1 = rd1.addChild("cube_r1", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd2 = right_door.addChild("rd2", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.1F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.1F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.1F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r2 = rd2.addChild("cube_r2", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd3 = right_door.addChild("rd3", ModelPartBuilder.create().uv(14, 13).cuboid(2.0F, -6.2F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.2F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.2F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r3 = rd3.addChild("cube_r3", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.2F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd4 = right_door.addChild("rd4", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.3F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.3F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.3F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r4 = rd4.addChild("cube_r4", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd5 = right_door.addChild("rd5", ModelPartBuilder.create().uv(14, 4).cuboid(2.0F, -5.4F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -5.4F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -5.4F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 6.0F, 0.0F));

		ModelPartData cube_r5 = rd5.addChild("cube_r5", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.4F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd6 = right_door.addChild("rd6", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.5F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.5F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, 0.0F));

		ModelPartData cube_r6 = rd6.addChild("cube_r6", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd7 = right_door.addChild("rd7", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.6F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.6F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.6F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r7 = rd7.addChild("cube_r7", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.6F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd8 = right_door.addChild("rd8", ModelPartBuilder.create().uv(0, 13).cuboid(2.0F, -6.7F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.7F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.7F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r8 = rd8.addChild("cube_r8", ModelPartBuilder.create().uv(14, 13).cuboid(-2.0F, -5.7F, -0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd9 = right_door.addChild("rd9", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.8F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.8F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.8F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -5.0F, 0.0F));

		ModelPartData cube_r9 = rd9.addChild("cube_r9", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.8F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd10 = right_door.addChild("rd10", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.9F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.9F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.9F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -6.0F, 0.0F));

		ModelPartData cube_r10 = rd10.addChild("cube_r10", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.9F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd11 = right_door.addChild("rd11", ModelPartBuilder.create().uv(40, 30).cuboid(-1.99F, 0.5F, -1.06F, 1.0F, 22.0F, 5.0F, new Dilation(0.0F))
		.uv(39, 30).cuboid(-1.01F, 0.5F, -1.06F, 2.0F, 22.0F, 5.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(1.99F, 0.5F, -2.99F, 1.0F, 22.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(0.99F, 0.5F, -1.01F, 2.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(-0.99F, 0.5F, -3.99F, 1.0F, 22.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(-0.01F, 0.5F, -3.99F, 2.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 34).cuboid(-5.0F, 0.5F, -1.99F, 5.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 34).cuboid(-5.0F, 0.5F, -1.01F, 3.0F, 22.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -9.0F, 1.0F));

		ModelPartData left_door = bone.addChild("left_door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 15.0F, 5.0F));

		ModelPartData bon2 = left_door.addChild("bon2", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.0F, -5.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 14.0F, 0.0F));

		ModelPartData cube_r11 = bon2.addChild("cube_r11", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon3 = left_door.addChild("bon3", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.1F, -5.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.1F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.1F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r12 = bon3.addChild("cube_r12", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon4 = left_door.addChild("bon4", ModelPartBuilder.create().uv(14, 13).cuboid(2.0F, -5.2F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -5.2F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -5.2F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 12.0F, 0.0F));

		ModelPartData cube_r13 = bon4.addChild("cube_r13", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.2F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon5 = left_door.addChild("bon5", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.3F, -5.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.3F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.3F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r14 = bon5.addChild("cube_r14", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon6 = left_door.addChild("bon6", ModelPartBuilder.create().uv(0, 4).cuboid(2.0F, -6.4F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.4F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.4F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r15 = bon6.addChild("cube_r15", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.4F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon7 = left_door.addChild("bon7", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.5F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.5F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r16 = bon7.addChild("cube_r16", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon8 = left_door.addChild("bon8", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.6F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.6F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.6F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r17 = bon8.addChild("cube_r17", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.6F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon9 = left_door.addChild("bon9", ModelPartBuilder.create().uv(0, 13).cuboid(2.0F, -6.7F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.7F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.7F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r18 = bon9.addChild("cube_r18", ModelPartBuilder.create().uv(14, 13).mirrored().cuboid(-2.0F, -6.7F, -0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon10 = left_door.addChild("bon10", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.8F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.8F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.8F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -5.0F, 0.0F));

		ModelPartData cube_r19 = bon10.addChild("cube_r19", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.8F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon11 = left_door.addChild("bon11", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -8.9F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -8.9F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -8.9F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r20 = bon11.addChild("cube_r20", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -8.9F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon12 = left_door.addChild("bon12", ModelPartBuilder.create().uv(39, 30).cuboid(-1.99F, 0.5F, -6.94F, 2.0F, 22.0F, 5.0F, new Dilation(0.0F))
		.uv(40, 30).cuboid(-0.01F, 0.5F, -6.94F, 1.0F, 22.0F, 5.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(1.99F, 0.5F, -2.01F, 1.0F, 22.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(0.99F, 0.5F, -2.99F, 2.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(-0.99F, 0.5F, -1.01F, 1.0F, 22.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(-0.01F, 0.5F, -0.01F, 2.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 34).cuboid(-5.0F, 0.5F, -2.01F, 5.0F, 22.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 34).cuboid(-4.94F, 0.5F, -2.99F, 3.0F, 22.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -9.0F, 2.0F));
		return TexturedModelData.of(modelData, 64, 64);
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
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			DoorHandler door = doorEntity.tardis().get().door();
			left_door.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			right_door.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = -70.0F;
			left_door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			right_door.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
		}

		matrices.push();
		matrices.scale(1.5f, 1.5f, 1.5f);
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