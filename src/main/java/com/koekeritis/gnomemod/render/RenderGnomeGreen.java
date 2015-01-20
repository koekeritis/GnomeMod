package com.koekeritis.gnomemod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.koekeritis.gnomemod.entities.mobs.EntityGnomeGreen;
import com.koekeritis.gnomemod.reference.Reference;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel2;


public class RenderGnomeGreen extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/GnomeTextureGreen.png");

	protected EntityGnomeModel2 model;

	public RenderGnomeGreen(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityGnomeGreen entity) {
		return texture;
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityGnomeGreen)entity);
	}
		
}
