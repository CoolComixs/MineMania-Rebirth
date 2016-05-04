package com.comixsyt.ms;

import com.comixsyt.ms.entity.EntityComixsMob;
import com.comixsyt.ms.entity.EntityLegoguy110Mob;
import com.comixsyt.ms.entity.EntityPanguin;
import com.comixsyt.ms.entityrenderer.ComixsYT_Dev;
import com.comixsyt.ms.entityrenderer.KillerMoo;
import com.comixsyt.ms.entityrenderer.Legoguy110_Dev;
import com.comixsyt.ms.entityrenderer.RenderComixsMob;
import com.comixsyt.ms.entityrenderer.RenderKillerCow;
import com.comixsyt.ms.entityrenderer.RenderLegoguy110Mob;
import com.comixsyt.ms.entityrenderer.RenderPanguin;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){

		RenderingRegistry.registerEntityRenderingHandler(EntityLegoguy110Mob.class, new RenderLegoguy110Mob(new Legoguy110_Dev(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityComixsMob.class, new RenderComixsMob(new ComixsYT_Dev(), 0));
		RenderingRegistry.registerEntityRenderingHandler(KillerMoo.class, new RenderKillerCow(new ModelCow(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanguin.class, new RenderPanguin(new ModelChicken(), 0));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
