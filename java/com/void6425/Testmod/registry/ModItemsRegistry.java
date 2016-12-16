package com.void6425.Testmod.registry;

import com.void6425.Testmod.Main;
import com.void6425.Testmod.Items.ItemBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItemsRegistry {
public static ItemBase Testitem;
	
	public static void init(){
	Testitem = new ItemBase("testitem");
	Testitem.setCreativeTab(Main.creativetab);
	
	
	
	
}
public static void register(){
	registerItem(Testitem);
}
public static void registerItem(Item item)
{
	GameRegistry.register(item);
	
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
}




}
