package com.SupremeMarshal.ToTheEarthCore.init;

import java.util.ArrayList;
import java.util.List;

import com.SupremeMarshal.ToTheEarthCore.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block HOT_LAVA_BLOCK = new HotLavaFluid("hot_lava", ModFluids.HOT_LAVA_FLUID, Material.LAVA);
	
	public static final Block AMAZONITE_ORE = new GemBase("amazonite_ore", Material.ROCK);
	public static final Block DIAMOND_ORE = new GemBase("diamond_ore", Material.ROCK);
	public static final Block RUBY_ORE = new GemBase("ruby_ore", Material.ROCK);
	public static final Block SAPHIR_ORE = new GemBase("saphir_ore", Material.ROCK);
	public static final Block PLATINUM_ORE = new GemBase("platinum_ore", Material.ROCK);
	public static final Block GOLD_ORE = new GemBase("gold_ore", Material.ROCK);
	public static final Block SILVER_ORE = new GemBase("silver_ore", Material.ROCK);
	public static final Block IRON_ORE = new GemBase("iron_ore", Material.ROCK);
	
	public static final Block AMAZONITE_BLOCK = new RockBase("amazonite_block", Material.ROCK);
	public static final Block DIAMOND_BLOCK = new RockBase("diamond_block", Material.ROCK);
	public static final Block RUBY_BLOCK = new RockBase("ruby_block", Material.ROCK);
	public static final Block SAPHIR_BLOCK = new RockBase("saphir_block", Material.ROCK);
	public static final Block PLATINUM_BLOCK = new RockBase("platinum_block", Material.ROCK);
	public static final Block GOLD_BLOCK = new RockBase("gold_block", Material.ROCK);
	public static final Block SILVER_BLOCK = new RockBase("silver_block", Material.ROCK);
	public static final Block STEEL_BLOCK = new RockBase("steel_block", Material.ROCK);
	public static final Block IRON_BLOCK = new RockBase("iron_block", Material.ROCK);
	
	public static final Block HARDROCK_AMAZONITE = new GemBase("hardrock_amazonite", Material.ROCK);
	public static final Block HARDROCK_DIAMOND = new GemBase("hardrock_diamond", Material.ROCK);
	public static final Block HARDROCK_RUBY = new GemBase("hardrock_ruby", Material.ROCK);
	public static final Block HARDROCK_SAPHIR = new GemBase("hardrock_saphir", Material.ROCK);
	public static final Block HARDROCK_EMERALD = new GemBase("hardrock_emerald", Material.ROCK);
	public static final Block HARDROCK_PLATINUM = new RockBase("hardrock_platinum", Material.ROCK);
	public static final Block HARDROCK_GOLD = new RockBase("hardrock_gold", Material.ROCK);
	public static final Block HARDROCK_SILVER = new RockBase("hardrock_silver", Material.ROCK);
	public static final Block HARDROCK_IRON = new RockBase("hardrock_iron", Material.ROCK);
	public static final Block HARDROCK_COAL = new GemBase("hardrock_coal", Material.ROCK);
	public static final Block HARDROCK_REDSTONE = new GemBase("hardrock_redstone", Material.ROCK);
	public static final Block HARDROCK_LAPIS = new LapisBase("hardrock_lapis", Material.ROCK);
	
	public static final Block REDROCK_AMAZONITE = new GemBase("redrock_amazonite", Material.ROCK);
	public static final Block REDROCK_DIAMOND = new GemBase("redrock_diamond", Material.ROCK);
	public static final Block REDROCK_RUBY = new GemBase("redrock_ruby", Material.ROCK);
	public static final Block REDROCK_SAPHIR = new GemBase("redrock_saphir", Material.ROCK);
	public static final Block REDROCK_EMERALD = new GemBase("redrock_emerald", Material.ROCK);
	public static final Block REDROCK_PLATINUM = new RockBase("redrock_platinum", Material.ROCK);
	public static final Block REDROCK_GOLD = new RockBase("redrock_gold", Material.ROCK);
	public static final Block REDROCK_SILVER = new RockBase("redrock_silver", Material.ROCK);
	public static final Block REDROCK_IRON = new RockBase("redrock_iron", Material.ROCK);
	public static final Block REDROCK_COAL = new GemBase("redrock_coal", Material.ROCK);
	public static final Block REDROCK_GAS = new RockBase("redrock_gas", Material.ROCK);
	public static final Block REDROCK_REDSTONE = new GemBase("redrock_redstone", Material.ROCK);
	public static final Block REDROCK_LAPIS = new LapisBase("redrock_lapis", Material.ROCK);
	
	public static final Block MANTLEROCK_AMAZONITE = new GemBase("mantlerock_amazonite", Material.ROCK);
	public static final Block MANTLEROCK_DIAMOND = new GemBase("mantlerock_diamond", Material.ROCK);
	public static final Block MANTLEROCK_RUBY = new GemBase("mantlerock_ruby", Material.ROCK);
	public static final Block MANTLEROCK_SAPHIR = new GemBase("mantlerock_saphir", Material.ROCK);
	public static final Block MANTLEROCK_EMERALD = new GemBase("mantlerock_emerald", Material.ROCK);
	public static final Block MANTLEROCK_PLATINUM = new RockBase("mantlerock_platinum", Material.ROCK);
	public static final Block MANTLEROCK_GOLD = new RockBase("mantlerock_gold", Material.ROCK);
	public static final Block MANTLEROCK_SILVER = new RockBase("mantlerock_silver", Material.ROCK);
	public static final Block MANTLEROCK_IRON = new RockBase("mantlerock_iron", Material.ROCK);
	public static final Block MANTLEROCK_COAL = new GemBase("mantlerock_coal", Material.ROCK);
	public static final Block MANTLEROCK_GAS = new RockBase("mantlerock_gas", Material.ROCK);
	public static final Block MANTLEROCK_REDSTONE = new GemBase("mantlerock_redstone", Material.ROCK);
	public static final Block MANTLEROCK_LAPIS = new LapisBase("mantlerock_lapis", Material.ROCK);
	
	
	public static final Block HARDROCK = new RockBase("hardrock", Material.ROCK);
	public static final Block REDROCK = new RockBase("redrock", Material.ROCK);
	public static final Block MANTLEROCK = new RockBase("mantlerock", Material.ROCK);
	public static final Block COREROCK = new RockBase("corerock", Material.ROCK);
	public static final Block MANTLEGAS = new GasBase("mantlegas", Material.ROCK);
	
	public static final Block HOTROCK = new BlockBase("hotrock", Material.ROCK);
	
	
}

