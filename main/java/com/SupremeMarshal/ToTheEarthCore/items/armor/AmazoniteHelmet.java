package com.SupremeMarshal.ToTheEarthCore.items.armor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.SupremeMarshal.ToTheEarthCore.items.armor.ArmorBase;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class AmazoniteHelmet extends ArmorBase 

{

	public AmazoniteHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_AMAZONITEHELM_UUID = UUID.fromString("33ff17c5-3b45-402b-9fb7-d10fc584b6c3");
	public static final UUID KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID = UUID.fromString("2f896915-dcdd-4e0c-864c-c4e78e3e0587");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_AMAZONITEHELM_UUID, "MAX_HEALTH_AMAZONITEHELM_UUID", 10, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID", 10, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_AMAZONITEHELM_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID", 10, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID", 10, 0));
    	}
    	return mods;
    }

}
