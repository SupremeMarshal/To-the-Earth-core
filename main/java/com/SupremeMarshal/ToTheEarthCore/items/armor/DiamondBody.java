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

public class DiamondBody extends ArmorBase 

{

	public DiamondBody(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_DIAMONDBODY_UUID = UUID.fromString("d0b07cb9-b59a-4af6-af93-39db9c5e566e");
	public static final UUID KNOCKBACK_RESISTANCE_DIAMONDBODY_UUID = UUID.fromString("e7a6a399-db3f-4535-afb2-f8c5a45f543d");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_DIAMONDBODY_UUID, "MAX_HEALTH_DIAMONDBODY_UUID", 10, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_DIAMONDBODY_UUID, "KNOCKBACK_RESISTANCE_DIAMONDBODY_UUID", 10, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.CHEST) {

    		String maxhealthplatinumbody = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumbody = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumbody, new AttributeModifier (MAX_HEALTH_DIAMONDBODY_UUID, "MAX_HEALTH_DIAMONDBODY_UUID", 10, 0));
    		mods.put(knockbackplatinumbody, new AttributeModifier (KNOCKBACK_RESISTANCE_DIAMONDBODY_UUID, "KNOCKBACK_RESISTANCE_DIAMONDBODY_UUID", 10, 0));
    	}
    	return mods;
    }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.DIAMOND_CHESTPLATE)
		{
			if (world.getTotalWorldTime() % 150 != 1)
			{
				return;
			}
			player.heal(0.4F);
		}
	}
}
