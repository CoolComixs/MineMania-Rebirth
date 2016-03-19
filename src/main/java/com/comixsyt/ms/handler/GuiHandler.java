package com.comixsyt.ms.handler;

import com.comixsyt.ms.gui.GuiGrinder;
import com.comixsyt.ms.gui.GuiLiquefier;
import com.comixsyt.ms.inventory.ContainerGrinder;
import com.comixsyt.ms.inventory.ContainerLiquefier;
import com.comixsyt.ms.tile_entity.TileEntityGrinder;
import com.comixsyt.ms.tile_entity.TileEntityLiquefier;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		if(ID == 0){
			TileEntityLiquefier tileEntityFurnace = (TileEntityLiquefier) world.getTileEntity(x, y, z);
			return new ContainerLiquefier(player.inventory, tileEntityFurnace);
		}
		if(ID == 1){
			TileEntityGrinder tileEntityFurnace = (TileEntityGrinder) world.getTileEntity(x, y, z);
			return new ContainerGrinder(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		if(ID == 0){
			TileEntityLiquefier tileEntityTestContainer = (TileEntityLiquefier) world.getTileEntity(x, y, z);
			return new GuiLiquefier(player.inventory, tileEntityTestContainer);
		}
		if(ID == 1){
			TileEntityGrinder tileEntityTestContainer = (TileEntityGrinder) world.getTileEntity(x, y, z);
			return new GuiGrinder(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}
