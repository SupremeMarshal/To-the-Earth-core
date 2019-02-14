package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HardnessHandler 
{
	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		Block block = (Block) dependencies.get("block");
		Entity entity = (Entity) dependencies.get("entity");
		int hardness = -1;
		int tier = 0;
		
		if (block == ModBlocks.STIFFROCK)
		{hardness = 0;}
		else if (block == ModBlocks.HARDROCK || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDROCK_IRON || block == ModBlocks.HARDROCK_REDSTONE
				|| block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.HARDROCK_SILVER 
				|| block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.HARDROCK_SAPHIR
				|| block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.HARDROCK_SULFUR)
		{hardness = 1;}
		else if (block == ModBlocks.HARDERROCK)
		{hardness = 2;}
		else if (block == ModBlocks.REDROCK || block == ModBlocks.REDROCK_COAL || block == ModBlocks.REDROCK_IRON || block == ModBlocks.REDROCK_REDSTONE
				|| block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.REDROCK_SILVER 
				|| block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.REDROCK_SAPHIR
				|| block == ModBlocks.REDROCK_RUBY || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.REDROCK_SULFUR)
		{hardness = 3;}
		else if (block == ModBlocks.MANTLEROCK || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.MANTLEROCK_REDSTONE
				|| block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.MANTLEROCK_SILVER  || block == ModBlocks.HOT_MANTLEROCK
				|| block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.MANTLEROCK_SAPHIR
				|| block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_SULFUR)
		{hardness = 4;}
		else if (block == ModBlocks.COREROCK || block == ModBlocks.COREROCK_AMAZONITE  || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.COREROCK_RUBY
				|| block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.COREROCK_LAPIS
				|| block == ModBlocks.COREROCK_PLATINUM || block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_IRON || block == ModBlocks.COREROCK_COAL
				|| block == ModBlocks.COREROCK_SULFUR)
		{hardness = 5;}
		else if (block == ModBlocks.INNERCOREROCK || block == ModBlocks.INNERCOREROCK_AMAZONITE  || block == ModBlocks.INNERCOREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_RUBY
				|| block == ModBlocks.INNERCOREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_ONYX || block == ModBlocks.INNERCOREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_LAPIS
				|| block == ModBlocks.INNERCOREROCK_PLATINUM || block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_IRON || block == ModBlocks.INNERCOREROCK_COAL
				|| block == ModBlocks.INNERCOREROCK_SULFUR)
		{hardness = 6;}
		else
		{hardness = -1;}
		
		if (block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.REDROCK_GOLD || block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.GOLD_ORE || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.MANTLEROCK_LAPIS
				|| block == ModBlocks.HARDROCK_REDSTONE  || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.IRON_BLOCK || block == ModBlocks.HARDROCK_SULFUR
				|| block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.MANTLEROCK_SULFUR || block == ModBlocks.SULFUR_ORE || block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_IRON
				|| block == ModBlocks.COREROCK_COAL || block == ModBlocks.COREROCK_SULFUR || block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_IRON
				|| block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.INNERCOREROCK_SULFUR || block == ModBlocks.INNERCOREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_REDSTONE)
		{tier = 1;}
		else if (block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.PLATINUM_ORE || block == ModBlocks.HARDROCK_EMERALD
				|| block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.COREROCK_PLATINUM || block == ModBlocks.INNERCOREROCK_PLATINUM || block == ModBlocks.INNERCOREROCK_EMERALD)
		{tier = 2;}
		else if (block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.SAPHIR_ORE || block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_SAPHIR)
		{tier = 3;}
		else if (block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.RUBY_ORE || block == ModBlocks.COREROCK_RUBY || block == ModBlocks.INNERCOREROCK_RUBY)
		{tier = 4;}
		else if (block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.DIAMOND_ORE || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_DIAMOND)
		{tier = 5;}
		else if (block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMAZONITE)
		{tier = 6;}
		else if (block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.ONYX_ORE || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.INNERCOREROCK_ONYX)
		{tier = 7;}
		else if (block == ModBlocks.IRON_ORE || block == ModBlocks.HARDROCK_IRON || block == ModBlocks.REDROCK_IRON || block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.HARDROCK_COAL ||
		block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL)
		{tier = 0;}
	
			if (((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem())
				|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem())
				|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem()))
				&& ((int)hardness == 1 || (int)hardness == 2 || (int)hardness == 3 || (int)hardness == 4))
			{
			block.setHardness((float) -1.0F);
			}
			else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(Items.WOODEN_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
			{
				if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 9.0F);}
				else { block.setHardness((float) -1.0F);}
				if (block == ModBlocks.IRON_BLOCK ) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
			else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(Items.STONE_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
			{
				if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
				else { block.setHardness((float) -1.0F);}
				if (block == ModBlocks.IRON_BLOCK) { block.setHardness(15.0f);}
				else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
				else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
				else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}


		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 17.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem()))
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 6.8F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 13.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.GOLD_PICKAXE, (int) (1)).getItem()))
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 6.5F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 8.3F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 25.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(9.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(14.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(19.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(24.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(29.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
		
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.PLATINUM_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 17.5F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 8.3F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 14.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 15.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(13.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(18.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(23.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(28.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(35.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.EMERALD_PICKAXE, (int) (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SAPHIR_PICKAXE, (int) (1)).getItem()))
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 20F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 25F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 40F);}
			else { block.setHardness((float) -1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(17.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(27.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(34.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.RUBY_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 10F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 15F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 25F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 35F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 50F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 20F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 25F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 30F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 35F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 50F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 60F);}
			else { block.setHardness((float) -1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(33.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(44.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(60.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}

			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.DIAMOND_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) {block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) {block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 5F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 10F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 15F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 20F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 6) { block.setHardness((float) 60F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 7.0F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 4 && (int)tier == 6) { block.setHardness((float) 50.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(55.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(100.0f);}

			}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.AMAZONITE_PICKAXE, (int) (1)).getItem())) {
				if ((int) hardness == -1 && (int) tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 3) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 4) {block.setHardness((float) 6.0F);}
				else if ((int)hardness == -1 && (int)tier == 5) {block.setHardness((float) 10.0F);}
				else if ((int)hardness == -1 && (int)tier == 6) {block.setHardness((float) 15.0F);}
				else if ((int)hardness == -1 && (int)tier == 7) {block.setHardness((float) 20.0F);}
				else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 3) {block.setHardness((float) 5.0F);}
				else if ((int)hardness == 1 && (int)tier == 4) {block.setHardness((float) 7.5F);}
				else if ((int)hardness == 1 && (int)tier == 5) {block.setHardness((float) 12.0F);}
				else if ((int)hardness == 1 && (int)tier == 6) {block.setHardness((float) 18.0F);}
				else if ((int)hardness == 1 && (int)tier == 6) {block.setHardness((float) 24.0F);}
				else if ((int)hardness == 2 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 2) {block.setHardness((float) 5.0F);}
				else if ((int)hardness == 3 && (int)tier == 3) {block.setHardness((float) 7.5F);}
				else if ((int)hardness == 3 && (int)tier == 4) {block.setHardness((float) 10F);}
				else if ((int)hardness == 3 && (int)tier == 5) {block.setHardness((float) 15F);}
				else if ((int)hardness == 3 && (int)tier == 6) {block.setHardness((float) 30F);}
				else if ((int)hardness == 3 && (int)tier == 7) {block.setHardness((float) 45F);}
				else if ((int)hardness == 4 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 1) {block.setHardness((float) 5.0F);}
				else if ((int)hardness == 4 && (int)tier == 2) {block.setHardness((float) 7.5F);}
				else if ((int)hardness == 4 && (int)tier == 3) {block.setHardness((float) 10.0F);}
				else if ((int)hardness == 4 && (int)tier == 4) {block.setHardness((float) 15.0F);}
				else if ((int)hardness == 4 && (int)tier == 5) {block.setHardness((float) 30.0F);}
				else if ((int)hardness == 4 && (int)tier == 6) {block.setHardness((float) 40.0F);}
				else if ((int)hardness == 4 && (int)tier == 7) {block.setHardness((float) 50.0F);}
				else if ((int)hardness == 5 && (int)tier == 0) {block.setHardness((float) 20.0F);}
				else if ((int)hardness == 5 && (int)tier == 1) {block.setHardness((float) 25.0F);}
				else if ((int)hardness == 5 && (int)tier == 2) {block.setHardness((float) 30.0F);}
				else if ((int)hardness == 5 && (int)tier == 3) {block.setHardness((float) 35.0F);}
				else if ((int)hardness == 5 && (int)tier == 4) {block.setHardness((float) 40.0F);}
				else if ((int)hardness == 5 && (int)tier == 5) {block.setHardness((float) 50.0F);}
				else if ((int)hardness == 5 && (int)tier == 6) {block.setHardness((float) 60.0F);}
				else if ((int)hardness == 5 && (int)tier == 7) {block.setHardness((float) 90.0F);}
				else { block.setHardness((float) -1.0F);}
				if (block == ModBlocks.IRON_BLOCK) {block.setHardness(4.0f);}
				else if (block == ModBlocks.STEEL_BLOCK) {block.setHardness(5.0f);}
				else if (block == ModBlocks.SILVER_BLOCK) {block.setHardness(10.0f);}
				else if (block == ModBlocks.GOLD_BLOCK) {block.setHardness(15.0f);}
				else if (block == ModBlocks.PLATINUM_BLOCK) {block.setHardness(20.0f);}
				else if (block == ModBlocks.SAPHIR_BLOCK) {block.setHardness(30.0f);}
				else if (block == ModBlocks.RUBY_BLOCK) {block.setHardness(40.0f);}
				else if (block == ModBlocks.DIAMOND_BLOCK) {block.setHardness(50.0f);}
				else if (block == ModBlocks.AMAZONITE_BLOCK) {block.setHardness(80.0f);}
			}

			else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.ONYX_PICKAXE, (int) (1)).getItem()))
			{
				if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 3) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 4) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 5) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 6) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == -1 && (int)tier == 7) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 0 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 3) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 4) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 5) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 6) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 1 && (int)tier == 7) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 2 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 3) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 4) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 5) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 6) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 3 && (int)tier == 7) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 0) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 1) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 2) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 3) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 4) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 5) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 6) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 4 && (int)tier == 7) {block.setHardness((float) 4.0F);}
				else if ((int)hardness == 5 && (int)tier == 0) {block.setHardness((float) 10.0F);}
				else if ((int)hardness == 5 && (int)tier == 1) {block.setHardness((float) 15.0F);}
				else if ((int)hardness == 5 && (int)tier == 2) {block.setHardness((float) 20.0F);}
				else if ((int)hardness == 5 && (int)tier == 3) {block.setHardness((float) 25.0F);}
				else if ((int)hardness == 5 && (int)tier == 4) {block.setHardness((float) 30.0F);}
				else if ((int)hardness == 5 && (int)tier == 5) {block.setHardness((float) 35.0F);}
				else if ((int)hardness == 5 && (int)tier == 6) {block.setHardness((float) 40.0F);}
				else if ((int)hardness == 5 && (int)tier == 7) {block.setHardness((float) 50.0F);}
				else if ((int)hardness == 6 && (int)tier == 0) {block.setHardness((float) 20.0F);}
				else if ((int)hardness == 6 && (int)tier == 1) {block.setHardness((float) 30.0F);}
				else if ((int)hardness == 6 && (int)tier == 2) {block.setHardness((float) 40.0F);}
				else if ((int)hardness == 6 && (int)tier == 3) {block.setHardness((float) 50.0F);}
				else if ((int)hardness == 6 && (int)tier == 4) {block.setHardness((float) 60.0F);}
				else if ((int)hardness == 6 && (int)tier == 5) {block.setHardness((float) 70.0F);}
				else if ((int)hardness == 6 && (int)tier == 6) {block.setHardness((float) 80.0F);}
				else if ((int)hardness == 6 && (int)tier == 7) {block.setHardness((float) 100.0F);}
				else { block.setHardness((float) -1.0F);}
				if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
				else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(4.0f);}
				else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(5.0f);}
				else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(6.0f);}
				else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(7.0f);}
				else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(10.0f);}
				else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(15.0f);}
				else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(20.0f);}
				else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(30.0f);}
			}
		else block.setHardness((float) -1.0F);
		}
}
