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

public class SapphirBoots extends ArmorBase 

{

	public SapphirBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_SAPPHIRBOOTS_UUID = UUID.fromString("6a92e0f4-900f-45c8-811c-2f9331a988ae");
	public static final UUID KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID = UUID.fromString("d084a93a-1d56-4460-92e4-2982ecc0070a");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_SAPPHIRBOOTS_UUID, "MAX_HEALTH_SAPPHIRBOOTS_UUID", 4, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID", 4, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_SAPPHIRBOOTS_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID", 4, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBOOTS_UUID", 4, 0));
    	}
    	return mods;
    }

}
