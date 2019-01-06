package com.SupremeMarshal.ToTheEarthCore.init;

import com.SupremeMarshal.ToTheEarthCore.fluids.FluidLiquid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{
	public static final Fluid HOT_LAVA_FLUID = new FluidLiquid("hot_lava", new ResourceLocation("totheearthcore:blocks/hot_lava_still"), new ResourceLocation("totheearthcore:blocks/hot_lava_flow"));
	public static final Fluid CORE_LAVA_FLUID = new FluidLiquid("core_lava", new ResourceLocation("totheearthcore:blocks/core_lava_still"), new ResourceLocation("totheearthcore:blocks/core_lava_flow"));

	public static void registerFluids()
	{
		registerFluid(HOT_LAVA_FLUID);
		registerFluid(CORE_LAVA_FLUID);
	}
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
