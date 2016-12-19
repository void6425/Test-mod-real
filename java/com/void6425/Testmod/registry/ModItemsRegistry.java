package com.void6425.Testmod.registry;

import com.void6425.Testmod.Main;
import com.void6425.Testmod.Items.ItemBase;
import com.void6425.Testmod.Items.ItemSporeBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItemsRegistry {
public static ItemBase Testitem;
public static ItemSporeBase TestMushSpore;
	public static void init(){
	Testitem = new ItemBase("testitem");
	Testitem.setCreativeTab(Main.creativetab);
	
	TestMushSpore= new ItemSporeBase("testmushspore");
	
	
	
	
}
public static void register(){
	registerItem(Testitem);
	registerItem(TestMushSpore);
}
public static void registerItem(Item item)
{
	GameRegistry.register(item);
	
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
}




}
