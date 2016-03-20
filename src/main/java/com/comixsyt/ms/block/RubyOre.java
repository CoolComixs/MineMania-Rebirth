package com.comixsyt.ms.block;

import java.util.Random;

import com.comixsyt.ms.ms;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RubyOre extends Block {

	public RubyOre(Material material) {
		super(material);
		this.setHardness(1.5F);
		this.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int Fortune){
		return ms.Ruby;
	}
	
	
/*	@Override
	public int quantityDropped(Random rand){
		return 1;
		
	}*/
	
}
