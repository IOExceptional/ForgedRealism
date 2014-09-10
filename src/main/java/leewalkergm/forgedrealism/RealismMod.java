package leewalkergm.forgedrealism;

import leewalkergm.forgedrealism.lib.GuiBuffBar;
import leewalkergm.forgedrealism.lib.ProxyCommon;
import leewalkergm.forgedrealism.lib.References;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
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
    	MinecraftForge.EVENT_BUS.register(new GuiBuffBar(Minecraft.getMinecraft()));
    	
        //Item Initialisation
        //Item itemObject = new ItemObject(909090);


        //Item Registry
        //GameRegistry.registerItem(itemObject, "Name");
    }
}
