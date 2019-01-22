package com.SupremeMarshal.ToTheEarthCore.blocks;

import com.SupremeMarshal.ToTheEarthCore.util.handlers.HardnessHandler;
import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class Corerock extends BlockBase
{

	public Corerock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(-1.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
		setTickRandomly(true);

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
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		Block block = this;
		if (!world.isRemote) {
			if (block == ModBlocks.COREROCK) { }
			else if (block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_EMERALD) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
			else if (block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_SAPHIR) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
			else if (block == ModBlocks.COREROCK_RUBY || block == ModBlocks.INNERCOREROCK_RUBY) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
			else if (block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_DIAMOND) {
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
			else if (block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMAZONITE) {
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
			else if (block == ModBlocks.COREROCK_ONYX || block == ModBlocks.INNERCOREROCK_ONYX) {
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
			else
			{
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		return super.removedByPlayer(state, world, pos, entity, willHarvest);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random random, int l)
	{
		Block block = this;

        if (block == ModBlocks.COREROCK_ONYX || block == ModBlocks.INNERCOREROCK_ONYX)
        {return new ItemStack(ModItems.ONYX, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMAZONITE)
		{return new ItemStack(ModItems.AMAZONITE, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_DIAMOND)
		{return new ItemStack(ModItems.DIAMOND, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_RUBY || block == ModBlocks.INNERCOREROCK_RUBY)
		{return new ItemStack(ModItems.RUBY, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_SAPHIR)
		{return new ItemStack(ModItems.SAPHIR, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_EMERALD)
		{return new ItemStack(Items.EMERALD, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_LAPIS)
		{return Items.DYE;}
		else if (block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_REDSTONE)
		{return new ItemStack(Items.REDSTONE, 1, 0).getItem();}
		else if (block == ModBlocks.COREROCK_COAL || block == ModBlocks.INNERCOREROCK_COAL)
		{return new ItemStack(Items.COAL, 1, 0).getItem();}
		else
		{return new ItemStack(block, 1, 0).getItem();}
	}

	@Override
	public int quantityDropped(Random random) {
		Block block = this;

		if (block == ModBlocks.COREROCK_REDSTONE)
		{
			return 12 + random.nextInt(10);
		}
		else if (block == ModBlocks.INNERCOREROCK_REDSTONE)
		{
			return 15 + random.nextInt(12);
		}
		else if (block == ModBlocks.COREROCK_COAL || block == ModBlocks.COREROCK_SULFUR)
		{
			return 5;
		}
		else if (block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.INNERCOREROCK_SULFUR)
		{
			return 7;
		}
		else
		{
			return 1;
		}

	}

	@Override
	public int damageDropped(IBlockState state) {
		Block block = this;
		if (block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_LAPIS) {
			return 4;
		}
		else
		{
			return getMetaFromState(state);
		}
	}

	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	{
		Block block = this;
		if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase)entityIn))
		{
			if (block == ModBlocks.COREROCK)
		{
			entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 6.0F);
		}
			else if (block == ModBlocks.INNERCOREROCK)
			{
				entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 12.0F);
			}
		}

		super.onEntityWalk(worldIn, pos, entityIn);
	}

	@SideOnly(Side.CLIENT)
	public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return 15728880;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		BlockPos blockpos = pos.up();
		IBlockState iblockstate = worldIn.getBlockState(blockpos);

		if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER)
		{
			worldIn.setBlockToAir(blockpos);
			worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

			if (worldIn instanceof WorldServer)
			{
				((WorldServer)worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.25D, (double)blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
			}
		}
	}

	public boolean canEntitySpawn(IBlockState state, Entity entityIn)
	{
		return entityIn.isImmuneToFire();
	}

}
	

