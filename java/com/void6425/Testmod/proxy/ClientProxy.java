package com.void6425.Testmod.proxy;



import com.void6425.Testmod.registry.ModBlocksRegistry;
import com.void6425.Testmod.registry.ModItemsRegistry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	
	@Override 
	
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
    
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModBlocksRegistry.registerRenders();
        ModItemsRegistry.register();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
   
    
    
  
}
