package net.awt.item;

import net.awt.AdventuresWithTARDISes;
import net.awt.entity.ModEntities;
import net.awt.item.custom.AtriumFuel;
import net.awt.item.custom.clothing.Bowtie;
import net.awt.item.custom.clothing.EyeStalk;
import net.awt.item.custom.clothing.Fez;
import net.awt.item.custom.clothing.TrustableHat;
import net.awt.item.custom.sonicglasses.SonicGlasses;
import net.awt.item.custom.VortexManipulator;
import net.awt.sound.AWTSound;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ATRIUM = registerItem("atrium", new Item(new FabricItemSettings()));
    public static final Item LIGHTSABER = registerItem("lightsaber", new Item(new FabricItemSettings()));
    public static final Item PROCESSINGUNIT = registerItem("processing_unit", new Item(new FabricItemSettings()));
    public static final Item ENERGIZEDATRIUM = registerItem("energized_atrium", new Item(new FabricItemSettings()));
    public static final Item ATRIUMCORE = registerItem("atrium_core", new Item(new FabricItemSettings()));
    public static final Item ROUNDELMOLD = registerItem("roundel_mold", new Item(new FabricItemSettings()));
    public static final Item spoon = registerItem("spoon", new Item(new FabricItemSettings()));
    public static final Item VORTEX_MANIPULATOR = registerItem("vortex_manipulator",new VortexManipulator(new FabricItemSettings()));
    public static final Item VORTEX_MANIPULATOR2 = registerItem("vortex_manipulator2",new VortexManipulator(new FabricItemSettings()));
    public static final Item WEAPON_MATRIX = registerItem("weapon_matrix",new Item(new FabricItemSettings()));

    public static final Item DRWHOVALE_MUSIC_DISC = registerItem("drwhovale_music_disc",
            new MusicDiscItem(10, AWTSound.DRWHOVALE, new FabricItemSettings().maxCount(1), 127));
    public static final Item doctorwhoxv_music_disc = registerItem("doctorwhoxv_music_disc",
            new MusicDiscItem(15, AWTSound.doctorwhoxv, new FabricItemSettings().maxCount(1), 29));
    public static final Item paralyzer_music_disc = registerItem("paralyzer_music_disc",
            new MusicDiscItem(15, AWTSound.paralyzer, new FabricItemSettings().maxCount(1), 207));
    public static final Item DUGGA_DOO_MUSIC_DISC = registerItem("dugga_doo_music_disc",
            new MusicDiscItem(15, AWTSound.DUGGA_DOO, new FabricItemSettings().maxCount(1),101));
    public static final Item doctorwho1411_music_disc = registerItem("doctorwho1411_music_disc",
            new MusicDiscItem(15, AWTSound.doctorwho1411, new FabricItemSettings().maxCount(1), 60));
    public static final Item K9_SPAWN_EGG = registerItem("k9_spawn_egg",
            new SpawnEggItem(ModEntities.K9, 0xFFFFFF,0xFFFFFFFF, new FabricItemSettings().maxCount(64)));

    public static final Item ATRIUM_FUEL = registerItem("atrium_fuel",
            new AtriumFuel(new FabricItemSettings()));

    public static final Item SONIC_GLASSES = registerItem("sonic_glasses", new SonicGlasses(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final Item DBZ_SCOUTER = registerItem("dbz_scouter", new SonicGlasses(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final Item TRUSTABLE_HAT = registerItem("trustable_hat", new TrustableHat(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final Item BOWTIE = registerItem("bowtie", new Bowtie(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final Item EYESTALK = registerItem("eyestalk", new EyeStalk(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final Item FEZ = registerItem("fez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item FANCYFEZ = registerItem("fancyfez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item PURPLEFEZ = registerItem("purplefez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item GREENFEZ = registerItem("greenfez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item ORANGEFEZ = registerItem("orangefez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item BLUEFEZ = registerItem("bluefez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item DARKBLUEFEZ = registerItem("darkbluefez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item PINKFEZ = registerItem("pinkfez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item GREYFEZ = registerItem("greyfez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item YELLOWFEZ = registerItem("yellowfez", new Fez(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdventuresWithTARDISes.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AdventuresWithTARDISes.LOGGER.info("Registering Mod Items for" + AdventuresWithTARDISes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}
