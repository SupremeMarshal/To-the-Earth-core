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

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_AMAZONITEHELM_UUID, "MAX_HEALTH_AMAZONITEHELM_UUID", 7, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID", 7, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_AMAZONITEHELM_UUID, "MAX_HEALTH_AMAZONITEHELM_UUID", 7, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID, "KNOCKBACK_RESISTANCE_AMAZONITEHELM_UUID", 7, 0));
    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.AMAZONITE_HELMET)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,0,0));
			if (world.getTotalWorldTime() % 100 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
