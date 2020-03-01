package jayden.mod.objects.armour;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTriviaArmour extends ModelBiped
{
	public ModelRenderer hat;
    public ModelRenderer shape17;

    public ModelTriviaArmour() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.hat = new ModelRenderer(this, 74, 0);
        this.hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat.addBox(-5.7F, -9.0F, -4.0F, 12, 1, 8, 1.0F);
        this.shape17 = new ModelRenderer(this, 62, 22);
        this.shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape17.addBox(-9.6F, -7.7F, -7.0F, 20, 1, 14, 0.0F);
        
        this.bipedHead.addChild(hat);
        this.bipedHead.addChild(shape17);
      
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
