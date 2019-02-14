package com.SupremeMarshal.ToTheEarthCore.blocks;
import com.SupremeMarshal.ToTheEarthCore.util.handlers.HardnessHandler;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;


import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;

import java.util.Random;


public class LapisBase extends BlockBase
{

    public LapisBase(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(-1.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 2);

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
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.DYE;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 4;
    }

    @Override
    public int quantityDropped(Random random) {
        Block block = this;
        int quantity = 2;
        if (block == ModBlocks.STIFFROCK_LAPIS)
        {
            quantity = 3;
        }
        else if (block == ModBlocks.HARDROCK_LAPIS)
        {
            quantity = 4;
        }
        else if (block == ModBlocks.HARDERROCK_LAPIS)
        {
            quantity = 6;
        }
        else if (block == ModBlocks.REDROCK_LAPIS)
        {
            quantity = 8;
        }
        else if (block == ModBlocks.MANTLEROCK_LAPIS)
        {
            quantity = 12;
        }
        return quantity;
    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        Block block = this;
        if (!world.isRemote) {
            if (block == ModBlocks.STIFFROCK_LAPIS) {
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));             
            } else if (block == ModBlocks.HARDROCK_LAPIS) {
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
            } else if (block == ModBlocks.HARDERROCK_LAPIS) {
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
            } else if (block == ModBlocks.REDROCK_LAPIS) {
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
                world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 1));
            } else if (block == ModBlocks.MANTLEROCK_LAPIS) {
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
            }}
            return super.removedByPlayer(state, world, pos, entity, willHarvest);
        }


    //override getItemDropped() and damageDropped() respectively. one for the item, one for the meta
}
