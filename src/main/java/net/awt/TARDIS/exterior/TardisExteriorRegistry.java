package net.awt.TARDIS.exterior;

import dev.amble.ait.client.models.exteriors.JakeTheDogExteriorModel;
import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.awt.TARDIS.exterior.category.custom.AWTExclusiveCategory;
import net.awt.TARDIS.exterior.client.model.door.*;
import net.awt.TARDIS.exterior.client.model.exterior.*;
import net.awt.sound.AWTSound;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

import static net.awt.AdventuresWithTARDISes.MOD_ID;

public class TardisExteriorRegistry {
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
    public static AddonExterior HOTTUBTIMEMACHINE;
    public static AddonExterior LEGODIM;
    public static AddonExterior POLICEBOXALT;
    public static AddonExterior POLICEBOXPURPLE;
    public static AddonExterior LEFTHOTTUB;

    public static AddonExterior JAKE;

    public static void onInitialize() {
        BAKER = new AddonExterior(new Identifier(MOD_ID, "classicboxes"), MOD_ID, "baker").register();
        BAKER.setDoor(new AddonExterior.Door(BAKER, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        SECOND = new AddonExterior(new Identifier(MOD_ID, "classicboxes"), MOD_ID, "second").register();
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        THIRD = new AddonExterior(new Identifier(MOD_ID, "classicboxes"), MOD_ID, "third").register();
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        REDONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "redonion").register();
        REDONION.setDoor(new AddonExterior.Door(REDONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        YELLOWONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "yellowonion").register();
        YELLOWONION.setDoor(new AddonExterior.Door(YELLOWONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        BLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "blueonion").register();
        BLUEONION.setDoor(new AddonExterior.Door(BLUEONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        WHITEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "whiteonion").register();
        WHITEONION.setDoor(new AddonExterior.Door(WHITEONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        PURPLEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "purpleonion").register();
        PURPLEONION.setDoor(new AddonExterior.Door(PURPLEONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        GREYONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "greyonion").register();
        GREYONION.setDoor(new AddonExterior.Door(GREYONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        PINKONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "pinkonion").register();
        PINKONION.setDoor(new AddonExterior.Door(PINKONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        LIGHTBLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "lightblueonion").register();
        LIGHTBLUEONION.setDoor(new AddonExterior.Door(LIGHTBLUEONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        LIMEGREENONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "limegreenonion").register();
        LIMEGREENONION.setDoor(new AddonExterior.Door(LIMEGREENONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        MULTIONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "multionion").register();
        MULTIONION.setDoor(new AddonExterior.Door(MULTIONION, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        POLICEBOX = new AddonExterior(new Identifier(MOD_ID, "modernboxes"), MOD_ID, "policebox").register();
        POLICEBOX.setDoor(new AddonExterior.Door(POLICEBOX, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTDEFAULT = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastdefault").register();
        VASTDEFAULT.setDoor(new AddonExterior.Door(VASTDEFAULT, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTCORAL = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vastcoral").register();
        VASTCORAL.setDoor(new AddonExterior.Door(VASTCORAL, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        VASTTOKOMAK = new AddonExterior(new Identifier(MOD_ID, "vast"), MOD_ID, "vasttokomak").register();
        VASTTOKOMAK.setDoor(new AddonExterior.Door(VASTTOKOMAK, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        TYPE70 = new AddonExterior(new Identifier(MOD_ID, "capsules"), MOD_ID, "type70").register();
        TYPE70.setDoor(new AddonExterior.Door(TYPE70, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        DEOTYPE70 = new AddonExterior(new Identifier(MOD_ID, "capsules"), MOD_ID, "deotype70").register();
        DEOTYPE70.setDoor(new AddonExterior.Door(DEOTYPE70, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTIS = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktis").register();
        BLOCKTIS.setDoor(new AddonExterior.Door(BLOCKTIS, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTISV2 = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktisv2").register();
        BLOCKTISV2.setDoor(new AddonExterior.Door(BLOCKTISV2, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        BLOCKTISV3 = new AddonExterior(new Identifier(MOD_ID, "blocktardis"), MOD_ID, "blocktisv3").register();
        BLOCKTISV3.setDoor(new AddonExterior.Door(BLOCKTISV3, false, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        DEOBOX = new AddonExterior(new Identifier(MOD_ID, "altmodernboxes"), MOD_ID, "deobox").register();
        DEOBOX.setDoor(new AddonExterior.Door(DEOBOX, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO = new AddonExterior(new Identifier(MOD_ID, "legoboxes"), MOD_ID, "logo_tardis_default").register();
        LEGO.setDoor(new AddonExterior.Door(LEGO, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO2 = new AddonExterior(new Identifier(MOD_ID, "legoboxes"), MOD_ID, "logo_tardis_purple").register();
        LEGO2.setDoor(new AddonExterior.Door(LEGO2, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEGO3 = new AddonExterior(new Identifier(MOD_ID, "legoboxes"), MOD_ID, "logo_tardis_darkblue").register();
        LEGO3.setDoor(new AddonExterior.Door(LEGO3, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        HOTTUBTIMEMACHINE = new AddonExterior(new Identifier(MOD_ID, "hottub"), MOD_ID, "hottubtimemachine").register();
        HOTTUBTIMEMACHINE.setDoor(new AddonExterior.Door(HOTTUBTIMEMACHINE, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();

        LEGODIM = new AddonExterior(new Identifier(MOD_ID, "legoboxes"), MOD_ID, "lego_dimensions_police_box").register();
        LEGODIM.setDoor(new AddonExterior.Door(LEGODIM, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        POLICEBOXALT = new AddonExterior(new Identifier(MOD_ID, "modernboxes"), MOD_ID, "policebox_alt").register();
        POLICEBOXALT.setDoor(new AddonExterior.Door(POLICEBOXALT, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        POLICEBOXPURPLE = new AddonExterior(AWTExclusiveCategory.REFERENCE, MOD_ID, "policebox_purple").register();
        POLICEBOXPURPLE.setDoor(new AddonExterior.Door(POLICEBOXPURPLE, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        JAKE = new AddonExterior(AWTExclusiveCategory.REFERENCE, MOD_ID, "jake").register();
        JAKE.setDoor(new AddonExterior.Door(JAKE, true, AWTSound.POLICEBOXDOOROPEN, AWTSound.POLICEBOXDOORCLOSED)).toDoor().register();

        LEFTHOTTUB = new AddonExterior(new Identifier(MOD_ID, "hottub"), MOD_ID, "lefthottub").register();
        LEFTHOTTUB.setDoor(new AddonExterior.Door(LEFTHOTTUB, false, AWTSound.BLOOP, AWTSound.BLOOP)).toDoor().register();


    }

    @Environment(EnvType.CLIENT)
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

        POLICEBOX.setModel(new policebox()).toClient().register();
        POLICEBOX.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();
        POLICEBOX.setPortalWidth(1f);
        POLICEBOX.setPortalHeight(2f);
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
        TYPE70.setPortalWidth(1f);
        TYPE70.setPortalHeight(2f);
        TYPE70.setSonicItemTranslations(new Vector3f(0, 0, 0));

        DEOTYPE70.setModel(new DeoType70Exterior()).toClient().register();
        DEOTYPE70.toDoor().setModel(new DeoType70Door(DeoType70Door.getTexturedModelData().createModel())).toClient().register();
        DEOTYPE70.setPortalWidth(1f);
        DEOTYPE70.setPortalHeight(2f);
        DEOTYPE70.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTIS.setModel(new BlocktisExterior()).toClient().register();
        BLOCKTIS.toDoor().setModel(new BlocktisDoor(BlocktisDoor.getTexturedModelData().createModel())).toClient().register();
        BLOCKTIS.setPortalWidth(0.75f);
        BLOCKTIS.setPortalHeight(1.75f);
        BLOCKTIS.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTISV2.setModel(new BlocktisV2Exterior()).toClient().register();
        BLOCKTISV2.toDoor().setModel(new BlocktisV2Door(BlocktisV2Door.getTexturedModelData().createModel())).toClient().register();
        BLOCKTISV2.setPortalWidth(0.75f);
        BLOCKTISV2.setPortalHeight(1.75f);
        BLOCKTISV2.setSonicItemTranslations(new Vector3f(0, 0, 0));

        BLOCKTISV3.setModel(new BlocktisV2Exterior()).toClient().register();
        BLOCKTISV3.toDoor().setModel(new BlocktisV2Door(BlocktisV2Door.getTexturedModelData().createModel())).toClient().register();
        BLOCKTISV3.setPortalWidth(0.75f);
        BLOCKTISV3.setPortalHeight(1.75f);
        BLOCKTISV3.setSonicItemTranslations(new Vector3f(0, 0, 0));

        DEOBOX.setModel(new DeoBox()).toClient().register();
        DEOBOX.toDoor().setModel(new DeoBoxDoor(DeoBoxDoor.getTexturedModelData().createModel())).toClient().register();
        DEOBOX.setPortalWidth(1f);
        DEOBOX.setPortalHeight(2f);
        DEOBOX.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO.setModel(new logo_tardis_model()).toClient().register();
        LEGO.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO.setPortalWidth(1f);
        LEGO.setPortalHeight(2f);
        LEGO.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO2.setModel(new logo_tardis_model()).toClient().register();
        LEGO2.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO2.setPortalWidth(1f);
        LEGO2.setPortalHeight(2f);
        LEGO2.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGO3.setModel(new logo_tardis_model()).toClient().register();
        LEGO3.toDoor().setModel(new logo_tardis_model_door(logo_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGO3.setPortalWidth(1f);
        LEGO3.setPortalHeight(2f);
        LEGO3.setSonicItemTranslations(new Vector3f(0, 0, 0));

        HOTTUBTIMEMACHINE.setModel(new hottubtimemachine()).toClient().register();
        HOTTUBTIMEMACHINE.toDoor().setModel(new hottubtimemachinedoor(hottubtimemachinedoor.getTexturedModelData().createModel())).toClient().register();
        HOTTUBTIMEMACHINE.setSonicItemTranslations(new Vector3f(0, 0, 0));

        LEGODIM.setModel(new lego_tardis_model()).toClient().register();
        LEGODIM.toDoor().setModel(new lego_tardis_model_door(lego_tardis_model_door.getTexturedModelData().createModel())).toClient().register();
        LEGODIM.setPortalWidth(0.90f);
        LEGODIM.setPortalHeight(1.5f);
        LEGODIM.setSonicItemTranslations(new Vector3f(0, 0, 0));

        POLICEBOXALT.setModel(new policebox()).toClient().register();
        POLICEBOXALT.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();
        POLICEBOXALT.setPortalWidth(1f);
        POLICEBOXALT.setPortalHeight(2f);
        POLICEBOXALT.setSonicItemTranslations(new Vector3f(0, 0, 0));

        POLICEBOXPURPLE.setModel(new policebox()).toClient().register();
        POLICEBOXPURPLE.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();
        POLICEBOXPURPLE.setPortalWidth(1f);
        POLICEBOXPURPLE.setPortalHeight(2f);
        POLICEBOXPURPLE.setSonicItemTranslations(new Vector3f(0, 0, 0));

        JAKE.setModel(new JakeTheDogExteriorModel(JakeTheDogExteriorModel.getTexturedModelData().createModel())).toClient().register();
        JAKE.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();

        LEFTHOTTUB.setModel(new lefthottub()).toClient().register();
        LEFTHOTTUB.toDoor().setModel(new lefthottubdoor(lefthottubdoor.getTexturedModelData().createModel())).toClient().register();
        LEFTHOTTUB.setSonicItemTranslations(new Vector3f(0, 0, 0));

    }
}
