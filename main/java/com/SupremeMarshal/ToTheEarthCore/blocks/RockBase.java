package com.SupremeMarshal.ToTheEarthCore.blocks;

import com.SupremeMarshal.ToTheEarthCore.util.handlers.HardnessHandler;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RockBase extends BlockBase 
{

	public RockBase(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		if (this == ModBlocks.HOT_MANTLEROCK) {
			setLightLevel(0.4F);
		}
		if (this == ModBlocks.COREROCK) {
			setLightLevel(1.0F);
		}
		if (this == ModBlocks.INNERCOREROCK) {
			setLightLevel(1.0F);
		}
	}
	
	public void onBlockClicked(World world, BlockPos pos, EntityPlayer entity) {
		Block block = this;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("block", block);
			$_dependencies.put("entity", entity);
			HardnessHandler.executeProcedure($_dependencies);
		}	
	}
}
	

