package net.awt;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.awt.TARDIS.console.client.AWTClientConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.item.ModItems;
import net.awt.item.custom.sonicglasses.SonicGlassesOverlay;
import net.awt.networking.ModPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class AdventureWithTARDISesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TardisExteriorRegistry.registerClientAddonExteriors();
        AWTClientConsoleVariantRegistry.init();

        TrinketRendererRegistry.registerRenderer(ModItems.SONIC_GLASSES, (TrinketRenderer) ModItems.SONIC_GLASSES);
        HudRenderCallback.EVENT.register(new SonicGlassesOverlay());

        ModPackets.registerS2CPackets();
    }
}
