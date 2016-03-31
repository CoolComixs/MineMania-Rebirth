package com.comixsyt.ms.entityrenderer;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderKillerCow extends RenderCow {

	public RenderKillerCow(ModelCow modelCow, float par2) {
		super(modelCow, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return new ResourceLocation("ms:textures/entity/Killer_Cow.png");
	}

}