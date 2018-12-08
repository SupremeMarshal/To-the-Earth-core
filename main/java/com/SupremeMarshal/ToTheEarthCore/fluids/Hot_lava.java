package com.SupremeMarshal.ToTheEarthCore.fluids;

import com.SupremeMarshal.ToTheEarthCore.HardnessHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class Hot_lava extends FluidLiquid
{

	
public Hot_lava(String name, ResourceLocation still, ResourceLocation flow) 
{
	super(name, still, flow);
	this.setUnlocalizedName(name);
}

}