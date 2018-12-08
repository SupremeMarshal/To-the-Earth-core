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

public class DiamondLegs extends ArmorBase 

{

	public DiamondLegs(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_DIAMONDLEGS_UUID = UUID.fromString("150f4849-6538-46a4-b67f-d23f3b59aa34");
	public static final UUID KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID = UUID.fromString("4834272d-8e85-4fe4-b828-e00876a88ee2");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_DIAMONDLEGS_UUID, "MAX_HEALTH_DIAMONDLEGS_UUID", 8, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID, "KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID", 8, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.LEGS) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_DIAMONDLEGS_UUID, "KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID", 8, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID, "KNOCKBACK_RESISTANCE_DIAMONDLEGS_UUID", 8, 0));
    	}
    	return mods;
    }

}
