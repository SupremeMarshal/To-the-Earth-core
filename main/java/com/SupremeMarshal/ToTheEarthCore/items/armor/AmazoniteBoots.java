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

public class AmazoniteBoots extends ArmorBase 

{

	public AmazoniteBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_AMAZONITEBOOTS_UUID = UUID.fromString("c74f0334-f073-41f2-bfbe-381a8e778278");
	public static final UUID KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID = UUID.fromString("adeaa808-92be-4469-bbf5-2dd15fac0357");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_AMAZONITEBOOTS_UUID, "MAX_HEALTH_AMAZONITEBOOTS_UUID", 10, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID", 10, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_AMAZONITEBOOTS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID", 10, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEBOOTS_UUID", 10, 0));
    	}
    	return mods;
    }

}
