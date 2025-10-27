package net.awt.datagen;


import net.awt.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)  {
        super(output, completableFuture);}

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.DRWHOVALE_MUSIC_DISC)
                .add(ModItems.doctorwhoxv_music_disc)
                .add(ModItems.paralyzer_music_disc)
                .add(ModItems.DUGGA_DOO_MUSIC_DISC)
                .add(ModItems.doctorwho1411_music_disc);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.DRWHOVALE_MUSIC_DISC)
                .add(ModItems.doctorwhoxv_music_disc)
                .add(ModItems.paralyzer_music_disc)
                .add(ModItems.doctorwho1411_music_disc)
                .add(ModItems.DUGGA_DOO_MUSIC_DISC);
    }
}
