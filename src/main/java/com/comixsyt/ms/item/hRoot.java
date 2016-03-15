package com.comixsyt.ms.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class hRoot extends ItemFood {

	public hRoot(int i, float f, boolean b) {
		super((int) f, b);
		//I wonder why the set effect can only set 1, fixed bellow with add effect.
		//this.setPotionEffect(Potion.moveSpeed.id, 30, 3, 1.0F);
		//this.setPotionEffect(Potion.jump.id, 30, 3, 1.0F);
		//this.setPotionEffect(Potion.resistance.id, 30, 3, 1.0F);

		this.setAlwaysEdible();
		// TODO Auto-generated constructor stub
	}

	protected void onFoodEaten(ItemStack temstack, World world, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.jump.id, 900, 3));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 900, 3));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 900, 3));

		
	}
	
	
}
