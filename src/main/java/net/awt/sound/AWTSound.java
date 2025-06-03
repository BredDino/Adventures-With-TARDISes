package net.awt.sound;

import net.awt.AdventuresWithTARDISes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class AWTSound {
    public static final SoundEvent BLOOP = register("bloop");
    public static final SoundEvent PARADOXMAT = register("paradoxmat");
    public static final SoundEvent TYPE70FLIGHT = register("type70flight");
    public static final SoundEvent TYPE70MAT = register("type70mat");
    public static final SoundEvent TYPE70DEMAT = register("type70demat");
    public static final SoundEvent EMERGENCYLAND = register("emergency_land");
    public static final SoundEvent POLICEBOXDOOROPEN = register("police_box_door_open");
    public static final SoundEvent POLICEBOXDOORCLOSED = register("police_box_door_close");
    public static final SoundEvent CLASSIC1 = register("classic1");
    public static final SoundEvent CLASSIC2 = register("classic2");
    public static final SoundEvent doctorwhoxv = register("doctorwhoxv");
    public static final SoundEvent DRWHOVALE = register("drwhovale");
    public static final SoundEvent paralyzer = register("paralyzer");
    public static final SoundEvent DUGGA_DOO = register("dugga_doo");

    public static SoundEvent register(String id) {
        Identifier identifier = new Identifier(AdventuresWithTARDISes.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void init() {
    }
}
