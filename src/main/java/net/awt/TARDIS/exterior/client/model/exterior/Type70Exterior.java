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
public class Type70Exterior extends ExteriorModel {
	private final ModelPart bone;
	private final ModelPart door;
	public Type70Exterior(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
	}
    public Type70Exterior()  {
        this(getTexturedModelData().createModel());
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-16.0F, -36.0F, -8.0F, 32.0F, 4.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 52).cuboid(8.0F, -32.0F, -8.0F, 8.0F, 32.0F, 24.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-16.0F, 0.1F, -8.0F, 32.0F, 0.0F, 24.0F, new Dilation(0.0F))
		.uv(0, 52).cuboid(-16.0F, -32.0F, -8.0F, 8.0F, 32.0F, 24.0F, new Dilation(0.0F))
		.uv(0, 108).cuboid(-8.0F, -32.0F, 0.0F, 16.0F, 32.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -4.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(112, 0).cuboid(-8.0F, -0.01F, -12.0F, 16.0F, 0.0F, 15.0F, new Dilation(0.0F))
		.uv(64, 108).cuboid(-8.0F, -32.01F, -13.0F, 16.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(112, 15).cuboid(-8.0F, -31.01F, -13.0F, 16.0F, 31.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));
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
            this.door.pivotZ = 5 + (door.isOpen() ? 8 : 0);
        } else {
            this.door.pivotZ = 5 - 8 * door.getLeftRot();
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