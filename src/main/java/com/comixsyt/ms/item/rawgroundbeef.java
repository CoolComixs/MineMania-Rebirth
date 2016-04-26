package com.comixsyt.ms.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class rawgroundbeef extends ItemFood {

	public rawgroundbeef(int i, float f, boolean b) {
		super((int) f, b);

	}
	
	protected void onFoodEaten(ItemStack temstack, World world, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 2));


		
	}
	
}
