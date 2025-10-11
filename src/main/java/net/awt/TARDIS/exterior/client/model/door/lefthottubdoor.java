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
public class lefthottubdoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart doors;
	private final ModelPart leftdoor;
	private final ModelPart rightdoor;
	public lefthottubdoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doors = this.bone.getChild("doors");
		this.leftdoor = this.doors.getChild("leftdoor");
		this.rightdoor = this.doors.getChild("rightdoor");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 156).cuboid(-10.0F, -34.0F, -8.5F, 20.0F, 34.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 191).cuboid(-8.0F, -32.0F, -8.5F, 16.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 194).cuboid(-8.05F, -32.0F, -7.7F, 16.0F, 32.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, -15.4F, 0.0F, 3.1416F, 0.0F));

		ModelPartData doors = bone.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftdoor = doors.addChild("leftdoor", ModelPartBuilder.create().uv(42, 156).cuboid(0.75F, -28.5F, -1.0F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 190).cuboid(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 194).cuboid(0.0F, -24.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.75F, -4.5F, -8.5F));

		ModelPartData rightdoor = doors.addChild("rightdoor", ModelPartBuilder.create().uv(62, 156).cuboid(-9.75F, -28.5F, -0.5F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 198).cuboid(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 202).cuboid(-1.0F, -24.5F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.75F, -4.5F, -9.0F));
		return TexturedModelData.of(modelData, 256, 256);
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
            leftdoor.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
            rightdoor.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
        } else {
            float maxRot = 85.0F;
            leftdoor.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
            rightdoor.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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