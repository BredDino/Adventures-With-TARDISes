package net.awt;

import dev.amble.ait.core.AITSounds;
import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import mdt.k9mod.client.renderers.K9EntityRenderer;
import net.awt.TARDIS.console.client.AWTClientConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.block.ModBlocks;
import net.awt.components.ModComponents;
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
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.glfw.GLFW;


public class AdventureWithTARDISesClient implements ClientModInitializer {
    public static KeyBinding SwitchGlassesMode;

    @Override
    public void onInitializeClient() {
        TardisExteriorRegistry.registerClientAddonExteriors();
        AWTClientConsoleVariantRegistry.init();

        TrinketRendererRegistry.registerRenderer(ModItems.SONIC_GLASSES, (TrinketRenderer) ModItems.SONIC_GLASSES);
        HudRenderCallback.EVENT.register(new SonicGlassesOverlay());

        TrinketRendererRegistry.registerRenderer(ModItems.DBZ_SCOUTER, (TrinketRenderer) ModItems.DBZ_SCOUTER);
        TrinketRendererRegistry.registerRenderer(ModItems.TRUSTABLE_HAT, (TrinketRenderer) ModItems.TRUSTABLE_HAT);

        TrinketRendererRegistry.registerRenderer(ModItems.BOWTIE, (TrinketRenderer) ModItems.BOWTIE);

        TrinketRendererRegistry.registerRenderer(ModItems.FEZ, (TrinketRenderer) ModItems.FEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.FANCYFEZ, (TrinketRenderer) ModItems.FANCYFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.PURPLEFEZ, (TrinketRenderer) ModItems.PURPLEFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.PINKFEZ, (TrinketRenderer) ModItems.PINKFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.ORANGEFEZ, (TrinketRenderer) ModItems.ORANGEFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.GREENFEZ, (TrinketRenderer) ModItems.GREENFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.GREYFEZ, (TrinketRenderer) ModItems.GREYFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.BLUEFEZ, (TrinketRenderer) ModItems.BLUEFEZ);
        TrinketRendererRegistry.registerRenderer(ModItems.DARKBLUEFEZ, (TrinketRenderer) ModItems.DARKBLUEFEZ);


        ModPackets.registerS2CPackets();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THICK_GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTY_GRATE_BLOCK,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTY_THICK_GRATE_BLOCK,RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.K9, K9Renderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.K9, K9Model::getTexturedModelData);

        SonicGlassesKeybind();


    }

    private void SonicGlassesKeybind() {
        SwitchGlassesMode = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.awt.sgm",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                "category.awt"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(minecraftClient -> {
            if (SwitchGlassesMode.wasPressed() && minecraftClient.player != null) {
                if (minecraftClient.player.isSneaking()) {
                    ClientPlayNetworking.send(ModPackets.SGSM_PACKET, new PacketByteBuf(PacketByteBufs.create()));
                    minecraftClient.player.playSound(AITSounds.SONIC_SWITCH, 1, 1);
                } else {
                    Entity entity = MinecraftClient.getInstance().getCameraEntity();
                    HitResult blockHit = entity.raycast(5.0, 0.0F, false);

                    if (blockHit.getType() == net.minecraft.util.hit.HitResult.Type.BLOCK) {
                        BlockPos hitblock = ((BlockHitResult) blockHit).getBlockPos();
                        ClientPlayNetworking.send(ModPackets.SGU_PACKET, new PacketByteBuf(PacketByteBufs.create().writeBlockPos(hitblock).writeBoolean(true)));
                    } else {
                        ClientPlayNetworking.send(ModPackets.SGU_PACKET, new PacketByteBuf(PacketByteBufs.create().writeBoolean(false)));
                    }
                }
            }
        });
    }
}
