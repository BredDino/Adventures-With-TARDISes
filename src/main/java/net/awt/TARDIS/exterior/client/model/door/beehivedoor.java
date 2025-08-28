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
public class beehivedoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart door;
	private final ModelPart bone2;
	private final ModelPart rightsidehoneycomb;
	private final ModelPart tophoneycomb;
	private final ModelPart leftsidehoneycomb;
	public beehivedoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
		this.bone2 = this.door.getChild("bone2");
		this.rightsidehoneycomb = this.bone.getChild("rightsidehoneycomb");
		this.tophoneycomb = this.bone.getChild("tophoneycomb");
		this.leftsidehoneycomb = this.bone.getChild("leftsidehoneycomb");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(45, 210).cuboid(-16.5F, -9.0F, -4.5F, 5.0F, 9.0F, 0.0F, new Dilation(0.0F))
		.uv(55, 210).cuboid(11.5F, -9.0F, -4.5F, 5.0F, 9.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 138).cuboid(-9.0F, -31.0F, -5.5F, 18.0F, 31.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -2.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(43, 164).cuboid(1.5F, 9.25F, -0.5F, 12.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 169).cuboid(1.5F, -11.5F, -0.5F, 12.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(29, 171).cuboid(2.0F, -13.6F, 0.25F, 11.0F, 29.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.5F, -15.7F, -5.85F));

		ModelPartData cube_r1 = door.addChild("cube_r1", ModelPartBuilder.create().uv(43, 159).cuboid(-13.6501F, 3.036F, -1.0F, 13.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 154).cuboid(-14.3262F, -11.4492F, -1.0F, 13.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 138).cuboid(-15.0F, -5.0F, 0.0F, 15.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.9516F, 3.2172F, 0.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r2 = door.addChild("cube_r2", ModelPartBuilder.create().uv(43, 149).cuboid(-14.5787F, -1.2078F, -1.5F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 144).cuboid(-14.2407F, -8.9505F, -1.5F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.9516F, 3.2172F, 1.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData bone2 = door.addChild("bone2", ModelPartBuilder.create().uv(65, 210).cuboid(-5.1659F, -15.6036F, -4.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 202).cuboid(-5.6659F, -16.1036F, -5.75F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(17.0F, 15.5F, 4.5F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(11, 216).cuboid(-12.6175F, -1.8208F, -3.35F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.9516F, -12.4885F, -2.7326F, -0.2618F, 0.0F, 0.0F));

		ModelPartData rightsidehoneycomb = bone.addChild("rightsidehoneycomb", ModelPartBuilder.create().uv(71, 161).cuboid(7.0F, -8.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(25, 217).cuboid(7.5F, -7.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(71, 154).cuboid(7.0F, -16.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 214).cuboid(7.5F, -15.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 174).cuboid(7.0F, -24.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 210).cuboid(7.5F, -23.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(57, 203).cuboid(8.0F, -20.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 197).cuboid(8.5F, -19.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 203).cuboid(8.0F, -28.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 193).cuboid(8.5F, -27.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 196).cuboid(8.0F, -12.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 189).cuboid(8.5F, -11.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 189).cuboid(8.0F, -4.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 185).cuboid(8.5F, -3.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, -0.1F, -0.1F));

		ModelPartData tophoneycomb = bone.addChild("tophoneycomb", ModelPartBuilder.create().uv(73, 218).cuboid(-11.0F, -31.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(73, 144).cuboid(5.5F, -32.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(83, 172).cuboid(6.4F, -31.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 208).cuboid(-7.5F, -33.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(83, 176).cuboid(-7.0F, -32.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 209).cuboid(1.5F, -33.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(65, 218).cuboid(2.0F, -32.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(75, 138).cuboid(-3.0F, -34.5F, -5.5F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 174).cuboid(-3.5F, -35.0F, -6.0F, 5.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(31, 210).cuboid(-11.5F, -32.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1F, -0.1F));

		ModelPartData leftsidehoneycomb = bone.addChild("leftsidehoneycomb", ModelPartBuilder.create().uv(71, 203).cuboid(-12.0F, -28.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(73, 214).cuboid(-11.5F, -27.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 202).cuboid(-11.0F, -24.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(3, 216).cuboid(-10.5F, -23.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 196).cuboid(-12.0F, -20.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(65, 214).cuboid(-11.5F, -19.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(29, 201).cuboid(-11.0F, -16.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(17, 215).cuboid(-10.5F, -15.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 189).cuboid(-12.0F, -12.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(79, 168).cuboid(-11.5F, -11.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 181).cuboid(-10.5F, -7.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 182).cuboid(-11.0F, -8.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(53, 182).cuboid(-12.0F, -4.0F, -6.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(73, 210).cuboid(-11.5F, -3.5F, -5.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 217).cuboid(-11.5F, -19.5F, -5.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -0.1F, -0.1F));
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