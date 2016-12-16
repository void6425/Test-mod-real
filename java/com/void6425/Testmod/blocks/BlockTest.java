package com.void6425.Testmod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends BlockBase {
	public BlockTest(){
    super(Material.IRON);
	setRegistryName("testblock");
	setUnlocalizedName("testblock");
	setHarvestLevel("pickaxe", 2);
	setHardness(2.0F);
	setResistance(10F);
	
	}
}
