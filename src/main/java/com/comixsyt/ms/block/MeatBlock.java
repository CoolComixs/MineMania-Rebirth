package com.comixsyt.ms.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MeatBlock extends Block {

	public MeatBlock(Material material) {
		super(material);
		this.setHardness(0.25F); //Took me forever to get a good value :/
	}

}
