package com.SupremeMarshal.ToTheEarthCore.init;

import com.SupremeMarshal.ToTheEarthCore.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block HOT_LAVA_BLOCK = new HotLavaFluid("hot_lava", ModFluids.HOT_LAVA_FLUID, Material.LAVA);
	public static final Block CORE_LAVA_BLOCK = new CoreLavaFluid("core_lava", ModFluids.CORE_LAVA_FLUID, Material.LAVA);

	public static final Block AZURITE_BLOCK = new RockBase("azurite_block", Materia.ROCK);
	public static final Block ONYX_BLOCK = new RockBase("onyx_block", Material.ROCK);
	public static final Block AMETHYST_BLOCK = new RockBase("amethyst_block", Material.ROCK);
	public static final Block AMAZONITE_BLOCK = new RockBase("amazonite_block", Material.ROCK);
	public static final Block JADE_BLOCK = new RockBase("jade_block", Material.ROCK);
	public static final Block DIAMOND_BLOCK = new RockBase("diamond_block", Material.ROCK);
	public static final Block TOPAZ_BLOCK = new RockBase("topaz_block", Material.ROCK);
	public static final Block RUBY_BLOCK = new RockBase("ruby_block", Material.ROCK);
	public static final Block FLAMING_TOPAZ_BLOCK = new RockBase("flaming_topaz_block", Material.ROCK);
	public static final Block SAPHIR_BLOCK = new RockBase("saphir_block", Material.ROCK);
	public static final Block PLATINUM_BLOCK = new RockBase("platinum_block", Material.ROCK);
	public static final Block GOLD_BLOCK = new RockBase("gold_block", Material.ROCK);
	public static final Block SILVER_BLOCK = new RockBase("silver_block", Material.ROCK);
	public static final Block STEEL_BLOCK = new RockBase("steel_block", Material.ROCK);
	public static final Block IRON_BLOCK = new RockBase("iron_block", Material.ROCK);
	public static final Block SULFUR_BLOCK = new BlockBase("sulfur_block", Material.ROCK);
	
	public static final Block AZURITE_ORE = new GemBase("azurite_ore", Material.ROCK);
	public static final Block ONYX_ORE = new GemBase("onyx_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new GemBase("amethyst_ore", Material.ROCK);
	public static final Block AMAZONITE_ORE = new GemBase("amazonite_ore", Material.ROCK);
	public static final Block JADE_ORE = new GemBase("jade_ore", Material.ROCK);
	public static final Block DIAMOND_ORE = new GemBase("diamond_ore", Material.ROCK);
	public static final Block TOPAZ_ORE = new GemBase("topaz_ore", Material.ROCK);
	public static final Block RUBY_ORE = new GemBase("ruby_ore", Material.ROCK);
	public static final Block FLAMING_TOPAZ_ORE = new GemBase("flaming_topaz_ore", Material.ROCK);
	public static final Block SAPHIR_ORE = new GemBase("saphir_ore", Material.ROCK);
	public static final Block PLATINUM_ORE = new GemBase("platinum_ore", Material.ROCK);
	public static final Block GOLD_ORE = new GemBase("gold_ore", Material.ROCK);
	public static final Block SILVER_ORE = new GemBase("silver_ore", Material.ROCK);
	public static final Block IRON_ORE = new GemBase("iron_ore", Material.ROCK);
	public static final Block SULFUR_ORE = new GemBase("sulfur_ore", Material.ROCK);
	
	public static final Block STIFFROCK_AZURITE = new GemBase("stiffrock_azurite", Material.ROCK);
	public static final Block STIFFROCK_ONYX = new GemBase("stiffrock_onyx", Material.ROCK);
	public static final Block STIFFROCK_AMETHYST = new GemBase("stiffrock_amethyst", Material.ROCK);
	public static final Block STIFFROCK_AMAZONITE = new GemBase("stiffrock_amazonite", Material.ROCK);
	public static final Block STIFFROCK_JADE = new GemBase("stiffrock_jade", Material.ROCK);
	public static final Block STIFFROCK_DIAMOND = new GemBase("stiffrock_diamond", Material.ROCK);
	public static final Block STIFFROCK_TOPAZ = new GemBase("stiffrock_topaz", Material.ROCK);
	public static final Block STIFFROCK_RUBY = new GemBase("stiffrock_ruby", Material.ROCK);
	public static final Block STIFFROCK_FLAMING_TOPAZ = new GemBase("stiffrock_flaming_topaz", Material.ROCK);
	public static final Block STIFFROCK_SAPHIR = new GemBase("stiffrock_saphir", Material.ROCK);
	public static final Block STIFFROCK_EMERALD = new GemBase("stiffrock_emerald", Material.ROCK);
	public static final Block STIFFROCK_PLATINUM = new RockBase("stiffrock_platinum", Material.ROCK);
	public static final Block STIFFROCK_GOLD = new RockBase("stiffrock_gold", Material.ROCK);
	public static final Block STIFFROCK_SILVER = new RockBase("stiffrock_silver", Material.ROCK);
	public static final Block STIFFROCK_IRON = new RockBase("stiffrock_iron", Material.ROCK);
	public static final Block STIFFROCK_COAL = new GemBase("stiffrock_coal", Material.ROCK);
	public static final Block STIFFROCK_REDSTONE = new GemBase("stiffrock_redstone", Material.ROCK);
	public static final Block STIFFROCK_LAPIS = new LapisBase("stiffrock_lapis", Material.ROCK);
	public static final Block STIFFROCK_SULFUR = new GemBase("stiffrock_sulfur", Material.ROCK);
	
	public static final Block HARDROCK_AZURITE = new GemBase("hardrock_azurite", Material.ROCK);
	public static final Block HARDROCK_ONYX = new GemBase("hardrock_onyx", Material.ROCK);
	public static final Block HARDROCK_AMETHYST = new GemBase("hardrock_amethyst", Material.ROCK);
	public static final Block HARDROCK_AMAZONITE = new GemBase("hardrock_amazonite", Material.ROCK);
	public static final Block HARDROCK_JADE = new GemBase("hardrock_jade", Material.ROCK);
	public static final Block HARDROCK_DIAMOND = new GemBase("hardrock_diamond", Material.ROCK);
	public static final Block HARDROCK_TOPAZ = new GemBase("hardrock_topaz", Material.ROCK);
	public static final Block HARDROCK_RUBY = new GemBase("hardrock_ruby", Material.ROCK);
	public static final Block HARDROCK_FLAMING_TOPAZ = new GemBase("hardrock_flaming_topaz", Material.ROCK);
	public static final Block HARDROCK_SAPHIR = new GemBase("hardrock_saphir", Material.ROCK);
	public static final Block HARDROCK_EMERALD = new GemBase("hardrock_emerald", Material.ROCK);
	public static final Block HARDROCK_PLATINUM = new RockBase("hardrock_platinum", Material.ROCK);
	public static final Block HARDROCK_GOLD = new RockBase("hardrock_gold", Material.ROCK);
	public static final Block HARDROCK_SILVER = new RockBase("hardrock_silver", Material.ROCK);
	public static final Block HARDROCK_IRON = new RockBase("hardrock_iron", Material.ROCK);
	public static final Block HARDROCK_COAL = new GemBase("hardrock_coal", Material.ROCK);
	public static final Block HARDROCK_REDSTONE = new GemBase("hardrock_redstone", Material.ROCK);
	public static final Block HARDROCK_LAPIS = new LapisBase("hardrock_lapis", Material.ROCK);
	public static final Block HARDROCK_SULFUR = new GemBase("hardrock_sulfur", Material.ROCK);
	
	public static final Block HARDERROCK_AZURITE = new GemBase("harderrock_azurite", Material.ROCK);
	public static final Block HARDERROCK_ONYX = new GemBase("harderrock_onyx", Material.ROCK);
	public static final Block HARDERROCK_AMETHYST = new GemBase("harderrock_amethyst", Material.ROCK);
	public static final Block HARDERROCK_AMAZONITE = new GemBase("harderrock_amazonite", Material.ROCK);
	public static final Block HARDERROCK_JADE = new GemBase("harderrock_jade", Material.ROCK);
	public static final Block HARDERROCK_DIAMOND = new GemBase("harderrock_diamond", Material.ROCK);
	public static final Block HARDERROCK_TOPAZ = new GemBase("harderrock_topaz", Material.ROCK);
	public static final Block HARDERROCK_RUBY = new GemBase("harderrock_ruby", Material.ROCK);
	public static final Block HARDERROCK_FLAMING_TOPAZ = new GemBase("harderrock_flaming_topaz", Material.ROCK);
	public static final Block HARDERROCK_SAPHIR = new GemBase("harderrock_saphir", Material.ROCK);
	public static final Block HARDERROCK_EMERALD = new GemBase("harderrock_emerald", Material.ROCK);
	public static final Block HARDERROCK_PLATINUM = new RockBase("harderrock_platinum", Material.ROCK);
	public static final Block HARDERROCK_GOLD = new RockBase("harderrock_gold", Material.ROCK);
	public static final Block HARDERROCK_SILVER = new RockBase("harderrock_silver", Material.ROCK);
	public static final Block HARDERROCK_IRON = new RockBase("harderrock_iron", Material.ROCK);
	public static final Block HARDERROCK_COAL = new GemBase("harderrock_coal", Material.ROCK);
	public static final Block HARDERROCK_REDSTONE = new GemBase("harderrock_redstone", Material.ROCK);
	public static final Block HARDERROCK_LAPIS = new LapisBase("harderrock_lapis", Material.ROCK);
	public static final Block HARDERROCK_SULFUR = new GemBase("harderrock_sulfur", Material.ROCK);

	public static final Block REDROCK_AZURITE = new GemBase("redrock_azurite", Material.ROCK);
	public static final Block REDROCK_ONYX = new GemBase("redrock_onyx", Material.ROCK);
	public static final Block REDROCK_AMETHYST = new GemBase("redrock_amethyst", Material.ROCK);
	public static final Block REDROCK_AMAZONITE = new GemBase("redrock_amazonite", Material.ROCK);
	public static final Block REDROCK_JADE = new GemBase("redrock_jade", Material.ROCK);
	public static final Block REDROCK_DIAMOND = new GemBase("redrock_diamond", Material.ROCK);
	public static final Block REDROCK_TOPAZ = new GemBase("redrock_topaz", Material.ROCK);
	public static final Block REDROCK_RUBY = new GemBase("redrock_ruby", Material.ROCK);
	public static final Block REDROCK_FLAMING_TOPAZ = new GemBase("redrock_flaming_topaz", Material.ROCK);
	public static final Block REDROCK_SAPHIR = new GemBase("redrock_saphir", Material.ROCK);
	public static final Block REDROCK_EMERALD = new GemBase("redrock_emerald", Material.ROCK);
	public static final Block REDROCK_PLATINUM = new RockBase("redrock_platinum", Material.ROCK);
	public static final Block REDROCK_GOLD = new RockBase("redrock_gold", Material.ROCK);
	public static final Block REDROCK_SILVER = new RockBase("redrock_silver", Material.ROCK);
	public static final Block REDROCK_IRON = new RockBase("redrock_iron", Material.ROCK);
	public static final Block REDROCK_COAL = new GemBase("redrock_coal", Material.ROCK);
	public static final Block REDROCK_REDSTONE = new GemBase("redrock_redstone", Material.ROCK);
	public static final Block REDROCK_LAPIS = new LapisBase("redrock_lapis", Material.ROCK);
	public static final Block REDROCK_SULFUR = new GemBase("redrock_sulfur", Material.ROCK);
	
	public static final Block MANTLEROCK_AZURITE = new GemBase("mantlerock_azurite", Material.ROCK);
	public static final Block MANTLEROCK_ONYX = new GemBase("mantlerock_onyx", Material.ROCK);
	public static final Block MANTLEROCK_AMETHYST = new GemBase("mantlerock_amethyst", Material.ROCK);
	public static final Block MANTLEROCK_AMAZONITE = new GemBase("mantlerock_amazonite", Material.ROCK);
	public static final Block MANTLEROCK_JADE = new GemBase("mantlerock_jade", Material.ROCK);
	public static final Block MANTLEROCK_DIAMOND = new GemBase("mantlerock_diamond", Material.ROCK);
	public static final Block MANTLEROCK_TOPAZ = new GemBase("mantlerock_topaz", Material.ROCK);
	public static final Block MANTLEROCK_RUBY = new GemBase("mantlerock_ruby", Material.ROCK);
	public static final Block MANTLEROCK_FLAMING_TOPAZ = new GemBase("mantlerock_flaming_topaz", Material.ROCK);
	public static final Block MANTLEROCK_SAPHIR = new GemBase("mantlerock_saphir", Material.ROCK);
	public static final Block MANTLEROCK_EMERALD = new GemBase("mantlerock_emerald", Material.ROCK);
	public static final Block MANTLEROCK_PLATINUM = new RockBase("mantlerock_platinum", Material.ROCK);
	public static final Block MANTLEROCK_GOLD = new RockBase("mantlerock_gold", Material.ROCK);
	public static final Block MANTLEROCK_SILVER = new RockBase("mantlerock_silver", Material.ROCK);
	public static final Block MANTLEROCK_IRON = new RockBase("mantlerock_iron", Material.ROCK);
	public static final Block MANTLEROCK_COAL = new GemBase("mantlerock_coal", Material.ROCK);
	public static final Block MANTLEROCK_REDSTONE = new GemBase("mantlerock_redstone", Material.ROCK);
	public static final Block MANTLEROCK_LAPIS = new LapisBase("mantlerock_lapis", Material.ROCK);
	public static final Block MANTLEROCK_SULFUR = new GemBase("mantlerock_sulfur", Material.ROCK);
	
	public static final Block LOWER_MANTLEROCK_AZURITE = new GemBase("lower_mantlerock_azurite", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_ONYX = new GemBase("lower_mantlerock_onyx", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_AMETHYST = new GemBase("lower_mantlerock_amethyst", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_AMAZONITE = new GemBase("lower_mantlerock_amazonite", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_JADE = new GemBase("lower_mantlerock_jade", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_DIAMOND = new GemBase("lower_mantlerock_diamond", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_TOPAZ = new GemBase("lower_mantlerock_topaz", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_RUBY = new GemBase("lower_mantlerock_ruby", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_FLAMING_TOPAZ = new GemBase("lower_mantlerock_flaming_topaz", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_SAPHIR = new GemBase("lower_mantlerock_saphir", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_EMERALD = new GemBase("lower_mantlerock_emerald", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_PLATINUM = new RockBase("lower_mantlerock_platinum", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_GOLD = new RockBase("lower_mantlerock_gold", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_SILVER = new RockBase("lower_mantlerock_silver", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_IRON = new RockBase("lower_mantlerock_iron", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_COAL = new GemBase("lower_mantlerock_coal", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_REDSTONE = new GemBase("lower_mantlerock_redstone", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_LAPIS = new LapisBase("lower_mantlerock_lapis", Material.ROCK);
	public static final Block LOWER_MANTLEROCK_SULFUR = new GemBase("lower_mantlerock_sulfur", Material.ROCK);

	public static final Block COREROCK_AZURITE = new Corerock("corerock_azurite", Material.ROCK);
	public static final Block COREROCK_ONYX = new Corerock("corerock_onyx", Material.ROCK);
	public static final Block COREROCK_AMETHYST = new Corerock("corerock_amethyst", Material.ROCK);
	public static final Block COREROCK_AMAZONITE = new Corerock("corerock_amazonite", Material.ROCK);
	public static final Block COREROCK_JADE = new Corerock("corerock_jade", Material.ROCK);
	public static final Block COREROCK_DIAMOND = new Corerock("corerock_diamond", Material.ROCK);
	public static final Block COREROCK_TOPAZ = new Corerock("corerock_topaz", Material.ROCK);
	public static final Block COREROCK_RUBY = new Corerock("corerock_ruby", Material.ROCK);
	public static final Block COREROCK_FLAMING_TOPAZ = new Corerock("corerock_flaming_topaz", Material.ROCK);
	public static final Block COREROCK_SAPHIR = new Corerock("corerock_saphir", Material.ROCK);
	public static final Block COREROCK_EMERALD = new Corerock("corerock_emerald", Material.ROCK);
	public static final Block COREROCK_LAPIS = new Corerock("corerock_lapis", Material.ROCK);
	public static final Block COREROCK_REDSTONE = new Corerock("corerock_redstone", Material.ROCK);
	public static final Block COREROCK_PLATINUM = new Corerock("corerock_platinum", Material.ROCK);
	public static final Block COREROCK_GOLD = new Corerock("corerock_gold", Material.ROCK);
	public static final Block COREROCK_SILVER = new Corerock("corerock_silver", Material.ROCK);
	public static final Block COREROCK_IRON = new Corerock("corerock_iron", Material.ROCK);
	public static final Block COREROCK_COAL = new Corerock("corerock_coal", Material.ROCK);
	public static final Block COREROCK_SULFUR = new Corerock("corerock_sulfur", Material.ROCK);

	public static final Block INNERCOREROCK_AZURITE = new Corerock("innercorerock_azurite", Material.ROCK);
	public static final Block INNERCOREROCK_ONYX = new Corerock("innercorerock_onyx", Material.ROCK);
	public static final Block INNERCOREROCK_AMETHYST = new Corerock("innercorerock_amethyst", Material.ROCK);
	public static final Block INNERCOREROCK_AMAZONITE = new Corerock("innercorerock_amazonite", Material.ROCK);
	public static final Block INNERCOREROCK_JADE = new Corerock("innercorerock_jade", Material.ROCK);
	public static final Block INNERCOREROCK_DIAMOND = new Corerock("innercorerock_diamond", Material.ROCK);
	public static final Block INNERCOREROCK_TOPAZ = new Corerock("innercorerock_topaz", Material.ROCK);
	public static final Block INNERCOREROCK_RUBY = new Corerock("innercorerock_ruby", Material.ROCK);
	public static final Block INNERCOREROCK_FLAMING_TOPAZ = new Corerock("innercorerock_flaming_topaz", Material.ROCK);
	public static final Block INNERCOREROCK_SAPHIR = new Corerock("innercorerock_saphir", Material.ROCK);
	public static final Block INNERCOREROCK_EMERALD = new Corerock("innercorerock_emerald", Material.ROCK);
	public static final Block INNERCOREROCK_LAPIS = new Corerock("innercorerock_lapis", Material.ROCK);
	public static final Block INNERCOREROCK_REDSTONE = new Corerock("innercorerock_redstone", Material.ROCK);
	public static final Block INNERCOREROCK_PLATINUM = new Corerock("innercorerock_platinum", Material.ROCK);
	public static final Block INNERCOREROCK_GOLD = new Corerock("innercorerock_gold", Material.ROCK);
	public static final Block INNERCOREROCK_SILVER = new Corerock("innercorerock_silver", Material.ROCK);
	public static final Block INNERCOREROCK_IRON = new Corerock("innercorerock_iron", Material.ROCK);
	public static final Block INNERCOREROCK_COAL = new Corerock("innercorerock_coal", Material.ROCK);
	public static final Block INNERCOREROCK_SULFUR = new Corerock("innercorerock_sulfur", Material.ROCK);
	
	public static final Block STIFFROCK = new RockBase("stiffrock", Material.ROCK);
	public static final Block HARDROCK = new RockBase("hardrock", Material.ROCK);
	public static final Block HARDERROCK = new RockBase("harderrock", Material.ROCK);
	public static final Block REDROCK = new RockBase("redrock", Material.ROCK);
	public static final Block MANTLEROCK = new RockBase("mantlerock", Material.ROCK);
	public static final Block LOWER_MANTLEROCK = new RockBase("lower_mantlerock", Material.ROCK);
	public static final Block COREROCK = new Corerock("corerock", Material.ROCK);
	public static final Block INNERCOREROCK = new Corerock("innercorerock", Material.ROCK);
	public static final Block MANTLEGAS = new GasBase("mantlegas", Material.ROCK);
	public static final Block HOT_MANTLEROCK = new Hot_Mantlerock("hot_mantlerock", Material.ROCK);
	
	public static final Block HOTROCK = new BlockBase("hotrock", Material.ROCK);
	
	
}

