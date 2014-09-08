package com.gmail.leewalkergm.realism;

import java.util.HashMap;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;

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
    }

    public void AddPlayer(EntityPlayer entityPlayer) 
    {
        RealismPlayer plr = _manager.GetRealismPlayer(entityPlayer);
    }
}
