package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.blocks.RockBase;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class HardnessHandler 
{



	public static void executeProcedure(HashMap<String, Object> dependencies) {
		Block block = (Block) dependencies.get("block");

		RockBase.hardness = -1;
		Entity entity = (Entity) dependencies.get("entity");
		int tier = 0;
		

		

	
		if (((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (1)).getItem())
			|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (1)).getItem())
			|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (1)).getItem()))
			&& (RockBase.hardness >= 0))
		{
			block.setHardness(-1.0F);
		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(Items.WOODEN_PICKAXE, (1)).getItem()) && RockBase.hardness == -1)
		{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(9.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK ) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(Items.STONE_PICKAXE, (1)).getItem()) && RockBase.hardness == -1)
		{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(8.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (1)).getItem()) && RockBase.hardness == -1)
		{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(8.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(20.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}


		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (1)).getItem()) && RockBase.hardness == -1)
		{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(8.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(17.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(30.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (1)).getItem()))
		{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(6.8F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(13.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(13.0F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(25.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.GOLD_PICKAXE, (1)).getItem()))
			{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(6.5F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(12.5F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(8.3F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(14.0F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 0) { block.setHardness(13.0F);}
			else if (RockBase.hardness == 1 && tier == 1) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 1 && tier == 2) { block.setHardness(25.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(9.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(14.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(19.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(24.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(29.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.PLATINUM_PICKAXE, (1)).getItem()))
			{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(5.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(10.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(17.5F);}
			else if (RockBase.hardness == -1 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(12.5F);}
			else if (RockBase.hardness == 0 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 1 && tier == 0) { block.setHardness(8.3F);}
			else if (RockBase.hardness == 1 && tier == 1) { block.setHardness(14.0F);}
			else if (RockBase.hardness == 1 && tier == 2) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 2 && tier == 0) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 2 && tier == 1) { block.setHardness(20F);}
			else if (RockBase.hardness == 2 && tier == 2) { block.setHardness(25F);}
			else if (RockBase.hardness == 2 && tier == 3) { block.setHardness(30F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(13.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(18.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(23.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(28.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(35.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(35.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.EMERALD_PICKAXE, (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.SAPHIR_PICKAXE, (1)).getItem()))
			{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(5.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(10.0F);}
			else if (RockBase.hardness == -1 && tier == 3) { block.setHardness(20.0F);}
			else if (RockBase.hardness == -1 && tier == 4) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 0 && tier == 3) { block.setHardness(12.0F);}
			else if (RockBase.hardness == 0 && tier == 4) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 0) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 1 && tier == 1) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 1 && tier == 2) { block.setHardness(12.5F);}
			else if (RockBase.hardness == 1 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 1 && tier == 4) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 2 && tier == 0) { block.setHardness(6.0F);}
			else if (RockBase.hardness == 2 && tier == 1) { block.setHardness(10F);}
			else if (RockBase.hardness == 2 && tier == 2) { block.setHardness(15F);}
			else if (RockBase.hardness == 2 && tier == 3) { block.setHardness(25F);}
			else if (RockBase.hardness == 2 && tier == 4) { block.setHardness(35F);}
			else if (RockBase.hardness == 3 && tier == 0) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 3 && tier == 1) { block.setHardness(20F);}
			else if (RockBase.hardness == 3 && tier == 2) { block.setHardness(25F);}
			else if (RockBase.hardness == 3 && tier == 3) { block.setHardness(30F);}
			else if (RockBase.hardness == 3 && tier == 4) { block.setHardness(40F);}
			else { block.setHardness(-1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(17.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(27.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(34.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(34.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.RUBY_PICKAXE, (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.FLAMING_TOPAZ_PICKAXE, (1)).getItem()))
			{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(5.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(10.0F);}
			else if (RockBase.hardness == -1 && tier == 3) { block.setHardness(15.0F);}
			else if (RockBase.hardness == -1 && tier == 4) { block.setHardness(20.0F);}
			else if (RockBase.hardness == -1 && tier == 5) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(4.5F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(5F);}
			else if (RockBase.hardness == 0 && tier == 3) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 0 && tier == 4) { block.setHardness(12.0F);}
			else if (RockBase.hardness == 0 && tier == 5) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 1 && tier == 1) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 1 && tier == 2) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 1 && tier == 3) { block.setHardness(12.0F);}
			else if (RockBase.hardness == 1 && tier == 4) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 5) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 2 && tier == 0) { block.setHardness(4.5F);}
			else if (RockBase.hardness == 2 && tier == 1) { block.setHardness(5F);}
			else if (RockBase.hardness == 2 && tier == 2) { block.setHardness(10F);}
			else if (RockBase.hardness == 2 && tier == 3) { block.setHardness(15F);}
			else if (RockBase.hardness == 2 && tier == 4) { block.setHardness(20F);}
			else if (RockBase.hardness == 2 && tier == 5) { block.setHardness(30F);}
			else if (RockBase.hardness == 3 && tier == 0) { block.setHardness(6.0F);}
			else if (RockBase.hardness == 3 && tier == 1) { block.setHardness(10F);}
			else if (RockBase.hardness == 3 && tier == 2) { block.setHardness(15F);}
			else if (RockBase.hardness == 3 && tier == 3) { block.setHardness(25F);}
			else if (RockBase.hardness == 3 && tier == 4) { block.setHardness(35F);}
			else if (RockBase.hardness == 3 && tier == 5) { block.setHardness(50F);}
			else if (RockBase.hardness == 4 && tier == 0) { block.setHardness(20F);}
			else if (RockBase.hardness == 4 && tier == 1) { block.setHardness(25F);}
			else if (RockBase.hardness == 4 && tier == 2) { block.setHardness(30F);}
			else if (RockBase.hardness == 4 && tier == 3) { block.setHardness(35F);}
			else if (RockBase.hardness == 4 && tier == 4) { block.setHardness(50F);}
			else if (RockBase.hardness == 4 && tier == 5) { block.setHardness(60F);}
			else { block.setHardness(-1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(33.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(33.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(44.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(44.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(60.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(60.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.DIAMOND_PICKAXE, (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.TOPAZ_PICKAXE, (1)).getItem()))
			{
			if (RockBase.hardness == -1 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == -1 && tier == 1) { block.setHardness(4.0F);}
			else if (RockBase.hardness == -1 && tier == 2) { block.setHardness(5.0F);}
			else if (RockBase.hardness == -1 && tier == 3) { block.setHardness(7.5F);}
			else if (RockBase.hardness == -1 && tier == 4) { block.setHardness(10.0F);}
			else if (RockBase.hardness == -1 && tier == 5) { block.setHardness(20.0F);}
			else if (RockBase.hardness == -1 && tier == 6) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 0 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 0 && tier == 1) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 0 && tier == 2) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 0 && tier == 3) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 0 && tier == 4) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 0 && tier == 5) { block.setHardness(12.0F);}
			else if (RockBase.hardness == 0 && tier == 6) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 1 && tier == 1) { block.setHardness(4.5F);}
			else if (RockBase.hardness == 1 && tier == 2) { block.setHardness(5F);}
			else if (RockBase.hardness == 1 && tier == 3) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 1 && tier == 4) { block.setHardness(12.0F);}
			else if (RockBase.hardness == 1 && tier == 5) { block.setHardness(18.0F);}
			else if (RockBase.hardness == 1 && tier == 6) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 2 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 2 && tier == 1) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 2 && tier == 2) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 2 && tier == 3) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 2 && tier == 4) { block.setHardness(10F);}
			else if (RockBase.hardness == 2 && tier == 5) { block.setHardness(15F);}
			else if (RockBase.hardness == 2 && tier == 6) { block.setHardness(30F);}
			else if (RockBase.hardness == 3 && tier == 0) { block.setHardness(4.5F);}
			else if (RockBase.hardness == 3 && tier == 1) { block.setHardness(5F);}
			else if (RockBase.hardness == 3 && tier == 2) { block.setHardness(10F);}
			else if (RockBase.hardness == 3 && tier == 3) { block.setHardness(15F);}
			else if (RockBase.hardness == 3 && tier == 4) { block.setHardness(20F);}
			else if (RockBase.hardness == 3 && tier == 5) { block.setHardness(30F);}
			else if (RockBase.hardness == 3 && tier == 6) { block.setHardness(60F);}
			else if (RockBase.hardness == 4 && tier == 0) { block.setHardness(7.0F);}
			else if (RockBase.hardness == 4 && tier == 1) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 4 && tier == 2) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 4 && tier == 3) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 4 && tier == 4) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 4 && tier == 5) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 4 && tier == 6) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 5 && tier == 0) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 5 && tier == 1) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 5 && tier == 2) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 5 && tier == 3) { block.setHardness(35.0F);}
			else if (RockBase.hardness == 5 && tier == 4) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 5 && tier == 5) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 5 && tier == 6) { block.setHardness(60.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(55.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(55.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.AMAZONITE_PICKAXE, (1)).getItem())
			 		|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.JADE_PICKAXE, (1)).getItem())) {
			if (RockBase.hardness <= 2) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 3 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 3 && tier == 1) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 3 && tier == 2) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 3 && tier == 3) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 3 && tier == 4) { block.setHardness(10F);}
			else if (RockBase.hardness == 3 && tier == 5) { block.setHardness(15F);}
			else if (RockBase.hardness == 3 && tier == 6) { block.setHardness(30F);}
			else if (RockBase.hardness == 3 && tier == 7) { block.setHardness(45F);}
			else if (RockBase.hardness == 4 && tier == 0) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 4 && tier == 1) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 4 && tier == 2) { block.setHardness(7.5F);}
			else if (RockBase.hardness == 4 && tier == 3) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 4 && tier == 4) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 4 && tier == 5) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 4 && tier == 6) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 4 && tier == 7) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 5 && tier == 0) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 5 && tier == 1) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 5 && tier == 2) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 5 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 5 && tier == 4) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 5 && tier == 5) { block.setHardness(35.0F);}
			else if (RockBase.hardness == 5 && tier == 6) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 5 && tier == 7) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 6 && tier == 0) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 6 && tier == 1) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 6 && tier == 2) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 6 && tier == 3) { block.setHardness(35.0F);}
			else if (RockBase.hardness == 6 && tier == 4) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 6 && tier == 5) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 6 && tier == 6) { block.setHardness(60.0F);}
			else if (RockBase.hardness == 6 && tier == 7) { block.setHardness(90.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(80.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(80.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}
		}

		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.ONYX_PICKAXE, (1)).getItem()) || (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.AMETHYST_PICKAXE, (1)).getItem()))
		{
			if (RockBase.hardness <= 5) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 6 && tier == 0) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 6 && tier == 1) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 6 && tier == 2) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 6 && tier == 3) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 6 && tier == 4) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 6 && tier == 5) { block.setHardness(35.0F);}
			else if (RockBase.hardness == 6 && tier == 6) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 6 && tier == 7) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 7 && tier == 0) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 7 && tier == 1) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 7 && tier == 2) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 7 && tier == 3) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 7 && tier == 4) { block.setHardness(60.0F);}
			else if (RockBase.hardness == 7 && tier == 5) { block.setHardness(70.0F);}
			else if (RockBase.hardness == 7 && tier == 6) { block.setHardness(80.0F);}
			else if (RockBase.hardness == 7 && tier == 7) { block.setHardness(100.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(100.0f);}
		}
