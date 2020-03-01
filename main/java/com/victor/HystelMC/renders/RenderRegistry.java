package com.victor.HystelMC.renders;

import com.victor.HystelMC.entities.UnknownCow;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry {

    public static void registryEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(UnknownCow.class, new UnknownCowRender.RenderFactory());
    }

}
