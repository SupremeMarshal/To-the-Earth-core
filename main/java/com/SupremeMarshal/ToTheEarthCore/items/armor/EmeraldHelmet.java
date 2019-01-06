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

public class EmeraldHelmet extends ArmorBase

{

	public EmeraldHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_EMERALDHELM_UUID = UUID.fromString("286ade01-888a-49c4-ad97-b8981a035c03");
	public static final UUID KNOCKBACK_RESISTANCE_EMERALDHELM_UUID = UUID.fromString("f180fac4-1555-4729-b3ed-0644ea08a19a");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_EMERALDHELM_UUID, "MAX_HEALTH_EMERALDHELM_UUID", 3, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_EMERALDHELM_UUID, "KNOCKBACK_RESISTANCE_EMERALDHELM_UUID", 3, 0));

	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    	
		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealthplatinumhelm = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumhelm = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumhelm, new AttributeModifier (MAX_HEALTH_EMERALDHELM_UUID, "MAX_HEALTH_EMERALDHELM_UUID", 3, 0));
    		mods.put(knockbackplatinumhelm, new AttributeModifier (KNOCKBACK_RESISTANCE_EMERALDHELM_UUID, "KNOCKBACK_RESISTANCE_EMERALDHELM_UUID", 3, 0));
    	}
    	return mods;
    }

}
