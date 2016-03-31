
package com.comixsyt.ms.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ComixsYT_Dev extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer Shape1;
    ModelRenderer HandleBack;
    ModelRenderer HandleLeft;
    ModelRenderer HandleFront;
    ModelRenderer HandleRight;
    ModelRenderer BackPackBack;
    ModelRenderer BackPack;
    ModelRenderer BackPackRight;
    ModelRenderer BackPackLeft;
    ModelRenderer BackpackBoottem;
  
  public ComixsYT_Dev()
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
      Shape1 = new ModelRenderer(this, 60, 0);
      Shape1.addBox(-0.5F, -11F, -0.5F, 1, 11, 1);
      Shape1.setRotationPoint(0F, 16F, 5.5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      HandleBack = new ModelRenderer(this, 55, 0);
      HandleBack.addBox(-0.5F, -2F, 0F, 1, 4, 1);
      HandleBack.setRotationPoint(0F, 16F, 6F);
      HandleBack.setTextureSize(64, 32);
      HandleBack.mirror = true;
      setRotation(HandleBack, 0F, 0F, 0F);
      HandleLeft = new ModelRenderer(this, 55, 0);
      HandleLeft.addBox(0F, -2F, -0.5F, 1, 4, 1);
      HandleLeft.setRotationPoint(0.5F, 16F, 5.5F);
      HandleLeft.setTextureSize(64, 32);
      HandleLeft.mirror = true;
      setRotation(HandleLeft, 0F, 0F, 0F);
      HandleFront = new ModelRenderer(this, 55, 0);
      HandleFront.addBox(-0.5F, -2F, -1F, 1, 4, 1);
      HandleFront.setRotationPoint(0F, 16F, 5F);
      HandleFront.setTextureSize(64, 32);
      HandleFront.mirror = true;
      setRotation(HandleFront, 0F, 0F, 0F);
      HandleRight = new ModelRenderer(this, 55, 0);
      HandleRight.addBox(-1F, -2F, -0.5F, 1, 4, 1);
      HandleRight.setRotationPoint(-0.5F, 16F, 5.5F);
      HandleRight.setTextureSize(64, 32);
      HandleRight.mirror = true;
      setRotation(HandleRight, 0F, 0F, 0F);
      BackPackBack = new ModelRenderer(this, 32, 17);
      BackPackBack.addBox(-1.5F, -3F, 0F, 3, 6, 1);
      BackPackBack.setRotationPoint(0F, 16F, 7F);
      BackPackBack.setTextureSize(64, 32);
      BackPackBack.mirror = true;
      setRotation(BackPackBack, 0F, 0F, 0F);
      BackPack = new ModelRenderer(this, 41, 0);
      BackPack.addBox(-2.5F, -3F, 0F, 5, 6, 1);
      BackPack.setRotationPoint(0F, 16F, 3F);
      BackPack.setTextureSize(64, 32);
      BackPack.mirror = true;
      setRotation(BackPack, 0F, 0F, 0F);
      BackPackRight = new ModelRenderer(this, 32, 7);
      BackPackRight.addBox(-1F, -3F, -1.5F, 1, 6, 4);
      BackPackRight.setRotationPoint(-1F, 16F, 5F);
      BackPackRight.setTextureSize(64, 32);
      BackPackRight.mirror = true;
      setRotation(BackPackRight, 0F, 0F, 0F);
      BackPackLeft = new ModelRenderer(this, 32, 7);
      BackPackLeft.addBox(0F, -3F, -1.5F, 1, 6, 4);
      BackPackLeft.setRotationPoint(1F, 16F, 5F);
      BackPackLeft.setTextureSize(64, 32);
      BackPackLeft.mirror = true;
      setRotation(BackPackLeft, 0F, 0F, 0F);
      BackpackBoottem = new ModelRenderer(this, 42, 7);
      BackpackBoottem.addBox(-1F, 0F, -2.5F, 2, 1, 5);
      BackpackBoottem.setRotationPoint(0F, 19F, 5F);
      BackpackBoottem.setTextureSize(64, 32);
      BackpackBoottem.mirror = true;
      setRotation(BackpackBoottem, 0F, 0F, 0F);
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
    Shape1.render(f5);
    HandleBack.render(f5);
    HandleLeft.render(f5);
    HandleFront.render(f5);
    HandleRight.render(f5);
    BackPackBack.render(f5);
    BackPack.render(f5);
    BackPackRight.render(f5);
    BackPackLeft.render(f5);
    BackpackBoottem.render(f5);
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
