// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.awt.entity.client;

import net.awt.entity.custom.CybermatEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CybermatModel<T extends CybermatEntity> extends SinglePartEntityModel<T> {
	private final ModelPart cybermatt2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	public CybermatModel(ModelPart root) {
		this.cybermatt2 = root.getChild("cybermatt2");
		this.bone = this.cybermatt2.getChild("bone");
		this.bone2 = this.cybermatt2.getChild("bone2");
		this.bone3 = this.cybermatt2.getChild("bone3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData cybermatt2 = modelPartData.addChild("cybermatt2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 23.0F, 0.0F));

		ModelPartData bone = cybermatt2.addChild("bone", ModelPartBuilder.create().uv(30, 29).cuboid(-1.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 8).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -1.0F, -1.0F, 6.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(24, 29).cuboid(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 30).cuboid(2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 26).cuboid(1.1F, -0.8929F, -0.9787F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 26).cuboid(-3.1F, -0.8929F, -0.9787F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 31).cuboid(1.1F, 0.9071F, 0.8213F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 4).cuboid(-3.1F, 0.9071F, 0.8213F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, -6.0F));

		ModelPartData bone2 = cybermatt2.addChild("bone2", ModelPartBuilder.create().uv(24, 26).cuboid(-1.0F, -2.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(22, 0).cuboid(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 13).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(12, 30).cuboid(1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(18, 30).cuboid(-2.0F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-2.0F, 1.0F, -5.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -2.0F));

		ModelPartData bone3 = cybermatt2.addChild("bone3", ModelPartBuilder.create().uv(22, 4).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 20).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(6, 30).cuboid(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 3.0F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r1 = bone3.addChild("cube_r1", ModelPartBuilder.create().uv(0, 26).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 1.0F, 3.0F, -0.0873F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		cybermatt2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart getPart() {
        return cybermatt2;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}