package net.awt.effect;

import net.awt.AdventuresWithTARDISes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.jar.Attributes;

public class ModEffects {

public static final RegistryEntry<StatusEffect> ANTIRADIATION = registerStatusEffect("anti-radiation",
        new AntiRadiation(StatusEffectCategory.BENEFICIAL,5635925 ));

    public static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(AdventuresWithTARDISes.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        AdventuresWithTARDISes.LOGGER.info("Registering Mod Effects for " + AdventuresWithTARDISes.MOD_ID);
    }
}
