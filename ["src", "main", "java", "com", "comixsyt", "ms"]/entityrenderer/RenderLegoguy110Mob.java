package com.comixsyt.ms.entityrenderer;

import com.comixsyt.ms.entity.EntityLegoguy110Mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderLegoguy110Mob extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation("ms:textures/entity/Legoguy110_Dev.png");
	
	public RenderLegoguy110Mob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityLegoguy110Mob entity) {
		return mobTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityLegoguy110Mob)entity);
	}
	
}