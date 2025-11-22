package net.awt.entity.client;

import net.awt.AdventuresWithTARDISes;
import net.awt.entity.custom.CybermatEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CybermatRenderer extends MobEntityRenderer<CybermatEntity, CybermatModel<CybermatEntity>>{
    public static final Identifier TEXTURE = new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/entity/cybermat.png");

    public CybermatRenderer(EntityRendererFactory.Context context){
        super(context, new CybermatModel<>(context.getPart(ModModelLayers.CYBERMAT)), 0.6f);
    }

    @Override
    public Identifier getTexture(CybermatEntity entity) {
        return TEXTURE;
    }

public void render(CybermatEntity mobEntity, float f, float g, MatrixStack matrixStack,
                   VertexConsumerProvider vertexConsumerProvider, int i){
        matrixStack.scale(0.5f,0.5f,0.5f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
}

}
