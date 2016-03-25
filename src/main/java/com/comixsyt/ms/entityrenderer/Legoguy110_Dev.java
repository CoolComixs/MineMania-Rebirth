package com.comixsyt.ms.entityrenderer;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Legoguy110_Dev extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer Laptop;
    ModelRenderer Backpack;
  
  public Legoguy110_Dev()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 13F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 10, 16);
      Body.addBox(-3F, -6F, -3F, 6, 8, 5);
      Body.setRotationPoint(0F, 19F, 1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 0, 16);
      LeftArm.addBox(0F, -0.5F, -2F, 1, 5, 4);
      LeftArm.setRotationPoint(3F, 14.5F, 1F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 16);
      RightArm.addBox(-1F, -0.5F, -2F, 1, 5, 4);
      RightArm.setRotationPoint(-3F, 14.5F, 1F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 32, 0);
      LeftLeg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      LeftLeg.setRotationPoint(1.5F, 21F, 1F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 32, 0);
      RightLeg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      RightLeg.setRotationPoint(-1.5F, 21F, 1F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      Laptop = new ModelRenderer(this, 52, 0);
      Laptop.addBox(-2.5F, -4.5F, 0F, 5, 9, 1);
      Laptop.setRotationPoint(0F, 16F, 4F);
      Laptop.setTextureSize(64, 32);
      Laptop.mirror = true;
      setRotation(Laptop, 0F, 0F, -0.5205006F);
      Backpack = new ModelRenderer(this, 39, 0);
      Backpack.addBox(-2.5F, -3F, 0F, 5, 6, 1);
      Backpack.setRotationPoint(0F, 16F, 3F);
      Backpack.setTextureSize(64, 32);
      Backpack.mirror = true;
      setRotation(Backpack, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    LeftLeg.render(f5);
    RightLeg.render(f5);
    Laptop.render(f5);
    Backpack.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float f6 = (180F / (float)Math.PI);
    	this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    	this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
