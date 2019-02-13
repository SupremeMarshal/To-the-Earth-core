package com.SupremeMarshal.ToTheEarthCore.blocks;

import com.SupremeMarshal.ToTheEarthCore.util.handlers.HardnessHandler;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Random;

public class GemBase extends BlockBase 
{

	public GemBase(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);

		


	}

	@Override
	public Item getItemDropped(IBlockState state, Random random, int l)
	{
	Block block = this;

	if (block == ModBlocks.HARDROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL)
		{return new ItemStack(Items.COAL, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.SAPHIR_ORE)
		{return new ItemStack(ModItems.SAPHIR, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.RUBY_ORE)
	{return new ItemStack(ModItems.RUBY, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.DIAMOND_ORE)
	{return new ItemStack(ModItems.DIAMOND, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.AMAZONITE_ORE)
	{return new ItemStack(ModItems.AMAZONITE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.ONYX_ORE)
	{return new ItemStack(ModItems.ONYX, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD)
	{return new ItemStack(Items.EMERALD, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.MANTLEROCK_REDSTONE)
	{return new ItemStack(Items.REDSTONE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.MANTLEROCK_SULFUR || block == ModBlocks.SULFUR_ORE)
	{return new ItemStack(ModItems.SULFUR, 1,0).getItem();}
	else
	{return new ItemStack(block, (int) (1), 0).getItem();}
	}

	@Override
	public int quantityDropped(Random random) {
		Block block = this;

		if (block == ModBlocks.HARDROCK_REDSTONE)
		{
			return 6 + random.nextInt(4);
		}

		else if (block == ModBlocks.REDROCK_REDSTONE)
		{
			return 8 + random.nextInt(6);
		}
		else if (block == ModBlocks.MANTLEROCK_REDSTONE)
		{
			return 10 + random.nextInt(8);
		}
		else if (block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDROCK_SULFUR)
		{
			return 2;
		}
		else if (block == ModBlocks.REDROCK_COAL || block == ModBlocks.REDROCK_SULFUR)
		{
			return 3;
		}
		else if (block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.MANTLEROCK_SULFUR)
		{
			return 4;
		}
		else
		{
			return 1;
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

	@Override
	public boolean canDropFromExplosion(Explosion explosionIn)
	{
		return false;
	}

	@Override
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		Block block = this;
		if (!world.isRemote) {
			if (block == ModBlocks.HARDROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.HARDROCK_REDSTONE ||
				block == ModBlocks.REDROCK_REDSTONE ||block == ModBlocks.MANTLEROCK_REDSTONE  ||
				block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.SULFUR_ORE
				|| block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.MANTLEROCK_SULFUR)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));

		}
		else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));

		}
		else if (block == ModBlocks.RUBY_ORE || block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));

		}
		else if (block == ModBlocks.DIAMOND_ORE || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));

		}
		else if (block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));

		}
		else if (block == ModBlocks.ONYX_ORE || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
		}
		}
		return super.removedByPlayer(state, world, pos, entity, willHarvest);
	}


// override getItemDropped() and damageDropped() respectively. one for the item, one for the meta

}


