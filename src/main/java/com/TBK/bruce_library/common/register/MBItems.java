package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import com.TBK.bruce_library.common.item.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BruceLibrary.MODID);


    public static final RegistryObject<Item> BULAT_BAR= ITEMS.register("bulat_bar",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CANVAS= ITEMS.register("canvas",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> DZIWER_BAR= ITEMS.register("dziwer_bar",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FINISHED_LEATHER= ITEMS.register("finished_leather",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FINISHED_OIL= ITEMS.register("finished_oil",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FINISHED_OIL_BUCKET= ITEMS.register("finished_oil_bucket",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FINISHED_SHAFT= ITEMS.register("finished_shaft",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PADDED_CANVAS= ITEMS.register("padded_canvas",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> QUILTED_CANVAS= ITEMS.register("quilted_canvas",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> NITRE= ITEMS.register("nitre",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SULFUR= ITEMS.register("sulfur",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> AQUA_FORTIS= ITEMS.register("aqua_fortis",()->new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> UPGRADE_KIT= ITEMS.register("upgrade_kit",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_LIMONITE= ITEMS.register("raw_limonite",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_PYRITE= ITEMS.register("raw_pyrite",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_MAGNETITE = ITEMS.register("raw_magnetite",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SMITHING_BELLOWS= ITEMS.register("smithing_bellows",()->new Item(new Item.Properties().stacksTo(1).durability(128)));

    public static final RegistryObject<Item> SMITHING_HAMMER= ITEMS.register("smithing_hammer",()->new HammerItem(new Item.Properties().stacksTo(1).durability(64)));

    public static final RegistryObject<Item> SMITHING_TONGS= ITEMS.register("smithing_tongs",()->new Item(new Item.Properties().stacksTo(1).durability(32)));

    public static final RegistryObject<Item> LARGE_IRON_BARREL= ITEMS.register("large_iron_barrel",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LARGE_GUNMETAL_BARREL= ITEMS.register("large_gunmetal_barrel",()->new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> IRON_BARREL= ITEMS.register("iron_barrel",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> GUNMETAL_BARREL= ITEMS.register("gunmetal_barrel",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SMALL_IRON_BARREL= ITEMS.register("small_iron_barrel",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SMALL_GUNMETAL_BARREL = ITEMS.register("small_gunmetal_barrel",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> GUN_TRIGGER = ITEMS.register("gun_trigger",()->new Item(new Item.Properties().stacksTo(64)));


    //SAMURAI ARMORY
    public static final RegistryObject<Item> ARMS_KOTE = ITEMS.register("arms_kote",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BROKEN_SWORD_BLADE = ITEMS.register("broken_sword_blade",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CLAY_TEMPERED_HAGANE_BLADE = ITEMS.register("clay_tempered_hagane_blade",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CLAY_TEMPERED_TAMAHAGANE_BLADE = ITEMS.register("clay_tempered_tamahagane_blade",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TESTU_IRON_BLADE_PART = ITEMS.register("testu_iron_blade_part",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TESTU_IRON_BLOOM = ITEMS.register("testu_iron_bloom",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TESTU_IRON_PLATE = ITEMS.register("testu_iron_plate",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TESTU_IRON_INGOT = ITEMS.register("testu_iron_ingot",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TSUBA_GUARD = ITEMS.register("tsuba_guard",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> WOVEN_FABRIC = ITEMS.register("woven_fabric",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> WRAPPED_WEAPON_HANDLE = ITEMS.register("wrapped_weapon_handle",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TAMAHAGANE_STEEL_BLADE_PART = ITEMS.register("tamahagane_steel_blade_part",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TAMAHAGANE_STEEL_BLOOM = ITEMS.register("tamahagane_steel_bloom",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TAMAHAGANE_STEEL_INGOT = ITEMS.register("tamahagane_steel_ingot",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TAMAHAGANE_STEEL_PLATE = ITEMS.register("tamahagane_steel_plate",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HAGANE_STEEL_BLADE_PART = ITEMS.register("hagane_steel_blade_part",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HAGANE_STEEL_BLOOM = ITEMS.register("hagane_steel_bloom",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HAGANE_STEEL_INGOT = ITEMS.register("hagane_steel_ingot",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HAGANE_STEEL_PLATE = ITEMS.register("hagane_steel_plate",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> IRON_SAND = ITEMS.register("iron_sand",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> KOBUTO_HELMET_SHELL = ITEMS.register("kobuto_helmet_shell",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> KUSARI_LINK = ITEMS.register("kusari_link",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LAMINAR_PLATE = ITEMS.register("laminar_plate",()->new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> STRING_STRAP = ITEMS.register("string_strap",()->new Item(new Item.Properties().stacksTo(64)));







    // TOOLS
    public static final RegistryObject<Item> JAP_SMITHING_HAMMER = ITEMS.register("japsmithing_hammer",()->new HammerItem(new Item.Properties().stacksTo(1).durability(64)));
    public static final RegistryObject<Item> SMITHING_CHOPSTICKS = ITEMS.register("smithing_chopsticks",()->new Item(new Item.Properties().stacksTo(1).durability(32)));
    public static final RegistryObject<Item> SMITHING_CLAYTUBE = ITEMS.register("smithing_claytube",()->new Item(new Item.Properties().stacksTo(1).defaultDurability(128)));

}
