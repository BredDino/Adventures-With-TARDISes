package net.awt.TARDIS.exterior.client.model.exterior;

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
public class hottubtimemachine extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart hottub;
	private final ModelPart water;
	public hottubtimemachine(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hottub = this.bone.getChild("hottub");
		this.water = this.bone.getChild("water");
	}

	public hottubtimemachine()   {
		this(getTexturedModelData().createModel());
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
	public void renderDoors(ClientTardis clientTardis, ExteriorBlockEntity exteriorBlockEntity, ModelPart modelPart, MatrixStack matrixStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3, boolean b) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {

		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {


		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0.0F, -1.5F, 0.0F);
		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		if ( exterior.tardis().isEmpty())
			return;

		DoorHandler door =  exterior.tardis().get().door();
		this.water.visible = door.isOpen();

		matrices.push();
		matrices.scale(1, 1, 1);
		matrices.translate(0, -1.59f, 0);
		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}