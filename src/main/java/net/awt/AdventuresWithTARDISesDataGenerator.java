package net.awt;

import net.awt.datagen.ModLootTableProvider;
import net.awt.datagen.ModWorldGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AdventuresWithTARDISesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}
}
