package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.comixsyt.ms.*;

public class EntityLegoguy110Mob extends EntityAnimal {

	public EntityLegoguy110Mob(World par1World) {
		super(par1World);
		this.setSize(0.9F, 0.9F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.7D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
		this.tasks.addTask(2, new EntityAITempt(this, 1.0D, ms.Ruby, false));
		this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D)); 
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
	    public boolean isBreedingItem(ItemStack p_70877_1_)
	    {
	        return p_70877_1_ != null && p_70877_1_.getItem() == ms.Ruby;
	    }

	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return new EntityLegoguy110Mob(worldObj);
	}

}
