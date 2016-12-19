package com.void6425.Testmod.Items;

import com.void6425.Testmod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSporeBase extends Item {

	public ItemSporeBase(String Name) {
		setUnlocalizedName(Name);
		setCreativeTab(Main.creativetab);
		setRegistryName(Name);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer playerIN, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitZ, float hitX, float hitY) {

		System.out.println("HI");
		final ItemStack stack = playerIN.getHeldItem(hand);
		if (worldIn.isAirBlock(pos)) {
			return EnumActionResult.FAIL;
		} else if (worldIn.getBlockState(pos) == Blocks.GRASS.getDefaultState()) {
			worldIn.setBlockState(pos, Blocks.MYCELIUM.getDefaultState());
			stack.func_190920_e(stack.func_190916_E() - 1);
			return EnumActionResult.SUCCESS;
		} else {
			return EnumActionResult.FAIL;
		}

	}

}
