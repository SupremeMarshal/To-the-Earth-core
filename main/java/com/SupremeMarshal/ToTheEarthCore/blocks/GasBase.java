package com.SupremeMarshal.ToTheEarthCore.blocks;
import com.SupremeMarshal.ToTheEarthCore.HardnessHandler;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import java.util.HashMap;
import java.util.Random;

public class GasBase extends BlockBase 
{

	public GasBase(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		
		}
	
	@Override
	public Item getItemDropped(IBlockState state, Random random, int l) 
	{
	return null; 
	}
	
	@Override
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		Block block = this;
		if (block == ModBlocks.MANTLEGAS && !world.isRemote)
		{
			world.createExplosion(null, (int)x, (int)y, (int)z, 4, true);
			
		}
		return super.removedByPlayer(state, world, pos, entity, willHarvest);	
	}
}
	

