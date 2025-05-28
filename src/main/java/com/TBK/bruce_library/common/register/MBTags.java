package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MBTags {
    public static final TagKey<Item> IS_TOOL_FOR_FURNACE = tag("is_tool_for_furnace");
    public static final TagKey<Item> IS_FUEL_FOR_SMITHING_FURNACE = tag("is_fuel_for_smithing_furnace");
    public static final TagKey<Item> IS_TONG = tag("blacksmith_tongs");
    public static final TagKey<Item> IS_BELLOW = tag("blacksmith_bellows");
    public static final TagKey<Item> IS_HAMMER = tag("blacksmith_hammer");


    private static TagKey<Item> tag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(BruceLibrary.MODID, name));
    }
}
