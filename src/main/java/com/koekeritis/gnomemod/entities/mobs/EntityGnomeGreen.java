package com.koekeritis.gnomemod.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityGnomeGreen extends EntityAnimal{
	

	public EntityGnomeGreen(World par1World) {
		super(par1World);
		this.setSize(.7F, 1.7F);
		
		//navigator
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setCanSwim(true);
		this.getNavigator().setEnterDoors(true);
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        
        //tasks
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.6D, 0.6D));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(5, new EntityAIWatchClosest2(this, EntityGnomeGreen.class, 5.0F, 0.02F));
        this.tasks.addTask(5, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(6, new EntityAIPanic(this, 0.8D));
        this.tasks.addTask(7, new EntityAITempt(this, 0.6D, Items.gold_ingot, false));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0F);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}
	
    public boolean allowLeashing() {
        return true;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return null;
	}	
}


