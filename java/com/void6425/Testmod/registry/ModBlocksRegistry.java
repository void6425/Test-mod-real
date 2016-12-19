package com.void6425.Testmod.registry;

import com.void6425.Testmod.Main;
import com.void6425.Testmod.blocks.BlockCounter;
import com.void6425.Testmod.blocks.BlockMyceliumBase;
import com.void6425.Testmod.blocks.BlockTest;
import com.void6425.Testmod.blocks.BlockTileEntity;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocksRegistry {

	public static Block TestBlock;
	public static Block ChestPlus;
	public static Block CustMy;

	public static void init() {
		// Ores
		TestBlock = new BlockTest();
		TestBlock.setCreativeTab(Main.creativetab);

		ChestPlus = new BlockCounter();
		ChestPlus.setCreativeTab(Main.creativetab);

		CustMy = new BlockMyceliumBase();
		CustMy.setCreativeTab(Main.creativetab);
	}

	public static void register() {
		// Ores
		registerBlock(TestBlock);
		registerBlock(ChestPlus);
		registerBlock(CustMy);
	}

	public static void registerRenders() {
		// Ores
		registerRender(TestBlock);
		registerRender(ChestPlus);
		registerRender(CustMy);
	}

	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);

		if (block instanceof BlockTileEntity) {
			GameRegistry.registerTileEntity(((BlockTileEntity<?>) block).getTileEntityClass(),
					block.getRegistryName().toString());
		}
	}

}
