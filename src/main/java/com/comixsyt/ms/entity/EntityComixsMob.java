package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityComixsMob extends EntityMob {

	public EntityComixsMob(World par1World) {
		super(par1World);
		this.setSize(0.9F, 0.9F);
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAISwimming(this));
		/*this.tasks.addTask(2, new EntityAITempt(this, 1.0D, ms.Diamondium, false));
		this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));*/
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.5D, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
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
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.5D);
	    }
	    public boolean isBreedingItem(ItemStack p_70877_1_)
	    {
	        return p_70877_1_ != null && p_70877_1_.getItem() == ms.Diamondium;
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        if (super.attackEntityAsMob(p_70652_1_))
	        {
	            if (this.getSkeletonType() == 1 && p_70652_1_ instanceof EntityLivingBase)
	            {
	                ((EntityLivingBase)p_70652_1_).addPotionEffect(new PotionEffect(Potion.wither.id, 200));
	            }

	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	   
	    
	private int getSkeletonType() {
			
			return 0;
		}
/*
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		// TODO Auto-generated method stub
		return new EntityComixsMob(worldObj);
	}
*/
}

