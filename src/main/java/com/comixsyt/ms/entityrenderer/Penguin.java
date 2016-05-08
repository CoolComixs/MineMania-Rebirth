
package com.comixsyt.ms.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Penguin extends ModelBase
{
  //fields
    ModelRenderer Right_Foot;
    ModelRenderer Left_Foot;
    ModelRenderer Right_Leg;
    ModelRenderer Left_Leg;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Beak;
    ModelRenderer Right_Wing;
    ModelRenderer Left_Wing;
    ModelRenderer Belly;
    ModelRenderer Tail;
  
  public Penguin()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Right_Foot = new ModelRenderer(this, 0, 1);
      Right_Foot.addBox(-1F, 0F, -2F, 2, 0, 2);
      Right_Foot.setRotationPoint(-2F, 24F, 0F);
      Right_Foot.setTextureSize(64, 32);
      Right_Foot.mirror = true;
      setRotation(Right_Foot, 0F, 0F, 0F);
      Left_Foot = new ModelRenderer(this, 0, 1);
      Left_Foot.addBox(-1F, 0F, -2F, 2, 0, 2);
      Left_Foot.setRotationPoint(2F, 24F, 0F);
      Left_Foot.setTextureSize(64, 32);
      Left_Foot.mirror = true;
      setRotation(Left_Foot, 0F, 0F, 0F);
      Right_Leg = new ModelRenderer(this, 9, 1);
      Right_Leg.addBox(-0.5F, 0F, 0F, 1, 3, 0);
      Right_Leg.setRotationPoint(-2F, 21F, 0F);
      Right_Leg.setTextureSize(64, 32);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, 0F);
      Left_Leg = new ModelRenderer(this, 9, 1);
      Left_Leg.addBox(-0.5F, 0F, 0F, 1, 3, 0);
      Left_Leg.setRotationPoint(2F, 21F, 0F);
      Left_Leg.setTextureSize(64, 32);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 20);
      Body.addBox(-3F, 0F, -2.5F, 6, 8, 4);
      Body.setRotationPoint(0F, 13F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 5);
      Head.addBox(-1.5F, -4F, -1.5F, 3, 4, 3);
      Head.setRotationPoint(0F, 13F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Beak = new ModelRenderer(this, 12, 9);
      Beak.addBox(-1F, -0.5F, -2F, 2, 1, 2);
      Beak.setRotationPoint(0F, 11.5F, -2.5F);
      Beak.setTextureSize(64, 32);
      Beak.mirror = true;
      setRotation(Beak, 0F, 0F, 0F);
      Right_Wing = new ModelRenderer(this, 10, 12);
      Right_Wing.addBox(-1F, -0.5F, -2F, 1, 5, 3);
      Right_Wing.setRotationPoint(-3F, 14F, 0.5F);
      Right_Wing.setTextureSize(64, 32);
      Right_Wing.mirror = true;
      setRotation(Right_Wing, 0F, 0F, 0F);
      Left_Wing = new ModelRenderer(this, 10, 12);
      Left_Wing.addBox(0F, -0.5F, -2F, 1, 5, 3);
      Left_Wing.setRotationPoint(3F, 14F, 0.5F);
      Left_Wing.setTextureSize(64, 32);
      Left_Wing.mirror = true;
      setRotation(Left_Wing, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 0, 12);
      Belly.addBox(-1.5F, -3.5F, -1F, 4, 7, 1);
      Belly.setRotationPoint(-0.5F, 17.5F, -2F);
      Belly.setTextureSize(64, 32);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 12, 7);
      Tail.addBox(-2F, 0F, 0F, 4, 1, 1);
      Tail.setRotationPoint(0F, 19F, 1.5F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Right_Foot.render(f5);
    Left_Foot.render(f5);
    Right_Leg.render(f5);
    Left_Leg.render(f5);
    Body.render(f5);
    Head.render(f5);
    Beak.render(f5);
    Right_Wing.render(f5);
    Left_Wing.render(f5);
    Belly.render(f5);
    Tail.render(f5);
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
		this.Left_Leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Right_Leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  }


}
