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
public class neziko extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart doorframe;
	private final ModelPart door;
	private final ModelPart straps;
	public neziko(ModelPart root) {
		this.bone = root.getChild("bone");
		this.doorframe = this.bone.getChild("doorframe");
		this.door = this.doorframe.getChild("door");
		this.straps = this.bone.getChild("straps");
	}
    public neziko()   {
        this(getTexturedModelData().createModel());
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(58, 0).cuboid(-8.25F, -9.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(58, 17).cuboid(-8.25F, -18.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(52, 77).cuboid(-8.25F, -27.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(86, 3).cuboid(-8.05F, -27.0F, 8.25F, 15.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(86, 0).cuboid(-8.05F, -18.0F, 8.25F, 15.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 50).cuboid(-8.05F, -9.0F, 8.25F, 15.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(98, 30).cuboid(7.25F, -27.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(98, 30).cuboid(7.25F, -18.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(54, 33).cuboid(7.25F, -9.0F, -6.0F, 0.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -32.0F, -6.0F, 15.0F, 32.0F, 14.0F, new Dilation(0.0F))
		.uv(58, 34).cuboid(5.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 38).cuboid(-8.25F, -32.25F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(66, 34).cuboid(-8.25F, -32.25F, 6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 42).cuboid(5.25F, -32.25F, 6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 27).cuboid(-8.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 23).cuboid(5.25F, -1.7F, -6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(66, 42).cuboid(5.25F, -1.7F, 6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(66, 38).cuboid(-8.25F, -1.7F, 6.25F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(18, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -16.6571F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(6, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -15.0429F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(28, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -7.6571F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(20, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -6.0429F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r5 = bone.addChild("cube_r5", ModelPartBuilder.create().uv(78, 42).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 34).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -6.0429F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r6 = bone.addChild("cube_r6", ModelPartBuilder.create().uv(8, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(2, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -7.6571F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r7 = bone.addChild("cube_r7", ModelPartBuilder.create().uv(76, 44).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 44).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -15.0429F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bone.addChild("cube_r8", ModelPartBuilder.create().uv(78, 44).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 36).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -16.6571F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = bone.addChild("cube_r9", ModelPartBuilder.create().uv(88, 88).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 38).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -25.6571F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = bone.addChild("cube_r10", ModelPartBuilder.create().uv(0, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 40).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -24.0429F, -4.9929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = bone.addChild("cube_r11", ModelPartBuilder.create().uv(22, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -24.0429F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r12 = bone.addChild("cube_r12", ModelPartBuilder.create().uv(24, 89).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 89).cuboid(16.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.3F, -25.6571F, 7.0071F, 0.7854F, 0.0F, 0.0F));

		ModelPartData doorframe = bone.addChild("doorframe", ModelPartBuilder.create().uv(0, 46).cuboid(-7.0F, -31.0F, -6.0F, 13.0F, 30.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData door = doorframe.addChild("door", ModelPartBuilder.create().uv(100, 6).cuboid(-13.0F, -30.0F, -1.0F, 13.0F, 30.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 34).cuboid(-12.0F, -16.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -1.0F, -5.0F));

		ModelPartData straps = bone.addChild("straps", ModelPartBuilder.create().uv(86, 6).cuboid(3.95F, -24.8787F, 9.3713F, 2.0F, 17.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 53).cuboid(-7.05F, -24.8787F, 9.3713F, 2.0F, 17.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r13 = straps.addChild("cube_r13", ModelPartBuilder.create().uv(86, 31).cuboid(-1.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 53).cuboid(10.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.05F, -24.878F, 7.9574F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r14 = straps.addChild("cube_r14", ModelPartBuilder.create().uv(74, 41).cuboid(-1.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(74, 38).cuboid(10.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.05F, -7.1716F, 7.251F, -0.7854F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
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
            this.doorframe.getChild("door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
        } else {
            float maxRot = -90;
            this.doorframe.getChild("door").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
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