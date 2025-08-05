package net.awt.entity.client;

import net.awt.entity.custom.K9Entity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public abstract class ModEntityRenderer<T, T1> {
    public ModEntityRenderer(EntityRendererFactory.Context context, K9Model<K9Entity> entityModel, float f) {
    }

    public abstract Identifier getTexture(K9Entity entity);
}
