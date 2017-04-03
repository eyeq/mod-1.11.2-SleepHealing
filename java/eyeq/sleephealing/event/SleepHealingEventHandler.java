package eyeq.sleephealing.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.FoodStats;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SleepHealingEventHandler {
    @SubscribeEvent
    public void onPlayerWakeUp(PlayerWakeUpEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        if(player.getEntityWorld().isRemote) {
            return;
        }
        if(!event.updateWorld()) {
            player.heal(player.getMaxHealth());
            FoodStats food = player.getFoodStats();
            food.setFoodLevel(food.getFoodLevel() - 5);
        }
    }
}
