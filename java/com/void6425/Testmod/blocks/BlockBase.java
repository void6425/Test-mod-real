package com.void6425.Testmod.blocks;

import com.void6425.Testmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block{
protected String name;

public BlockBase(Material material)
{
	super(material);
}

public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
{
    return new ItemStack(this);
}


}
