package com.SupremeMarshal.ToTheEarthCore.items.armor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class PlatinumBoots extends ArmorBase 

{

	public PlatinumBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_PLATINUMBOOTS_UUID = UUID.fromString("1726437a-2fba-42b9-a3f7-56a777740037");
	public static final UUID KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID = UUID.fromString("7ffe2d12-c540-407b-8df6-101450ab8a5b");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_PLATINUMBOOTS_UUID, "MAX_HEALTH_PLATINUMBOOTS_UUID", 2, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID, "KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID", 2, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_PLATINUMBOOTS_UUID, "KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID", 2, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID, "KNOCKBACK_RESISTANCE_PLATINUMBOOTS_UUID", 2, 0));
    	}
    	return mods;
    }

}
