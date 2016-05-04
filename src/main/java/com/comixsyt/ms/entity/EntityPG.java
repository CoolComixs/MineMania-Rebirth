package com.comixsyt.ms.entity;

import com.comixsyt.ms.ms;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;;

public class EntityPG {

	public static void mainRegisrty(){
		registerEntity();
		
	} 
	
	public static void registerEntity(){
		
		createEntity(EntityPanguin.class, "Penguin", 0x000000, 0xFFFFFF);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int SpotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ms.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 5, 2, 9, EnumCreatureType.creature, BiomeGenBase.icePlains);
		EntityRegistry.addSpawn(entityClass, 5, 1, 3, EnumCreatureType.creature, BiomeGenBase.iceMountains);
		//EntityRegistry.addSpawn(entityClass, 1, 1, 5, EnumCreatureType.creature, BiomeGenBase.Biome);
		
		createEgg(randomId, solidColor, SpotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}
	
	
	
	
	
}
