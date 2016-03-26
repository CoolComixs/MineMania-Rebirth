package com.comixsyt.ms;

<<<<<<< HEAD
import com.comixsyt.ms.entity.EntityComixsMob;
import com.comixsyt.ms.entity.EntityLegoguy110Mob;
import com.comixsyt.ms.entityrenderer.ComixsYT_Dev;
import com.comixsyt.ms.entityrenderer.Legoguy110_Dev;
import com.comixsyt.ms.entityrenderer.RenderComixsMob;
import com.comixsyt.ms.entityrenderer.RenderLegoguy110Mob;
=======
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.comixsyt.ms.entity.*;
import com.comixsyt.ms.entityrenderer.*;

>>>>>>> 7e1ff8962e50d69e78bd11b1b523f3aee788c29a

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
