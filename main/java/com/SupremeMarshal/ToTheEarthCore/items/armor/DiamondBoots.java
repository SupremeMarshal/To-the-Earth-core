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

public class DiamondBoots extends ArmorBase 

{

	public DiamondBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_DIAMONDBOOTS_UUID = UUID.fromString("da7c90ee-8ad5-4a00-819e-dc58c3889499");
	public static final UUID KNOCKBACK_RESISTANCE_DIAMONDBOOTS_UUID = UUID.fromString("fca00d5f-0943-4b9f-ad4b-c0c7aed66d1c");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_DIAMONDBOOTS_UUID, "MAX_HEALTH_DIAMONDBOOTS_UUID", 5, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_DIAMONDBOOTS_UUID, "KNOCKBACK_RESISTANCE_DIAMONDBOOTS_UUID", 5, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_DIAMONDBOOTS_UUID, "MAX_HEALTH_DIAMONDBOOTS_UUID", 5, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_DIAMONDBOOTS_UUID, "KNOCKBACK_RESISTANCE_DIAMONDBOOTS_UUID", 5, 0));
    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.DIAMOND_BOOTS)
		{
			if (world.getTotalWorldTime() % 150 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
