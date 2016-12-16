package com.void6425.Testmod;

import javax.annotation.Resources;

import com.void6425.Testmod.proxy.CommonProxy;
import com.void6425.Testmod.tabs.TestTab;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID,name = References.NAME,version = References.VERSION)

public class Main {
    //public GuiHandler guiHandler = new GuiHandler();
	public static final TestTab creativetab = new TestTab();
	
	
	
	
	@SidedProxy(clientSide= References.ClientProxy, serverSide= References.CommonProxy)
	public static CommonProxy proxy;
	
    
    @Instance   
	public static Main instance = new Main();
	
	
    
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {


    	proxy.preInit(e); 
		
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
        proxy.postInit(e);
    }

       
        
    }

