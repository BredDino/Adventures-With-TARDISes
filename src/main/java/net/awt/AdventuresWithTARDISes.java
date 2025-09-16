package net.awt;

import net.awt.TARDIS.console.AWTConsoleRegistry;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.TARDIS.exterior.category.AWTCategoryRegistry;
import net.awt.block.ModBlocks;
import net.awt.effect.ModEffects;
import net.awt.entity.ModEntities;
import net.awt.entity.custom.K9Entity;
import net.awt.item.ModItemGroups;
import net.awt.item.ModItems;
import net.awt.networking.ModPackets;
import net.awt.sound.AWTSound;
import net.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdventuresWithTARDISes implements ModInitializer {
	public static final String MOD_ID = "awt";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AWTSound.init();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModEffects.registerEffects();

		TardisExteriorRegistry.onInitialize();
		AWTConsoleRegistry.init();
		AWTConsoleVariantRegistry.init();
		AWTCategoryRegistry.init();

		ModWorldGeneration.generateModWorldGen();

		ModPackets.registerC2SPackets();

        FabricDefaultAttributeRegistry.register(ModEntities.K9, K9Entity.createK9Attributes());
	}

	public static Identifier id(String path) {
		return new Identifier("awt", path);
	}
}