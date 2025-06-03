package net.awt.datagen;

import net.awt.block.ModBlocks;
import net.awt.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ATRIUM_BLOCK);
        addDrop(ModBlocks.ATRIUM_ORE, oreDrops(ModBlocks.ATRIUM_ORE, ModItems.ATRIUM));
        addDrop(ModBlocks.DEEPSLATE_ATRIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_ATRIUM_ORE, ModItems.ATRIUM));

        addDrop(ModBlocks.WHITE_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.BLACK_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.END_STONE_BRICKS_ROUNDEL);
        addDrop(ModBlocks.GRAY_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.GREEN_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.POLISHED_ANDESITE_ROUNDEL);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL);
        addDrop(ModBlocks.POLISHED_GRANITE_ROUNDEL);
        addDrop(ModBlocks.POLISHED_DIORITE_ROUNDEL);
        addDrop(ModBlocks.QUARTZ_ROUNDEL);
        addDrop(ModBlocks.SANDSTONE_ROUNDEL);
        addDrop(ModBlocks.CYAN_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.YELLOW_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.WEATHERED_COPPER_ROUNDEL);
        addDrop(ModBlocks.RED_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.PURPLE_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.PINK_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.BROWN_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.ORANGE_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.OXIDIZED_COPPER_ROUNDEL);
        addDrop(ModBlocks.LIME_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.BLUE_CONCRETE_ROUNDEL);
        addDrop(ModBlocks.EXPOSED_COPPER_ROUNDEL);
        addDrop(ModBlocks.COPPER_ROUNDEL);
    }
}