package net.awt.TARDIS.exterior.client.model.door;

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
public class lefthottubdoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart water;
	private final ModelPart bone2;
	public lefthottubdoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.water = this.bone.getChild("water");
		this.bone2 = this.bone.getChild("bone2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(84, 123).cuboid(-8.0F, -10.0F, -17.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 76).cuboid(17.3137F, -10.0F, -5.6863F, 2.0F, 10.0F, 16.0F, new Dilation(0.0F))
		.uv(36, 76).cuboid(-19.3137F, -10.0F, -5.6863F, 2.0F, 10.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-19.3F, 0.1F, -17.1F, 39.0F, 0.0F, 38.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(84, 135).cuboid(-8.0F, -10.0F, -1.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.9497F, 0.0F, 15.2635F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(120, 135).cuboid(-8.0F, -10.0F, -1.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-12.9497F, 0.0F, 15.2635F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(0, 129).cuboid(-8.0F, -10.0F, -1.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-12.9497F, 0.0F, -10.636F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(120, 123).cuboid(-8.0F, -10.0F, -1.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.9497F, 0.0F, -10.636F, 0.0F, -0.7854F, 0.0F));

		ModelPartData water = bone.addChild("water", ModelPartBuilder.create().uv(0, 38).cuboid(-18.0F, 0.0F, -17.0F, 39.0F, 0.0F, 38.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.3F, -9.9F, -0.1F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create().uv(42, 116).cuboid(-32.3345F, -12.0F, -16.7071F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F))
		.uv(84, 116).cuboid(-20.3137F, -12.0F, -28.7279F, 17.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 122).cuboid(-20.3137F, -12.0F, 8.3137F, 17.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(72, 76).cuboid(4.7071F, -12.0F, -16.7071F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F))
		.uv(36, 136).cuboid(-19.8137F, -10.0F, 9.0637F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(11.8137F, 0.0F, 10.5637F));

		ModelPartData cube_r5 = bone2.addChild("cube_r5", ModelPartBuilder.create().uv(72, 96).cuboid(6.0F, -2.09F, -15.0F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-8.9706F, -9.9F, 3.8284F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r6 = bone2.addChild("cube_r6", ModelPartBuilder.create().uv(114, 76).cuboid(5.0F, -2.09F, -16.0F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-24.5564F, -9.9F, 15.1421F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = bone2.addChild("cube_r7", ModelPartBuilder.create().uv(0, 102).cuboid(6.0F, -2.09F, -15.0F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.2218F, -9.9F, -11.0503F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r8 = bone2.addChild("cube_r8", ModelPartBuilder.create().uv(114, 96).cuboid(5.0F, -2.09F, -16.0F, 4.0F, 3.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(-35.163F, -9.9F, -20.9498F, 0.0F, -0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
        return null;
    }

    @Override
    public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        if ( doorEntity.tardis().isEmpty())
            return;

        DoorHandler door =  doorEntity.tardis().get().door();
        this.water.visible = door.isOpen();

        matrices.push();
        matrices.scale(1F, 1F, 1F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
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