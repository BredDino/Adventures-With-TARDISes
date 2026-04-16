package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.DoorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class nezikodoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart door;
	public nezikodoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(93, 91).cuboid(-8.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(93, 95).cuboid(5.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(101, 88).cuboid(-8.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(101, 92).cuboid(5.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(63, 57).cuboid(-8.0F, -32.0F, -6.0F, 15.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, -11.75F, 0.0F, 3.1416F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(97, 57).cuboid(0.0F, -30.0F, -1.0F, 13.0F, 30.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 99).cuboid(11.0F, -16.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(63, 91).cuboid(0.0F, -30.0F, -1.0F, 13.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -1.0F, -5.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
    @Override
    public void renderWithAnimations(ClientTardis tardis, DoorBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, float tickDelta) {
        if (!AITModClient.CONFIG.animateDoors) {
            DoorHandler door = doorEntity.tardis().get().door();
            bone.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
        } else {
            float maxRot = 90.0F;
            door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
        }

        matrices.push();
        matrices.scale(1, 1, 1);
        matrices.translate(0.0F, -1.5F, 0.0F);
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180.0F));
        super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, tickDelta);
        matrices.pop();
    }


    @Override
    public ModelPart getPart() {
        return bone;
    }
}