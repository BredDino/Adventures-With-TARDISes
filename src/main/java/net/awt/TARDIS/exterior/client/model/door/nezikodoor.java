package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
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
public class nezikodoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart doorframe;
	private final ModelPart door;
	public nezikodoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doorframe = this.bone.getChild("doorframe");
		this.door = this.doorframe.getChild("door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(93, 91).cuboid(-8.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(93, 95).cuboid(5.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(101, 88).cuboid(-8.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(101, 92).cuboid(5.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(63, 57).cuboid(-8.0F, -32.0F, -6.0F, 15.0F, 32.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -1.75F));

		ModelPartData doorframe = bone.addChild("doorframe", ModelPartBuilder.create().uv(63, 91).cuboid(-7.0F, -31.0F, -6.0F, 13.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData door = doorframe.addChild("door", ModelPartBuilder.create().uv(97, 57).cuboid(-13.0F, -30.0F, -1.0F, 13.0F, 30.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 99).cuboid(-2.0F, -16.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -1.0F, -5.0F));
		return TexturedModelData.of(modelData, 128, 128);
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