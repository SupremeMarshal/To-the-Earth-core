package com.SupremeMarshal.ToTheEarthCore.init;


import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.IRON_ORE, new ItemStack(ModItems.IRON_INGOT, 1), 0.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 2), 1.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 3), 1.5F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 4), 2.0F);

		GameRegistry.addSmelting(ModItems.IRON_COAL, new ItemStack(ModItems.STEEL_INGOT, 1), 1.0F);
		
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 2), 2.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 3), 3.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 4), 4.0F);
		
		GameRegistry.addSmelting(ModBlocks.GOLD_ORE, new ItemStack(ModItems.GOLD_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 2), 3.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 3), 4.5F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 4), 6.0F);
		
		GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 2F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 2), 4.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 3), 6.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 4), 8.0F);
	}
	
}
