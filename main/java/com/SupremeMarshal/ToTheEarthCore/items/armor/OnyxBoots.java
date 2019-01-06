package com.SupremeMarshal.ToTheEarthCore.items.armor;

import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OnyxBoots extends ArmorBase

{

	public OnyxBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_ONYXBOOTS_UUID = UUID.fromString("8c52f172-61da-4f9c-8750-577696624f90");
	public static final UUID KNOCKBACK_RESISTANCE_ONYXBOOTS_UUID = UUID.fromString("88b80f4f-362b-4b0b-9808-94c928a720c0");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_ONYXBOOTS_UUID, "MAX_HEALTH_ONYXBOOTS_UUID", 9, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ONYXBOOTS_UUID, "KNOCKBACK_RESISTANCE_ONYXBOOTS_UUID", 9, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.FEET) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_ONYXBOOTS_UUID, "MAX_HEALTH_ONYXBOOTS_UUID", 9, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_ONYXBOOTS_UUID, "KNOCKBACK_RESISTANCE_ONYXBOOTS_UUID", 9, 0));
    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.ONYX_BOOTS)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,0,0));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 0, 0));
			if (world.getTotalWorldTime() % 60 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
