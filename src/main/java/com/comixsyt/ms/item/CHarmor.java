package com.comixsyt.ms.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CHarmor extends ItemArmor {

	public CHarmor(ArmorMaterial armorMaterial, int RenderIndex, int armorType) {
		super(armorMaterial, RenderIndex, armorType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			
			return "ms:textures/models/armor/chainleather_layer2.png";
			
		}
		return "ms:textures/models/armor/chainleather_layer1.png";
		
	}
	
}
