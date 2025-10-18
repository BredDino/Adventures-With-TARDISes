package net.awt.TARDIS.exterior.client.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.DoorBlockEntity;
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
public class Type70Door extends DoorModel {
	private final ModelPart bone;
	private final ModelPart door;
	public Type70Door(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(89, 152).cuboid(-16.0F, -36.0F, 0.0F, 32.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(119, 157).cuboid(7.0F, -32.0F, 0.0F, 9.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(89, 190).cuboid(-16.0F, -32.0F, 0.0F, 9.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -7.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(89, 157).cuboid(-7.0F, -32.01F, -9.0F, 14.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 8.0F));
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
    public void renderWithAnimations(ClientTardis tardis, DoorBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, float tickDelta) {
        if ( doorEntity.tardis().isEmpty())
            return;

        DoorHandler door =  doorEntity.tardis().get().door();

        if (!AITModClient.CONFIG.animateDoors) {
            this.door.pivotZ = 8 + (door.isOpen() ? 11 : 0);
        } else {
            this.door.pivotZ = 8 - 11 * door.getLeftRot();
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