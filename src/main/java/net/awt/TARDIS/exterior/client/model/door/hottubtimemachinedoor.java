package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
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
public class hottubtimemachinedoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart hottub;
	private final ModelPart water;
	public hottubtimemachinedoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hottub = this.bone.getChild("hottub");
		this.water = this.bone.getChild("water");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, 24.0F, -8.0F));

		ModelPartData hottub = bone.addChild("hottub", ModelPartBuilder.create().uv(0, 47).cuboid(-24.0F, -13.0F, 22.0F, 32.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 75).cuboid(-18.0F, -7.0F, -6.0F, 20.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-24.0F, -13.0F, -8.0F, 32.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 75).cuboid(-18.0F, -7.0F, 18.0F, 20.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-24.0F, -1.0F, -8.0F, 32.0F, 1.0F, 32.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = hottub.addChild("cube_r1", ModelPartBuilder.create().uv(60, 61).cuboid(-24.0F, -12.0F, 0.0F, 28.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 61).cuboid(-24.0F, -12.0F, 0.0F, 28.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-24.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = hottub.addChild("cube_r2", ModelPartBuilder.create().uv(0, 61).cuboid(-24.0F, -12.0F, 0.0F, 28.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r3 = hottub.addChild("cube_r3", ModelPartBuilder.create().uv(68, 33).cuboid(-24.0F, -6.0F, -2.0F, 28.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r4 = hottub.addChild("cube_r4", ModelPartBuilder.create().uv(68, 43).cuboid(-24.0F, -6.0F, -2.0F, 28.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-20.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData water = bone.addChild("water", ModelPartBuilder.create().uv(0, 88).cuboid(-14.0F, -8.0F, -14.0F, 28.0F, 2.0F, 28.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, 0.0F, 8.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
		return null;
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if ( doorEntity.tardis().isEmpty())
			return;

		DoorHandler door =  doorEntity.tardis().get().door();
		this.water.visible = door.isOpen();

		matrices.push();
		matrices.scale(1F, 1F, 1F);
		matrices.translate(0.0F, -1.5F, 0.0F);
		super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}