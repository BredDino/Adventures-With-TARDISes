package net.awt.TARDIS.exterior.client.model.exterior;

import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.models.exteriors.SimpleExteriorModel;
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
public class Glasgow extends SimpleExteriorModel {
	private ModelPart tardis;

	public Glasgow(ModelPart root) {
		this.tardis = root.getChild("tardis");
	}
    public Glasgow()  {
        this(getTexturedModelData().createModel());
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData tardis = modelPartData.addChild("tardis", ModelPartBuilder.create().uv(0, 157).cuboid(-12.0F, -43.0F, -12.0F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F))
		.uv(0, 104).cuboid(11.1F, -38.5F, -9.0F, 0.0F, 35.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 104).mirrored().cuboid(-10.9F, -38.5F, -9.0F, 0.0F, 35.0F, 18.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 0).cuboid(-13.0F, -3.5F, -13.0F, 26.0F, 2.0F, 26.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-12.5F, -4.5F, -12.5F, 25.0F, 1.0F, 25.0F, new Dilation(0.0F))
		.uv(2, 81).cuboid(-9.25F, -38.5F, -11.25F, 18.5F, 1.25F, 22.85F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 25.3F, 0.0F));

		ModelPartData cube_r1 = tardis.addChild("cube_r1", ModelPartBuilder.create().uv(85, 80).cuboid(-9.25F, -1.0F, -11.75F, 18.5F, 1.25F, 23.25F, new Dilation(0.0F))
		.uv(0, 104).cuboid(11.1F, -1.0F, -9.0F, 0.0F, 35.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -37.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = tardis.addChild("cube_r2", ModelPartBuilder.create().uv(36, 157).cuboid(-1.5F, -20.0F, -1.5F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-10.5F, -23.0F, 10.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r3 = tardis.addChild("cube_r3", ModelPartBuilder.create().uv(24, 157).cuboid(-1.5F, -20.0F, -1.5F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.5F, -23.0F, 10.5F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r4 = tardis.addChild("cube_r4", ModelPartBuilder.create().uv(12, 157).cuboid(-1.5F, -20.0F, -1.5F, 3.0F, 39.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.5F, -23.0F, -10.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData right_door = tardis.addChild("right_door", ModelPartBuilder.create(), ModelTransform.pivot(-9.0F, -4.0F, -10.0F));

		ModelPartData cube_r5 = right_door.addChild("cube_r5", ModelPartBuilder.create().uv(156, 148).cuboid(0.25F, -15.0F, -0.4F, 1.0F, 35.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(8.6F, -19.5F, -1.25F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r6 = right_door.addChild("cube_r6", ModelPartBuilder.create().uv(48, 157).cuboid(-11.2F, -17.5F, -0.5F, 0.0F, 35.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -17.0F, 10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData left_door = tardis.addChild("left_door", ModelPartBuilder.create().uv(154, 128).cuboid(-8.1F, -19.8F, -1.6F, 0.6F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(154, 128).cuboid(-8.1F, -16.8F, -1.6F, 0.6F, 0.0F, 0.6F, new Dilation(0.0F))
		.uv(154, 128).cuboid(-8.1F, -19.8F, -1.6F, 0.6F, 0.0F, 0.6F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -4.0F, -10.0F));

		ModelPartData cube_r7 = left_door.addChild("cube_r7", ModelPartBuilder.create().uv(156, 104).cuboid(0.25F, -34.0F, -0.4F, 1.0F, 35.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-0.4F, -0.5F, -1.25F, 0.0F, -1.5708F, 0.0F));

		ModelPartData roof = tardis.addChild("roof", ModelPartBuilder.create().uv(104, 0).cuboid(-13.0F, -41.5F, -10.0F, 4.0F, 3.0F, 20.0F, new Dilation(0.0F))
		.uv(108, 104).cuboid(9.0F, -41.5F, -10.0F, 4.0F, 3.0F, 20.0F, new Dilation(0.0F))
		.uv(0, 54).cuboid(-11.0F, -44.5F, -11.0F, 22.0F, 3.0F, 22.0F, new Dilation(0.1F))
		.uv(88, 54).cuboid(-10.0F, -46.5F, -10.0F, 20.0F, 2.0F, 20.0F, new Dilation(0.0F))
		.uv(99, 28).cuboid(-9.25F, -47.5F, -9.25F, 18.5F, 1.0F, 18.5F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r8 = roof.addChild("cube_r8", ModelPartBuilder.create().uv(108, 150).cuboid(-13.0F, -2.0F, -10.0F, 4.0F, 3.0F, 20.0F, new Dilation(0.0F))
		.uv(108, 127).cuboid(9.0F, -2.0F, -10.0F, 4.0F, 3.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -39.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData lantern = tardis.addChild("lantern", ModelPartBuilder.create().uv(101, 28).cuboid(-2.0F, -48.0F, -2.0F, 4.0F, 1.5F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r9 = lantern.addChild("cube_r9", ModelPartBuilder.create().uv(88, 76).cuboid(-1.25F, -1.5F, -1.25F, 2.5F, 2.5F, 2.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -48.25F, 0.0F, 0.0F, -0.6981F, 0.0F));

		ModelPartData cube_r10 = lantern.addChild("cube_r10", ModelPartBuilder.create().uv(94, 55).cuboid(-1.75F, -3.5F, -1.75F, 3.5F, 3.5F, 3.5F, new Dilation(0.0F))
		.uv(99, 78).cuboid(-1.0F, -5.5F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(100, 49).cuboid(-2.0F, -4.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -49.5F, 0.0F, 0.0F, -0.3054F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        tardis.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
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
            this.tardis.getChild("left_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
            this.tardis.getChild("right_door").yaw = (door.isRightOpen() || door.areBothOpen())
                    ? 5.0F
                    : 0.0F;
        } else {
            float maxRot = 85f;
            this.tardis.getChild("left_door").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
            this.tardis.getChild("right_door").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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
        return tardis;
    }

    @Override
    public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

    }
}