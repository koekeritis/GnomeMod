package com.koekeritis.gnomemod.framework;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.koekeritis.gnomemod.GnomeMod;

import cpw.mods.fml.common.registry.EntityRegistry;

public class RegisterEntities {
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, GnomeMod.instance, 64, 1, true);
		
		createEgg(randomID, solidColor, spotColor);
	}	

	private static void createEgg(int randomID, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColor, spotColor));
	}
	
}
