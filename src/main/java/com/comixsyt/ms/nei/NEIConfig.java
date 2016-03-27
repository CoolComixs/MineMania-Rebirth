package com.comixsyt.ms.nei;

import com.comixsyt.ms.gui.GuiGrinder;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEIConfig implements IConfigureNEI {

	@Override
	public void loadConfig() {

		API.registerRecipeHandler(new GrinderRecipeHandler());
		API.registerUsageHandler(new GrinderRecipeHandler());
		API.setGuiOffset(GuiGrinder.class, -2, 1);
		
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "MineManiaRebirth Plugin";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

}
