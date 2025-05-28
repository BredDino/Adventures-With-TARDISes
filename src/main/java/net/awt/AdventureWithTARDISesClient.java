package net.awt;

import net.awt.TARDIS.TardisRegistry;
import net.fabricmc.api.ClientModInitializer;

public class AdventureWithTARDISesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TardisRegistry.registerClientAddonExteriors();
    }
}
