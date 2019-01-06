package com.SupremeMarshal.ToTheEarthCore.items.armor;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlatinumLegs extends ArmorBase 

{

	public PlatinumLegs(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_PLATINUMLEGS_UUID = UUID.fromString("a5c77a84-5a15-4752-9f07-599a3a2e4c9f");
	public static final UUID KNOCKBACK_RESISTANCE_PLATINUMLEGS_UUID = UUID.fromString("1726437a-2fba-42b9-a3f7-56a777740037");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_PLATINUMLEGS_UUID, "MAX_HEALTH_PLATINUMLEGS_UUID", 3, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_PLATINUMLEGS_UUID, "KNOCKBACK_RESISTANCE_PLATINUMLEGS_UUID", 3, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.LEGS) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_PLATINUMLEGS_UUID, "MAX_HEALTH_PLATINUMLEGS_UUID", 3, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_PLATINUMLEGS_UUID, "KNOCKBACK_RESISTANCE_PLATINUMLEGS_UUID", 3, 0));
    	}
    	return mods;
    }

}
