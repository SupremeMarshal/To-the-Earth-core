package com.SupremeMarshal.ToTheEarthCore.init;



import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;



public class HotLavaFluid extends BlockFluidClassic {

	public HotLavaFluid(String name, Fluid fluid, Material material) {
		super(fluid, material);
		setTranslationKey(name);
		setRegistryName(name);
		
		setLightLevel(1);
		setDensity(600);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	
	public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		
		if (entityIn instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entityIn;
			//no protection = 10 damage each second (without the normal lava damage)
			//Full Amazonite protect 100%
			if (player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) 
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 0.0F);
			}
			//3 piece of Amazonite protect 75%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 2.5F);
			}
			//2 pieces of Amazonite protect 50%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 5F);
			}
			//1 piece of Amazonite protect 25%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 7.5F);
			}
			//3 pieces of Diamond protect 37.5%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 6.25F);
			}
			//2 pieces of Diamond protect 25%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 7.5F);
			}
			//1 piece of Diamond protect 12.5%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() != ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() != ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() != ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() != ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 8.75F);
			}
			//full diamond protect 50%
			else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) 
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 5.0F);
			}
			//3 pieces of diamond and 1 piece of Amazonite protect 62.5%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 3.75F);
			}
			//2 pieces of diamond and amazonite protect 75%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 2.5F);
			}
			//1 piece of Diamond and 3 Piece of Amazonite protect 87.5%
			else if ((player.inventory.armorItemInSlot(3).getItem() == ModItems.DIAMOND_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) || 
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.DIAMOND_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.DIAMOND_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.AMAZONITE_BOOTS) ||
					
					(player.inventory.armorItemInSlot(3).getItem() == ModItems.AMAZONITE_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.AMAZONITE_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.AMAZONITE_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.DIAMOND_BOOTS))
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 1.25F);
			}
			//no protection
			else
			{
				entityIn.attackEntityFrom(DamageSource.CACTUS, 10F);
			}
			
			
		}		
	}
	
	
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

}
