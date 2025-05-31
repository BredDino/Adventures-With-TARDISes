package net.awt;

import net.awt.TARDIS.console.client.AWTClientConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.fabricmc.api.ClientModInitializer;

public class AdventureWithTARDISesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TardisExteriorRegistry.registerClientAddonExteriors();
        AWTClientConsoleVariantRegistry.init();
    }
}
