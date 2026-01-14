package net.awt.world;

import net.awt.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {

    public static void addSpawns() {
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(
                        BiomeKeys.SNOWY_PLAINS,
                        BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.ICE_SPIKES,
                        BiomeKeys.FROZEN_PEAKS,
                        BiomeKeys.JAGGED_PEAKS,
                        BiomeKeys.GROVE
                ),
                SpawnGroup.MONSTER,
                ModEntities.CYBERMAT,
                80,
                1,
                3
        );
    }
}
