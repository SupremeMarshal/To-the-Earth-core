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

public class EmeraldLegs extends ArmorBase

{

	public EmeraldLegs(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_EMERALDLEGS_UUID = UUID.fromString("be63b70f-4085-4ea0-9f8b-271c52614a9a");
	public static final UUID KNOCKBACK_RESISTANCE_EMERALDLEGS_UUID = UUID.fromString("43ddd663-0b3a-4e44-a16d-266ccfd295db");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_EMERALDLEGS_UUID, "MAX_HEALTH_EMERALDLEGS_UUID", 5, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_EMERALDLEGS_UUID, "KNOCKBACK_RESISTANCE_EMERALDLEGS_UUID", 5, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.LEGS) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_EMERALDLEGS_UUID, "MAX_HEALTH_EMERALDLEGS_UUID", 5, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_EMERALDLEGS_UUID, "KNOCKBACK_RESISTANCE_EMERALDLEGS_UUID", 5, 0));
    	}
    	return mods;
    }

}
