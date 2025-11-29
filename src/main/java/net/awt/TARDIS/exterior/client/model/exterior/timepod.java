package net.awt.TARDIS.exterior.client.model.exterior;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.exteriors.SimpleExteriorModel;
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
public class timepod extends SimpleExteriorModel {
	private final ModelPart bone;
	private final ModelPart chair;
	private final ModelPart door;
	private final ModelPart legs;
	private final ModelPart rockets;
	private final ModelPart rocket;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	public timepod(ModelPart root) {
		this.bone = root.getChild("bone");
		this.chair = this.bone.getChild("chair");
		this.door = this.bone.getChild("door");
		this.legs = this.bone.getChild("legs");
		this.rockets = this.bone.getChild("rockets");
		this.rocket = this.rockets.getChild("rocket");
		this.bone4 = this.rockets.getChild("bone4");
		this.bone5 = this.rockets.getChild("bone5");
		this.bone6 = this.rockets.getChild("bone6");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(76, 45).cuboid(5.5F, 12.5F, -3.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(2.5F, 12.5F, -7.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(-3.5F, 12.5F, -7.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(-0.5F, 12.5F, -7.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(-0.5F, 12.5F, 5.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(-3.5F, 12.5F, 5.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 49).cuboid(2.5F, 12.5F, 5.5F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F))
		.uv(76, 45).cuboid(5.5F, 12.5F, -0.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 45).cuboid(5.5F, 12.5F, 2.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 45).cuboid(-7.5F, 12.5F, -3.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 45).cuboid(-7.5F, 12.5F, 2.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 45).cuboid(-7.5F, 12.5F, -0.5F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-5.0F, 11.0F, -5.0F, 11.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(40, 25).cuboid(-4.0F, 31.0F, -4.0F, 9.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.5F, 14.0F, -4.5F, 10.0F, 17.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -17.0F, -0.5F));

		ModelPartData chair = bone.addChild("chair", ModelPartBuilder.create().uv(16, 76).cuboid(-3.5F, -3.0F, 18.5F, 6.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 5.0F, -16.0F));

		ModelPartData cube_r1 = chair.addChild("cube_r1", ModelPartBuilder.create().uv(76, 14).cuboid(-2.0F, -3.0F, -1.0F, 5.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 4.0F, 19.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r2 = chair.addChild("cube_r2", ModelPartBuilder.create().uv(72, 83).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 20.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData door = bone.addChild("door", ModelPartBuilder.create().uv(0, 27).cuboid(-5.0F, -11.0F, -10.0F, 10.0F, 11.0F, 10.0F, new Dilation(0.0F))
		.uv(40, 14).cuboid(-4.5F, -13.0F, -9.5F, 9.0F, 2.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 11.0F, 5.5F));

		ModelPartData legs = bone.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = legs.addChild("cube_r3", ModelPartBuilder.create().uv(58, 36).cuboid(-1.0F, -2.0F, 1.0F, 9.0F, 28.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-10.262F, 15.3823F, 9.8464F, 0.0869F, 0.7816F, 0.1231F));

		ModelPartData cube_r4 = legs.addChild("cube_r4", ModelPartBuilder.create().uv(40, 36).cuboid(-2.0F, -2.0F, 1.0F, 9.0F, 28.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.6199F, 15.9052F, -6.0355F, -0.0869F, 0.7816F, -0.1231F));

		ModelPartData cube_r5 = legs.addChild("cube_r5", ModelPartBuilder.create().uv(58, 36).cuboid(-1.0F, -2.0F, 1.0F, 9.0F, 28.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-8.8464F, 15.3823F, -10.262F, -0.0869F, -0.7816F, 0.1231F));

		ModelPartData cube_r6 = legs.addChild("cube_r6", ModelPartBuilder.create().uv(40, 36).cuboid(-2.0F, -2.0F, 1.0F, 9.0F, 28.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(7.0348F, 15.9052F, 5.6206F, 0.0869F, -0.7816F, -0.1231F));

		ModelPartData rockets = bone.addChild("rockets", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rocket = rockets.addChild("rocket", ModelPartBuilder.create().uv(76, 37).cuboid(-2.0F, 11.0F, 10.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 64).cuboid(-2.5F, 12.5F, 9.5F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 83).cuboid(-1.5F, 22.5F, 10.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 54).cuboid(-2.0F, 24.5F, 10.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 48).cuboid(-0.499F, 13.5F, 7.5F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, -2.0F));

		ModelPartData bone4 = rockets.addChild("bone4", ModelPartBuilder.create().uv(76, 37).cuboid(-2.0F, 11.0F, 10.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 64).cuboid(-2.5F, 12.5F, 9.5F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 83).cuboid(-1.5F, 22.5F, 10.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 54).cuboid(-2.0F, 24.5F, 10.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 48).cuboid(-0.499F, 13.5F, 13.5F, 0.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, -20.0F));

		ModelPartData bone5 = rockets.addChild("bone5", ModelPartBuilder.create().uv(76, 37).cuboid(-2.0F, 11.0F, 10.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 64).cuboid(-2.5F, 12.5F, 9.5F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 83).cuboid(-1.5F, 22.5F, 10.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 54).cuboid(-2.0F, 24.5F, 10.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 50).cuboid(1.501F, 13.5F, 11.5F, 2.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, 2.0F, -11.0F));

		ModelPartData bone6 = rockets.addChild("bone6", ModelPartBuilder.create().uv(76, 37).cuboid(-2.0F, 11.0F, 10.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 64).cuboid(-2.5F, 12.5F, 9.5F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 83).cuboid(-1.5F, 22.5F, 10.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 54).cuboid(-2.0F, 24.5F, 10.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 50).cuboid(-4.499F, 13.5F, 11.5F, 2.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(10.0F, 2.0F, -11.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
    @Override
    public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        if ( exterior.tardis().isEmpty())
            return;

        DoorHandler door =  exterior.tardis().get().door();
        this.door.visible = door.isClosed();

        matrices.push();
        matrices.scale(1.5F, 1.5F, 1.5F);
        matrices.translate(0, -1.5F, 0);
        super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, alpha);
        matrices.pop();
    }

    @Override
    public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.push();
        matrices.scale(1.5F, 1.5F, 1.5F);
        matrices.translate(0, -1.5f, 0);
        super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        matrices.pop();
    }

    @Override
    public ModelPart getPart() {
        return bone;
    }


    @Override
    public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

    }
}