package com.koekeritis.gnomemod.proxy;

import java.util.Random;

import com.koekeritis.gnomemod.entities.mobs.EntityGnomeBlue;
import com.koekeritis.gnomemod.entities.mobs.EntityGnomeGreen;
import com.koekeritis.gnomemod.render.RenderGnomeBlue;
import com.koekeritis.gnomemod.render.RenderGnomeGreen;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel1;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel2;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGnomeBlue.class, new RenderGnomeBlue(new EntityGnomeModel1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGnomeGreen.class, new RenderGnomeGreen(new EntityGnomeModel2(), 0));

	}
}
