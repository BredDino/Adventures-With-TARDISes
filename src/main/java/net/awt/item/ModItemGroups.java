package net.awt.item;

import net.awt.AdventuresWithTARDISes;
import net.awt.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ATRIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "atrium"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.Atrium"))
                    .icon(() -> new ItemStack(ModItems.ATRIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ATRIUM);
                        entries.add(ModItems.PROCESSINGUNIT);
                        entries.add(ModItems.ATRIUMCORE);
                        entries.add(ModItems.ENERGIZEDATRIUM);
                        entries.add(ModBlocks.ATRIUM_BLOCK);
                        entries.add(ModBlocks.ATRIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ATRIUM_ORE);
                        entries.add(ModItems.VORTEX_MANIPULATOR);
                        entries.add(ModItems.VORTEX_MANIPULATOR2);
                        entries.add(ModItems.K9_SPAWN_EGG);
                        entries.add(ModItems.WEAPON_MATRIX);

                        entries.add(ModItems.spoon);

                        //entries.add(ModItems.CLASSIC1);
                        entries.add(ModItems.DRWHOVALE_MUSIC_DISC);
                        entries.add(ModItems.doctorwhoxv_music_disc);
                        entries.add(ModItems.paralyzer_music_disc);
                        entries.add(ModItems.DUGGA_DOO_MUSIC_DISC);
                        entries.add(ModItems.SONIC_GLASSES);
                        entries.add(ModBlocks.GRATE_BLOCK);
                        entries.add(ModBlocks.THICK_GRATE_BLOCK);
                        entries.add(ModBlocks.RUSTY_GRATE_BLOCK);
                        entries.add(ModBlocks.RUSTY_THICK_GRATE_BLOCK);
                    }).build());



    public static final ItemGroup ROUNDEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "roundel"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.Roundel"))
                    .icon(() -> new ItemStack(ModBlocks.WHITE_CONCRETE_ROUNDEL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.BLACK_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.CYAN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.DIRT_ROUNDEL);
                        entries.add(ModBlocks.END_STONE_BRICKS_ROUNDEL);
                        entries.add(ModBlocks.GRAY_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.GREEN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_DIORITE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_GRANITE_ROUNDEL);
                        entries.add(ModBlocks.QUARTZ_ROUNDEL);
                        entries.add(ModBlocks.SANDSTONE_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_ACACIA_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_BIRCH_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_CHERRY_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_DARK_OAK_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_JUNGLE_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_MANGROVE_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_OAK_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_SPRUCE_LOG_ROUNDEL);
                        entries.add(ModBlocks.BLUE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.BROWN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.COPPER_ROUNDEL);
                        entries.add(ModBlocks.EXPOSED_COPPER_ROUNDEL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.LIME_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.MOSS_ROUNDEL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.OXIDIZED_COPPER_ROUNDEL);
                        entries.add(ModBlocks.PINK_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.RED_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.WEATHERED_COPPER_ROUNDEL);
                        entries.add(ModItems.ROUNDELMOLD);
                    }).build());


    public static void registerItemGroups() {
        AdventuresWithTARDISes.LOGGER.info("Registering Item Groups for" + AdventuresWithTARDISes.MOD_ID);
    }
}
