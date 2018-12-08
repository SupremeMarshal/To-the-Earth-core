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

public class PlatinumHelmet extends ArmorBase 

{

	public PlatinumHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_PLATINUMHELM_UUID = UUID.fromString("cfb80931-3fc9-4e5a-9760-213aee2dce98");
	public static final UUID KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID = UUID.fromString("5619ab81-25e6-43e1-85e8-0a11be2b0bcd");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_PLATINUMHELM_UUID, "MAX_HEALTH_PLATINUMHELM_UUID", 2, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID, "KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID", 2, 0));

	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    	
		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealthplatinumhelm = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumhelm = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumhelm, new AttributeModifier (MAX_HEALTH_PLATINUMHELM_UUID, "KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID", 2, 0));
    		mods.put(knockbackplatinumhelm, new AttributeModifier (KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID, "KNOCKBACK_RESISTANCE_PLATINUMHELM_UUID", 2, 0));
    	}
    	return mods;
    }

}
