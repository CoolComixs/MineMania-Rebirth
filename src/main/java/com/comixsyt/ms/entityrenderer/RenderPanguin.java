package com.comixsyt.ms.entityrenderer;

import com.comixsyt.ms.entity.EntityLegoguy110Mob;
import com.comixsyt.ms.entity.EntityPanguin;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPanguin extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation("ms:textures/entity/Panguin.png");
	
	public RenderPanguin(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityPanguin entity) {
		return mobTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPanguin)entity);
	}
	
}