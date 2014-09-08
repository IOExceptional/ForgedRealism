package com.gmail.leewalkergm.realism;

import net.minecraftforge.common.MinecraftForge;

import com.gmail.leewalkergm.realism.lib.ProxyCommon;
import com.gmail.leewalkergm.realism.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = References.MODID, version = References.VERSION)
public class RealismMod
{
    @SidedProxy(clientSide = References.Client, serverSide = References.Common)
	
    public static ProxyCommon Proxy;
    private static EventHandlers _eventHandlers;
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Proxy.regiserRenderInformation();
        MinecraftForge.EVENT_BUS.register(_eventHandlers);
    }
    
    public RealismMod()
    {
        _eventHandlers = new EventHandlers();
    	registerItems();
    }

    private void registerItems() 
    {
        //Item Initialisation
        //Item itemObject = new ItemObject(909090);


        //Item Registry
        //GameRegistry.registerItem(itemObject, "Name");
    }
}
