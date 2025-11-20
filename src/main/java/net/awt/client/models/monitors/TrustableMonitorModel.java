package net.awt.client.models.monitors;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

public class TrustableMonitorModel extends SinglePartEntityModel {
	private final ModelPart group;
	public TrustableMonitorModel(ModelPart root) {
		this.group = root.getChild("group");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData group = modelPartData.addChild("group", ModelPartBuilder.create().uv(0, 15).cuboid(-15.5F, -11.5F, 7.3F, 15.0F, 11.0F, 0.0F, new Dilation(0.3F))
		.uv(0, 0).cuboid(-16.0F, -12.0F, 6.9F, 16.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-13.0F, -8.0F, 8.9F, 10.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 14).cuboid(-10.0F, -17.0F, 5.9F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(22, 26).cuboid(-11.0F, -13.0F, 4.9F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 24.0F, -7.9F));

		ModelPartData cube_r1 = group.addChild("cube_r1", ModelPartBuilder.create().uv(25, 26).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, -16.0F, 7.9F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r2 = group.addChild("cube_r2", ModelPartBuilder.create().uv(22, 26).cuboid(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -16.0F, 7.9F, 0.0F, 0.0F, 0.3927F));
		return TexturedModelData.of(modelData, 64, 64);
	}
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
                       float green, float blue, float alpha) {
        matrices.push();
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(0));

        group.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public ModelPart getPart() {
        return group;
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
                          float headPitch) {
    }
}