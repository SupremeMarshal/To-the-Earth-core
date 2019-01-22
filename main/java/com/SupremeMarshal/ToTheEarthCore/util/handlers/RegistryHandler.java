package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.init.EntityInit;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModFluids;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import com.SupremeMarshal.ToTheEarthCore.util.IHasModel;
import com.SupremeMarshal.ToTheEarthCore.util.ModConfiguration;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));


		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for (Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		RenderHandler.registerEntityRenders();
		RenderHandler.registerCustomMeshesAndStates();
	}



	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		ModFluids.registerFluids();
		EntityInit.registerEntities();
		ModConfiguration.registerConfig(event);


		


	}

	public static void initRegistries(FMLInitializationEvent event) {
		OreDictionary.registerOre("itemCoal", new ItemStack(Items.COAL, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemPlank", new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("ingotIron", new ItemStack(ModItems.IRON_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.STEEL_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ModItems.SILVER_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("ingotGold", new ItemStack(ModItems.SILVER_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ModItems.SILVER_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemSapphire", new ItemStack(ModItems.SAPHIR, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemRuby", new ItemStack(ModItems.RUBY, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemDiamond", new ItemStack(ModItems.DIAMOND, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemAmazonite", new ItemStack(ModItems.AMAZONITE, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("itemSulfur", new ItemStack(ModItems.SULFUR, 1, OreDictionary.WILDCARD_VALUE));
	}

	public static void posInitRegistries(FMLPostInitializationEvent event)
	{
		net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingList().remove(
				new net.minecraft.item.ItemStack(net.minecraft.init.Items.IRON_HORSE_ARMOR, 1, 32767),
				new net.minecraft.item.ItemStack(net.minecraft.init.Items.IRON_NUGGET));
		net.minecraft.item.crafting.FurnaceRecipes.instance().getSmeltingList().put(
				new net.minecraft.item.ItemStack(net.minecraft.init.Items.IRON_HORSE_ARMOR, 1, 32767),
				new net.minecraft.item.ItemStack(ModItems.IRON_NUGGET));

	}





	
}
