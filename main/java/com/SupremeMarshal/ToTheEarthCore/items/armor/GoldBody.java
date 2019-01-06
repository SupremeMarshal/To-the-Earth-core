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

public class GoldBody extends ArmorBase

{

	public GoldBody(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_GOLDBODY_UUID = UUID.fromString("f32661c4-8f25-4404-a3d3-6627735bf883");
	public static final UUID KNOCKBACK_RESISTANCE_GOLDBODY_UUID = UUID.fromString("a35c95c7-4d53-44ad-a467-d911baa09158");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_GOLDBODY_UUID, "MAX_HEALTH_GOLDBODY_UUID", 3, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_GOLDBODY_UUID, "KNOCKBACK_RESISTANCE_GOLDBODY_UUID", 3, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.CHEST) {

    		String maxhealthplatinumbody = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumbody = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumbody, new AttributeModifier (MAX_HEALTH_GOLDBODY_UUID, "MAX_HEALTH_GOLDBODY_UUID", 3, 0));
    		mods.put(knockbackplatinumbody, new AttributeModifier (KNOCKBACK_RESISTANCE_GOLDBODY_UUID, "KNOCKBACK_RESISTANCE_GOLDBODY_UUID", 3, 0));
    	}
    	return mods;
    }

}
