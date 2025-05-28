package net.awt.TARDIS;

import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.awt.sound.AWTSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import static net.awt.AdventuresWithTARDISes.MOD_ID;

public class TardisRegistry {
    public static AddonExterior BAKER;
    public static AddonExterior SECOND;
    public static AddonExterior THIRD;
    public static AddonExterior REDONION;
    public static AddonExterior YELLOWONION;
    public static AddonExterior BLUEONION;
    public static AddonExterior WHITEONION;
    public static AddonExterior PURPLEONION;
    public static AddonExterior GREYONION;
    public static AddonExterior PINKONION;
    public static AddonExterior LIGHTBLUEONION;
    public static AddonExterior LIMEGREENONION;
    public static AddonExterior MULTIONION;
    public static AddonExterior CUBE;
    public static AddonExterior ATRIUM;
    public static AddonExterior POLICEBOX;
    public static AddonExterior VASTDEFAULT;
    public static AddonExterior VASTCORAL;
    public static AddonExterior VASTTOKOMAK;
    public static AddonExterior TYPE70;
    public static AddonExterior DEOTYPE70;
    public static AddonExterior BLOCKTIS;
    public static AddonExterior BLOCKTISV2;
    public static AddonExterior BLOCKTISV3;
    public static AddonExterior DEOBOX;
    public static AddonExterior LEGO;
    public static AddonExterior LEGO2;
    public static AddonExterior LEGO3;

    public void onInitialize() {
        BAKER = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "baker").register();
        BAKER.setDoor(new AddonExterior.Door(BAKER, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();
        SECOND = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "second").register();
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();
        THIRD = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "third").register();
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();
        REDONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "redonion").register();
        REDONION.setDoor(new AddonExterior.Door(REDONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        YELLOWONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "yellowonion").register();
        YELLOWONION.setDoor(new AddonExterior.Door(YELLOWONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        BLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "blueonion").register();
        BLUEONION.setDoor(new AddonExterior.Door(BLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        WHITEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "whiteonion").register();
        WHITEONION.setDoor(new AddonExterior.Door(WHITEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PURPLEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "purpleonion").register();
        PURPLEONION.setDoor(new AddonExterior.Door(PURPLEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        GREYONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "greyonion").register();
        GREYONION.setDoor(new AddonExterior.Door(GREYONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PINKONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "pinkonion").register();
        PINKONION.setDoor(new AddonExterior.Door(PINKONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIGHTBLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "lightblueonion").register();
        LIGHTBLUEONION.setDoor(new AddonExterior.Door(LIGHTBLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIMEGREENONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "limegreenonion").register();
        LIMEGREENONION.setDoor(new AddonExterior.Door(LIMEGREENONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        MULTIONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "multionion").register();
        MULTIONION.setDoor(new AddonExterior.Door(MULTIONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        CUBE = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "cube").register();
        CUBE.setDoor(new AddonExterior.Door(CUBE, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        ATRIUM = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "atrium").register();
        ATRIUM.setDoor(new AddonExterior.Door(ATRIUM, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        POLICEBOX = new AddonExterior(new Identifier(MOD_ID, "lefts"), MOD_ID, "policebox").register();
        POLICEBOX.setDoor(new AddonExterior.Door(POLICEBOX, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTDEFAULT = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastdefault").register();
        VASTDEFAULT.setDoor(new AddonExterior.Door(VASTDEFAULT, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTCORAL = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastcoral").register();
        VASTCORAL.setDoor(new AddonExterior.Door(VASTCORAL, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTTOKOMAK = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vasttokomak").register();
        VASTTOKOMAK.setDoor(new AddonExterior.Door(VASTTOKOMAK, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        TYPE70 = new AddonExterior(new Identifier(MOD_ID, "lefts"), MOD_ID, "type70").register();
        TYPE70.setDoor(new AddonExterior.Door(TYPE70, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        DEOTYPE70 = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "deotype70").register();
        DEOTYPE70.setDoor(new AddonExterior.Door(DEOTYPE70, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTIS = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktis").register();
        BLOCKTIS.setDoor(new AddonExterior.Door(BLOCKTIS, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTISV2 = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktisv2").register();
        BLOCKTISV2.setDoor(new AddonExterior.Door(BLOCKTISV2, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTISV3 = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktisv3").register();
        BLOCKTISV3.setDoor(new AddonExterior.Door(BLOCKTISV3, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        DEOBOX = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "deobox").register();
        DEOBOX.setDoor(new AddonExterior.Door(DEOBOX, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_default").register();
        LEGO.setDoor(new AddonExterior.Door(LEGO, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO2 = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_purple").register();
        LEGO2.setDoor(new AddonExterior.Door(LEGO2, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO3 = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_darkblue").register();
        LEGO3.setDoor(new AddonExterior.Door(LEGO3, true, net.awt.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();
    }
}
