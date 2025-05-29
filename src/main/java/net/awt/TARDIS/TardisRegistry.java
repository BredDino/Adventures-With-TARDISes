package net.awt.TARDIS;

import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.client.model.door.*;
import net.awt.TARDIS.client.model.exterior.*;
import net.awt.sound.AWTSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

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

    public static void onInitialize() {
        BAKER = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "baker").register();
        BAKER.setDoor(new AddonExterior.Door(BAKER, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        SECOND = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "second").register();
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        THIRD = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "third").register();
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        REDONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "redonion").register();
        REDONION.setDoor(new AddonExterior.Door(REDONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        YELLOWONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "yellowonion").register();
        YELLOWONION.setDoor(new AddonExterior.Door(YELLOWONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        BLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "blueonion").register();
        BLUEONION.setDoor(new AddonExterior.Door(BLUEONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        WHITEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "whiteonion").register();
        WHITEONION.setDoor(new AddonExterior.Door(WHITEONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PURPLEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "purpleonion").register();
        PURPLEONION.setDoor(new AddonExterior.Door(PURPLEONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        GREYONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "greyonion").register();
        GREYONION.setDoor(new AddonExterior.Door(GREYONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PINKONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "pinkonion").register();
        PINKONION.setDoor(new AddonExterior.Door(PINKONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIGHTBLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "lightblueonion").register();
        LIGHTBLUEONION.setDoor(new AddonExterior.Door(LIGHTBLUEONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIMEGREENONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "limegreenonion").register();
        LIMEGREENONION.setDoor(new AddonExterior.Door(LIMEGREENONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        MULTIONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "multionion").register();
        MULTIONION.setDoor(new AddonExterior.Door(MULTIONION, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        CUBE = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "cube").register();
        CUBE.setDoor(new AddonExterior.Door(CUBE, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        ATRIUM = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "atrium").register();
        ATRIUM.setDoor(new AddonExterior.Door(ATRIUM, false, net.awt.sound.AWTSound.BLOOP, net.awt.sound.AWTSound.BLOOP)).toDoor().register();

        POLICEBOX = new AddonExterior(new Identifier(MOD_ID, "lefts"), MOD_ID, "policebox").register();
        POLICEBOX.setDoor(new AddonExterior.Door(POLICEBOX, true, net.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTDEFAULT = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastdefault").register();
        VASTDEFAULT.setDoor(new AddonExterior.Door(VASTDEFAULT, true, net.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTCORAL = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastcoral").register();
        VASTCORAL.setDoor(new AddonExterior.Door(VASTCORAL, true, net.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTTOKOMAK = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vasttokomak").register();
        VASTTOKOMAK.setDoor(new AddonExterior.Door(VASTTOKOMAK, true, net.awt.sound.AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

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
        DEOBOX.setDoor(new AddonExterior.Door(DEOBOX, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_default").register();
        LEGO.setDoor(new AddonExterior.Door(LEGO, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO2 = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_purple").register();
        LEGO2.setDoor(new AddonExterior.Door(LEGO2, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO3 = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "logo_tardis_darkblue").register();
        LEGO3.setDoor(new AddonExterior.Door(LEGO3, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();
    }

    public static void registerClientAddonExteriors() {
        BAKER.setModel(new BakerExteriorModel()).toClient().register();
        BAKER.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        BAKER.setPortalWidth(1.25f);
        BAKER.setPortalHeight(2.5f);
        BAKER.toDoor().setModel(new BakerDoorModel(BakerDoorModel.getTexturedModelData().createModel())).toClient().register();

        SECOND.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        SECOND.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        SECOND.setPortalWidth(1.25f);
        SECOND.setPortalHeight(2.25f);
        SECOND.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        THIRD.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        THIRD.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        THIRD.setPortalWidth(1.25f);
        THIRD.setPortalHeight(2.25f);
        THIRD.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        REDONION.setModel(new OnionExterior()).toClient().register();
        REDONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        REDONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        YELLOWONION.setModel(new OnionExterior()).toClient().register();
        YELLOWONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        YELLOWONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        BLUEONION.setModel(new OnionExterior()).toClient().register();
        BLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        BLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        WHITEONION.setModel(new OnionExterior()).toClient().register();
        WHITEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        WHITEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        PURPLEONION.setModel(new OnionExterior()).toClient().register();
        PURPLEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        PURPLEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        GREYONION.setModel(new OnionExterior()).toClient().register();
        GREYONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        GREYONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        PINKONION.setModel(new OnionExterior()).toClient().register();
        PINKONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        PINKONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        LIGHTBLUEONION.setModel(new OnionExterior()).toClient().register();
        LIGHTBLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        LIGHTBLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        LIMEGREENONION.setModel(new OnionExterior()).toClient().register();
        LIMEGREENONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        LIMEGREENONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        MULTIONION.setModel(new OnionExterior()).toClient().register();
        MULTIONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        MULTIONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        CUBE.setModel(new CubeExterior()).toClient().register();
        CUBE.toDoor().setModel(new CubeDoor(CubeDoor.getTexturedModelData().createModel())).toClient().register();
        CUBE.setSonicItemTranslations(new Vector3f(0, 0, 0));

        ATRIUM.setModel(new AtriumExterior()).toClient().register();
        ATRIUM.toDoor().setModel(new AtriumDoor(AtriumDoor.getTexturedModelData().createModel())).toClient().register();
        ATRIUM.setSonicItemTranslations(new Vector3f(0, 0, 0));

        POLICEBOX.setModel(new policebox()).toClient().register();
        POLICEBOX.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();
        POLICEBOX.setSonicItemTranslations(new Vector3f(0, 0, 0));

        VASTDEFAULT.setModel(new VastBox()).toClient().register();
        VASTDEFAULT.toDoor().setModel(new VastBoxDoor(VastBoxDoor.getTexturedModelData().createModel())).toClient().register();
        VASTDEFAULT.setPortalWidth(1f);
        VASTDEFAULT.setPortalHeight(2f);
        VASTDEFAULT.setSonicItemTranslations(new Vector3f(0, 0, 0));

        VASTCORAL.setModel(new VastBox()).toClient().register();
        VASTCORAL.toDoor().setModel(new VastBoxDoor(VastBoxDoor.getTexturedModelData().createModel())).toClient().register();
        VASTCORAL.setPortalWidth(1f);
        VASTCORAL.setPortalHeight(2f);
        VASTCORAL.setSonicItemTranslations(new Vector3f(0, 0, 0));

        VASTTOKOMAK.setModel(new VastBox()).toClient().register();
        VASTTOKOMAK.toDoor().setModel(new VastBoxDoor(VastBoxDoor.getTexturedModelData().createModel())).toClient().register();
        VASTTOKOMAK.setPortalWidth(1f);
        VASTTOKOMAK.setPortalHeight(2f);
        VASTTOKOMAK.setSonicItemTranslations(new Vector3f(0, 0, 0));

        TYPE70.setModel(new Type70Exterior()).toClient().register();
        TYPE70.toDoor().setModel(new Type70Door(Type70Door.getTexturedModelData().createModel())).toClient().register();
        TYPE70.setSonicItemTranslations(new Vector3f(0, 0, 0));

        DEOTYPE70.setModel(new DeoType70Exterior()).toClient().register();
        DEOTYPE70.toDoor().setModel(new DeoType70Door(DeoType70Door.getTexturedModelData().createModel())).toClient().register();
        DEOTYPE70.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTIS.setModel(new BlocktisExterior()).toClient().register();
        BLOCKTIS.toDoor().setModel(new BlocktisDoor(BlocktisDoor.getTexturedModelData().createModel())).toClient().register();
        BLOCKTIS.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTISV2.setModel(new BlocktisV2Exterior()).toClient().register();
        BLOCKTISV2.toDoor().setModel(new BlocktisV2Door(BlocktisV2Door.getTexturedModelData().createModel())).toClient().register();
        BLOCKTISV2.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTISV3.setModel(new BlocktisV2Exterior()).toClient().register();
        BLOCKTISV3.toDoor().setModel(new BlocktisV2Door(BlocktisV2Door.getTexturedModelData().createModel())).toClient().register();
        BLOCKTISV3.setSonicItemTranslations(new Vector3f(0, 0, 0));

        DEOBOX.setModel(new DeoBox()).toClient().register();
        DEOBOX.toDoor().setModel(new DeoBoxDoor(DeoBoxDoor.getTexturedModelData().createModel())).toClient().register();
        DEOBOX.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO.setModel(new logo_tardis_model()).toClient().register();
        LEGO.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO2.setModel(new logo_tardis_model()).toClient().register();
        LEGO2.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO2.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO3.setModel(new logo_tardis_model()).toClient().register();
        LEGO3.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO3.setSonicItemTranslations(new Vector3f(0, 0, 0));


    }
}
