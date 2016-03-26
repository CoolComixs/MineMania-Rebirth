package com.comixsyt.ms.entityrenderer;

import com.comixsyt.ms.entity.EntityComixsMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderComixsMob extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation("ms:textures/entity/ComixsYT_Dev.png");
	
	public RenderComixsMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityComixsMob entity) {
		return mobTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityComixsMob)entity);
	}
	
}