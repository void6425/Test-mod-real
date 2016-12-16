package com.void6425.Testmod.tabs;

import com.void6425.Testmod.References;
import com.void6425.Testmod.registry.ModItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TestTab extends CreativeTabs {
	public TestTab(){
		super(References.MODID);
	}

	@Override
	public ItemStack getTabIconItem(){
		return new ItemStack(ModItemsRegistry.Testitem);
	}
	
	
}
