package com.comixsyt.ms.block;

import java.util.Random;

import com.comixsyt.ms.ms;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Graphiteblock extends Block {

	
	public Graphiteblock(Material material) {
		super(material);
		this.setHardness(10.0F);
		this.setHarvestLevel("pickaxe", 2);	
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int Fortune){
		return ms.Graphite;
	}
	
	
	@Override
	public int quantityDropped(Random rand){
		return 4;
		
	}
	
	
}
