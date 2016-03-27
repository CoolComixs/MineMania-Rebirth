package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import cpw.mods.fml.common.registry.*;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;;

public class EntityCC {

	public static void mainRegisrty(){
		registerEntity();
		
	} 
	
	public static void registerEntity(){
		
		createEntity(EntityComixsMob.class, "Comixs_Dev", 0x00ffff, 0xff6699);
		
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
