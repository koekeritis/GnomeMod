package com.koekeritis.gnomemod;

import com.koekeritis.gnomemod.entities.mobs.EntityGnomeBlue;
import com.koekeritis.gnomemod.entities.mobs.EntityGnomeGreen;
import com.koekeritis.gnomemod.framework.RegisterEntities;
import com.koekeritis.gnomemod.proxy.IProxy;
import com.koekeritis.gnomemod.reference.Colours;
import com.koekeritis.gnomemod.reference.Reference;
import com.koekeritis.gnomemod.render.RenderGnomeBlue;
import com.koekeritis.gnomemod.render.RenderGnomeGreen;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel1;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel2;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class GnomeMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static GnomeMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//rendering
		RenderingRegistry.registerEntityRenderingHandler(EntityGnomeBlue.class, new RenderGnomeBlue(new EntityGnomeModel1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGnomeGreen.class, new RenderGnomeGreen(new EntityGnomeModel2(), 0));
		
		//entities
		RegisterEntities.createEntity(EntityGnomeBlue.class, "Blue gnome", Colours.blue, Colours.red);
		RegisterEntities.createEntity(EntityGnomeGreen.class, "Green gnome", Colours.darkGreen, Colours.red);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
