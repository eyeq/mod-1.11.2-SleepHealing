package eyeq.sleephealing;

import eyeq.sleephealing.event.SleepHealingEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.sleephealing.SleepHealing.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class SleepHealing {
    public static final String MOD_ID = "eyeq_sleephealing";

    @Mod.Instance(MOD_ID)
    public static SleepHealing instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new SleepHealingEventHandler());
    }
}
