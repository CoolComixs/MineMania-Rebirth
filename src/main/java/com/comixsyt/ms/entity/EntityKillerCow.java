package com.comixsyt.ms.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.comixsyt.ms.entityrenderer.KillerMoo;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityKillerCow {
 
    public static void mainRegistry() {
        registerEntity();
       spawnEntity();
    }
    public static void spawnEntity() {
        addSpawn(KillerMoo.class, 100, 1, 5, EnumCreatureType.monster);
    } 
    public static void addSpawn(Class entityClass, int probability, int min, int max, EnumCreatureType type) {
    	for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
    		if (BiomeGenBase.getBiomeGenArray()[i] != null) {
    			EntityRegistry.addSpawn(entityClass, 1, 0, 1, type, BiomeGenBase.forest);
    			EntityRegistry.addSpawn(entityClass, 1, 0, 1, type, BiomeGenBase.birchForest);
    			EntityRegistry.addSpawn(entityClass, 1, 0, 1, type, BiomeGenBase.jungle);
    	    }
    	}
    }
 
    public static void registerEntity() {
    	createEntity(KillerMoo.class, "Killer_Cow", 0xC513D5, 0x3013D5);
    }
 
    public static void createEntity(Class KillerMoo, String entityName, int solidColor, int spotColor) {
    	int entityId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(KillerMoo, entityName, entityId);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, solidColor, spotColor)); 
    }
    }