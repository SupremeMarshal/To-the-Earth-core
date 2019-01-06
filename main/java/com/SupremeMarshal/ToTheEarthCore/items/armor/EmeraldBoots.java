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

public class EmeraldBoots extends ArmorBase

{

	public EmeraldBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_EMERALDBOOTS_UUID = UUID.fromString("416804bd-1282-4b53-b555-b9ddf6e2352b");
	public static final UUID KNOCKBACK_RESISTANCE_EMERALDBOOTS_UUID = UUID.fromString("38964364-909f-4d73-85c7-aa7a5f71fcbf");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_EMERALDBOOTS_UUID, "MAX_HEALTH_EMERALDBOOTS_UUID", 3, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_EMERALDBOOTS_UUID, "KNOCKBACK_RESISTANCE_EMERALDBOOTS_UUID", 3, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_EMERALDBOOTS_UUID, "MAX_HEALTH_EMERALDBOOTS_UUID", 3, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_EMERALDBOOTS_UUID, "KNOCKBACK_RESISTANCE_EMERALDBOOTS_UUID", 3, 0));
    	}
    	return mods;
    }

}
