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

	public EnumActionResult onItemUse(EntityPlayer playerin, World world,EnumHand hand,BlockPos pos, EnumFacing facing, float hitz, float hitX, float hitY){
	
		final ItemStack stack = playerin.getHeldItem(hand);
	if (world.isAirBlock(pos)){
		return EnumActionResult.FAIL;
	}else 
		 world.setBlockState(pos, Blocks.MYCELIUM.getDefaultState());
		 stack.func_190920_e(stack.func_190916_E()-1);
		 return EnumActionResult.SUCCESS;
	
	}
	
}

