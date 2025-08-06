package net.awt.entity.client;

import net.awt.AdventuresWithTARDISes;
import net.awt.entity.custom.K9Entity;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class K9Renderer extends MobEntityRenderer<K9Entity, K9Model<K9Entity>>{
    private static final Identifier TEXTURE = new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/entity/robotdog.png");

    public K9Renderer(EntityRendererFactory.Context context){
        super(context, new K9Model<>(context.getPart(ModModelLayers.K9)), 0.6f);
    }

    @Override
    public Identifier getTexture(K9Entity entity) {
        return TEXTURE;
    }

public void render(K9Entity mobEntity, float f, float g, MatrixStack matrixStack,
                   VertexConsumerProvider vertexConsumerProvider, int i){
        matrixStack.scale(0.5f,0.5f,0.5f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
}

}
