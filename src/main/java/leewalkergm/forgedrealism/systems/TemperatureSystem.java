package leewalkergm.forgedrealism.systems;

import leewalkergm.forgedrealism.RealismPlayer;
import leewalkergm.forgedrealism.RealismPlayerManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;

public  class TemperatureSystem 
{
    private final RealismPlayerManager _manager;
    
    public TemperatureSystem(RealismPlayerManager manager)
    {
        _manager = manager;
    }
    
    public void UpdatePlayer(EntityPlayer entityPlayer) 
    {
        RealismPlayer plr = _manager.GetRealismPlayer(entityPlayer);
        
        int temp = plr.getTemperature();
        String biome = plr.GetBiome();
        
        //System.out.println("Current biome: " + biome + ", current temp: " + temp);        
    }

    public void AddPlayer(EntityPlayer entityPlayer) 
    {
        RealismPlayer plr = _manager.GetRealismPlayer(entityPlayer);
    }
}
