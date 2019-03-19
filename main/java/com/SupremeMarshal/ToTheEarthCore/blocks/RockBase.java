package com.SupremeMarshal.ToTheEarthCore.blocks;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;
import com.SupremeMarshal.ToTheEarthCore.util.handlers.HardnessHandler;
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

public class RockBase extends BlockBase 
{
	public static int hardness;
	public static int tier;

	public RockBase(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		Block block = this;

		if (block == ModBlocks.STIFFROCK || block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.STIFFROCK_SULFUR || block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.STIFFROCK_LAPIS
				|| block == ModBlocks.STIFFROCK_IRON || block == ModBlocks.STIFFROCK_SILVER || block == ModBlocks.STIFFROCK_GOLD || block == ModBlocks.STIFFROCK_PLATINUM
				|| block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.STIFFROCK_RUBY
				|| block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.STIFFROCK_AZURITE)
		{hardness = 0;}
		else if (block == ModBlocks.HARDROCK || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.HARDROCK_LAPIS
				|| block == ModBlocks.HARDROCK_IRON || block == ModBlocks.HARDROCK_SILVER || block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_PLATINUM
				|| block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_RUBY
				|| block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.HARDROCK_AZURITE)
		{hardness = 1;}
		else if (block == ModBlocks.REDROCK || block == ModBlocks.REDROCK_COAL || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.REDROCK_LAPIS
				|| block == ModBlocks.REDROCK_IRON || block == ModBlocks.REDROCK_SILVER || block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_PLATINUM
				|| block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_RUBY
				|| block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.REDROCK_JADE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.REDROCK_AZURITE)
		{hardness = 2;}
		else if (block == ModBlocks.MANTLEROCK || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.MANTLEROCK_SULFUR || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.MANTLEROCK_LAPIS
				|| block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.MANTLEROCK_SILVER || block == ModBlocks.HOT_MANTLEROCK || block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_PLATINUM
				|| block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_RUBY
				|| block == ModBlocks.MANTLEROCK_TOPAZ || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.MANTLEROCK_JADE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMETHYST || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.MANTLEROCK_AZURITE)
		{hardness = 3;}
		else if (block == ModBlocks.LOWER_MANTLEROCK || block == ModBlocks.LOWER_MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_SULFUR || block == ModBlocks.LOWER_MANTLEROCK_REDSTONE || block == ModBlocks.LOWER_MANTLEROCK_LAPIS
				|| block == ModBlocks.LOWER_MANTLEROCK_IRON || block == ModBlocks.LOWER_MANTLEROCK_SILVER || block == ModBlocks.LOWER_MANTLEROCK_GOLD || block == ModBlocks.LOWER_MANTLEROCK_PLATINUM
				|| block == ModBlocks.LOWER_MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_RUBY
				|| block == ModBlocks.LOWER_MANTLEROCK_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_DIAMOND || block == ModBlocks.LOWER_MANTLEROCK_JADE || block == ModBlocks.LOWER_MANTLEROCK_AMAZONITE || block == ModBlocks.LOWER_MANTLEROCK_AMETHYST || block == ModBlocks.LOWER_MANTLEROCK_ONYX || block == ModBlocks.LOWER_MANTLEROCK_AZURITE)
		{hardness = 4;}
		else if (block == ModBlocks.COREROCK || block == ModBlocks.COREROCK_COAL || block == ModBlocks.COREROCK_SULFUR || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.COREROCK_LAPIS
				|| block == ModBlocks.COREROCK_IRON || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_PLATINUM
				|| block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.COREROCK_FLAMING_TOPAZ || block == ModBlocks.COREROCK_RUBY
				|| block == ModBlocks.COREROCK_TOPAZ || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.COREROCK_JADE || block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.COREROCK_AMETHYST || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.COREROCK_AZURITE)
		{hardness = 5;
		setLightLevel(0.6F);}
		else if (block == ModBlocks.INNERCOREROCK || block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.INNERCOREROCK_SULFUR || block == ModBlocks.INNERCOREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_LAPIS
				|| block == ModBlocks.INNERCOREROCK_IRON || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_PLATINUM
				|| block == ModBlocks.INNERCOREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_FLAMING_TOPAZ || block == ModBlocks.INNERCOREROCK_RUBY
				|| block == ModBlocks.INNERCOREROCK_TOPAZ || block == ModBlocks.INNERCOREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_JADE || block == ModBlocks.INNERCOREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMETHYST || block == ModBlocks.INNERCOREROCK_ONYX || block == ModBlocks.INNERCOREROCK_AZURITE)
		{hardness = 6;
		setLightLevel(0.7F);}
		else if (block == ModBlocks.BLUE_COREROCK || block == ModBlocks.BLUE_COREROCK_COAL || block == ModBlocks.BLUE_COREROCK_SULFUR || block == ModBlocks.BLUE_COREROCK_REDSTONE || block == ModBlocks.BLUE_COREROCK_LAPIS
				|| block == ModBlocks.BLUE_COREROCK_IRON || block == ModBlocks.BLUE_COREROCK_SILVER || block == ModBlocks.BLUE_COREROCK_GOLD || block == ModBlocks.BLUE_COREROCK_PLATINUM
				|| block == ModBlocks.BLUE_COREROCK_EMERALD || block == ModBlocks.BLUE_COREROCK_SAPHIR || block == ModBlocks.BLUE_COREROCK_FLAMING_TOPAZ || block == ModBlocks.BLUE_COREROCK_RUBY
				|| block == ModBlocks.BLUE_COREROCK_TOPAZ || block == ModBlocks.BLUE_COREROCK_DIAMOND || block == ModBlocks.BLUE_COREROCK_JADE || block == ModBlocks.BLUE_COREROCK_AMAZONITE || block == ModBlocks.BLUE_COREROCK_AMETHYST || block == ModBlocks.BLUE_COREROCK_ONYX || block == ModBlocks.BLUE_COREROCK_AZURITE)
		{hardness = 7;
		setLightLevel(0.8F);}
		else
		{hardness = -1;}

		if (block == ModBlocks.GOLD_ORE || block == ModBlocks.SULFUR_ORE || block == ModBlocks.SILVER_ORE
				|| block == ModBlocks.STIFFROCK_GOLD || block == ModBlocks.STIFFROCK_LAPIS || block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.STIFFROCK_SILVER || block == ModBlocks.STIFFROCK_SULFUR
				|| block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.HARDROCK_SILVER || block == ModBlocks.HARDROCK_SULFUR
				|| block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.REDROCK_SILVER || block == ModBlocks.REDROCK_SULFUR
				|| block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.MANTLEROCK_SILVER || block == ModBlocks.MANTLEROCK_SULFUR
				|| block == ModBlocks.LOWER_MANTLEROCK_GOLD || block == ModBlocks.LOWER_MANTLEROCK_LAPIS || block == ModBlocks.LOWER_MANTLEROCK_REDSTONE || block == ModBlocks.LOWER_MANTLEROCK_SILVER || block == ModBlocks.LOWER_MANTLEROCK_SULFUR
				|| block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_SULFUR
				|| block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_SULFUR
				|| block == ModBlocks.BLUE_COREROCK_GOLD || block == ModBlocks.BLUE_COREROCK_LAPIS || block == ModBlocks.BLUE_COREROCK_REDSTONE || block == ModBlocks.BLUE_COREROCK_SILVER || block == ModBlocks.BLUE_COREROCK_SULFUR
				|| block == ModBlocks.COREROCK_IRON || block == ModBlocks.INNERCOREROCK_IRON || block == ModBlocks.BLUE_COREROCK_IRON
				|| block == ModBlocks.COREROCK_COAL || block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.BLUE_COREROCK_COAL)
		{tier = 1;}
		else if (block == ModBlocks.PLATINUM_ORE || block == ModBlocks.STIFFROCK_PLATINUM || block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.LOWER_MANTLEROCK_PLATINUM || block == ModBlocks.COREROCK_PLATINUM || block == ModBlocks.INNERCOREROCK_PLATINUM || block == ModBlocks.BLUE_COREROCK_PLATINUM
				|| block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_EMERALD || block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_EMERALD || block == ModBlocks.BLUE_COREROCK_EMERALD)
		{tier = 2;}
		else if (block == ModBlocks.JADE_ORE || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.REDROCK_JADE || block == ModBlocks.MANTLEROCK_JADE || block == ModBlocks.LOWER_MANTLEROCK_JADE || block == ModBlocks.COREROCK_JADE || block == ModBlocks.INNERCOREROCK_JADE || block == ModBlocks.BLUE_COREROCK_JADE)
		{tier = 2;}
		else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR || block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_SAPHIR || block == ModBlocks.BLUE_COREROCK_SAPHIR)
		{tier = 3;}
		else if (block == ModBlocks.TOPAZ_ORE || block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.MANTLEROCK_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_TOPAZ || block == ModBlocks.COREROCK_TOPAZ || block == ModBlocks.INNERCOREROCK_TOPAZ || block == ModBlocks.BLUE_COREROCK_TOPAZ)
		{tier = 3;}
		else if (block == ModBlocks.FLAMING_TOPAZ_ORE || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.COREROCK_FLAMING_TOPAZ || block == ModBlocks.INNERCOREROCK_FLAMING_TOPAZ || block == ModBlocks.BLUE_COREROCK_FLAMING_TOPAZ)
		{tier = 3;}
		else if (block == ModBlocks.RUBY_ORE || block == ModBlocks.STIFFROCK_RUBY || block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.LOWER_MANTLEROCK_RUBY || block == ModBlocks.COREROCK_RUBY || block == ModBlocks.INNERCOREROCK_RUBY || block == ModBlocks.BLUE_COREROCK_RUBY)
		{tier = 4;}
		else if (block == ModBlocks.DIAMOND_ORE || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.LOWER_MANTLEROCK_DIAMOND || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_DIAMOND || block == ModBlocks.BLUE_COREROCK_DIAMOND)
		{tier = 5;}
		else if (block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.LOWER_MANTLEROCK_AMAZONITE || block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMAZONITE || block == ModBlocks.BLUE_COREROCK_AMAZONITE)
		{tier = 6;}
		else if (block == ModBlocks.AMETHYST_ORE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.MANTLEROCK_AMETHYST || block == ModBlocks.LOWER_MANTLEROCK_AMETHYST || block == ModBlocks.COREROCK_AMETHYST || block == ModBlocks.INNERCOREROCK_AMETHYST || block == ModBlocks.BLUE_COREROCK_AMETHYST)
		{tier = 6;}
		else if (block == ModBlocks.AZURITE_ORE || block == ModBlocks.STIFFROCK_AZURITE || block == ModBlocks.HARDROCK_AZURITE || block == ModBlocks.REDROCK_AZURITE || block == ModBlocks.MANTLEROCK_AZURITE || block == ModBlocks.LOWER_MANTLEROCK_AZURITE || block == ModBlocks.COREROCK_AZURITE || block == ModBlocks.INNERCOREROCK_AZURITE || block == ModBlocks.BLUE_COREROCK_AZURITE
				|| block == ModBlocks.ONYX_ORE || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.LOWER_MANTLEROCK_ONYX || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.INNERCOREROCK_ONYX || block == ModBlocks.BLUE_COREROCK_ONYX)
		{tier = 7;}
		else if (block == ModBlocks.IRON_ORE || block == ModBlocks.STIFFROCK_IRON || block == ModBlocks.HARDROCK_IRON || block == ModBlocks.REDROCK_IRON || block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.LOWER_MANTLEROCK_IRON
				|| block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_IRON)
		{tier = 0;}

	}



	@Override
	public Item getItemDropped(IBlockState state, Random random, int l)
	{
		Block block = this;

		if (block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_EMERALD)
		{return new ItemStack(Items.EMERALD, (int) (1), 0).getItem();}
		else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR)
		{return new ItemStack(ModItems.SAPHIR, (int) (1), 0).getItem();}
		else if (block == ModBlocks.FLAMING_TOPAZ_ORE || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_FLAMING_TOPAZ)
		{return new ItemStack(ModItems.FLAMING_TOPAZ, (int) (1), 0).getItem();}
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
		else if (block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.STIFFROCK_LAPIS || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.LOWER_MANTLEROCK_LAPIS || block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_LAPIS || block == ModBlocks.BLUE_COREROCK_LAPIS)
		{return Items.DYE;}

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
		else if (block == ModBlocks.STIFFROCK_LAPIS)
		{
			return 3;
		}
		else if (block == ModBlocks.HARDROCK_LAPIS)
		{
			return 4;
		}
		else if (block == ModBlocks.REDROCK_LAPIS)
		{
			return 8;
		}
		else if (block == ModBlocks.MANTLEROCK_LAPIS)
		{
			return 12;
		}
		else if (block == ModBlocks.LOWER_MANTLEROCK_LAPIS)
		{
			return 16;
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
			else if (block == ModBlocks.STIFFROCK_LAPIS) {
				for (int i = 0; i < 3; i++) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				}
			} else if (block == ModBlocks.HARDROCK_LAPIS) {
				for (int i = 0; i < 4; i++) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				}
			} else if (block == ModBlocks.REDROCK_LAPIS) {
				for (int i = 0; i < 8; i++) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				}
			} else if (block == ModBlocks.MANTLEROCK_LAPIS) {
				for (int i = 0; i < 12; i++) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				}
			} else if (block == ModBlocks.LOWER_MANTLEROCK_LAPIS) {
				for (int i = 0; i < 16; i++) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
				}
			}
		}
		return super.removedByPlayer(state, world, pos, entity, willHarvest);
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
	public int damageDropped(IBlockState state) {
		Block block = this;
		if (block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.STIFFROCK_LAPIS || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.LOWER_MANTLEROCK_LAPIS || block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_LAPIS || block == ModBlocks.BLUE_COREROCK_LAPIS) {
			return 4;
		}
		return super.damageDropped(state);
	}

}
	

