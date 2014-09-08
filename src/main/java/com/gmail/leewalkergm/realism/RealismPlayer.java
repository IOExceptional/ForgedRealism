/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gmail.leewalkergm.realism;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

/**
 *
 * @author lee
 */
class RealismPlayer
{
    private final EntityPlayer _player;
    
    private int _temperature;
	private int _hydration;

    public RealismPlayer(EntityPlayer player) 
    {
        _player = player;
        _temperature = 36;
        _hydration = 35;
    }
    
    public String getUsername()
    {
    	String username = "----";
    	if(_player instanceof EntityPlayerMP)
    	{
    		username = ((EntityPlayerMP)_player).getDisplayName();
    	}
    	return username;
    }

    public int getTemperature()
    {
    	return _temperature;
    }
    
    public int getHydration()
    {
    	return _hydration;
    }
    
    public EntityPlayer GetEntityPlayer()
    {
    	return _player;
    }
    
    public String GetBiome()
    {
    	String biome = "";
    	BiomeGenBase biomeGen;
    	try
    	{
    		World world = _player.worldObj;
    		if(world == null)
    		{
    			System.out.println("World is null.");
    		}
    		WorldChunkManager manager = world.getWorldChunkManager();
    		if(manager == null)
    		{
    			System.out.println("World chunk manager is null.");
    		}
    		System.out.println("Allowed biomes: " + manager.allowedBiomes.size());
    		biomeGen = manager.getBiomeGenAt((int)_player.posX, (int)_player.posZ);
    		biome = biomeGen.biomeName;
    	}
    	catch(NullPointerException ex)
    	{
    		ex.printStackTrace();
    	}
    	
    	return biome;
    }
}
