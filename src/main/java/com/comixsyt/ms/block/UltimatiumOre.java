package com.comixsyt.ms.block;

import java.util.Random;

import com.comixsyt.ms.ms;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class UltimatiumOre extends Block {

	public UltimatiumOre(Material material) {
		super(material);
		this.setHardness(100.0F);
		this.setHarvestLevel("pickaxe", 6);
		
		
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int Fortune){
		return ms.Ultimatium;
	}
	
	
	@Override
	public int quantityDropped(Random rand){
		return 1;
		
	}
	
}
