package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import cpw.mods.fml.common.registry.*;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;;

public class EntityLG {

	public static void mainRegisrty(){
		registerEntity();
		
	} 
	
	public static void registerEntity(){
		
		createEntity(EntityLegoguy110Mob.class, "Legoguy110_Dev", 0x2E2E2E, 0x960000);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int SpotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ms.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 0, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, SpotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}
	
	
	
	
	
	
}
