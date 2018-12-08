package com.SupremeMarshal.ToTheEarthCore.items.tools;

import com.SupremeMarshal.ToTheEarthCore.Main;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import com.SupremeMarshal.ToTheEarthCore.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}

}
