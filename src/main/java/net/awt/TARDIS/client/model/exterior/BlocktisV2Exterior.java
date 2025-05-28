package net.awt.TARDIS.client.model.exterior;

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
public class BlocktisV2Exterior extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart door;
	private final ModelPart middle;
	private final ModelPart toplayer;
	private final ModelPart sign;
	private final ModelPart bottomlayer;
	private final ModelPart lamp;
	public BlocktisV2Exterior(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
		this.middle = this.bone.getChild("middle");
		this.toplayer = this.bone.getChild("toplayer");
		this.sign = this.toplayer.getChild("sign");
		this.bottomlayer = this.bone.getChild("bottomlayer");
		this.lamp = this.bone.getChild("lamp");
	}
	public BlocktisV2Exterior()   {
		this(getTexturedModelData().createModel());
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(64, 246).cuboid(0.0F, -8.0F, 0.0F, 16.0F, 32.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, 0.0F, -24.0F));

		ModelPartData middle = bone.addChild("middle", ModelPartBuilder.create().uv(208, 0).cuboid(8.0F, -8.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 214).cuboid(8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 214).cuboid(8.0F, -8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(192, 214).cuboid(-24.0F, -8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(228, 32).cuboid(-24.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(228, 64).cuboid(-24.0F, -8.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 230).cuboid(-8.0F, -8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData toplayer = bone.addChild("toplayer", ModelPartBuilder.create().uv(336, 58).cuboid(8.0F, -32.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(-8.0F, -32.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(-24.0F, -32.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(-24.0F, -32.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(8.0F, -32.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(-8.0F, -32.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(336, 58).cuboid(-24.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(164, 54).cuboid(8.0F, -24.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(164, 86).cuboid(8.0F, -24.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 166).cuboid(8.0F, -24.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 182).cuboid(-24.0F, -24.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 182).cuboid(-24.0F, -24.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(192, 118).cuboid(-24.0F, -24.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(192, 150).cuboid(-8.0F, -24.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(192, 182).cuboid(-8.0F, -24.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 198).cuboid(-8.0F, -24.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData sign = toplayer.addChild("sign", ModelPartBuilder.create().uv(0, 54).cuboid(-24.0F, -21.0F, -26.3F, 48.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 66).cuboid(-24.0F, -21.0F, 24.8F, 48.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = sign.addChild("cube_r1", ModelPartBuilder.create().uv(0, 90).cuboid(-26.0F, 0.0F, -1.0F, 48.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-25.5F, -21.0F, -1.7F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = sign.addChild("cube_r2", ModelPartBuilder.create().uv(0, 78).cuboid(-26.0F, 0.0F, -1.0F, 48.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(25.5F, -21.0F, -1.7F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bottomlayer = bone.addChild("bottomlayer", ModelPartBuilder.create().uv(100, 86).cuboid(8.0F, 8.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 102).cuboid(8.0F, 8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 118).cuboid(8.0F, 8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 118).cuboid(-24.0F, 8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 134).cuboid(-24.0F, 8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 150).cuboid(-24.0F, 8.0F, -24.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 150).cuboid(-8.0F, 8.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-26.0F, 24.0F, -26.0F, 52.0F, 2.0F, 52.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData lamp = bone.addChild("lamp", ModelPartBuilder.create().uv(100, 54).cuboid(-8.0F, -15.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -25.0F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
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
			float maxRot = -85;
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