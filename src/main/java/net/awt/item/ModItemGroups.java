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
                        entries.add(ModItems.ATRIUM_FUEL);
                        entries.add(ModItems.ENERGIZEDATRIUM);
                        entries.add(ModBlocks.ATRIUM_BLOCK);
                        entries.add(ModBlocks.ATRIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ATRIUM_ORE);
                        entries.add(ModItems.VORTEX_MANIPULATOR);
                        entries.add(ModItems.VORTEX_MANIPULATOR2);
                        entries.add(ModItems.K9_SPAWN_EGG);
                        entries.add(ModItems.WEAPON_MATRIX);
                       // entries.add(ModBlocks.THE_MOMENT);
                        entries.add(ModBlocks.TRUSTABLE_MONITOR);

                        entries.add(ModItems.spoon);

                        entries.add(ModItems.DRWHOVALE_MUSIC_DISC);
                        entries.add(ModItems.doctorwhoxv_music_disc);
                        entries.add(ModItems.paralyzer_music_disc);
                        entries.add(ModItems.DUGGA_DOO_MUSIC_DISC);
                        entries.add(ModItems.doctorwho1411_music_disc);

                        entries.add(ModItems.SONIC_GLASSES);
                        entries.add(ModItems.DBZ_SCOUTER);

                    }).build());

    public static final ItemGroup ROUNDEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "roundel"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.Roundel"))
                    .icon(() -> new ItemStack(ModBlocks.HARTNELL_ROUNDEL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.HARTNELL_ROUNDEL);
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
                        entries.add(ModBlocks.AMBQUARTZ_ROUNDEL);
                        entries.add(ModBlocks.BLUEQUARTZ_ROUNDEL);
                        entries.add(ModBlocks.CRIMQUARTZ_ROUNDEL);
                        entries.add(ModBlocks.VERDQUARTZ_ROUNDEL);
                        entries.add(ModBlocks.VIOQUARTZ_ROUNDEL);
                        entries.add(ModBlocks.OBSIQUARTZ_ROUNDEL);
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
                        entries.add(ModBlocks.HARTNELL_WALL);
                        entries.add(ModBlocks.GRATE_BLOCK);
                        entries.add(ModBlocks.THICK_GRATE_BLOCK);
                        entries.add(ModBlocks.RUSTY_GRATE_BLOCK);
                        entries.add(ModBlocks.RUSTY_THICK_GRATE_BLOCK);

                    }).build());
    public static final ItemGroup CLOTHING_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "clothing"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.Clothing"))
                    .icon(() -> new ItemStack(ModItems.TRUSTABLE_HAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TRUSTABLE_HAT);

                        entries.add(ModItems.BOWTIE);

                        entries.add(ModItems.EYESTALK);

                        entries.add(ModItems.FEZ);
                        entries.add(ModItems.FANCYFEZ);
                        entries.add(ModItems.PURPLEFEZ);
                        entries.add(ModItems.GREENFEZ);
                        entries.add(ModItems.ORANGEFEZ);
                        entries.add(ModItems.PINKFEZ);
                        entries.add(ModItems.GREYFEZ);
                        entries.add(ModItems.BLUEFEZ);
                        entries.add(ModItems.DARKBLUEFEZ);
                        entries.add(ModItems.YELLOWFEZ);
                    }).build());

    public static void registerItemGroups() {
        AdventuresWithTARDISes.LOGGER.info("Registering Item Groups for" + AdventuresWithTARDISes.MOD_ID);
    }
}
