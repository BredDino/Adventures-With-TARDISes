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
public class timepoddoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart door;
	public timepoddoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.door = this.bone.getChild("door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(40, 0).cuboid(-5.5F, -17.0F, -5.5F, 11.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 12.0F, 21.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(0, 27).cuboid(0.0F, -11.0F, -4.0F, 10.0F, 11.0F, 10.0F, new Dilation(0.0F))
		.uv(40, 14).cuboid(0.5F, -13.0F, -3.5F, 9.0F, 2.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -17.0F, -1.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderWithAnimations(ClientTardis tardis, DoorBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, float tickDelta) {
        if ( doorEntity.tardis().isEmpty())
            return;

        DoorHandler door =  doorEntity.tardis().get().door();
        this.door.visible = door.isClosed();

        matrices.push();
        matrices.scale(1.5F, 1.5F, 1.5F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, tickDelta);
        matrices.pop();
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return bone;
    }
}