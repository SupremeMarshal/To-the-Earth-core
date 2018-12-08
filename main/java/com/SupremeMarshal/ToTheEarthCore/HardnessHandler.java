package com.SupremeMarshal.ToTheEarthCore;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class HardnessHandler 
{
	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		Block block = (Block) dependencies.get("block");
		Entity entity = (Entity) dependencies.get("entity");
		int hardness = -1;
		int tier = 0;
		
		
		if (block == ModBlocks.HARDROCK || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDROCK_IRON || block == ModBlocks.HARDROCK_REDSTONE
				|| block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.HARDROCK_SILVER 
				|| block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.HARDROCK_SAPHIR
				|| block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.HARDROCK_AMAZONITE)
		{hardness = 0;}
		else if (block == ModBlocks.REDROCK || block == ModBlocks.REDROCK_COAL || block == ModBlocks.REDROCK_IRON || block == ModBlocks.REDROCK_REDSTONE
				|| block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.REDROCK_SILVER 
				|| block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.REDROCK_SAPHIR
				|| block == ModBlocks.REDROCK_RUBY || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.REDROCK_AMAZONITE)
		{hardness = 1;}
		else if (block == ModBlocks.MANTLEROCK || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.MANTLEROCK_REDSTONE
				|| block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.MANTLEROCK_SILVER 
				|| block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.MANTLEROCK_SAPHIR
				|| block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.MANTLEROCK_AMAZONITE)
		{hardness = 2;}
		else if (block == ModBlocks.COREROCK)
		{hardness = 3;}
		else 
		{hardness = -1;}
		
		if (block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.REDROCK_GOLD || block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.GOLD_ORE || block == ModBlocks.HARDROCK_EMERALD 
				|| block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.MANTLEROCK_LAPIS 
				|| block == ModBlocks.HARDROCK_REDSTONE  || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.MANTLEROCK_REDSTONE)
		{tier = 1;}
		else if (block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.PLATINUM_ORE)
		{tier = 2;}
		else if (block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.SAPHIR_ORE)
		{tier = 3;}
		else if (block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.RUBY_ORE)
		{tier = 4;}
		else if (block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.DIAMOND_ORE)
		{tier = 5;}
		else if (block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.AMAZONITE_ORE)
		{tier = 6;}
		else {tier = 0;}
	
			if (((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem())
				|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem())
				|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem()))
				&& ((int)hardness == 0 || (int)hardness == 1 || (int)hardness == 2 || (int)hardness == 3))
			{
			block.setHardness((float) -1.0F);
			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else { block.setHardness((float) -1.0F);}
		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 17.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else { block.setHardness((float) -1.0F);}
		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 9.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 25.0F);}
			else { block.setHardness((float) -1.0F);}
		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.GOLD_PICKAXE, (int) (1)).getItem()))
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 7F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 30.0F);}
			else { block.setHardness((float) -1.0F);}
			}
		
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.PLATINUM_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 17.5F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 9.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else { block.setHardness((float) -1.0F);}
			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SAPHIR_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 3.5F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.6F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 15F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 20F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 30F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 25F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 30F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 40F);}
			else { block.setHardness((float) -1.0F); }
			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.RUBY_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 2F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 3F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 10F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 15F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 25F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 35F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 50F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 15F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 20F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 25F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 35F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 50F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 70F);}
			else { block.setHardness((float) -1.0F); }
			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.DIAMOND_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 1.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 3.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 2.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 2.5F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 5F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 3.5F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 5F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 10F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 15F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 20F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 30F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 60F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 7.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 80.0F);}
			else { block.setHardness((float) 30.0F);}
			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.AMAZONITE_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 0.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 1.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 1.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 15.0F);}
			if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 0.5F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 1.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 2.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 1.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 2.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 10F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 15F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 30F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 3.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 45.0F);}
			else { block.setHardness((float) 15.0F);}
			}
		else block.setHardness((float) -1.0F);
		}
}
