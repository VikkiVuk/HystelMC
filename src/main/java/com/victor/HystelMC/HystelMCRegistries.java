package com.victor.HystelMC;

import com.victor.HystelMC.Blocks.*;
import com.victor.HystelMC.Init.BlockInit;
import com.victor.HystelMC.Init.EntityInit;
import com.victor.HystelMC.Init.ItemInit;
import com.victor.HystelMC.items.*;
import com.victor.HystelMC.materials.HystelMCArmorMaterials;
import com.victor.HystelMC.materials.HystelMCToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class HystelMCRegistries {

    public static final ItemGroup hysteltab = HystelMC.setup.itemGroup;

    public static final Logger LOGGER = HystelMC.LOGGER;

    public static final String MODID = HystelMC.MOD_ID;

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Chairsy());
        event.getRegistry().register(new BlockResta());
        event.getRegistry().register(new BlockBluestone());
        event.getRegistry().register(new BlockRuby());
        event.getRegistry().register(new BlockCopper());
        event.getRegistry().register(new BlockBluestoneOre());
        event.getRegistry().register(new BlockRubyOre());
        event.getRegistry().register(new BlockCopperOre());
        event.getRegistry().register(new BlockRainbowOre());
        event.getRegistry().register(new BlockCGM());
        event.getRegistry().register(new BlockHS());
        event.getRegistry().register(new BlockBC());
        event.getRegistry().register(new BlockTA());
        event.getRegistry().register(new BlockSH());
        event.getRegistry().register(new BlockCB());
        event.getRegistry().register(new BlockSpeaker());
        event.getRegistry().register(new IllusionBlock());
        event.getRegistry().register(new CoffaTable());
        event.getRegistry().register(new KbEnc10());
        event.getRegistry().register(new SharEnc10());



        LOGGER.info("Blocks registered.");
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event)
    {
        Item.Properties properties = new Item.Properties().group(hysteltab);
        event.getRegistry().register(new BlockItem(BlockInit.CHAIRSY, properties).setRegistryName("chairsy"));
        event.getRegistry().register(new BlockItem(BlockInit.CUSTOM_RESTA, properties).setRegistryName("custom_resta"));
        event.getRegistry().register(new BlockItem(BlockInit.BLUESTONE_BLOCK, properties).setRegistryName("bluestone_block"));
        event.getRegistry().register(new BlockItem(BlockInit.RUBY_BLOCK, properties).setRegistryName("ruby_block"));
        event.getRegistry().register(new BlockItem(BlockInit.COPPER_BLOCK, properties).setRegistryName("copper_block"));
        event.getRegistry().register(new BlockItem(BlockInit.bluestone_ore, properties).setRegistryName("bluestone_ore"));
        event.getRegistry().register(new BlockItem(BlockInit.ruby_ore, properties).setRegistryName("ruby_ore"));
        event.getRegistry().register(new BlockItem(BlockInit.copper_ore, properties).setRegistryName("copper_ore"));
        event.getRegistry().register(new BlockItem(BlockInit.rainbow_ore, properties).setRegistryName("rainbow_ore"));
        event.getRegistry().register(new BlockItem(BlockInit.CUSTOM_GLASSY_MOBBLE, properties).setRegistryName("custom_glassy_mobble"));
        event.getRegistry().register(new BlockItem(BlockInit.HYSTEL_SOMETHING, properties).setRegistryName("hystel_something"));
        event.getRegistry().register(new BlockItem(BlockInit.BETTER_CAULDRON, properties).setRegistryName("better_cauldron"));
        event.getRegistry().register(new BlockItem(BlockInit.TOKEN_ATM, properties).setRegistryName("token_atm"));
        event.getRegistry().register(new BlockItem(BlockInit.SANTA_HAT, properties).setRegistryName("santa_hat"));
        event.getRegistry().register(new BlockItem(BlockInit.CUSTOMIZED_BOBBLE, properties).setRegistryName("customized_bobble"));
        event.getRegistry().register(new BlockItem(BlockInit.SPEAKER, properties).setRegistryName("speakers"));
        event.getRegistry().register(new BlockItem(BlockInit.ILLUSION_BLOCK, properties).setRegistryName("custom_block"));
        event.getRegistry().register(new BlockItem(BlockInit.COFFEE_TABLE, properties).setRegistryName("coffee_table"));
        event.getRegistry().register(new BlockItem(BlockInit.KNOCKBACK_ENCHANTER, properties).setRegistryName("knoEnc"));
        event.getRegistry().register(new BlockItem(BlockInit.SHARPNESS_ENCHANTER, properties).setRegistryName("sharEnc"));
        event.getRegistry().register(new BluestoneIngot());
        event.getRegistry().register(new Ruby());
        event.getRegistry().register(new CopperIngoty());
        event.getRegistry().register(new RainbowGem());
        event.getRegistry().registerAll
                (
                        //Miscellaneous
                        ItemInit.UNKNOWN_ITEM = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("unknown_item")),
                        ItemInit.MICROPHONE = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("microphone")),
                        //Tokens
                        ItemInit.iron_token = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("iron_token")),
                        ItemInit.gold_token = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("gold_token")),
                        ItemInit.ruby_token = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_token")),
                        ItemInit.bluestone_token = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_token")),
                        ItemInit.rainbow_token = new Item(new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_token")),
                        //Bluestone
                        ItemInit.bluestone_helmet = new ArmorItem(HystelMCArmorMaterials.bluestone, EquipmentSlotType.HEAD, new Item.Properties().group(hysteltab)).setRegistryName("bluestone_helmet"),
                        ItemInit.bluestone_chestplate = new ArmorItem(HystelMCArmorMaterials.bluestone, EquipmentSlotType.CHEST, new Item.Properties().group(hysteltab)).setRegistryName("bluestone_chestplate"),
                        ItemInit.bluestone_leggings = new ArmorItem(HystelMCArmorMaterials.bluestone, EquipmentSlotType.LEGS, new Item.Properties().group(hysteltab)).setRegistryName("bluestone_leggings"),
                        ItemInit.bluestone_boots = new ArmorItem(HystelMCArmorMaterials.bluestone, EquipmentSlotType.FEET, new Item.Properties().group(hysteltab)).setRegistryName("bluestone_boots"),
                        //Tools
                        ItemInit.bluestone_axe = new CustomAxeItem(HystelMCToolMaterials.bluestone, -1.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_axe")),
                        ItemInit.bluestone_hoe = new HoeItem(HystelMCToolMaterials.bluestone, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_hoe")),
                        ItemInit.bluestone_pickaxe = new CustomPickaxeItem(HystelMCToolMaterials.bluestone, -2, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_pickaxe")),
                        ItemInit.bluestone_shovel = new ShovelItem(HystelMCToolMaterials.bluestone, -3.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_shovel")),
                        ItemInit.bluestone_sword = new SwordItem(HystelMCToolMaterials.bluestone, 0, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("bluestone_sword")),
                        //Ruby
                        ItemInit.ruby_helmet = new ArmorItem(HystelMCArmorMaterials.ruby, EquipmentSlotType.HEAD, new Item.Properties().group(hysteltab)).setRegistryName("ruby_helmet"),
                        ItemInit.ruby_chestplate = new ArmorItem(HystelMCArmorMaterials.ruby, EquipmentSlotType.CHEST, new Item.Properties().group(hysteltab)).setRegistryName("ruby_chestplate"),
                        ItemInit.ruby_leggings = new ArmorItem(HystelMCArmorMaterials.ruby, EquipmentSlotType.LEGS, new Item.Properties().group(hysteltab)).setRegistryName("ruby_leggings"),
                        ItemInit.ruby_boots = new ArmorItem(HystelMCArmorMaterials.ruby, EquipmentSlotType.FEET, new Item.Properties().group(hysteltab)).setRegistryName("ruby_boots"),
                        //Tools
                        ItemInit.ruby_axe = new CustomAxeItem(HystelMCToolMaterials.ruby, -1.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_axe")),
                        ItemInit.ruby_hoe = new HoeItem(HystelMCToolMaterials.ruby, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_hoe")),
                        ItemInit.ruby_pickaxe = new CustomPickaxeItem(HystelMCToolMaterials.ruby, -2, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_pickaxe")),
                        ItemInit.ruby_shovel = new ShovelItem(HystelMCToolMaterials.ruby, -3.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_shovel")),
                        ItemInit.ruby_sword = new SwordItem(HystelMCToolMaterials.ruby, 0, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("ruby_sword")),
                        //Copper
                        ItemInit.copper_helmet = new ArmorItem(HystelMCArmorMaterials.copper, EquipmentSlotType.HEAD, new Item.Properties().group(hysteltab)).setRegistryName("copper_helmet"),
                        ItemInit.copper_chestplate = new ArmorItem(HystelMCArmorMaterials.copper, EquipmentSlotType.CHEST, new Item.Properties().group(hysteltab)).setRegistryName("copper_chestplate"),
                        ItemInit.copper_leggings = new ArmorItem(HystelMCArmorMaterials.copper, EquipmentSlotType.LEGS, new Item.Properties().group(hysteltab)).setRegistryName("copper_leggings"),
                        ItemInit.copper_boots = new ArmorItem(HystelMCArmorMaterials.copper, EquipmentSlotType.FEET, new Item.Properties().group(hysteltab)).setRegistryName("copper_boots"),
                        //Tools
                        ItemInit.copper_axe = new CustomAxeItem(HystelMCToolMaterials.ruby, -1.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("copper_axe")),
                        ItemInit.copper_hoe = new HoeItem(HystelMCToolMaterials.ruby, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("copper_hoe")),
                        ItemInit.copper_pickaxe = new CustomPickaxeItem(HystelMCToolMaterials.ruby, -2, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("copper_pickaxe")),
                        ItemInit.copper_shovel = new ShovelItem(HystelMCToolMaterials.ruby, -3.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("copper_shovel")),
                        ItemInit.copper_sword = new SwordItem(HystelMCToolMaterials.ruby, 0, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("copper_sword")),
                        //Rainbow
                        ItemInit.rainbow_helmet = new ArmorItem(HystelMCArmorMaterials.rainbow, EquipmentSlotType.HEAD, new Item.Properties().group(hysteltab)).setRegistryName("rainbow_helmet"),
                        ItemInit.rainbow_chestplate = new ArmorItem(HystelMCArmorMaterials.rainbow, EquipmentSlotType.CHEST, new Item.Properties().group(hysteltab)).setRegistryName("rainbow_chestplate"),
                        ItemInit.rainbow_leggings = new ArmorItem(HystelMCArmorMaterials.rainbow, EquipmentSlotType.LEGS, new Item.Properties().group(hysteltab)).setRegistryName("rainbow_leggings"),
                        ItemInit.rainbow_boots = new ArmorItem(HystelMCArmorMaterials.rainbow, EquipmentSlotType.FEET, properties).setRegistryName("rainbow_boots"),
                        //Tools
                        ItemInit.rainbow_axe = new CustomAxeItem(HystelMCToolMaterials.ruby, -1.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_axe")),
                        ItemInit.rainbow_hoe = new HoeItem(HystelMCToolMaterials.ruby, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_hoe")),
                        ItemInit.rainbow_pickaxe = new CustomPickaxeItem(HystelMCToolMaterials.ruby, -2, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_pickaxe")),
                        ItemInit.rainbow_shovel = new ShovelItem(HystelMCToolMaterials.ruby, -3.0f, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_shovel")),
                        ItemInit.rainbow_sword = new SwordItem(HystelMCToolMaterials.ruby, 0, 6.0f, new Item.Properties().group(hysteltab)).setRegistryName(location("rainbow_sword"))
                );

        EntityInit.registerEntitySpawnEggs(event);

        LOGGER.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll
                (
                        EntityInit.unknown_cow
                );

        EntityInit.registerEntityWorldSpawns();
    }



    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }

}
