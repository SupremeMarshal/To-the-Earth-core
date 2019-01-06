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

public class PlatinumBody extends ArmorBase 

{

	public PlatinumBody(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_PLATINUMBODY_UUID = UUID.fromString("122785ee-9867-4ace-af8b-745932039e73");
	public static final UUID KNOCKBACK_RESISTANCE_PLATINUMBODY_UUID = UUID.fromString("ecec32f1-c5b5-4921-98ba-e1717a3befa4");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_PLATINUMBODY_UUID, "MAX_HEALTH_PLATINUMBODY_UUID", 4, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_PLATINUMBODY_UUID, "KNOCKBACK_RESISTANCE_PLATINUMBODY_UUID", 4, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.CHEST) {

    		String maxhealthplatinumbody = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumbody = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumbody, new AttributeModifier (MAX_HEALTH_PLATINUMBODY_UUID, "MAX_HEALTH_PLATINUMBODY_UUID", 4, 0));
    		mods.put(knockbackplatinumbody, new AttributeModifier (KNOCKBACK_RESISTANCE_PLATINUMBODY_UUID, "KNOCKBACK_RESISTANCE_PLATINUMBODY_UUID", 4, 0));
    	}
    	return mods;
    }

}
