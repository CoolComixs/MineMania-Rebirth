package com.comixsyt.ms;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.comixsyt.ms.entity.*;
import com.comixsyt.ms.entityrenderer.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){

		RenderingRegistry.registerEntityRenderingHandler(EntityLegoguy110Mob.class, new RenderLegoguy110Mob(new Legoguy110_Dev(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityComixsMob.class, new RenderComixsMob(new ComixsYT_Dev(), 0));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
