package net.awt.TARDIS.console.types;

import dev.amble.ait.AITMod;
import dev.amble.ait.core.tardis.control.ControlTypes;
import dev.amble.ait.core.tardis.control.impl.*;
import dev.amble.ait.core.tardis.control.impl.pos.IncrementControl;
import dev.amble.ait.core.tardis.control.impl.pos.XControl;
import dev.amble.ait.core.tardis.control.impl.pos.YControl;
import dev.amble.ait.core.tardis.control.impl.pos.ZControl;
import dev.amble.ait.core.tardis.control.impl.waypoint.MarkWaypointControl;
import dev.amble.ait.core.tardis.control.impl.waypoint.SetWaypointControl;
import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

public class TestType extends ConsoleTypeSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/test");
    private static final ControlTypes[] TYPES = new ControlTypes[]{
            new ControlTypes(new ThrottleControl(), EntityDimensions.changing(0.12499998F, 0.099999994F), new Vector3f(-0.37109375F, 0.49999985F, 0.97558594F)),
            new ControlTypes(new HandBrakeControl(), EntityDimensions.changing(0.125F, 0.099999994F), new Vector3f(-0.041015625F, 0.49999985F, 0.97558594F)),
            new ControlTypes(new AutoPilotControl(), EntityDimensions.changing(0.125F, 0.1F), new Vector3f(-0.19687499F, 0.47500017F, 0.9875F)),
            new ControlTypes(new FastReturnControl(), EntityDimensions.changing(0.075F, 0.075F), new Vector3f(0.24960938F, 0.62499994F, 0.6625F)),
            new ControlTypes(new DoorControl(), EntityDimensions.changing(0.1125F, 0.07499997F), new Vector3f(0.784375F, 0.52499986F, -0.50156254F)),
            new ControlTypes(new DoorLockControl(), EntityDimensions.changing(0.1125F, 0.07499997F), new Vector3f(0.66015625F, 0.5249997F, -0.7F)),
            new ControlTypes(new AntiGravsControl(), EntityDimensions.changing(0.1F, 0.0875F), new Vector3f(0.10312499F, 0.4875001F, 0.965625F)),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(0.20000002F, 0.1125F), new Vector3f(0.7125F, 0.5375015F, -0.16289063F)),
            new ControlTypes(new TelepathicControl(), EntityDimensions.changing(0.17500004F, 0.15F), new Vector3f(-7.812418E-4F, 0.48749995F, -0.7267578F)),
            new ControlTypes(new LandTypeControl(), EntityDimensions.changing(0.20000002F, 0.099999994F), new Vector3f(-0.346875F, 0.465F, -0.9546875F)),
            new ControlTypes(new IncrementControl(), EntityDimensions.changing(0.125F, 0.0875F), new Vector3f(-0.67539066F, 0.4875001F, -0.83632815F)),
            new ControlTypes(new XControl(), EntityDimensions.changing(0.074999996F, 0.099999994F), new Vector3f(-0.5355469F, 0.5875F, -0.37187502F)),
            new ControlTypes(new YControl(), EntityDimensions.changing(0.074999996F, 0.1F), new Vector3f(-0.6503906F, 0.55F, -0.43632814F)),
            new ControlTypes(new ZControl(), EntityDimensions.changing(0.074999996F, 0.1F), new Vector3f(-0.77500004F, 0.5125001F, -0.51132816F)),
            new ControlTypes(new RandomiserControl(), EntityDimensions.changing(0.06249999F, 0.125F), new Vector3f(-0.953125F, 0.4625F, -0.3609375F)),
            new ControlTypes(new DirectionControl(), EntityDimensions.changing(0.1F, 0.1F), new Vector3f(-1.1007812F, 0.47500008F, 0.15039062F)),
            new ControlTypes(new SecurityControl(), EntityDimensions.changing(0.07499999F, 0.1F), new Vector3f(0.55390626F, 0.57499975F, 0.31445312F)),
            new ControlTypes(new HailMaryControl(), EntityDimensions.changing(0.07499999F, 0.1F), new Vector3f(-0.721875F, 0.5749999F, 0.10117188F)),
            new ControlTypes(new CloakControl(), EntityDimensions.changing(0.1125F, 0.1F), new Vector3f(-0.03515624F, 0.47500008F, -1.0359375F)),
            new ControlTypes(new SiegeModeControl(), EntityDimensions.changing(0.112500004F, 0.0875F), new Vector3f(-0.43515626F, 0.5749998F, 0.50156254F)),
            new ControlTypes(new DimensionControl(), EntityDimensions.changing(0.099999994F, 0.099999994F), new Vector3f(-0.91562504F, 0.4825F, 0.43984377F)),
            new ControlTypes(new RefuelerControl(), EntityDimensions.changing(0.1125F, 0.08749999F), new Vector3f(0.3F, 0.4874998F, -1.0429688F)),
            new ControlTypes(new HADSControl(), EntityDimensions.changing(0.074999996F, 0.1F), new Vector3f(0.51601565F, 0.57500017F, 0.4033203F)),
            new ControlTypes(new PowerControl(), EntityDimensions.changing(0.125F, 0.1F), new Vector3f(0.790625F, 0.5250003F, 0.45234376F)),
            new ControlTypes(new ConsolePortControl(), EntityDimensions.changing(0.16250001F, 0.0875F), new Vector3f(-0.425F, 0.6000002F, 0.24140623F)), new ControlTypes(new MarkWaypointControl(), EntityDimensions.changing(0.074999996F, 0.0875F), new Vector3f(0.1875F, 0.4750002F, 0.94082034F)), new ControlTypes(new EngineOverloadControl(), EntityDimensions.changing(0.1125F, 0.1F), new Vector3f(0.06484375F, 0.47500014F, -1.0359373F)), new ControlTypes(new SetWaypointControl(), EntityDimensions.changing(0.07499999F, 0.1F), new Vector3f(-0.9609375F, 0.46250054F, -0.22285157F)), new ControlTypes(new SonicPortControl(), EntityDimensions.changing(0.125F, 0.08749999F), new Vector3f(-0.4359375F, 0.625F, -0.26015624F)), new ControlTypes(new ElectricalDischargeControl(), EntityDimensions.changing(0.099999994F, 0.087499976F), new Vector3f(0.7343742F, 0.5249996F, -0.5765621F)), new ControlTypes(new ShieldsControl(), EntityDimensions.changing(0.099999994F, 0.07499999F), new Vector3f(-0.5734375F, 0.5374998F, 0.6625F))};

    public TestType() {
        super(REFERENCE, "test");
    }

    public ControlTypes[] getControlTypes() {
        return TYPES;
    }

    public ConsoleVariantSchema getDefaultVariant() {
        return AWTConsoleVariantRegistry.TEST;
    }

}


