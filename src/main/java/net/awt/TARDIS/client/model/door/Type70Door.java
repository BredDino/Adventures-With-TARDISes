package net.awt.TARDIS.client.model.door;

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
public class Type70Door extends DoorModel {
	private final ModelPart bone;
	private final ModelPart type70door;
	public Type70Door(ModelPart root) {
		this.bone = root.getChild("bone");
		this.type70door = this.bone.getChild("type70door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(-1.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData type70door = bone.addChild("type70door", ModelPartBuilder.create().uv(48, 72).cuboid(-11.0F, 26.9F, -7.0F, 19.0F, 1.0F, 14.0F, new Dilation(0.0F))
		.uv(48, 102).cuboid(8.0F, -3.1F, -7.0F, 1.0F, 31.0F, 14.0F, new Dilation(0.0F))
		.uv(48, 87).cuboid(-11.0F, -3.1F, -7.0F, 19.0F, 1.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -28.0F, 1.0F));
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
			if ( doorEntity.tardis().isEmpty())
				return;

			DoorHandler door =  doorEntity.tardis().get().door();

			if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
				this.type70door.pivotX = -3 + (door.isOpen() ? 16 : 0);
			} else {
				this.type70door.pivotX = -3 + 16 * door.getLeftRot();
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