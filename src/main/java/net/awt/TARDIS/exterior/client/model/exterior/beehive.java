package net.awt.TARDIS.exterior.client.model.exterior;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
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
public class beehive extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart inside;
	private final ModelPart door;
	private final ModelPart bone2;
	public beehive(ModelPart root) {
		this.bone = root.getChild("bone");
		this.inside = this.bone.getChild("inside");
		this.door = this.bone.getChild("door");
		this.bone2 = this.door.getChild("bone2");
	}
    public beehive()   {
        this(getTexturedModelData().createModel());
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(40, 106).cuboid(-7.0F, -29.0F, -5.25F, 2.0F, 29.0F, 0.0F, new Dilation(0.0F))
		.uv(114, 102).cuboid(4.0F, -29.0F, -5.25F, 2.0F, 29.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, -29.0F, -5.0F, 11.0F, 29.0F, 10.0F, new Dilation(0.0F))
		.uv(50, 87).cuboid(-6.5F, -27.0F, -5.5F, 12.0F, 4.0F, 11.0F, new Dilation(0.0F))
		.uv(0, 91).cuboid(-6.5F, -6.25F, -5.5F, 12.0F, 4.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 24.0F, 0.5F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(54, 71).cuboid(-8.0F, -4.0F, -2.0F, 13.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -5.5F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(0, 58).cuboid(-9.0F, -4.0F, -3.0F, 14.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -9.25F, -3.5F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(0, 39).cuboid(-10.0F, -4.0F, -3.0F, 15.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -13.5F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(58, 36).cuboid(-9.0F, -4.0F, -3.0F, 14.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -17.0F, -3.5F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r5 = bone.addChild("cube_r5", ModelPartBuilder.create().uv(0, 75).cuboid(-8.0F, -3.0F, -2.0F, 13.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -21.0F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r6 = bone.addChild("cube_r6", ModelPartBuilder.create().uv(58, 117).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -29.75F, -0.5F, 0.0F, 0.0F, 0.1309F));

		ModelPartData inside = bone.addChild("inside", ModelPartBuilder.create().uv(42, 0).cuboid(-5.0F, -28.0F, -5.0F, 9.0F, 27.0F, 9.0F, new Dilation(0.0F))
		.uv(104, 71).cuboid(-5.5F, -27.0F, -5.5F, 10.0F, 4.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 106).cuboid(-5.5F, -6.25F, -5.5F, 10.0F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r7 = inside.addChild("cube_r7", ModelPartBuilder.create().uv(96, 87).cuboid(-7.0F, -4.0F, -2.0F, 11.0F, 4.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -5.5F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r8 = inside.addChild("cube_r8", ModelPartBuilder.create().uv(78, 0).cuboid(-8.0F, -4.0F, -3.0F, 12.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -9.25F, -3.5F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r9 = inside.addChild("cube_r9", ModelPartBuilder.create().uv(58, 53).cuboid(-9.0F, -4.0F, -3.0F, 13.0F, 5.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -13.5F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r10 = inside.addChild("cube_r10", ModelPartBuilder.create().uv(78, 16).cuboid(-8.0F, -4.0F, -3.0F, 12.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -17.0F, -3.5F, 0.0F, 0.0F, -0.0436F));

		ModelPartData cube_r11 = inside.addChild("cube_r11", ModelPartBuilder.create().uv(46, 102).cuboid(-7.0F, -3.0F, -2.0F, 11.0F, 4.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -21.0F, -4.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(112, 42).cuboid(-13.5F, 7.75F, 0.5F, 12.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(112, 47).cuboid(-13.5F, -13.0F, 0.5F, 12.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 102).cuboid(-13.0F, -15.0F, 1.0F, 11.0F, 29.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 106).cuboid(-13.1F, -6.25F, 0.0F, 0.0F, 14.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 117).cuboid(-1.9F, -6.25F, 0.0F, 0.0F, 14.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -14.0F, -7.0F));

		ModelPartData cube_r12 = door.addChild("cube_r12", ModelPartBuilder.create().uv(112, 37).cuboid(-13.6501F, 3.036F, -1.0F, 13.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(112, 32).cuboid(-14.3262F, -11.4492F, -1.0F, 13.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(110, 53).cuboid(-15.0F, -5.0F, -2.0F, 15.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0484F, 1.7172F, 1.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData cube_r13 = door.addChild("cube_r13", ModelPartBuilder.create().uv(110, 64).cuboid(-14.5787F, -1.2078F, -1.5F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(110, 59).cuboid(-14.2407F, -8.9505F, -1.5F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0484F, 1.7172F, 1.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData bone2 = door.addChild("bone2", ModelPartBuilder.create().uv(78, 32).cuboid(-5.1659F, -15.6036F, -7.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 117).cuboid(-5.6659F, -16.1036F, -8.25F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 14.0F, 6.0F));

		ModelPartData cube_r14 = bone2.addChild("cube_r14", ModelPartBuilder.create().uv(86, 32).cuboid(-12.6175F, -1.8208F, -3.35F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(6.9516F, -12.3885F, -5.2326F, -0.2618F, 0.0F, 0.0F));
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

        if (!AITModClient.CONFIG.animateDoors) {
            this.bone.getChild("door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
        } else {
            float maxRot = -90;
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