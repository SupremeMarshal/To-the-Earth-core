package com.SupremeMarshal.ToTheEarthCore.fluids;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

public class FluidLiquid extends Fluid 
{
public FluidLiquid(String name, ResourceLocation still, ResourceLocation flow) 
{
	super(name, still, flow);
	this.setUnlocalizedName(name);
}

}