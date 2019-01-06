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

public class SapphirHelmet extends ArmorBase 

{

	public SapphirHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_SAPPHIRHELM_UUID = UUID.fromString("0a1676a7-3214-4f76-8c4e-7534c8f13941");
	public static final UUID KNOCKBACK_RESISTANCE_SAPPHIRHELM_UUID = UUID.fromString("f8215f0e-c22a-4c66-af66-94d50b8ed73c");
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_SAPPHIRHELM_UUID, "MAX_HEALTH_SAPPHIRHELM_UUID", 3, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_SAPPHIRHELM_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRHELM_UUID", 3, 0));

	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    	
		
    	if (slot==EntityEquipmentSlot.HEAD) {

    		String maxhealthplatinumhelm = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumhelm = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumhelm, new AttributeModifier (MAX_HEALTH_SAPPHIRHELM_UUID, "MAX_HEALTH_SAPPHIRHELM_UUID", 3, 0));
    		mods.put(knockbackplatinumhelm, new AttributeModifier (KNOCKBACK_RESISTANCE_SAPPHIRHELM_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRHELM_UUID", 3, 0));
    	}
    	return mods;
    }
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.SAPHIR_HELMET)
		{
			if (world.getTotalWorldTime() % 300 != 1)
			{
				return;
			}
			player.heal(0.15F);
		}
	}
}
