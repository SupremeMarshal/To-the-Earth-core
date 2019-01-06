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

public class OnyxBody extends ArmorBase

{

	public OnyxBody(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_ONYXBODY_UUID = UUID.fromString("3deeaf1b-5493-4fb9-b9ad-39d51225347c");
	public static final UUID KNOCKBACK_RESISTANCE_ONYXBODY_UUID = UUID.fromString("e7a5098c-273f-4b5c-9293-9fd74d678ff3");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_ONYXBODY_UUID, "MAX_HEALTH_ONYXBODY_UUID", 18, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ONYXBODY_UUID, "KNOCKBACK_RESISTANCE_ONYXBODY_UUID", 18, 0));
	}
   @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.CHEST) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_ONYXBODY_UUID, "MAX_HEALTH_ONYXBODY_UUID", 18, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_ONYXBODY_UUID, "KNOCKBACK_RESISTANCE_ONYXBODY_UUID", 18, 0));

    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.ONYX_HELMET
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.ONYX_CHESTPLATE
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.ONYX_LEGGINGS
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.ONYX_BOOTS)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 0, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 0, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 0, 0));
		}
		if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.ONYX_CHESTPLATE)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,0,0));
			if (world.getTotalWorldTime() % 60 != 1)
			{
				return;
			}
			player.heal(0.4F);
		}
	}

}
//player.heal(0.001F);