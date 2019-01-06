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

public class RubyBoots extends ArmorBase 

{

	public RubyBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_RUBYBOOTS_UUID = UUID.fromString("c3a3b300-d7ad-4bc4-87b6-8cd788975261");
	public static final UUID KNOCKBACK_RESISTANCE_RUBYBOOTS_UUID = UUID.fromString("385650fc-a5c6-4223-8338-ef04ebbfcdd0");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_RUBYBOOTS_UUID, "MAX_HEALTH_RUBYBOOTS_UUID", 4, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_RUBYBOOTS_UUID, "KNOCKBACK_RESISTANCE_RUBYBOOTS_UUID", 4, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_RUBYBOOTS_UUID, "MAX_HEALTH_RUBYBOOTS_UUID", 4, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_RUBYBOOTS_UUID, "KNOCKBACK_RESISTANCE_RUBYBOOTS_UUID", 4, 0));
    	}
    	return mods;
    }
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.RUBY_BOOTS)
		{
			if (world.getTotalWorldTime() % 200 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
