package com.void6425.Testmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMyceliumBase extends Block implements IGrowable {

	public BlockMyceliumBase() {
		super(Material.GRASS);
		setUnlocalizedName("custMy");
		setRegistryName("custMy");

	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {

		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {

		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		if (worldIn.isAirBlock(pos.up())) {
			if (rand.nextInt(2) == 1) {
				worldIn.setBlockState(pos.up(), Blocks.BROWN_MUSHROOM.getDefaultState(), 3);

			} else {
				System.out.println("Nop int");
			}
		} else {
			System.out.println("Nop");
		}
	}

}
