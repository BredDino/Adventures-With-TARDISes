package net.awt;

import net.awt.TARDIS.TardisRegistry;
import net.awt.block.ModBlocks;
import net.awt.item.ModItemGroups;
import net.awt.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdventuresWithTARDISes implements ModInitializer {
	public static final String MOD_ID = "awt";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		TardisRegistry.onInitialize();
	}
}