package com.SupremeMarshal.ToTheEarthCore.init;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Iterator;
import java.util.Map;

public class ModSmelting {

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.IRON_ORE, new ItemStack(ModItems.IRON_INGOT, 1), 0.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 2), 1.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 3), 1.5F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_IRON, new ItemStack(ModItems.IRON_INGOT, 4), 2.0F);

		GameRegistry.addSmelting(ModItems.IRON_COAL, new ItemStack(ModItems.STEEL_INGOT, 1), 1.0F);

		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 1), 2.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_SILVER, new ItemStack(ModItems.SILVER_INGOT, 2), 4.0F);

		GameRegistry.addSmelting(ModBlocks.GOLD_ORE, new ItemStack(ModItems.GOLD_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 1), 2.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 1), 2.5F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_GOLD, new ItemStack(ModItems.GOLD_INGOT, 2), 5.0F);

		GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 2F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 1), 2.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 1), 3.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_PLATINUM, new ItemStack(ModItems.PLATINUM_INGOT, 2), 6.0F);

		GameRegistry.addSmelting(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE, 5), 1.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_REDSTONE, new ItemStack(Items.REDSTONE, 7), 2.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_REDSTONE, new ItemStack(Items.REDSTONE, 10), 3.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_REDSTONE, new ItemStack(Items.REDSTONE, 14), 4.0F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_REDSTONE, new ItemStack(Items.REDSTONE, 18), 5.0F);

		GameRegistry.addSmelting(ModBlocks.HARDROCK_EMERALD, new ItemStack(Items.EMERALD, 1), 2.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_EMERALD, new ItemStack(Items.EMERALD, 1), 3.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_EMERALD, new ItemStack(Items.EMERALD, 1), 3.5F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_EMERALD, new ItemStack(Items.EMERALD, 2), 7.0F);

		GameRegistry.addSmelting(ModBlocks.SAPHIR_ORE, new ItemStack(ModItems.SAPHIR, 1), 2.5F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_SAPHIR, new ItemStack(ModItems.SAPHIR, 1), 3.0F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_SAPHIR, new ItemStack(ModItems.SAPHIR, 1), 3.5F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_SAPHIR, new ItemStack(ModItems.SAPHIR, 1), 4.0F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_SAPHIR, new ItemStack(ModItems.SAPHIR, 2), 8.0F);

		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 3.0F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_RUBY, new ItemStack(ModItems.RUBY, 1), 3.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_RUBY, new ItemStack(ModItems.RUBY, 1), 4.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_RUBY, new ItemStack(ModItems.RUBY, 1), 4.5F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_RUBY, new ItemStack(ModItems.RUBY, 2), 9.0F);

		GameRegistry.addSmelting(ModBlocks.DIAMOND_ORE, new ItemStack(ModItems.DIAMOND, 1), 4.0F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_DIAMOND, new ItemStack(ModItems.DIAMOND, 1), 4.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_DIAMOND, new ItemStack(ModItems.DIAMOND, 1), 5.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_DIAMOND, new ItemStack(ModItems.DIAMOND, 1), 5.5F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_DIAMOND, new ItemStack(ModItems.DIAMOND, 2), 11.0F);

		GameRegistry.addSmelting(ModBlocks.AMAZONITE_ORE, new ItemStack(ModItems.AMAZONITE, 1), 5.0F);
		GameRegistry.addSmelting(ModBlocks.HARDROCK_AMAZONITE, new ItemStack(ModItems.AMAZONITE, 1), 5.5F);
		GameRegistry.addSmelting(ModBlocks.REDROCK_AMAZONITE, new ItemStack(ModItems.AMAZONITE, 1), 6.0F);
		GameRegistry.addSmelting(ModBlocks.MANTLEROCK_AMAZONITE, new ItemStack(ModItems.AMAZONITE, 1), 6.5F);
		GameRegistry.addSmelting(ModBlocks.COREROCK_AMAZONITE, new ItemStack(ModItems.AMAZONITE, 2), 13.0F);

		GameRegistry.addSmelting(ModBlocks.COREROCK_ONYX, new ItemStack(ModItems.ONYX, 1), 15.0F);

		GameRegistry.addSmelting(Items.IRON_HORSE_ARMOR, new ItemStack(ModItems.IRON_NUGGET, 1), 0.0F);




	}

	public static void RemoveSmelting(ItemStack resultStack) {
		ItemStack recipeResult = null;
		Map<ItemStack,ItemStack> recipes = FurnaceRecipes.instance().getSmeltingList();
		Iterator<ItemStack> iterator = recipes.keySet().iterator();
		resultStack = new ItemStack(Items.IRON_HORSE_ARMOR, 1, 0);
		while(iterator.hasNext()) {
			ItemStack tmpRecipe = iterator.next();
			recipeResult = recipes.get(tmpRecipe);
			if (ItemStack.areItemStacksEqual(resultStack, recipeResult)) {
				iterator.remove();
			}
		}
	}








}
