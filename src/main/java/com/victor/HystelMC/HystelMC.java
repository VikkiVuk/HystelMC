package com.victor.HystelMC;

import com.victor.HystelMC.config.Config;
import com.victor.HystelMC.items.RainbowGem;
import com.victor.HystelMC.world.gen.OreGeneration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.client.renderer.entity.model.MinecartModel;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.item.*;
import net.minecraft.util.datafix.fixes.MinecartEntityTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.victor.HystelMC.Blocks.BlockBluestone;
import com.victor.HystelMC.Blocks.BlockCopper;
import com.victor.HystelMC.Blocks.BlockResta;
import com.victor.HystelMC.Blocks.BlockRuby;
import com.victor.HystelMC.Blocks.Chairsy;
import com.victor.HystelMC.Init.BlockInit;
import com.victor.HystelMC.Init.ItemInit;
import com.victor.HystelMC.items.BluestoneIngot;
import com.victor.HystelMC.items.CopperIngoty;
import com.victor.HystelMC.items.Ruby;
import com.victor.HystelMC.materials.HystelMCArmorMaterials;
import com.victor.HystelMC.setup.ClientProxy;
import com.victor.HystelMC.setup.IProxy;
import com.victor.HystelMC.setup.ModSetup;
import com.victor.HystelMC.setup.ServerProxy;

import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("hm")
public class HystelMC {

    public static HystelMC instance;

    public static final String MOD_ID = "hm";
    
    public static ModSetup setup = new ModSetup();
    
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
    public HystelMC() 
    {
        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER, "hystelmc-server.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT, "hystelmc-client.toml");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("hystelmc-client.toml").toString());
        Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("hystelmc-server.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) 
    {
        OreGeneration.setupOreGeneration();
        LOGGER.info("Setup method registered.");
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)

}
