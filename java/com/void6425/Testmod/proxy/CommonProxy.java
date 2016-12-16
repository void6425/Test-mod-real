package com.void6425.Testmod.proxy;

import com.void6425.Testmod.registry.ModBlocksRegistry;
import com.void6425.Testmod.registry.ModItemsRegistry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	
	
	public void preInit(FMLPreInitializationEvent e) 
    {
		ModBlocksRegistry.init();
		ModItemsRegistry.init();
        ModBlocksRegistry.register();
    }

    public void init(FMLInitializationEvent e) 
    { 
    	
    
    	
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
   
  
}