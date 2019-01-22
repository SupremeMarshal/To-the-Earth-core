package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid="totheearthcore")
public class PlayerTickEventHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        if (event.player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND).getItem() == ModItems.SILVER_SHIELD
                || event.player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() == ModItems.SILVER_SHIELD
                || event.player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND).getItem() == ModItems.GOLD_SHIELD
                || event.player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() == ModItems.GOLD_SHIELD)
        {
            if (event.player.world.getTotalWorldTime() % 300 != 1)
            {
                return;
            }
            event.player.heal(0.25F);
            //heal 1 Health per minute
        }
        else if (event.player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND).getItem() == ModItems.SILVER_SHIELD
                || event.player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() == ModItems.SILVER_SHIELD)
        {
            if (event.player.world.getTotalWorldTime() % 300 != 1)
            {
                return;
            }
            event.player.heal(0.25F);
            //heal 1 Health per minute
        }
    }
}
