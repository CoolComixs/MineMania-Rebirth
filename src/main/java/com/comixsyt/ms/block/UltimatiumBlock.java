package com.comixsyt.ms.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UltimatiumBlock extends Block {

	public UltimatiumBlock(Material material) {
		super(material);
		
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 0);
	}

}
