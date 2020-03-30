package com.HystelDKL.HystelMC;


import com.HystelDKL.HystelMC.init.HystelBlocks;
import com.HystelDKL.HystelMC.init.HystelItems;
import com.HystelDKL.HystelMC.init.ItemInit;
import com.HystelDKL.HystelMC.world.gen.OreGeneration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("hm")
@Mod.EventBusSubscriber(modid = HystelMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HystelMC
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "hm";
    public static HystelMC instance;

    public HystelMC() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        HystelItems.ITEMS.register(modEventBus);
        HystelBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();

        HystelBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(HystelTab.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);

        });

        LOGGER.debug("Hi this is HystelMC, Deferred Items have been registered with BlockItems!");
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
        OreGeneration.generateOre();
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    public static class HystelTab extends ItemGroup
    {
        public static final HystelTab instance = new HystelTab(ItemGroup.GROUPS.length, "hysteltab");

        private HystelTab(int index, String label)
        {
            super(index,label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.bluestone_ingot);
        }
    }



}
