package com.HystelDKL.HystelMC.init;

import com.HystelDKL.HystelMC.HystelMC;
import com.HystelDKL.HystelMC.objects.items.DinkyWinky;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = HystelMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(HystelMC.MOD_ID)
public class ItemInit
{

    public static final Item bluestone_ingot = null;
    public static final Item ruby = null;
    public static final Item copper_ingot = null;
    public static final Item rainbow_gem = null;
    //Miscellaneous
    public static final Item dinky_winky = null;
    //Food
    public static final Item cheesseburger = null;
    public static final Item bacon = null;
    public static final Item beefburger = null;
    public static final Item beefpatty = null;
    public static final Item butter = null;
    public static final Item cheesse = null;
    public static final Item cracker = null;
    public static final Item cheesse_and_cracker = null;
    public static final Item fries = null;
    public static final Item pizza = null;
    public static final Item grated_cheesse = null;
    public static final Item rice = null;
    public static final Item rice_bowl = null;
    public static final Item tomato = null;


    //Tools
    //Bluestone
    public static final Item bluestone_sword = null;
    public static final Item bluestone_pickaxe = null;
    public static final Item bluestone_axe = null;
    public static final Item bluestone_shovel = null;
    public static final Item bluestone_hoe = null;
    //Ruby
    public static final Item ruby_sword = null;
    public static final Item ruby_pickaxe = null;
    public static final Item ruby_axe = null;
    public static final Item ruby_shovel = null;
    public static final Item ruby_hoe = null;
    //Copper
    public static final Item copper_sword = null;
    public static final Item copper_pickaxe = null;
    public static final Item copper_axe = null;
    public static final Item copper_shovel = null;
    public static final Item copper_hoe = null;
    //Rainbow
    public static final Item rainbow_sword = null;
    public static final Item rainbow_pickaxe = null;
    public static final Item rainbow_axe = null;
    public static final Item rainbow_shovel = null;
    public static final Item rainbow_hoe = null;
    //Armor
    //Bluestone
    public static final Item bluestone_helmet = null;
    public static final Item bluestone_chestplate = null;
    public static final Item bluestone_leggings = null;
    public static final Item bluestone_boots = null;
    //Ruby
    public static final Item ruby_helmet = null;
    public static final Item ruby_chestplate = null;
    public static final Item ruby_leggings = null;
    public static final Item ruby_boots = null;
    //Copper
    public static final Item copper_helmet = null;
    public static final Item copper_chestplate = null;
    public static final Item copper_leggings = null;
    public static final Item copper_boots = null;
    //Rainbow
    public static final Item rainbow_helmet = null;
    public static final Item rainbow_chestplate = null;
    public static final Item rainbow_leggings = null;
    public static final Item rainbow_boots = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_gem"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(6).saturation(6.2F).build())).setRegistryName("cheesseburger"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(3).saturation(6.2F).build())).setRegistryName("bacon"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(4).saturation(6.2F).build())).setRegistryName("beefburger"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(3).saturation(6.2F).build())).setRegistryName("beefpatty"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(1).saturation(6.2F).build())).setRegistryName("butter"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(2).saturation(6.2F).build())).setRegistryName("cheesse"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(4).saturation(6.2F).build())).setRegistryName("cheesse_and_cracker"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(2).saturation(6.2F).build())).setRegistryName("cracker"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(2).saturation(6.2F).build())).setRegistryName("fries"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(5).saturation(6.2F).build())).setRegistryName("pizza"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(4).saturation(6.2F).build())).setRegistryName("grated_cheesse"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(3).saturation(6.2F).build())).setRegistryName("rice"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(4).saturation(6.2F).build())).setRegistryName("rice_bowl"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(3).saturation(6.2F).build())).setRegistryName("tomato"));
        event.getRegistry().register(new Item(new Item.Properties().group(HystelMC.HystelTab.instance).food(new Food.Builder().hunger(3).saturation(6.2F).build())).setRegistryName("sausage"));
        event.getRegistry().register(new DinkyWinky(new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("dinky_winky"));


        //Tools
        //Bluestone
        event.getRegistry().register(new SwordItem(ModItemTier.BLUESTONE, 5, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.BLUESTONE, 5, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_pickaxe"));
        event.getRegistry().register(new AxeItem(ModItemTier.BLUESTONE, 5, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_axe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.BLUESTONE, 5, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_shovel"));
        event.getRegistry().register(new HoeItem(ModItemTier.BLUESTONE, 5, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_hoe"));
        //Ruby
        event.getRegistry().register(new SwordItem(ModItemTier.RUBY, 4, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.RUBY, 4, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_pickaxe"));
        event.getRegistry().register(new AxeItem(ModItemTier.RUBY, 4, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_axe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.RUBY, 4, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_shovel"));
        event.getRegistry().register(new HoeItem(ModItemTier.RUBY, 4, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_hoe"));
        //Copper
        event.getRegistry().register(new SwordItem(ModItemTier.COPPER, 3, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.COPPER, 3, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_pickaxe"));
        event.getRegistry().register(new AxeItem(ModItemTier.COPPER, 3, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_axe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.COPPER, 3, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_shovel"));
        event.getRegistry().register(new HoeItem(ModItemTier.COPPER, 3, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_hoe"));
        //Rainbow
        event.getRegistry().register(new SwordItem(ModItemTier.RAINBOW, 6, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.RAINBOW, 6, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_pickaxe"));
        event.getRegistry().register(new AxeItem(ModItemTier.RAINBOW, 6, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_axe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.RAINBOW, 6, 4.2F, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_shovel"));
        event.getRegistry().register(new HoeItem(ModItemTier.RAINBOW, 6, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_hoe"));
        event.getRegistry().registerAll
                (
                        //Bluestone
                        new ArmorItem(ModArmorTier.bluestone, EquipmentSlotType.HEAD, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_helmet"),
                        new ArmorItem(ModArmorTier.bluestone, EquipmentSlotType.CHEST, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_chestplate"),
                        new ArmorItem(ModArmorTier.bluestone, EquipmentSlotType.LEGS, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_leggings"),
                        new ArmorItem(ModArmorTier.bluestone, EquipmentSlotType.FEET, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("bluestone_boots"),

                        //Ruby
                        new ArmorItem(ModArmorTier.ruby, EquipmentSlotType.HEAD, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_helmet"),
                        new ArmorItem(ModArmorTier.ruby, EquipmentSlotType.CHEST, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_chestplate"),
                        new ArmorItem(ModArmorTier.ruby, EquipmentSlotType.LEGS, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_leggings"),
                        new ArmorItem(ModArmorTier.ruby, EquipmentSlotType.FEET, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("ruby_boots"),

                        //Copper
                        new ArmorItem(ModArmorTier.copper, EquipmentSlotType.HEAD, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_helmet"),
                        new ArmorItem(ModArmorTier.copper, EquipmentSlotType.CHEST, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_chestplate"),
                        new ArmorItem(ModArmorTier.copper, EquipmentSlotType.LEGS, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_leggings"),
                        new ArmorItem(ModArmorTier.copper, EquipmentSlotType.FEET, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("copper_boots"),

                        //Rainbow
                        new ArmorItem(ModArmorTier.rainbow, EquipmentSlotType.HEAD, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_helmet"),
                        new ArmorItem(ModArmorTier.rainbow, EquipmentSlotType.CHEST, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_chestplate"),
                        new ArmorItem(ModArmorTier.rainbow, EquipmentSlotType.LEGS, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_leggings"),
                        new ArmorItem(ModArmorTier.rainbow, EquipmentSlotType.FEET, new Item.Properties().group(HystelMC.HystelTab.instance)).setRegistryName("rainbow_boots")

                );


    }

    public enum ModItemTier implements IItemTier
    {
        BLUESTONE(6, 2600, 10.9F, 9.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
        RUBY(5, 2000, 9.5F, 8.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
        COPPER(4, 1600, 7.9F, 7.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
        RAINBOW(7, 2600, 15.9F, 10.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

       private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
       {

           this.repairMaterial = new LazyValue<>(repairMaterial);
           this.enchantability = enchantability;
           this.attackDamage = attackDamage;
           this.efficiency = efficiency;
           this.maxUses = maxUses;
           this.harvestLevel = harvestLevel;
       }


        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    public enum ModArmorTier implements IArmorMaterial
    {
        bluestone("bluestone", 579, new int[] {7, 6, 8, 5}, 25, ItemInit.bluestone_ingot, "ITEM_ARMOR_EQUIP_DIAMOND", 0.0f),
        ruby("ruby", 500, new int[] {6, 5, 7, 4}, 12, ItemInit.ruby, "ITEM_ARMOR_EQUIP_IRON", 0.0f),
        copper("copper", 472, new int[] {4, 5, 6, 3}, 11, ItemInit.copper_ingot, "ITEM_ARMOR_EQUIP_IRON", 0.0f),
        rainbow("rainbow", 589, new int[] {9, 9, 9, 9}, 11, ItemInit.rainbow_gem, "ITEM_ARMOR_EQUIP_DIAMOND", 1.0f);


        private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
        private String name, equipSound;
        private int durability, enchantability;
        private Item repairItem;
        private int[] damageReductionAmounts;
        private float toughness;

        private ModArmorTier(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness)
        {
            this.name = name;
            this.equipSound = equipSound;
            this.durability = durability;
            this.enchantability = enchantability;
            this.repairItem = repairItem;
            this.damageReductionAmounts = damageReductionAmounts;
            this.toughness = toughness;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slot)
        {
            return this.damageReductionAmounts[slot.getIndex()];
        }

        @Override
        public int getDurability(EquipmentSlotType slot)
        {
            return max_damage_array[slot.getIndex()] * this.durability;
        }

        @Override
        public int getEnchantability()
        {
            return this.enchantability;
        }

        @Override
        public String getName()
        {
            return HystelMC.MOD_ID + ":" + this.name;
        }

        @Override
        public Ingredient getRepairMaterial()
        {
            return Ingredient.fromItems(this.repairItem);
        }

        @Override
        public SoundEvent getSoundEvent()
        {
            return new SoundEvent(new ResourceLocation(equipSound));
        }

        @Override
        public float getToughness()
        {
            return this.toughness;
        }
    }

}
