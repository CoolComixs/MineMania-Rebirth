package com.comixsyt.ms.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLeafBlocks extends ItemBlock {
	
	public static final String[] leafs = new String[] {"Orange", "Lemon", "Cherry"};
	
	public ItemLeafBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
		
	}
	
	public String getUnlocalisedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= leafs.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + leafs[i];
	}
	
	public int getMedadata (int meda) {
		return meda;
	}

		
}
