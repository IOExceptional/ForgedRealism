/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gmail.leewalkergm.realism;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 *
 * @author lee
 */
public class EventHandlers 
{
    private final Minecraft _minecraft;
    private final TemperatureSystem _tempSystem;
    private final RealismPlayerManager _playerManager;
    
    public EventHandlers()
    {
        _minecraft = FMLClientHandler.instance().getClient();
        _playerManager = new RealismPlayerManager();
        _tempSystem = new TemperatureSystem(_playerManager);
    }
    
    @SubscribeEvent
    public void onPlayerLogIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        _tempSystem.AddPlayer(event.player);
    }
    
    @SubscribeEvent
    public void onPlayerUpdate(LivingUpdateEvent event)
    {
        if(event.entity instanceof EntityPlayer)
        {
            _tempSystem.UpdatePlayer((EntityPlayer)event.entity);
        }
    }
}
