package com.comixsyt.ms.block;

import java.util.Random;

import com.comixsyt.ms.ms;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BeetCrop extends BlockCrops {

	private IIcon[] iconArray;

	public void registerBlockIcons(IIconRegister iconRegister) {

		this.iconArray = new IIcon[4];

		for (int i = 0; i < this.iconArray.length; i++) {

			this.iconArray[i] = iconRegister.registerIcon("ms:beet" + (i + 1));

		}

	}

	public IIcon getIcon(int side, int metadata){
		
		if (metadata < 7){
			if (metadata == 6){
				metadata = 5;
			}
			return this.iconArray[metadata >> 1];
		}
		return this.iconArray[3];
	}
	
	int quantitydropped (Random random) {
		return 1;
	} 
	
	
	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i() {
		return ms.beetseed;
	}

	/**
	 * crop
	 */
	@Override
	protected Item func_149865_P() {
		return ms.beetrootitem;
	}

}