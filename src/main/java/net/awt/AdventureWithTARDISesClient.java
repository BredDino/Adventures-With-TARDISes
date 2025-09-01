package net.awt;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import mdt.k9mod.client.renderers.K9EntityRenderer;
import net.awt.TARDIS.console.client.AWTClientConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.block.ModBlocks;
import net.awt.entity.ModEntities;
import net.awt.entity.client.K9Renderer;
import net.awt.entity.client.ModEntityRenderer;
import net.awt.entity.client.ModModelLayers;
import net.awt.entity.client.K9Model;
import net.awt.entity.custom.K9Entity;
import net.awt.item.ModItems;
import net.awt.item.custom.sonicglasses.SonicGlassesOverlay;
import net.awt.networking.ModPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;

import static net.awt.AdventuresWithTARDISes.id;


public class AdventureWithTARDISesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TardisExteriorRegistry.registerClientAddonExteriors();
        AWTClientConsoleVariantRegistry.init();
        resourcepackRegister();

        TrinketRendererRegistry.registerRenderer(ModItems.SONIC_GLASSES, (TrinketRenderer) ModItems.SONIC_GLASSES);
        HudRenderCallback.EVENT.register(new SonicGlassesOverlay());

        ModPackets.registerS2CPackets();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THICK_GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTY_GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTY_THICK_GRATE_BLOCK,RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.K9, K9Renderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.K9, K9Model::getTexturedModelData);
    }

    public static void resourcepackRegister() {

        // Register builtin resourcepacks
        FabricLoader.getInstance().

                getModContainer("awt").

                ifPresent(modContainer ->

                {

                    ResourceManagerHelper.registerBuiltinResourcePack(id("greyedgui"), modContainer, ResourcePackActivationType.NORMAL);
                    ResourceManagerHelper.registerBuiltinResourcePack(id("lebronjamesgui"), modContainer, ResourcePackActivationType.NORMAL);
                });
    }

}

