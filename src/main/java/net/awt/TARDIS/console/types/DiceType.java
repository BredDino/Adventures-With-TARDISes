package net.awt.TARDIS.console.types;

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

public class DiceType extends ConsoleTypeSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/dice");
    private static final ControlTypes[] TYPES = new ControlTypes[]{
            new ControlTypes(new ThrottleControl(), EntityDimensions.changing(0.21249999F, 0.20000002F), new Vector3f(0.440625F, 0.575F, 1.4359375F)),
            new ControlTypes(new HandBrakeControl(), EntityDimensions.changing(0.20000002F, 0.15F), new Vector3f(-0.5257813F, 0.5624998F, 1.4125F)),
            new ControlTypes(new AutoPilotControl(), EntityDimensions.changing(0.1125F, 0.1F), new Vector3f(-0.39609376F, 0.6500002F, 1.053125F)),
            new ControlTypes(new DoorControl(), EntityDimensions.changing(0.16250001F, 0.175F), new Vector3f(-0.37734377F, 0.5874998F, -1.3984375F)),
            new ControlTypes(new DoorLockControl(), EntityDimensions.changing(0.07499999F, 0.087499976F), new Vector3f(0.34843752F, 0.71249926F, -0.921875F)),
            new ControlTypes(new AntiGravsControl(), EntityDimensions.changing(0.1125F, 0.099999994F), new Vector3f(0.20234373F, 0.7375F, -0.83125F)),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(0.43749985F, 0.16250001F), new Vector3f(0.9867188F, 0.5875017F, -0.565625F)),
            new ControlTypes(new EngineOverloadControl(), EntityDimensions.changing(0.099999994F, 0.16250001F), new Vector3f(1.4117191F, 0.5375015F, -0.24062519F)),
            new ControlTypes(new FastReturnControl(), EntityDimensions.changing(0.087500006F, 0.11250001F), new Vector3f(0.6617187F, 0.57500017F, 1.459375F)),
            new ControlTypes(new ElectricalDischargeControl(), EntityDimensions.changing(0.07499999F, 0.0875F), new Vector3f(0.08828106F, 0.5750003F, -1.4593754F)),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(0.43749988F, 0.3749999F), new Vector3f(0.72578126F, 1.0000017F, -0.4625F)),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(0.43749988F, 0.3749999F), new Vector3f(
                    -0.937500f + (0.43749988F/2),
                    1.0000017F,
                    -0.4625F
            )),
            new ControlTypes(new SecurityControl(), EntityDimensions.changing(0.07499999F, 0.16250001F), new Vector3f(0.19140626F, 0.77499974F, 0.7519531F)),
            new ControlTypes(new TelepathicControl(), EntityDimensions.changing(0.79999954F, 0.18750001F), new Vector3f(0.925F, 0.5624998F, 0.5390625F)),
            new ControlTypes(new LandTypeControl(), EntityDimensions.changing(0.16250001F, 0.15F), new Vector3f(-0.39921877F, 0.6775001F, -1.06875F)),
            new ControlTypes(new IncrementControl(), EntityDimensions.changing(0.1125F, 0.1F), new Vector3f(-0.8875F, 0.6500006F, -0.77343756F)),
            new ControlTypes(new XControl(), EntityDimensions.changing(0.08749999F, 0.08749999F), new Vector3f(-0.7867188F, 0.6999998F, -0.5453125F)),
            new ControlTypes(new YControl(), EntityDimensions.changing(0.0875F, 0.0875F), new Vector3f(-1.046875F, 0.6499998F, -0.4359375F)),
            new ControlTypes(new ZControl(), EntityDimensions.changing(0.0875F, 0.0875F), new Vector3f(-1.0875F, 0.6F, -0.7234375F)),
            new ControlTypes(new RandomiserControl(), EntityDimensions.changing(0.1375F, 0.07499999F), new Vector3f(0.58515626F, 0.57500017F, -1.4250001F)),
            new ControlTypes(new DirectionControl(), EntityDimensions.changing(0.1125F, 0.1125F), new Vector3f(0.5375F, 0.75F, -0.62656254F)),
            new ControlTypes(new HailMaryControl(), EntityDimensions.changing(0.1125F, 0.125F), new Vector3f(-0.9585937F, 0.57499963F, -1.2625F)),
            new ControlTypes(new DimensionControl(), EntityDimensions.changing(0.1125F, 0.1125F), new Vector3f(0.9117188F, 0.5950001F, -1.1015625F)),
            new ControlTypes(new RefuelerControl(), EntityDimensions.changing(0.099999994F, 0.1125F), new Vector3f(-1.5F, 0.5749998F, -0.3046875F)),
            new ControlTypes(new PowerControl(), EntityDimensions.changing(0.17500001F, 0.17500001F), new Vector3f(0.3765625F, 0.5875002F, -1.3859376F)),
            new ControlTypes(new SiegeModeControl(), EntityDimensions.changing(0.20000002F, 0.22500002F), new Vector3f(
                    -1.304838f,
                    0.065551f,
                    0.740271f
            )
            ),
            new ControlTypes(new HADSControl(), EntityDimensions.changing(0.07499999F, 0.17500001F), new Vector3f(-0.0953125F, 0.7624998F, 0.76875F)),
            new ControlTypes(new MarkWaypointControl(), EntityDimensions.changing(0.07499999F, 0.0875F), new Vector3f(0.18828124F, 0.5750004F, -1.459375F)),
            new ControlTypes(new SetWaypointControl(), EntityDimensions.changing(0.06249999F, 0.112500004F), new Vector3f(0.15078124F, 0.7000004F, -1.0609375F)),
            new ControlTypes(new ConsolePortControl(), EntityDimensions.changing(0.125F, 0.1125F), new Vector3f(0.0015624892F, 0.73750055F, -0.7953125F)),
            new ControlTypes(new CloakControl(), EntityDimensions.changing(0.099999994F, 0.1125F), new Vector3f(0.82734376F, 0.75000036F, -0.1609375F)),
            new ControlTypes(new SonicPortControl(), EntityDimensions.changing(0.125F, 0.08749999F), new Vector3f(-1.0605469F, 0.7624998F, 0.21328126F)),
            new ControlTypes(new ShieldsControl(), EntityDimensions.changing(0.125F, 0.099999994F), new Vector3f(-0.21093749F, 0.7374998F, -0.825F))};

    public DiceType() {
        super(REFERENCE, "dice");
    }

    public ControlTypes[] getControlTypes() {
        return TYPES;
    }

    public ConsoleVariantSchema getDefaultVariant() {
        return AWTConsoleVariantRegistry.DICE;
    }

}


