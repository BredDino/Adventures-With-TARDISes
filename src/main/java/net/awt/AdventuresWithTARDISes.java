package net.awt;

import dev.amble.lib.register.AmbleRegistries;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.awt.TARDIS.console.ConsoleRegistry;
import net.awt.block.ModBlocks;
import net.awt.item.ModItemGroups;
import net.awt.item.ModItems;
import net.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
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

		TardisExteriorRegistry.onInitialize();
		//ConsoleRegistry.init();

		ModWorldGeneration.generateModWorldGen();
	}

	public static Identifier id(String path) {
		return new Identifier("awt", path);
	}
}