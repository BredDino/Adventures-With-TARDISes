package net.awt.TARDIS.console.client.models;

import dev.amble.ait.client.models.consoles.ConsoleModel;
import dev.amble.ait.client.models.consoles.SimpleConsoleModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ConsoleBlockEntity;
import dev.amble.ait.core.tardis.handler.travel.TravelHandlerBase;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BlockConsoleModel extends SimpleConsoleModel {
	private final ModelPart Root;
	private final ModelPart console;
	private final ModelPart stairs;
	private final ModelPart stair;
	private final ModelPart stair2;
	private final ModelPart stair3;
	private final ModelPart stair4;
	private final ModelPart stair5;
	private final ModelPart stair6;
	private final ModelPart stair7;
	private final ModelPart stair8;
	private final ModelPart stair9;
	private final ModelPart stair10;
	private final ModelPart stair11;
	private final ModelPart stair12;
	private final ModelPart stair13;
	private final ModelPart stair14;
	private final ModelPart stair15;
	private final ModelPart stair16;
	private final ModelPart slabs;
	private final ModelPart trapdoors;
	private final ModelPart rotor;
	private final ModelPart bulbything;
	private final ModelPart Controls;
	private final ModelPart XYZandIncriments;
	private final ModelPart throttle;
	private final ModelPart prot19;
	private final ModelPart hailmary;
	private final ModelPart autopilot;
	private final ModelPart prot3;
	private final ModelPart handbreak;
	private final ModelPart seigemode;
	private final ModelPart antigravs;
	private final ModelPart refueler;
	private final ModelPart alarms;
	private final ModelPart prot54;
	private final ModelPart monitor;
	private final ModelPart prot515;
	private final ModelPart DoorLock;
	private final ModelPart power;
	private final ModelPart SonicPort;
	private final ModelPart monitor2;
	public BlockConsoleModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.console = this.Root.getChild("console");
		this.stairs = this.console.getChild("stairs");
		this.stair = this.stairs.getChild("stair");
		this.stair2 = this.stairs.getChild("stair2");
		this.stair3 = this.stairs.getChild("stair3");
		this.stair4 = this.stairs.getChild("stair4");
		this.stair5 = this.stairs.getChild("stair5");
		this.stair6 = this.stairs.getChild("stair6");
		this.stair7 = this.stairs.getChild("stair7");
		this.stair8 = this.stairs.getChild("stair8");
		this.stair9 = this.stairs.getChild("stair9");
		this.stair10 = this.stairs.getChild("stair10");
		this.stair11 = this.stairs.getChild("stair11");
		this.stair12 = this.stairs.getChild("stair12");
		this.stair13 = this.stairs.getChild("stair13");
		this.stair14 = this.stairs.getChild("stair14");
		this.stair15 = this.stairs.getChild("stair15");
		this.stair16 = this.stairs.getChild("stair16");
		this.slabs = this.console.getChild("slabs");
		this.trapdoors = this.console.getChild("trapdoors");
		this.rotor = this.console.getChild("rotor");
		this.bulbything = this.rotor.getChild("bulbything");
		this.Controls = this.Root.getChild("Controls");
		this.XYZandIncriments = this.Controls.getChild("XYZandIncriments");
		this.throttle = this.Controls.getChild("throttle");
		this.prot19 = this.Controls.getChild("prot19");
		this.hailmary = this.Controls.getChild("hailmary");
		this.autopilot = this.Controls.getChild("autopilot");
		this.prot3 = this.Controls.getChild("prot3");
		this.handbreak = this.Controls.getChild("handbreak");
		this.seigemode = this.Controls.getChild("seigemode");
		this.antigravs = this.Controls.getChild("antigravs");
		this.refueler = this.Controls.getChild("refueler");
		this.alarms = this.Controls.getChild("alarms");
		this.prot54 = this.Controls.getChild("prot54");
		this.monitor = this.Controls.getChild("monitor");
		this.prot515 = this.Controls.getChild("prot515");
		this.DoorLock = this.Controls.getChild("DoorLock");
		this.power = this.Controls.getChild("power");
		this.SonicPort = this.Controls.getChild("SonicPort");
		this.monitor2 = this.Controls.getChild("monitor2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Root = modelPartData.addChild("Root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData console = Root.addChild("console", ModelPartBuilder.create().uv(0, 0).cuboid(-16.0F, -24.0F, 0.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 8.0F, -8.0F));

		ModelPartData stairs = console.addChild("stairs", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -8.0F, 8.0F));

		ModelPartData stair = stairs.addChild("stair", ModelPartBuilder.create().uv(64, 112).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 256).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData stair2 = stairs.addChild("stair2", ModelPartBuilder.create().uv(128, 0).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 72).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData stair3 = stairs.addChild("stair3", ModelPartBuilder.create().uv(128, 24).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 96).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stair4 = stairs.addChild("stair4", ModelPartBuilder.create().uv(128, 48).cuboid(8.0F, -33.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 120).cuboid(8.0F, -25.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 17.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stair5 = stairs.addChild("stair5", ModelPartBuilder.create().uv(192, 144).cuboid(8.0F, -33.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 144).cuboid(8.0F, -25.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-32.0F, 17.0F, 32.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stair6 = stairs.addChild("stair6", ModelPartBuilder.create().uv(192, 168).cuboid(8.0F, -33.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 168).cuboid(8.0F, -25.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(32.0F, 17.0F, 32.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stair7 = stairs.addChild("stair7", ModelPartBuilder.create().uv(192, 192).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 192).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-32.0F, 16.0F, -32.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stair8 = stairs.addChild("stair8", ModelPartBuilder.create().uv(64, 208).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 216).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(32.0F, 16.0F, -32.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stair9 = stairs.addChild("stair9", ModelPartBuilder.create().uv(0, 216).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 240).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(-32.0F, 16.0F, -32.0F));

		ModelPartData stair10 = stairs.addChild("stair10", ModelPartBuilder.create().uv(128, 216).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 264).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(-32.0F, 16.0F, 32.0F));

		ModelPartData stair11 = stairs.addChild("stair11", ModelPartBuilder.create().uv(192, 216).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(112, 264).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(32.0F, 16.0F, 32.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData stair12 = stairs.addChild("stair12", ModelPartBuilder.create().uv(64, 232).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(160, 264).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(32.0F, 16.0F, -32.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData stair13 = stairs.addChild("stair13", ModelPartBuilder.create().uv(48, 280).cuboid(-8.0F, -40.0F, -16.0F, 16.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(192, 240).cuboid(-8.0F, -32.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

		ModelPartData stair14 = stairs.addChild("stair14", ModelPartBuilder.create().uv(0, 288).cuboid(-8.0F, -40.0F, -16.0F, 16.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(256, 0).cuboid(-8.0F, -32.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData stair15 = stairs.addChild("stair15", ModelPartBuilder.create().uv(256, 24).cuboid(8.0F, -33.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(208, 264).cuboid(8.0F, -25.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -47.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stair16 = stairs.addChild("stair16", ModelPartBuilder.create().uv(256, 48).cuboid(8.0F, -32.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(256, 264).cuboid(8.0F, -24.0F, -8.0F, 8.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -48.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData slabs = console.addChild("slabs", ModelPartBuilder.create().uv(64, 64).cuboid(-24.0F, -16.0F, -24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 96).cuboid(8.0F, -16.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 120).cuboid(24.0F, -16.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 160).cuboid(-24.0F, -16.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 168).cuboid(-40.0F, -16.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 240).cuboid(8.0F, -24.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(128, 240).cuboid(-24.0F, -24.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -8.0F, 8.0F));

		ModelPartData slab_r1 = slabs.addChild("slab_r1", ModelPartBuilder.create().uv(0, 192).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, -40.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData slab_r2 = slabs.addChild("slab_r2", ModelPartBuilder.create().uv(128, 144).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, 24.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData trapdoors = console.addChild("trapdoors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData trapdoor_r1 = trapdoors.addChild("trapdoor_r1", ModelPartBuilder.create().uv(122, 288).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -56.0F, 12.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData trapdoor_r2 = trapdoors.addChild("trapdoor_r2", ModelPartBuilder.create().uv(122, 288).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -40.0F, 12.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData trapdoor_r3 = trapdoors.addChild("trapdoor_r3", ModelPartBuilder.create().uv(122, 288).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -56.0F, 32.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData trapdoor_r4 = trapdoors.addChild("trapdoor_r4", ModelPartBuilder.create().uv(122, 288).cuboid(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -40.0F, 32.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData rotor = console.addChild("rotor", ModelPartBuilder.create().uv(0, 32).cuboid(-16.0F, -40.0F, 0.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 64).cuboid(-16.0F, -56.0F, 0.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 32).cuboid(-16.0F, -72.0F, 0.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-16.0F, -88.0F, 0.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bulbything = rotor.addChild("bulbything", ModelPartBuilder.create().uv(0, 304).cuboid(-13.0F, -36.0F, 3.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Controls = Root.addChild("Controls", ModelPartBuilder.create().uv(448, 4).cuboid(0.0F, -24.0F, -16.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 363).cuboid(0.0F, -28.0F, 16.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 476).cuboid(-32.0F, -28.0F, -16.0F, 16.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 8.0F, -8.0F));

		ModelPartData tardisdirection_r1 = Controls.addChild("tardisdirection_r1", ModelPartBuilder.create().uv(6, 504).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, -9.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData fastreturn_r1 = Controls.addChild("fastreturn_r1", ModelPartBuilder.create().uv(6, 504).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData landtype_r1 = Controls.addChild("landtype_r1", ModelPartBuilder.create().uv(6, 504).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, -14.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData mark_r1 = Controls.addChild("mark_r1", ModelPartBuilder.create().uv(6, 504).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData set_r1 = Controls.addChild("set_r1", ModelPartBuilder.create().uv(0, 504).cuboid(-9.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData door_open_or_close_r1 = Controls.addChild("door_open_or_close_r1", ModelPartBuilder.create().uv(6, 504).cuboid(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-41.0F, -24.0F, 8.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData load_r1 = Controls.addChild("load_r1", ModelPartBuilder.create().uv(0, 504).cuboid(-9.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-40.0F, -24.0F, 22.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData XYZandIncriments = Controls.addChild("XYZandIncriments", ModelPartBuilder.create().uv(0, 384).cuboid(-8.0F, -17.0F, 24.0F, 16.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 383).cuboid(-1.0F, -21.0F, 28.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 383).cuboid(3.0F, -21.0F, 28.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 383).cuboid(-5.0F, -21.0F, 28.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(5, 335).cuboid(-3.0F, -18.0F, 33.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -8.0F, 8.0F));

		ModelPartData throttle = Controls.addChild("throttle", ModelPartBuilder.create().uv(0, 332).cuboid(19.0F, -26.0F, 21.0F, 10.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData stick_r1 = throttle.addChild("stick_r1", ModelPartBuilder.create().uv(0, 348).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData prot19 = Controls.addChild("prot19", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(35.0F, 0.0F, 16.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stick_r2 = prot19.addChild("stick_r2", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData hailmary = Controls.addChild("hailmary", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 16.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stick_r3 = hailmary.addChild("stick_r3", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData autopilot = Controls.addChild("autopilot", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 16.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stick_r4 = autopilot.addChild("stick_r4", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData prot3 = Controls.addChild("prot3", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(27.0F, 0.0F, 16.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData stick_r5 = prot3.addChild("stick_r5", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData handbreak = Controls.addChild("handbreak", ModelPartBuilder.create().uv(0, 332).cuboid(19.0F, -26.0F, 21.0F, 10.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -32.0F));

		ModelPartData stick_r6 = handbreak.addChild("stick_r6", ModelPartBuilder.create().uv(0, 348).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData seigemode = Controls.addChild("seigemode", ModelPartBuilder.create().uv(0, 332).cuboid(-3.0F, -4.0F, -2.0F, 10.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(22.0F, -19.0F, 7.0F, 0.0F, 0.0F, -3.1416F));

		ModelPartData stick_r7 = seigemode.addChild("stick_r7", ModelPartBuilder.create().uv(0, 348).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -3.0F, 1.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData antigravs = Controls.addChild("antigravs", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-15.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stick_r8 = antigravs.addChild("stick_r8", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData refueler = Controls.addChild("refueler", ModelPartBuilder.create().uv(6, 335).cuboid(22.0F, -26.0F, 23.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-20.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData alarms = Controls.addChild("alarms", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-50.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stick_r9 = alarms.addChild("stick_r9", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData prot54 = Controls.addChild("prot54", ModelPartBuilder.create().uv(6, 335).cuboid(22.0F, -26.0F, 23.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-45.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData monitor = Controls.addChild("monitor", ModelPartBuilder.create().uv(0, 240).cuboid(0.0F, -32.0F, 0.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 405).cuboid(12.0F, -32.0F, 0.0F, 2.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData prot515 = Controls.addChild("prot515", ModelPartBuilder.create().uv(0, 441).cuboid(19.0F, -26.0F, 20.0F, 10.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-33.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData DoorLock = Controls.addChild("DoorLock", ModelPartBuilder.create(), ModelTransform.of(-6.5914F, -31.4596F, 52.2489F, -0.2618F, -1.0472F, 0.0F));

		ModelPartData DoorLock_r1 = DoorLock.addChild("DoorLock_r1", ModelPartBuilder.create().uv(4, 412).cuboid(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.001F)), ModelTransform.of(-4.0F, 8.0F, -6.0F, 2.6561F, 0.9959F, 0.3981F));

		ModelPartData power = Controls.addChild("power", ModelPartBuilder.create().uv(5, 335).cuboid(21.0F, -26.0F, 23.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 32.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stick_r10 = power.addChild("stick_r10", ModelPartBuilder.create().uv(3, 349).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(24.0F, -25.0F, 24.0F, 0.0F, 0.0F, -0.9599F));

		ModelPartData SonicPort = Controls.addChild("SonicPort", ModelPartBuilder.create().uv(17, 507).cuboid(0.0F, -1.05F, 0.0F, 0.0F, 0.0F, 0.0F, new Dilation(0.001F))
		.uv(10, 506).cuboid(-1.75F, -0.45F, -1.75F, 3.5F, 2.0F, 3.5F, new Dilation(0.0F))
		.uv(0, 509).cuboid(-1.0F, -1.05F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(21, 449).cuboid(-1.0F, -1.05F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.001F)), ModelTransform.pivot(-23.9182F, -24.989F, 23.3F));

		ModelPartData monitor2 = Controls.addChild("monitor2", ModelPartBuilder.create().uv(0, 240).cuboid(0.0F, -32.0F, 0.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 405).cuboid(12.0F, -32.0F, 0.0F, 2.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-16.0F, -24.0F, 16.0F, 0.0F, 3.1416F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ConsoleBlockEntity console, ClientTardis tardis, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		matrices.push();
		matrices.translate(0.5F, -1.5F, -0.5F);
		matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180.0F));
		super.renderWithAnimations(console, tardis, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForState(TravelHandlerBase.State state) {
		return Animation.Builder.create(0.0F).build();
	}

	@Override
	public ModelPart getPart() {
		return Root;
	}
}