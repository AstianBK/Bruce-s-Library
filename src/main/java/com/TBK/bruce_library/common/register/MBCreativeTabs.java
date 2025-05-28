package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MBCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BruceLibrary.MODID);

    public static final RegistryObject<CreativeModeTab> MB_MOBS_TAB = TABS.register(BruceLibrary.MODID,()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(MBItems.AQUA_FORTIS.get()))
            .title(Component.translatable("itemGroup.medieval_boomstick"))
            .displayItems((s,a)-> {

                a.accept(MBBlocks.SMITHING_FURNACE.get());

                a.accept(MBBlocks.MAGNETITE_ORE.get());
                a.accept(MBBlocks.MAGNETITE_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.LIMONITE_ORE.get());
                a.accept(MBBlocks.LIMONITE_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.SULFUR_ORE_BLOCK.get());
                a.accept(MBBlocks.SULFUR_ORE.get());
                a.accept(MBBlocks.SULFUR_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.PYRITE_ORE.get());
                a.accept(MBBlocks.PYRITE_ORE_DEEPSLATE.get());
            })
            .build());
}
