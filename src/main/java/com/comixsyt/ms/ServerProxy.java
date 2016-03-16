package com.comixsyt.ms;


import com.comixsyt.ms.handler.GuiHandler;
import com.comixsyt.ms.tile_entity.TileEntityLiquefier;


import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {

	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(ms.modInstance, new GuiHandler());
        //NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());


		
	}

	public void registerTileEntities(){
		//GameRegistry.registerTileEntity(TileEntityLiquefier.class, "msTileEntityLiquefier");
		GameRegistry.registerTileEntity(TileEntityLiquefier.class, "msTileEntityLiquefier");
		
		
	}
}