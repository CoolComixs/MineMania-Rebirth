package com.comixsyt.ms.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Ultimatiumarmor extends ItemArmor {

	public Ultimatiumarmor(ArmorMaterial armorMaterial, int RenderIndex, int armorType) {
		super(armorMaterial, RenderIndex, armorType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			
			return "ms:textures/models/armor/ultimatium_layer_2.png";
			
		}
		return "ms:textures/models/armor/ultimatium_layer_1.png";
		
	}
	
}
