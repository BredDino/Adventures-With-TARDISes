package net.awt.item;

import net.awt.AdventuresWithTARDISes;
import net.awt.item.custom.TardisDectectorItem;
import net.awt.item.custom.VortexManipulator;
import net.awt.sound.AWTSound;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ATRIUM = registerItem("atrium", new Item(new FabricItemSettings()));
    public static final Item LIGHTSABER = registerItem("lightsaber", new Item(new FabricItemSettings()));
    public static final Item PROCESSINGUNIT = registerItem("processing_unit", new Item(new FabricItemSettings()));
    public static final Item ENERGIZEDATRIUM = registerItem("energized_atrium", new Item(new FabricItemSettings()));
    public static final Item ATRIUMCORE = registerItem("atrium_core", new Item(new FabricItemSettings()));
    public static final Item ROUNDELMOLD = registerItem("roundel_mold", new Item(new FabricItemSettings()));
    public static final Item VORTEX_MANIPULATOR = registerItem("vortex_manipulator",new VortexManipulator(new FabricItemSettings()));
    public static final Item VORTEX_MANIPULATOR2 = registerItem("vortex_manipulator2",new VortexManipulator(new FabricItemSettings()));
    public static final Item TARDISDETECTOR = registerItem("tardis_detector",new TardisDectectorItem(new FabricItemSettings()));
    public static final Item DRWHOVALE_MUSIC_DISC = registerItem("drwhovale_music_disc",
            new MusicDiscItem(10, AWTSound.DRWHOVALE, new FabricItemSettings().maxCount(1), 127));
    public static final Item doctorwhoxv_music_disc = registerItem("doctorwhoxv_music_disc",
            new MusicDiscItem(15, AWTSound.doctorwhoxv, new FabricItemSettings().maxCount(1), 29));
    public static final Item paralyzer_music_disc = registerItem("paralyzer_music_disc",
            new MusicDiscItem(15, AWTSound.paralyzer, new FabricItemSettings().maxCount(1), 207));
    public static final Item DUGGA_DOO_MUSIC_DISC = registerItem("dugga_doo_music_disc",
            new MusicDiscItem(15, AWTSound.DUGGA_DOO, new FabricItemSettings().maxCount(1),101));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ATRIUM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdventuresWithTARDISes.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AdventuresWithTARDISes.LOGGER.info("Registering Mod Items for" + AdventuresWithTARDISes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}
