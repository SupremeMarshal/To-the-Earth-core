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

public class GoldBoots extends ArmorBase

{

	public GoldBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_GOLDBOOTS_UUID = UUID.fromString("a9fb9d05-55c3-4647-b29e-3eeedeedcd29");
	public static final UUID KNOCKBACK_RESISTANCE_GOLDBOOTS_UUID = UUID.fromString("9c0c2172-39f6-4fd8-8f3f-9eb2d2ab689c");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_GOLDBOOTS_UUID, "MAX_HEALTH_GOLDBOOTS_UUID", 1, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_GOLDBOOTS_UUID, "KNOCKBACK_RESISTANCE_GOLDBOOTS_UUID", 1, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_GOLDBOOTS_UUID, "MAX_HEALTH_GOLDBOOTS_UUID", 1, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_GOLDBOOTS_UUID, "KNOCKBACK_RESISTANCE_GOLDBOOTS_UUID", 1, 0));
    	}
    	return mods;
    }

}
