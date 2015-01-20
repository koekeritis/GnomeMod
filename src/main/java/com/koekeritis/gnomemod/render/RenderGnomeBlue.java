package com.koekeritis.gnomemod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.koekeritis.gnomemod.entities.mobs.EntityGnomeBlue;
import com.koekeritis.gnomemod.reference.Reference;
import com.koekeritis.gnomemod.render.models.EntityGnomeModel1;

public class RenderGnomeBlue extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/GnomeTextureBlue.png");

	protected EntityGnomeModel1 model;

	public RenderGnomeBlue(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityGnomeBlue entity) {
		return texture;
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityGnomeBlue)entity);
	}
		
}
