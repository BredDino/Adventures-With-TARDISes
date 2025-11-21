package net.awt;

import dev.amble.ait.core.handles.HandlesResponse;
import dev.amble.ait.core.handles.HandlesSound;
import dev.amble.ait.core.tardis.ServerTardis;
import dev.amble.ait.core.tardis.handler.TardisCrashHandler;
import dev.amble.ait.registry.impl.HandlesResponseRegistry;
import net.awt.TARDIS.console.AWTConsoleRegistry;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.awt.TARDIS.exterior.TardisExteriorRegistry;
import net.awt.TARDIS.exterior.category.AWTCategoryRegistry;
import net.awt.block.ModBlocks;
import net.awt.effect.ModEffects;
import net.awt.entity.ModEntities;
import net.awt.entity.custom.K9Entity;
import net.awt.events.UseEvent;
import net.awt.events.UseItemEvent;
import net.awt.item.ModItemGroups;
import net.awt.item.ModItems;
import net.awt.networking.ModPackets;
import net.awt.sound.AWTSound;
import net.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.server.command.PlaySoundCommand;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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

        //Atrium Coal
        FuelRegistry.INSTANCE.add(ModItems.ATRIUM_FUEL, 12800);

        // Your Idol Disc TARDIS Response

        // Handles, KYS.
        HandlesResponseRegistry.register(new HandlesResponse() {
            @Override
            public boolean run(ServerPlayerEntity serverPlayerEntity, HandlesSound handlesSound, ServerTardis serverTardis) {
                serverTardis.selfDestruct().boom();
                this.sendChat(serverPlayerEntity, Text.literal("Killing myself."));
                return this.success(handlesSound);
            }

            @Override
            public List<String> getCommandWords() {
                return List.of("kill yourself", "kys");
            }

            @Override
            public Identifier id() {
                return new Identifier(AdventuresWithTARDISes.MOD_ID, "kill_yourself");
            }
        });

		UseBlockCallback.EVENT.register(UseEvent.EVENT.invoker());
		UseItemCallback.EVENT.register(UseItemEvent.EVENT.invoker());

		ModWorldGeneration.generateModWorldGen();

		ModPackets.registerC2SPackets();

        FabricDefaultAttributeRegistry.register(ModEntities.K9, K9Entity.createK9Attributes());

        // Resource Pack Handler
        var modContainer = FabricLoader.getInstance().getModContainer("awt").orElseThrow();

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("awt", "awtmenu"),
                modContainer,
                Text.literal("Main Menu Music"),
                ResourcePackActivationType.DEFAULT_ENABLED
        );

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("awt", "greyedgui"),
                modContainer,
                Text.literal("Greyed Out TARDIS Monitor GUI"),
                ResourcePackActivationType.NORMAL
        );

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("awt", "lebronjamesgui"),
                modContainer,
                Text.literal("Lebron James TARDIS Monitor GUI"),
                ResourcePackActivationType.NORMAL
        );

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("awt", "redshiftgui"),
                modContainer,
                Text.literal("Redshifted TARDIS Monitor GUIs"),
                ResourcePackActivationType.NORMAL
        );

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("awt","awttesterrorsound"),
                modContainer,
                Text.literal("Comedic Error Sound"),
                ResourcePackActivationType.NORMAL
        );
	}

	public static Identifier id(String path) {
		return new Identifier("awt", path);
	}

}