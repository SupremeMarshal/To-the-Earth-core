package com.SupremeMarshal.ToTheEarthCore.items.armor;

import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DiamondHelmet extends ArmorBase 

{

	public DiamondHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_DIAMONDHELM_UUID = UUID.fromString("5eb40d73-3770-434b-aeda-f277f42b50ba");
	public static final UUID KNOCKBACK_RESISTANCE_DIAMONDHELM_UUID = UUID.fromString("6c764957-a79a-4eb9-96e4-77ca2cec60c4");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_DIAMONDHELM_UUID, "MAX_HEALTH_DIAMONDHELM_UUID", 5, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_DIAMONDHELM_UUID, "KNOCKBACK_RESISTANCE_DIAMONDHELM_UUID", 5, 0));

	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    	
		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealthplatinumhelm = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumhelm = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumhelm, new AttributeModifier (MAX_HEALTH_DIAMONDHELM_UUID, "MAX_HEALTH_DIAMONDHELM_UUID", 5, 0));
    		mods.put(knockbackplatinumhelm, new AttributeModifier (KNOCKBACK_RESISTANCE_DIAMONDHELM_UUID, "KNOCKBACK_RESISTANCE_DIAMONDHELM_UUID", 5, 0));
    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.DIAMOND_HELMET)
		{
			if (world.getTotalWorldTime() % 150 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
