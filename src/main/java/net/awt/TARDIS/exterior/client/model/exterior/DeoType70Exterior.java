package net.awt.TARDIS.exterior.client.model.exterior;

import dev.amble.ait.AITMod;
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
public class DeoType70Exterior extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart door;
	private final ModelPart wall;
	public DeoType70Exterior(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
		this.wall = this.bone.getChild("wall");
	}
	public DeoType70Exterior()  {
		this(getTexturedModelData().createModel());
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 107).cuboid(-20.0F, -44.0F, -9.0F, 40.0F, 0.0F, 21.0F, new Dilation(0.0F))
		.uv(0, 85).cuboid(-20.0F, -1.0F, -9.0F, 40.0F, 0.0F, 21.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 25.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(0, 129).cuboid(-8.0F, 18.5F, -4.1667F, 16.0F, 1.0F, 13.0F, new Dilation(0.0F))
		.uv(129, 41).cuboid(-8.0F, -19.5F, -4.1667F, 16.0F, 1.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -20.5F, -4.8333F));

		ModelPartData door_r1 = door.addChild("door_r1", ModelPartBuilder.create().uv(123, 85).cuboid(-18.0F, -2.0F, 18.0F, 37.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(26.0F, -0.5F, -6.1667F, -1.5708F, 0.0F, 1.5708F));

		ModelPartData wall = bone.addChild("wall", ModelPartBuilder.create().uv(129, 56).cuboid(-26.0F, -23.0F, -9.0F, 16.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(18.0F, -21.0F, 0.0F));

		ModelPartData wall_r1 = wall.addChild("wall_r1", ModelPartBuilder.create().uv(123, 103).cuboid(-23.0F, -1.0F, 18.0F, 43.0F, 0.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, -10.0F, -1.5708F, 0.0F, 1.5708F));

		ModelPartData wall_r2 = wall.addChild("wall_r2", ModelPartBuilder.create().uv(123, 116).cuboid(-23.0F, -1.0F, 18.0F, 43.0F, 0.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(20.0F, 0.0F, -10.0F, -1.5708F, 0.0F, 1.5708F));

		ModelPartData wall_r3 = wall.addChild("wall_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-23.0F, -2.0F, -9.0F, 43.0F, 0.0F, 40.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 0.0F, 10.0F, -1.5708F, 0.0F, 1.5708F));

		ModelPartData wall_r4 = wall.addChild("wall_r4", ModelPartBuilder.create().uv(0, 63).cuboid(-23.0F, -1.0F, -9.0F, 43.0F, 0.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(-39.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData wall_r5 = wall.addChild("wall_r5", ModelPartBuilder.create().uv(0, 41).cuboid(-23.0F, -2.0F, -9.0F, 43.0F, 0.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
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

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.bone.getChild("door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
		} else {
			float maxRot = 180;
			this.bone.getChild("door").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
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
		return bone;
	}

	@Override
	public net.minecraft.client.render.entity.animation.Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}
}