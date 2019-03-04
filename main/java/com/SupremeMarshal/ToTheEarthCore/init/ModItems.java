package com.SupremeMarshal.ToTheEarthCore.init;

import com.SupremeMarshal.ToTheEarthCore.items.Gems;
import com.SupremeMarshal.ToTheEarthCore.items.ItemBase;
import com.SupremeMarshal.ToTheEarthCore.items.armor.*;
import com.SupremeMarshal.ToTheEarthCore.items.food.EnchantedFoodEffectBase;
import com.SupremeMarshal.ToTheEarthCore.items.food.FoodEffectBase;
import com.SupremeMarshal.ToTheEarthCore.items.shields.*;
import com.SupremeMarshal.ToTheEarthCore.items.tools.*;
import com.SupremeMarshal.ToTheEarthCore.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//TOOLS MATERIAL	(NAME, HARVEST LVL, MAX USE, EFFICIENCY, DAMAGE, ENCHANTABILITY)
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron", 2, 250, 3.0F, 2.0F, 20);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 500, 4.0F, 2.5F, 18);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 3, 200, 6.0F, 3.0F, 16);
	public static final ToolMaterial MATERIAL_GOLD = EnumHelper.addToolMaterial("material_gold", 4, 750, 8.5F, 3.5F, 14);
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 5, 900, 11.0F, 4.0F, 12);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 6, 250, 15.0F, 5.0F, 10);
	public static final ToolMaterial MATERIAL_SAPHIR = EnumHelper.addToolMaterial("material_saphir", 6, 1500, 15.0F, 5.0F, 10);
	public static final ToolMaterial MATERIAL_FLAMING_TOPAZ = EnumHelper.addToolMaterial("material_flaming_topaz", 7, 400, 20.0F, 6.0F, 8);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 7, 2000, 20.0F, 6.0F, 8);
	public static final ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 8, 500, 25.0F, 7.5F, 6);
	public static final ToolMaterial MATERIAL_DIAMOND = EnumHelper.addToolMaterial("material_diamond", 8, 3000, 25.0F, 7.5F, 6);
	public static final ToolMaterial MATERIAL_JADE = EnumHelper.addToolMaterial("material_jade", 9, 800, 30.0F, 10.0F, 5);
	public static final ToolMaterial MATERIAL_AMAZONITE = EnumHelper.addToolMaterial("material_amazonite", 9, 4000, 30.0F, 10.0F, 5);
	public static final ToolMaterial MATERIAL_DEMON = EnumHelper.addToolMaterial("material_demon", 9, 1000, 25.0F, 20F, 5);
	public static final ToolMaterial MATERIAL_CORE = EnumHelper.addToolMaterial("material_core", 10, 2500, 30.0F, 24F, 5);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 10, 1000, 35.0F, 15.0F, 4);
	public static final ToolMaterial MATERIAL_ONYX = EnumHelper.addToolMaterial("material_onyx", 10, 5000, 35.0F, 15.0F, 4);
	
	
	//ARMOR MATERIAL (name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_IRON = EnumHelper.addArmorMaterial("armor_material_iron", Reference.MOD_ID + ":iron", 15,
			new int[] {2, 5, 4, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 30,
			new int[] {2, 5, 4, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MOD_ID + ":silver", 12,
			new int[] {2, 6, 5, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_GOLD = EnumHelper.addArmorMaterial("armor_material_gold", Reference.MOD_ID + ":gold", 45,
			new int[] {2, 6, 5, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MOD_ID + ":platinum", 56,
			new int[] {3, 7, 6, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 15,
			new int[] {3, 8, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPHIR = EnumHelper.addArmorMaterial("armor_material_saphir", Reference.MOD_ID + ":saphir", 93,
			new int[] {3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 125,
			new int[] {4, 9, 7, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_DIAMOND = EnumHelper.addArmorMaterial("armor_material_diamond", Reference.MOD_ID + ":diamond", 187,
			new int[] {5, 10, 8, 5}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_AMAZONITE = EnumHelper.addArmorMaterial("armor_material_amazonite", Reference.MOD_ID + ":amazonite", 250,
			new int[] {6, 12, 9, 6}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_ONYX = EnumHelper.addArmorMaterial("armor_material_onyx", Reference.MOD_ID + ":onyx", 312,
			new int[] {7, 14, 10, 7}, 4, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	
	
	
//TOOLS

	//IRON//
	public static final ItemSword IRON_SWORD = new ToolSword("iron_sword", MATERIAL_IRON);
	public static final ItemSpade IRON_SHOVEL = new ToolSpade("iron_shovel", MATERIAL_IRON);
	public static final ItemPickaxe IRON_PICKAXE = new ToolPickaxe("iron_pickaxe", MATERIAL_IRON);
	public static final ItemAxe IRON_AXE = new ToolAxe("iron_axe", MATERIAL_IRON);
	public static final ItemHoe IRON_HOE = new ToolHoe("iron_hoe", MATERIAL_IRON);
	
	public static final Item IRON_HELMET = new ArmorBase("iron_helmet", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item IRON_CHESTPLATE = new ArmorBase("iron_chestplate", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item IRON_LEGGINGS = new ArmorBase("iron_leggings", ARMOR_MATERIAL_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item IRON_BOOTS = new ArmorBase("iron_boots", ARMOR_MATERIAL_IRON, 1, EntityEquipmentSlot.FEET);
	
	//STEEL//

	
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	//SILVER//

	
	public static final ItemSword SILVER_SWORD = new ToolSword("silver_sword", MATERIAL_SILVER);
	public static final ItemSpade SILVER_SHOVEL = new ToolSpade("silver_shovel", MATERIAL_SILVER);
	public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
	public static final ItemAxe SILVER_AXE = new ToolAxe("silver_axe", MATERIAL_SILVER);
	public static final ItemHoe SILVER_HOE = new ToolHoe("silver_hoe", MATERIAL_SILVER);
	
	public static final Item SILVER_HELMET = new SilverHelmet("silver_helmet", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new SilverBody("silver_chestplate", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new SilverLegs("silver_leggings", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new SilverBoots("silver_boots", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	
	//GOLD//

	
	public static final ItemSword GOLD_SWORD = new ToolSword("gold_sword", MATERIAL_GOLD);
	public static final ItemSpade GOLD_SHOVEL = new ToolSpade("gold_shovel", MATERIAL_GOLD);
	public static final ItemPickaxe GOLD_PICKAXE = new ToolPickaxe("gold_pickaxe", MATERIAL_GOLD);
	public static final ItemAxe GOLD_AXE = new ToolAxe("gold_axe", MATERIAL_GOLD);
	public static final ItemHoe GOLD_HOE = new ToolHoe("gold_hoe", MATERIAL_GOLD);
	
	public static final Item GOLD_HELMET = new GoldHelmet("gold_helmet", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.HEAD);
	public static final Item GOLD_CHESTPLATE = new GoldBody("gold_chestplate", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.CHEST);
	public static final Item GOLD_LEGGINGS = new GoldLegs("gold_leggings", ARMOR_MATERIAL_GOLD, 2, EntityEquipmentSlot.LEGS);
	public static final Item GOLD_BOOTS = new GoldBoots("gold_boots", ARMOR_MATERIAL_GOLD, 1, EntityEquipmentSlot.FEET);
	
	//PLATINUM//

	
	public static final ItemSword PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	public static final ItemSpade PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
	public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
	public static final ItemAxe PLATINUM_AXE = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
	public static final ItemHoe PLATINUM_HOE = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
	
	public static final Item PLATINUM_HELMET = new PlatinumHelmet("platinum_helmet", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new PlatinumBody("platinum_chestplate", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGGINGS = new PlatinumLegs("platinum_leggings", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new PlatinumBoots("platinum_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
	//EMERALD//

	
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	
	public static final Item EMERALD_HELMET = new EmeraldHelmet("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new EmeraldBody("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new EmeraldLegs("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new EmeraldBoots("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);

	//SAPHIR//


	public static final ItemSword SAPHIR_SWORD = new ToolSword("saphir_sword", MATERIAL_SAPHIR);
	public static final ItemSpade SAPHIR_SHOVEL = new ToolSpade("saphir_shovel", MATERIAL_SAPHIR);
	public static final ItemPickaxe SAPHIR_PICKAXE = new ToolPickaxe("saphir_pickaxe", MATERIAL_SAPHIR);
	public static final ItemAxe SAPHIR_AXE = new ToolAxe("saphir_axe", MATERIAL_SAPHIR);
	public static final ItemHoe SAPHIR_HOE = new ToolHoe("saphir_hoe", MATERIAL_SAPHIR);

	public static final Item SAPHIR_HELMET = new SapphirHelmet("saphir_helmet", ARMOR_MATERIAL_SAPHIR, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPHIR_CHESTPLATE = new SapphirBody("saphir_chestplate", ARMOR_MATERIAL_SAPHIR, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPHIR_LEGGINGS = new SapphirLegs("saphir_leggings", ARMOR_MATERIAL_SAPHIR, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPHIR_BOOTS = new SapphirBoots("saphir_boots", ARMOR_MATERIAL_SAPHIR, 1, EntityEquipmentSlot.FEET);

	//FLAMING_TOPAZ//
	
	
	public static final ItemSword FLAMING_TOPAZ_SWORD = new ToolSword("flaming_topaz_sword", MATERIAL_FLAMING_TOPAZ);
	public static final ItemSpade FLAMING_TOPAZ_SHOVEL = new ToolSpade("flaming_topaz_shovel", MATERIAL_FLAMING_TOPAZ);
	public static final ItemPickaxe FLAMING_TOPAZ_PICKAXE = new ToolPickaxe("flaming_topaz_pickaxe", MATERIAL_FLAMING_TOPAZ);
	public static final ItemAxe FLAMING_TOPAZ_AXE = new ToolAxe("flaming_topaz_axe", MATERIAL_FLAMING_TOPAZ);
	public static final ItemHoe FLAMING_TOPAZ_HOE = new ToolHoe("flaming_topaz_hoe", MATERIAL_FLAMING_TOPAZ);
	
	//RUBY//

	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final Item RUBY_HELMET = new RubyHelmet("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new RubyBody("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new RubyLegs("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new RubyBoots("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	//TOPAZ//
	
	
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SHOVEL = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	
	//DIAMOND//

	
	public static final ItemSword DIAMOND_SWORD = new ToolSword("diamond_sword", MATERIAL_DIAMOND);
	public static final ItemSpade DIAMOND_SHOVEL = new ToolSpade("diamond_shovel", MATERIAL_DIAMOND);
	public static final ItemPickaxe DIAMOND_PICKAXE = new ToolPickaxe("diamond_pickaxe", MATERIAL_DIAMOND);
	public static final ItemAxe DIAMOND_AXE = new ToolAxe("diamond_axe", MATERIAL_DIAMOND);
	public static final ItemHoe DIAMOND_HOE = new ToolHoe("diamond_hoe", MATERIAL_DIAMOND);
	
	public static final Item DIAMOND_HELMET = new DiamondHelmet("diamond_helmet", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item DIAMOND_CHESTPLATE = new DiamondBody("diamond_chestplate", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item DIAMOND_LEGGINGS = new DiamondLegs("diamond_leggings", ARMOR_MATERIAL_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item DIAMOND_BOOTS = new DiamondBoots("diamond_boots", ARMOR_MATERIAL_DIAMOND, 1, EntityEquipmentSlot.FEET);
	
	//JADE//
	
	
	public static final ItemSword JADE_SWORD = new ToolSword("jade_sword", Material.JADE);
	public static final ItemSpade JADE_SHOVEL = new ToolShovel("jade_shovel", Material.JADE);
	public static final ItemPickaxe JADE_PICKAXE = new ToolPickaxe("jade_pickaxe", Material.JADE);
	public static final ItemAxe JADE_AXE = new ToolAxe("jade_axe", Material.JADE);
	public static final ItemHoe JADE_HOE = new ToolHoe("jade_hoe", Material.JADE);
	
	//AMAZONITE//

	
	public static final ItemSword AMAZONITE_SWORD = new ToolSword("amazonite_sword", MATERIAL_AMAZONITE);
	public static final ItemSpade AMAZONITE_SHOVEL = new ToolSpade("amazonite_shovel", MATERIAL_AMAZONITE);
	public static final ItemPickaxe AMAZONITE_PICKAXE = new ToolPickaxe("amazonite_pickaxe", MATERIAL_AMAZONITE);
	public static final ItemAxe AMAZONITE_AXE = new ToolAxe("amazonite_axe", MATERIAL_AMAZONITE);
	public static final ItemHoe AMAZONITE_HOE = new ToolHoe("amazonite_hoe", MATERIAL_AMAZONITE);
	
	public static final Item AMAZONITE_HELMET = new AmazoniteHelmet("amazonite_helmet", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMAZONITE_CHESTPLATE = new AmazoniteBody("amazonite_chestplate", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMAZONITE_LEGGINGS = new AmazoniteLegs("amazonite_leggings", ARMOR_MATERIAL_AMAZONITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMAZONITE_BOOTS = new AmazoniteBoots("amazonite_boots", ARMOR_MATERIAL_AMAZONITE, 1, EntityEquipmentSlot.FEET);


	//AMETHYST//
	
	
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL.AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);

	
	//ONYX//

	public static final ItemSword ONYX_SWORD = new ToolSword("onyx_sword", MATERIAL_ONYX);
	public static final ItemSpade ONYX_SHOVEL = new ToolSpade("onyx_shovel", MATERIAL_ONYX);
	public static final ItemPickaxe ONYX_PICKAXE = new ToolPickaxe("onyx_pickaxe", MATERIAL_ONYX);
	public static final ItemAxe ONYX_AXE = new ToolAxe("onyx_axe", MATERIAL_ONYX);
 	public static final ItemHoe ONYX_HOE = new ToolHoe("onyx_hoe", MATERIAL_ONYX);

	public static final Item ONYX_HELMET = new OnyxHelmet("onyx_helmet", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.HEAD);
	public static final Item ONYX_CHESTPLATE = new OnyxBody("onyx_chestplate", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.CHEST);
	public static final Item ONYX_LEGGINGS = new OnyxLegs("onyx_leggings", ARMOR_MATERIAL_ONYX, 2, EntityEquipmentSlot.LEGS);
	public static final Item ONYX_BOOTS = new OnyxBoots("onyx_boots", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.FEET);

	//DEMON//CORE//
	
	public static final ItemSword DEMON_SWORD = new ToolSword("demon_sword", MATERIAL_DEMON);
	public static final ItemSword CORE_SWORD = new ToolSword("core_sword", MATERIAL_CORE);
	
	

	//GEMS//
	public static final Item SAPHIR = new ItemBase("saphir");
	public static final Item FLAMING_TOPAZ = new ItemBase("flaming_topaz");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item DIAMOND = new ItemBase("diamond");
	public static final Item JADE = new ItemBase("jade");
	public static final Item AMAZONITE = new Gems("amazonite");
	public static final Item AMETHYST = new Gems("amethyst");
	public static final Item ONYX = new Gems("onyx");
	
	//ROD//
	public static final Item EMERALD_ROD = new ItemBase("emerald_rod");
	public static final Item SAPHIR_ROD = new ItemBase("saphir_rod");
	public static final Item FLAMING_TOPAZ_ROD = new ItemBase("flaming_topaz_rod");
	public static final Item RUBY_ROD = new ItemBase("ruby_rod");
	public static final Item TOPAZ_ROD = new ItemBase("topaz_rod");
	public static final Item DIAMOND_ROD = new ItemBase("diamond_rod");
	public static final Item JADE_ROD = new ItemBase("jade_rod");
	public static final Item AMAZONITE_ROD = new Gems("amazonite_rod");
	public static final Item AMETHYST_ROD = new Gems("amethyst_rod");
	public static final Item ONYX_ROD = new Gems("onyx_rod");
	
	//Ingot//
	public static final Item IRON_INGOT = new ItemBase("iron_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item GOLD_INGOT = new ItemBase("gold_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");

	public static final Item IRON_COAL = new ItemBase("iron_coal");
	public static final Item SULFUR = new ItemBase("sulfur");
	
	public static final Item IRON_NUGGET = new ItemBase("iron_nugget");
	public static final Item STEEL_NUGGET = new ItemBase("steel_nugget");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item GOLD_NUGGET = new ItemBase("gold_nugget");
	public static final Item PLATINUM_NUGGET = new ItemBase("platinum_nugget");
	
	public static final Item DEMON_STAR = new ItemBase("demon_star");
	public static final Item DEMON_STAR_CHARGED = new Gems("demon_star_charged");
	public static final Item CORE_STAR = new ItemBase("core_star");

	public static final Item PLATINUM_APPLE = new FoodEffectBase("platinum_apple", 10, 3.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 6000,4, false, false),
			new PotionEffect(MobEffects.REGENERATION, 400,2, false, false),
			new PotionEffect(MobEffects.STRENGTH, 3000,0, false, false));

	public static final Item ENCHANTED_PLATINUM_APPLE = new EnchantedFoodEffectBase("enchanted_platinum_apple", 10, 3.0F, false,
			new PotionEffect(MobEffects.ABSORPTION, 6000,4, false, false),
			new PotionEffect(MobEffects.REGENERATION, 800,2, false, false),
			new PotionEffect(MobEffects.STRENGTH, 3000,1, false, false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000,1, false, false),
			new PotionEffect(MobEffects.RESISTANCE, 6000,1, false, false),
			new PotionEffect(MobEffects.GLOWING, 3000,0, false, false));

//SHIELDS
	public static final Item IRON_SHIELD = new IronShield("iron_shield");
	public static final Item STEEL_SHIELD = new SteelShield("steel_shield");
	public static final Item SILVER_SHIELD = new SilverShield("silver_shield");
	public static final Item GOLD_SHIELD = new GoldShield("gold_shield");
//	public static final Item PLATINUM_SHIELD = new PlatinumShield("platinum_shield");
//	public static final Item SAPPHIRE_SHIELD = new SapphireShield("sapphire_shield");
//	public static final Item RUBY_SHIELD = new RubyShield("ruby_shield");
//	public static final Item DIAMOND_SHIELD = new DiamondShield("diamond_shield");
//	public static final Item AMAZONITE_SHIELD = new AmazoniteShield("amazonite_shield");
//	public static final Item ONYX_SHIELD = new OnyxShield("onyx_shield");



}
