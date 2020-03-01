package com.victor.HystelMC.renders;

import com.victor.HystelMC.HystelMCRegistries;
import com.victor.HystelMC.entities.UnknownCow;
import com.victor.HystelMC.models.UnknownCowModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class UnknownCowRender extends LivingRenderer<UnknownCow, UnknownCowModel>
{
    public UnknownCowRender(EntityRendererManager manager)
    {
        super(manager, new UnknownCowModel(), 0f);
    }


    @Override
    protected ResourceLocation getEntityTexture(UnknownCow entity)
    {
        return HystelMCRegistries.location("textures/entity/unknown_cow.png");
    }

    public static class RenderFactory implements IRenderFactory<UnknownCow>
    {
        @Override
        public EntityRenderer<? super UnknownCow> createRenderFor(EntityRendererManager manager)
        {
            return new UnknownCowRender(manager);
        }

    }
}
