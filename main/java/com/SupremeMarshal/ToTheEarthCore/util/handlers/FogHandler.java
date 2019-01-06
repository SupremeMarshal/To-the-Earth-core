package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;

@EventBusSubscriber
public class FogHandler {


    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(EntityViewRenderEvent.FogDensity event)
    {
        Entity p = event.getEntity();
        if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == Blocks.LAVA)
    {
        event.setDensity(0.5F);
    }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == ModBlocks.HOT_LAVA_BLOCK)
        {
            event.setDensity(0.3F);
        }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == ModBlocks.CORE_LAVA_BLOCK)
        {
            event.setDensity(0.75F);
        }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == Blocks.WATERLILY)
        {
            event.setDensity(0.1F);
        }
        else if (event.getEntity().posY < 0 && event.getEntity().posY > -1000)
        {
            event.setDensity(-0.0000035F * Math.round(event.getEntity().posY));
        }
        //0.0035
        else if (event.getEntity().posY <= -1000 && event.getEntity().posY > -14993)
        {
            event.setDensity(0.001F + (-0.00000125F * Math.round(event.getEntity().posY)));
        }
        else if (event.getEntity().posY <= -14993)
        {
            event.setDensity(0.1F);
        }
        else
        {
            event.setDensity(0.0001F);
        }

        event.setCanceled(true); // must cancel event for event handler to take effect
    }


    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(EntityViewRenderEvent.FogColors event)
    {
        Entity p = event.getEntity();
        if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == Blocks.LAVA)
        {
            event.setRed (1.0F);
            event.setGreen(0.75F);
            event.setBlue(0.25F);
        }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == ModBlocks.HOT_LAVA_BLOCK)
        {
            event.setRed (1.0F);
            event.setGreen(0.85F);
            event.setBlue(0.0F);
        }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == ModBlocks.CORE_LAVA_BLOCK)
        {
            event.setRed (0.6F);
            event.setGreen(1.0F);
            event.setBlue(1.0F);
        }
        else if (p.getEntityWorld().getBlockState(new BlockPos(p.posX, p.posY + p.getEyeHeight(), p.posZ)).getBlock() == Blocks.WATERLILY)
        {
            event.setRed (0.1F);
            event.setGreen(0.15F);
            event.setBlue(0.80F);
        }
        else if (event.getEntity().posY < 0 && event.getEntity().posY > -4000)
        {
            Color theColor = Color.BLACK;
            event.setRed (-0.00012F * Math.round(event.getEntity().posY));
            event.setGreen(0.0F);
            event.setBlue(0.0F);
        }
        else if (event.getEntity().posY <= -4000 && event.getEntity().posY > -6850)
        {
            Color theColor = Color.BLACK;
            /* RED STARTING 0.48F at -4000Y, 0.99F at -6850Y */
            event.setRed ((-0.00018F * Math.round(event.getEntity().posY))-0.24F);
            event.setGreen((-0.00035F * Math.round(event.getEntity().posY))-1.4F);
            event.setBlue(0.0F);
        }
        else if (event.getEntity().posY <= -6850 && event.getEntity().posY > -9200)
        {
            Color theColor = Color.BLACK;
            /* RED STARTING 0.99F at -6850Y, 0.0F at  */
            event.setRed ((0.000432F * Math.round(event.getEntity().posY))+3.95F);
            event.setGreen(1.0F);
            event.setBlue(0.0F);
        }
        else if (event.getEntity().posY <= -9200 && event.getEntity().posY > -14993)
        {
            Color theColor = Color.BLACK;
            /* RED STARTING 0.99F at -6850Y, 0.0F at  */
            event.setRed ((-0.0005F * Math.round(event.getEntity().posY))-4.6F);
            event.setGreen(0.99F);
            event.setBlue((-0.0001F * Math.round(event.getEntity().posY))-0.92F);
        }
        else if (event.getEntity().posY <= -14993)
        {
            Color theColor = Color.WHITE;
            /* RED STARTING 0.99F at -6850Y, 0.0F at  */
            event.setRed (0.50F);
            event.setGreen(1.0F);
            event.setBlue(1.0F);
        }
    }
}
