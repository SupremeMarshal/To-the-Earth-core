package com.SupremeMarshal.ToTheEarthCore.blocks;

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

	if (block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_EMERALD)
	{return new ItemStack(Items.EMERALD, (int) (1), 0).getItem();}
	else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR)
	{return new ItemStack(ModItems.SAPHIR, (int) (1), 0).getItem();}
	else if (block == ModBlocks.RUBY_ORE || block == ModBlocks.STIFFROCK_RUBY || block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.LOWER_MANTLEROCK_RUBY)
	{return new ItemStack(ModItems.RUBY, (int) (1), 0).getItem();}
	else if (block == ModBlocks.TOPAZ_ORE || block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.MANTLEROCK_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_TOPAZ)
	{return new ItemStack(ModItems.TOPAZ, (int) (1), 0).getItem();}
	else if (block == ModBlocks.DIAMOND_ORE || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.LOWER_MANTLEROCK_DIAMOND)
	{return new ItemStack(ModItems.DIAMOND, (int) (1), 0).getItem();}
	else if (block == ModBlocks.JADE_ORE || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.REDROCK_JADE || block == ModBlocks.MANTLEROCK_JADE || block == ModBlocks.LOWER_MANTLEROCK_JADE)
	{return new ItemStack(ModItems.JADE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.LOWER_MANTLEROCK_AMAZONITE)
	{return new ItemStack(ModItems.AMAZONITE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.AMETHYST_ORE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.MANTLEROCK_AMETHYST || block == ModBlocks.LOWER_MANTLEROCK_AMETHYST)
	{return new ItemStack(ModItems.AMETHYST, (int) (1), 0).getItem();}
	else if (block == ModBlocks.ONYX_ORE || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.LOWER_MANTLEROCK_ONYX)
	{return new ItemStack(ModItems.ONYX, (int) (1), 0).getItem();}
	else if (block == ModBlocks.AZURITE_ORE || block == ModBlocks.STIFFROCK_AZURITE || block == ModBlocks.HARDROCK_AZURITE || block == ModBlocks.REDROCK_AZURITE || block == ModBlocks.MANTLEROCK_AZURITE || block == ModBlocks.LOWER_MANTLEROCK_AZURITE)
	{return new ItemStack(ModItems.AZURITE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_COAL)
	{return new ItemStack(Items.COAL, (int) (1), 0).getItem();}
	else if (block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.LOWER_MANTLEROCK_REDSTONE)
	{return new ItemStack(Items.REDSTONE, (int) (1), 0).getItem();}
	else if (block == ModBlocks.SULFUR_ORE || block == ModBlocks.STIFFROCK_SULFUR || block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.MANTLEROCK_SULFUR || block == ModBlocks.LOWER_MANTLEROCK_SULFUR)
	{return new ItemStack(ModItems.SULFUR, 1,0).getItem();}
	else
	{return new ItemStack(block, (int) (1), 0).getItem();}
	}

	@Override
	public int quantityDropped(Random random) {
		Block block = this;

		if ( block == ModBlocks.STIFFROCK_REDSTONE)
		{
			return 5 + random.nextInt(3);
		}
			
		else if (block == ModBlocks.HARDROCK_REDSTONE)
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
		else if (block == ModBlocks.LOWER_MANTLEROCK_REDSTONE)
		{
			return 11 + random.nextInt(9);
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
		else if (block == ModBlocks.LOWER_MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_SULFUR)
		{
			return 4;
		}
		else
		{
			return 1;
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
			if (block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL ||
				block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.MANTLEROCK_REDSTONE ||
				block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD ||
				block == ModBlocks.SULFUR_ORE || block == ModBlocks.STIFFROCK_SULFUR || block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.MANTLEROCK_SULFUR)
		{
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
		}
		else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR)
		{
			for (int i = 0; i < 5; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.FLAMING_TOPAZ_ORE || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ)
		{
			for (int i = 0; i < 6; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.RUBY_ORE || block == ModBlocks.STIFFROCK_RUBY || block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY)
		{
			for (int i = 0; i < 8; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.TOPAZ_ORE || block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.MANTLEROCK_TOPAZ)
		{
			for (int i = 0; i < 9; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.DIAMOND_ORE || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND)
		{
			for (int i = 0; i < 12; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.JADE_ORE || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.REDROCK_JADE || block == ModBlocks.MANTLEROCK_JADE)
		{
			for (int i = 0; i < 15; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE)
		{
			for (int i = 0; i < 20; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.AMETHYST_ORE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.MANTLEROCK_AMETHYST)
		{
			for (int i = 0; i < 4; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			}
			for (int i = 0; i < 9; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.ONYX_ORE || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX)
		{
			for (int i = 0; i < 6; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			}
			for (int i = 0; i < 13; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		else if (block == ModBlocks.AZURITE_ORE || block == ModBlocks.STIFFROCK_AZURITE || block == ModBlocks.HARDROCK_AZURITE || block == ModBlocks.REDROCK_AZURITE || block == ModBlocks.MANTLEROCK_AZURITE)
		{
			for (int i = 0; i < 9; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
			}
			for (int i = 0; i < 18; i++) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
			}
		}
		}
		return super.removedByPlayer(state, world, pos, entity, willHarvest);
	}


// override getItemDropped() and damageDropped() respectively. one for the item, one for the meta

}


