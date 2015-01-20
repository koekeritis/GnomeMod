package com.koekeritis.gnomemod.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Gnome - koekeritis
 * Created using Tabula 4.1.1
 */
public class EntityGnomeModel1 extends ModelBase {
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer body;
    public ModelRenderer upperBody;
    public ModelRenderer head;
    public ModelRenderer leftArm;
    public ModelRenderer rightArm;
    public ModelRenderer hatStrip1;
    public ModelRenderer beardStripBottom;
    public ModelRenderer beardStripRight;
    public ModelRenderer beardStripTop;
    public ModelRenderer beardStripLeft;
    public ModelRenderer hatStrip2;
    public ModelRenderer hatStrip3;
    public ModelRenderer hatStrip4;
    public ModelRenderer hatStrip5;
    public ModelRenderer hatStrip6;
    public ModelRenderer hatStrip7;
    public ModelRenderer hatStrip8;

    public EntityGnomeModel1() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.beardStripLeft = new ModelRenderer(this, 50, 20);
        this.beardStripLeft.setRotationPoint(-1.0F, -2.0F, -3.0F);
        this.beardStripLeft.addBox(2.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.hatStrip3 = new ModelRenderer(this, 5, 50);
        this.hatStrip3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip3.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.body = new ModelRenderer(this, 0, 15);
        this.body.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.body.addBox(-6.0F, 0.0F, -5.0F, 12, 8, 10, 0.0F);
        this.upperBody = new ModelRenderer(this, 0, 35);
        this.upperBody.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.upperBody.addBox(-5.0F, 0.0F, -4.0F, 10, 3, 8, 0.0F);
        this.head = new ModelRenderer(this, 22, 0);
        this.head.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.head.addBox(-3.5F, -7.0F, -3.5F, 7, 7, 7, 0.0F);
        this.beardStripBottom = new ModelRenderer(this, 47, 20);
        this.beardStripBottom.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.beardStripBottom.addBox(-2.5F, 0.0F, -1.0F, 5, 1, 1, 0.0F);
        this.rightLeg = new ModelRenderer(this, 0, 0);
        this.rightLeg.setRotationPoint(-2.6F, 15.9F, 0.0F);
        this.rightLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.leftLeg = new ModelRenderer(this, 0, 0);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(2.6F, 15.9F, 0.0F);
        this.leftLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.hatStrip2 = new ModelRenderer(this, 5, 50);
        this.hatStrip2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip2.addBox(-3.5F, 0.0F, -3.5F, 7, 1, 7, 0.0F);
        this.hatStrip1 = new ModelRenderer(this, 5, 54);
        this.hatStrip1.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.hatStrip1.addBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F);
        this.beardStripRight = new ModelRenderer(this, 50, 20);
        this.beardStripRight.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.beardStripRight.addBox(-2.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.beardStripTop = new ModelRenderer(this, 47, 20);
        this.beardStripTop.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.beardStripTop.addBox(-2.5F, 0.0F, -1.0F, 5, 1, 1, 0.0F);
        this.hatStrip6 = new ModelRenderer(this, 5, 50);
        this.hatStrip6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip6.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
        this.hatStrip7 = new ModelRenderer(this, 5, 50);
        this.hatStrip7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip7.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.hatStrip5 = new ModelRenderer(this, 5, 50);
        this.hatStrip5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip5.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.hatStrip8 = new ModelRenderer(this, 5, 50);
        this.hatStrip8.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip8.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.leftArm = new ModelRenderer(this, 42, 30);
        this.leftArm.mirror = true;
        this.leftArm.setRotationPoint(3.5F, 6.0F, 0.0F);
        this.leftArm.addBox(0.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotation(leftArm, 0.0F, 0.0F, -0.34557519189487723F);
        this.rightArm = new ModelRenderer(this, 42, 30);
        this.rightArm.setRotationPoint(-3.5F, 6.0F, 0.0F);
        this.rightArm.addBox(-4.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotation(rightArm, 0.0F, 0.0F, 0.34557519189487723F);
        this.hatStrip4 = new ModelRenderer(this, 5, 50);
        this.hatStrip4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hatStrip4.addBox(-2.5F, 0.0F, -2.5F, 5, 1, 5, 0.0F);
        this.head.addChild(this.beardStripLeft);
        this.hatStrip2.addChild(this.hatStrip3);
        this.head.addChild(this.beardStripBottom);
        this.hatStrip1.addChild(this.hatStrip2);
        this.head.addChild(this.hatStrip1);
        this.head.addChild(this.beardStripRight);
        this.head.addChild(this.beardStripTop);
        this.hatStrip5.addChild(this.hatStrip6);
        this.hatStrip6.addChild(this.hatStrip7);
        this.hatStrip4.addChild(this.hatStrip5);
        this.hatStrip7.addChild(this.hatStrip8);
        this.hatStrip3.addChild(this.hatStrip4);
        this.body.addChild(this.upperBody);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
        this.upperBody.render(f5);
        this.head.render(f5);
        this.rightLeg.render(f5);
        this.leftLeg.render(f5);
        this.leftArm.render(f5);
        this.rightArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
     
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	
        float f6 = (180F / (float)Math.PI);
        this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
        
        this.leftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.rightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        
        this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    }
        
}
