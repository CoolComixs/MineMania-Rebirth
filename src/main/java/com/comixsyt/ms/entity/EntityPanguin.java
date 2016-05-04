package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPanguin extends EntityChicken {

	public EntityPanguin(World par1World) {
		super(par1World);
		this.setSize(0.9F, 0.9F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.2D));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.5D));
		this.tasks.addTask(2, new EntityAITempt(this, 0.2D, ms.Ruby, false));
		this.tasks.addTask(3, new EntityAIMate(this, 0.5D));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 0.5D));
		this.tasks.addTask(5, new EntityAISwimming(this));
	}

	 public boolean isAIEnabled()
	    {
	        return true;
	    }
	 protected void updateAITasks()
	    {
	        super.updateAITasks();
	    }
	 
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
	    }
	    
	    public void onLivingUpdate()
	    {
	        super.onLivingUpdate();
	        this.field_70888_h = this.field_70886_e;
	        this.field_70884_g = this.destPos;
	        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);

	        if (this.destPos < 0.0F)
	        {
	            this.destPos = 0.0F;
	        }

	        if (this.destPos > 1.0F)
	        {
	            this.destPos = 1.0F;
	        }

	        if (!this.onGround && this.field_70889_i < 1.0F)
	        {
	            this.field_70889_i = 1.0F;
	        }

	        this.field_70889_i = (float)((double)this.field_70889_i * 0.9D);

	        if (!this.onGround && this.motionY < 0.0D)
	        {
	            this.motionY *= 0.6D;
	        }

	        this.field_70886_e += this.field_70889_i * 2.0F;

	        if (!this.worldObj.isRemote && !this.isChild() && !this.func_152116_bZ() && --this.timeUntilNextEgg <= 0)
	        {
	            this.playSound("", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
	            this.dropItem(Items.egg, 1);
	            this.timeUntilNextEgg = this.rand.nextInt(60) + 60;
	        }
	    }

	    public boolean isBreedingItem(ItemStack p_70877_1_)
	    {
	        return p_70877_1_ != null && p_70877_1_.getItem() == ms.Ruby;
	    } 
	   
	@Override
	public EntityChicken createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return new EntityPanguin(worldObj);
	}

}