else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (1)).getItem() == new ItemStack(ModItems.AZURITE_PICKAXE, (1)).getItem()))
		{
			if (RockBase.hardness <= 6) { block.setHardness(4.0F);}
			else if (RockBase.hardness == 7 && tier == 0) { block.setHardness(5.0F);}
			else if (RockBase.hardness == 7 && tier == 1) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 7 && tier == 2) { block.setHardness(15.0F);}
			else if (RockBase.hardness == 7 && tier == 3) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 7 && tier == 4) { block.setHardness(25.0F);}
			else if (RockBase.hardness == 7 && tier == 5) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 7 && tier == 6) { block.setHardness(35.0F);}
			else if (RockBase.hardness == 7 && tier == 7) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 8 && tier == 0) { block.setHardness(10.0F);}
			else if (RockBase.hardness == 8 && tier == 1) { block.setHardness(20.0F);}
			else if (RockBase.hardness == 8 && tier == 2) { block.setHardness(30.0F);}
			else if (RockBase.hardness == 8 && tier == 3) { block.setHardness(40.0F);}
			else if (RockBase.hardness == 8 && tier == 4) { block.setHardness(50.0F);}
			else if (RockBase.hardness == 8 && tier == 5) { block.setHardness(60.0F);}
			else if (RockBase.hardness == 8 && tier == 6) { block.setHardness(70.0F);}
			else if (RockBase.hardness == 8 && tier == 7) { block.setHardness(80.0F);}
			else { block.setHardness(-1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(100.0f);}
		}
		else block.setHardness(-1.0F);
		}
}
