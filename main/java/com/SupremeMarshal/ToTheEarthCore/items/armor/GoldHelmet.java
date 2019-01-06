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

public class GoldHelmet extends ArmorBase

{

	public GoldHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_GOLDHELM_UUID = UUID.fromString("de2d6ce5-561c-47e6-a9d1-219b6a1fac02");
	public static final UUID KNOCKBACK_RESISTANCE_GOLDHELM_UUID = UUID.fromString("4b01a01c-88fa-453d-b980-9309de4cd25c");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_GOLDHELM_UUID, "MAX_HEALTH_GOLDHELM_UUID", 1, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_GOLDHELM_UUID, "KNOCKBACK_RESISTANCE_GOLDHELM_UUID", 1, 0));

	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    	
		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealthplatinumhelm = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumhelm = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumhelm, new AttributeModifier (MAX_HEALTH_GOLDHELM_UUID, "MAX_HEALTH_GOLDHELM_UUID", 1, 0));
    		mods.put(knockbackplatinumhelm, new AttributeModifier (KNOCKBACK_RESISTANCE_GOLDHELM_UUID, "KNOCKBACK_RESISTANCE_GOLDHELM_UUID", 1, 0));
    	}
    	return mods;
    }

}
