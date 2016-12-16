package com.void6425.Testmod.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	public ItemBase(String unlocalizedName)
	{
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(CreativeTabs.MATERIALS);
		setRegistryName(unlocalizedName);
	}
}
