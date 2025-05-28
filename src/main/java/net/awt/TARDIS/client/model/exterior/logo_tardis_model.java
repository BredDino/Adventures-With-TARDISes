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
public class logo_tardis_model extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart title_about_police_box;
	private final ModelPart lamp;
	private final ModelPart text_up;
	private final ModelPart bon43;
	private final ModelPart bon44;
	private final ModelPart bon45;
	private final ModelPart bon46;
	private final ModelPart bon47;
	private final ModelPart bon48;
	private final ModelPart bon;
	private final ModelPart text;
	private final ModelPart bon35;
	private final ModelPart bon36;
	private final ModelPart bon37;
	private final ModelPart bon38;
	private final ModelPart bon39;
	private final ModelPart bon40;
	private final ModelPart bon41;
	private final ModelPart bon42;
	private final ModelPart down;
	private final ModelPart bon26;
	private final ModelPart bon27;
	private final ModelPart bon30;
	private final ModelPart bon29;
	private final ModelPart bon28;
	private final ModelPart bon31;
	private final ModelPart bon32;
	private final ModelPart bon33;
	private final ModelPart bon34;
	private final ModelPart other;
	private final ModelPart bon13;
	private final ModelPart bon14;
	private final ModelPart bon15;
	private final ModelPart bon16;
	private final ModelPart bon17;
	private final ModelPart bon18;
	private final ModelPart bon19;
	private final ModelPart bon20;
	private final ModelPart bon21;
	private final ModelPart bon22;
	private final ModelPart bon23;
	private final ModelPart bon57;
	private final ModelPart bon24;
	private final ModelPart bon49;
	private final ModelPart bon50;
	private final ModelPart bon51;
	private final ModelPart bon52;
	private final ModelPart bon25;
	private final ModelPart bon56;
	private final ModelPart bon55;
	private final ModelPart bon54;
	private final ModelPart bon53;
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
	public logo_tardis_model(ModelPart root) {
		this.bone = root.getChild("bone");
		this.title_about_police_box = this.bone.getChild("title_about_police_box");
		this.lamp = this.bone.getChild("lamp");
		this.text_up = this.bone.getChild("text_up");
		this.bon43 = this.text_up.getChild("bon43");
		this.bon44 = this.text_up.getChild("bon44");
		this.bon45 = this.text_up.getChild("bon45");
		this.bon46 = this.text_up.getChild("bon46");
		this.bon47 = this.text_up.getChild("bon47");
		this.bon48 = this.text_up.getChild("bon48");
		this.bon = this.bon48.getChild("bon");
		this.text = this.bone.getChild("text");
		this.bon35 = this.text.getChild("bon35");
		this.bon36 = this.text.getChild("bon36");
		this.bon37 = this.text.getChild("bon37");
		this.bon38 = this.text.getChild("bon38");
		this.bon39 = this.text.getChild("bon39");
		this.bon40 = this.text.getChild("bon40");
		this.bon41 = this.text.getChild("bon41");
		this.bon42 = this.text.getChild("bon42");
		this.down = this.bone.getChild("down");
		this.bon26 = this.down.getChild("bon26");
		this.bon27 = this.down.getChild("bon27");
		this.bon30 = this.down.getChild("bon30");
		this.bon29 = this.down.getChild("bon29");
		this.bon28 = this.down.getChild("bon28");
		this.bon31 = this.down.getChild("bon31");
		this.bon32 = this.down.getChild("bon32");
		this.bon33 = this.down.getChild("bon33");
		this.bon34 = this.down.getChild("bon34");
		this.other = this.bone.getChild("other");
		this.bon13 = this.other.getChild("bon13");
		this.bon14 = this.other.getChild("bon14");
		this.bon15 = this.other.getChild("bon15");
		this.bon16 = this.other.getChild("bon16");
		this.bon17 = this.other.getChild("bon17");
		this.bon18 = this.other.getChild("bon18");
		this.bon19 = this.other.getChild("bon19");
		this.bon20 = this.other.getChild("bon20");
		this.bon21 = this.other.getChild("bon21");
		this.bon22 = this.other.getChild("bon22");
		this.bon23 = this.other.getChild("bon23");
		this.bon57 = this.other.getChild("bon57");
		this.bon24 = this.other.getChild("bon24");
		this.bon49 = this.bon24.getChild("bon49");
		this.bon50 = this.bon24.getChild("bon50");
		this.bon51 = this.bon24.getChild("bon51");
		this.bon52 = this.bon24.getChild("bon52");
		this.bon25 = this.other.getChild("bon25");
		this.bon56 = this.bon25.getChild("bon56");
		this.bon55 = this.bon25.getChild("bon55");
		this.bon54 = this.bon25.getChild("bon54");
		this.bon53 = this.bon25.getChild("bon53");
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
	public logo_tardis_model()  {
		this(getTexturedModelData().createModel());
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(0.0F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData title_about_police_box = bone.addChild("title_about_police_box", ModelPartBuilder.create().uv(0, 10).cuboid(8.1F, -2.0F, -6.0F, 0.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData cube_r1 = title_about_police_box.addChild("cube_r1", ModelPartBuilder.create().uv(0, 10).cuboid(8.1F, -2.0F, -7.0F, 0.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r2 = title_about_police_box.addChild("cube_r2", ModelPartBuilder.create().uv(0, 10).cuboid(8.1F, -2.0F, -7.0F, 0.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r3 = title_about_police_box.addChild("cube_r3", ModelPartBuilder.create().uv(0, 10).cuboid(8.1F, -2.0F, -7.0F, 0.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData lamp = bone.addChild("lamp", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r4 = lamp.addChild("cube_r4", ModelPartBuilder.create().uv(43, 1).cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = lamp.addChild("cube_r5", ModelPartBuilder.create().uv(41, 0).cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 18).cuboid(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = lamp.addChild("cube_r6", ModelPartBuilder.create().uv(41, 0).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 0.7418F, 0.0F));

		ModelPartData cube_r7 = lamp.addChild("cube_r7", ModelPartBuilder.create().uv(10, 14).cuboid(0.5F, -0.5F, 0.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -2.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData text_up = bone.addChild("text_up", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 3.0F, -7.0F));

		ModelPartData bon43 = text_up.addChild("bon43", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, 0.0F, -7.05F, 14.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-7.0F, -1.1F, -7.05F, 14.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 0.0F, 7.0F));

		ModelPartData bon44 = text_up.addChild("bon44", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, 0.0F, -6.95F, 14.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-7.0F, -1.1F, -6.95F, 14.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 0.0F, 18.0F));

		ModelPartData bon45 = text_up.addChild("bon45", ModelPartBuilder.create().uv(24, 8).cuboid(4.05F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(4.05F, -1.1F, -4.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 0.0F, 7.0F));

		ModelPartData bon46 = text_up.addChild("bon46", ModelPartBuilder.create().uv(24, 8).cuboid(3.95F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(3.95F, -1.1F, -4.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-18.0F, 0.0F, 7.0F));

		ModelPartData bon47 = text_up.addChild("bon47", ModelPartBuilder.create().uv(0, 24).cuboid(-1.0F, -1.1F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.0F, 0.0F, 7.0F));

		ModelPartData bon48 = text_up.addChild("bon48", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F, -24.0F, 7.0F));

		ModelPartData bon = bon48.addChild("bon", ModelPartBuilder.create().uv(4, 44).cuboid(3.99F, 22.91F, -7.04F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bon.addChild("cube_r8", ModelPartBuilder.create().uv(4, 44).cuboid(4.04F, -2.09F, -6.99F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r9 = bon.addChild("cube_r9", ModelPartBuilder.create().uv(4, 44).cuboid(4.04F, -2.09F, -6.99F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r10 = bon.addChild("cube_r10", ModelPartBuilder.create().uv(4, 44).cuboid(3.99F, -2.09F, -7.04F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData text = bone.addChild("text", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 4.0F, -7.0F));

		ModelPartData bon35 = text.addChild("bon35", ModelPartBuilder.create().uv(10, 33).cuboid(-4.95F, 0.0F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(-4.95F, -1.1F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

		ModelPartData bon36 = text.addChild("bon36", ModelPartBuilder.create().uv(10, 33).cuboid(-6.05F, 0.0F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(-6.05F, -1.1F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, 1.0F, 0.0F));

		ModelPartData bon37 = text.addChild("bon37", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 1.0F, 7.0F));

		ModelPartData bon38 = text.addChild("bon38", ModelPartBuilder.create().uv(10, 33).cuboid(2.05F, 0.0F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(2.05F, -1.1F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon39 = text.addChild("bon39", ModelPartBuilder.create().uv(10, 33).cuboid(2.05F, 0.0F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(2.05F, -1.1F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bon40 = text.addChild("bon40", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon41 = text.addChild("bon41", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bon42 = text.addChild("bon42", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData down = bone.addChild("down", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 29.0F, -7.0F));

		ModelPartData bon26 = down.addChild("bon26", ModelPartBuilder.create().uv(10, 33).cuboid(-4.95F, 0.0F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(-4.95F, -1.1F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

		ModelPartData bon27 = down.addChild("bon27", ModelPartBuilder.create().uv(10, 33).cuboid(-6.05F, 0.0F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(-6.05F, -1.1F, 9.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, 1.0F, 0.0F));

		ModelPartData bon30 = down.addChild("bon30", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 1.0F, 7.0F));

		ModelPartData bon29 = down.addChild("bon29", ModelPartBuilder.create().uv(10, 33).cuboid(2.05F, 0.0F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(2.05F, -1.1F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon28 = down.addChild("bon28", ModelPartBuilder.create().uv(10, 33).cuboid(2.05F, 0.0F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(10, 33).cuboid(2.05F, -1.1F, 2.05F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bon31 = down.addChild("bon31", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon32 = down.addChild("bon32", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bon33 = down.addChild("bon33", ModelPartBuilder.create().uv(34, 17).cuboid(-2.0F, 0.0F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(-2.0F, -1.1F, 2.05F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bon34 = down.addChild("bon34", ModelPartBuilder.create().uv(24, 18).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData other = bone.addChild("other", ModelPartBuilder.create().uv(11, 6).cuboid(4.0F, -1.1F, 1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 6).cuboid(4.0F, -1.1F, -12.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 29.0F, 5.0F));

		ModelPartData bon13 = other.addChild("bon13", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -1.0F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.0F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.0F, 5.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -10.0F));

		ModelPartData cube_r11 = bon13.addChild("cube_r11", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r12 = bon13.addChild("cube_r12", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon14 = other.addChild("bon14", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -2.1F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -2.1F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -2.1F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -2.1F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -2.1F, 5.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -2.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -10.0F));

		ModelPartData cube_r13 = bon14.addChild("cube_r13", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r14 = bon14.addChild("cube_r14", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon15 = other.addChild("bon15", ModelPartBuilder.create().uv(24, 24).cuboid(-3.0F, -6.2F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(-3.0F, -6.2F, 9.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -6.2F, 11.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -6.2F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 5).cuboid(-1.0F, -6.2F, 5.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(38, 5).cuboid(-1.0F, -6.2F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -10.0F));

		ModelPartData cube_r15 = bon15.addChild("cube_r15", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.2F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r16 = bon15.addChild("cube_r16", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.2F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon16 = other.addChild("bon16", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -2.3F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -2.3F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -2.3F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -2.3F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -2.3F, 5.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -2.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, -10.0F));

		ModelPartData cube_r17 = bon16.addChild("cube_r17", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r18 = bon16.addChild("cube_r18", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon17 = other.addChild("bon17", ModelPartBuilder.create().uv(24, 24).cuboid(-3.0F, -6.4F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(-3.0F, -6.4F, 9.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -6.4F, 11.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -6.4F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 5).cuboid(-1.0F, -6.4F, 5.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(38, 5).cuboid(-1.0F, -6.4F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -10.0F));

		ModelPartData cube_r19 = bon17.addChild("cube_r19", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.4F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r20 = bon17.addChild("cube_r20", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.4F, -1.05F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon18 = other.addChild("bon18", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -1.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -1.5F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.5F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.5F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.5F, 5.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.5F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -13.0F, -10.0F));

		ModelPartData cube_r21 = bon18.addChild("cube_r21", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r22 = bon18.addChild("cube_r22", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon19 = other.addChild("bon19", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -1.6F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -1.6F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.6F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.6F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.6F, 5.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.6F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -14.0F, -10.0F));

		ModelPartData cube_r23 = bon19.addChild("cube_r23", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.6F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r24 = bon19.addChild("cube_r24", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.6F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon20 = other.addChild("bon20", ModelPartBuilder.create().uv(24, 24).cuboid(-3.0F, -5.7F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(-3.0F, -5.7F, 9.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -5.7F, 11.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-2.0F, -5.7F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 13).mirrored().cuboid(-1.0F, -5.7F, 5.05F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 13).mirrored().cuboid(-1.0F, -5.7F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -15.0F, -10.0F));

		ModelPartData cube_r25 = bon20.addChild("cube_r25", ModelPartBuilder.create().uv(0, 13).cuboid(-2.0F, -5.7F, -1.05F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r26 = bon20.addChild("cube_r26", ModelPartBuilder.create().uv(0, 13).mirrored().cuboid(-2.0F, -5.7F, -1.05F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.0F, 0.0F, 9.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon21 = other.addChild("bon21", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -1.8F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -1.8F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.8F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.8F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.8F, 5.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.8F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -20.0F, -10.0F));

		ModelPartData cube_r27 = bon21.addChild("cube_r27", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.8F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r28 = bon21.addChild("cube_r28", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.8F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon22 = other.addChild("bon22", ModelPartBuilder.create().uv(24, 4).cuboid(-3.0F, -1.9F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -1.9F, 9.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.9F, 11.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(-2.0F, -1.9F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.9F, 5.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-1.0F, -1.9F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -21.0F, -10.0F));

		ModelPartData cube_r29 = bon22.addChild("cube_r29", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.9F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r30 = bon22.addChild("cube_r30", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.9F, -1.05F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon23 = other.addChild("bon23", ModelPartBuilder.create().uv(40, 30).cuboid(4.01F, -0.5F, 0.06F, 1.0F, 23.0F, 5.0F, new Dilation(0.0F))
		.uv(40, 30).cuboid(4.99F, -0.5F, 0.0F, 1.0F, 23.0F, 5.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(6.99F, -0.5F, 4.99F, 1.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(5.99F, -0.5F, 4.01F, 2.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(4.01F, -0.5F, 5.99F, 1.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(4.99F, -0.5F, 6.99F, 2.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 34).cuboid(0.0F, -0.5F, 4.99F, 5.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 34).cuboid(0.0F, -0.5F, 4.01F, 4.0F, 23.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -23.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bon57 = other.addChild("bon57", ModelPartBuilder.create().uv(40, 30).cuboid(4.99F, -0.5F, 0.0F, 1.0F, 23.0F, 5.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(6.99F, -0.5F, 4.99F, 1.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(5.99F, -0.5F, 4.01F, 2.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 33).cuboid(4.01F, -0.5F, 5.99F, 1.0F, 23.0F, 2.0F, new Dilation(0.0F))
		.uv(43, 34).cuboid(4.99F, -0.5F, 6.99F, 2.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 34).cuboid(0.0F, -0.5F, 4.99F, 5.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 34).cuboid(0.06F, -0.5F, 4.01F, 4.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 30).cuboid(4.01F, -0.5F, 0.0F, 1.0F, 23.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -23.0F, -5.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bon24 = other.addChild("bon24", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -23.0F, -5.0F));

		ModelPartData bon49 = bon24.addChild("bon49", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, 23.99F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, 22.91F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bon50 = bon24.addChild("bon50", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bon51 = bon24.addChild("bon51", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon52 = bon24.addChild("bon52", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bon25 = other.addChild("bon25", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -48.0F, -5.0F));

		ModelPartData bon56 = bon25.addChild("bon56", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, 23.99F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, 22.91F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bon55 = bon25.addChild("bon55", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bon54 = bon25.addChild("bon54", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon53 = bon25.addChild("bon53", ModelPartBuilder.create().uv(0, 40).cuboid(5.04F, -1.01F, -8.04F, 3.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(5.04F, -2.09F, -8.04F, 3.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 25.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData right_door = bone.addChild("right_door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 15.0F, -5.0F));

		ModelPartData rd1 = right_door.addChild("rd1", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 14.0F, 0.0F));

		ModelPartData cube_r31 = rd1.addChild("cube_r31", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd2 = right_door.addChild("rd2", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.1F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.1F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.1F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r32 = rd2.addChild("cube_r32", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd3 = right_door.addChild("rd3", ModelPartBuilder.create().uv(14, 13).cuboid(2.0F, -6.2F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.2F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.2F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r33 = rd3.addChild("cube_r33", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.2F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd4 = right_door.addChild("rd4", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.3F, 1.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.3F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.3F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r34 = rd4.addChild("cube_r34", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd5 = right_door.addChild("rd5", ModelPartBuilder.create().uv(14, 4).cuboid(2.0F, -5.4F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -5.4F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -5.4F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 6.0F, 0.0F));

		ModelPartData cube_r35 = rd5.addChild("cube_r35", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.4F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd6 = right_door.addChild("rd6", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.5F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.5F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, 0.0F));

		ModelPartData cube_r36 = rd6.addChild("cube_r36", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd7 = right_door.addChild("rd7", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.6F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.6F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.6F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r37 = rd7.addChild("cube_r37", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.6F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd8 = right_door.addChild("rd8", ModelPartBuilder.create().uv(0, 13).cuboid(2.0F, -6.7F, 0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.7F, -3.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.7F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r38 = rd8.addChild("cube_r38", ModelPartBuilder.create().uv(0, 13).cuboid(-2.0F, -5.7F, -0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd9 = right_door.addChild("rd9", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.8F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.8F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.8F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -5.0F, 0.0F));

		ModelPartData cube_r39 = rd9.addChild("cube_r39", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.8F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData rd10 = right_door.addChild("rd10", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.9F, 0.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.9F, -3.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.9F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -6.0F, 0.0F));

		ModelPartData cube_r40 = rd10.addChild("cube_r40", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.9F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

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

		ModelPartData cube_r41 = bon2.addChild("cube_r41", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon3 = left_door.addChild("bon3", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.1F, -5.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.1F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.1F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 13.0F, 0.0F));

		ModelPartData cube_r42 = bon3.addChild("cube_r42", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.1F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon4 = left_door.addChild("bon4", ModelPartBuilder.create().uv(14, 13).cuboid(2.0F, -5.2F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -5.2F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -5.2F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 12.0F, 0.0F));

		ModelPartData cube_r43 = bon4.addChild("cube_r43", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -5.2F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon5 = left_door.addChild("bon5", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.3F, -5.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.3F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.3F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r44 = bon5.addChild("cube_r44", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon6 = left_door.addChild("bon6", ModelPartBuilder.create().uv(0, 4).cuboid(2.0F, -6.4F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.4F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.4F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, 0.0F));

		ModelPartData cube_r45 = bon6.addChild("cube_r45", ModelPartBuilder.create().uv(38, 5).cuboid(-1.0F, -6.4F, -0.95F, 2.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon7 = left_door.addChild("bon7", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -1.5F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -1.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -1.5F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r46 = bon7.addChild("cube_r46", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -1.5F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon8 = left_door.addChild("bon8", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.6F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.6F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.6F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData cube_r47 = bon8.addChild("cube_r47", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.6F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon9 = left_door.addChild("bon9", ModelPartBuilder.create().uv(0, 13).cuboid(2.0F, -6.7F, -4.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(5.0F, -6.7F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(3.0F, -6.7F, 1.0F, 3.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r48 = bon9.addChild("cube_r48", ModelPartBuilder.create().uv(0, 13).mirrored().cuboid(-2.0F, -6.7F, -0.95F, 3.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon10 = left_door.addChild("bon10", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -2.8F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -2.8F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -2.8F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -5.0F, 0.0F));

		ModelPartData cube_r49 = bon10.addChild("cube_r49", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -2.8F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bon11 = left_door.addChild("bon11", ModelPartBuilder.create().uv(31, 0).cuboid(2.0F, -8.9F, -4.95F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(5.0F, -8.9F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 5).cuboid(3.0F, -8.9F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r50 = bon11.addChild("cube_r50", ModelPartBuilder.create().uv(28, 27).cuboid(-1.0F, -8.9F, -0.95F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

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
		matrices.scale(1.5f, 1.5f, 1.5f);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = exterior.tardis().get().door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.bone.getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.bone.getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = -70.0F;
			this.bone.getChild("left_door").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.bone.getChild("right_door").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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