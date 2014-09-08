/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gmail.leewalkergm.realism;

import java.util.HashMap;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;

/**
 *
 * @author lee
 */
public class RealismPlayerManager 
{
    private HashMap<UUID, RealismPlayer> _players;
    
    public RealismPlayerManager() 
    {
        _players = new HashMap<UUID, RealismPlayer>();
        
        //TODO: Load old players?
    }
    
    public RealismPlayer GetRealismPlayer(EntityPlayer player)
    {
        UUID uniqueId = player.getUniqueID();
        if(!_players.containsKey(uniqueId))
        {
            RegisterPlayer(uniqueId, player);
        }
        return _players.get(uniqueId);
    }

    private void RegisterPlayer(UUID uniqueId, EntityPlayer player) 
    {
    	RealismPlayer plr = new RealismPlayer(player);
        _players.put(uniqueId, plr);
        System.out.println("Player: " + plr.getUsername() + " has been added.");
    }
    
}
