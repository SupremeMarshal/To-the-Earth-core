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

public class GoldLegs extends ArmorBase

{

	public GoldLegs(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_GOLDLEGS_UUID = UUID.fromString("ec5baf86-1084-44e6-b8f6-2477f3c18140");
	public static final UUID KNOCKBACK_RESISTANCE_GOLDLEGS_UUID = UUID.fromString("924c2114-de6d-4104-a24d-33418ac4f65d");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_GOLDLEGS_UUID, "MAX_HEALTH_GOLDLEGS_UUID", 2, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_GOLDLEGS_UUID, "KNOCKBACK_RESISTANCE_GOLDLEGS_UUID", 2, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.LEGS) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_GOLDLEGS_UUID, "MAX_HEALTH_GOLDLEGS_UUID", 2, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_GOLDLEGS_UUID, "KNOCKBACK_RESISTANCE_GOLDLEGS_UUID", 2, 0));
    	}
    	return mods;
    }

}