package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.TBK.bruce_library.common.register.MBItems.*;

public class MBCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BruceLibrary.MODID);

    public static final RegistryObject<CreativeModeTab> MB_MOBS_TAB = TABS.register(BruceLibrary.MODID,()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(MBItems.AQUA_FORTIS.get()))
            .title(Component.translatable("itemGroup.medieval_boomstick"))
            .displayItems((s,a)-> {

                a.accept(MBBlocks.SMITHING_FURNACE.get());

                a.accept(MBBlocks.JAP_FURNACE.get());

                a.accept(MBBlocks.MAGNETITE_ORE.get());
                a.accept(MBBlocks.MAGNETITE_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.LIMONITE_ORE.get());
                a.accept(MBBlocks.LIMONITE_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.SULFUR_ORE_BLOCK.get());
                a.accept(MBBlocks.SULFUR_ORE.get());
                a.accept(MBBlocks.SULFUR_ORE_DEEPSLATE.get());

                a.accept(MBBlocks.PYRITE_ORE.get());
                a.accept(MBBlocks.PYRITE_ORE_DEEPSLATE.get());


                a.accept(BULAT_BAR.get());
                a.accept(CANVAS.get());
                a.accept(DZIWER_BAR.get());
                a.accept(FINISHED_LEATHER.get());
                a.accept(FINISHED_OIL.get());
                a.accept(FINISHED_OIL_BUCKET.get());
                a.accept(FINISHED_SHAFT.get());
                a.accept(PADDED_CANVAS.get());
                a.accept(QUILTED_CANVAS.get());
                a.accept(NITRE.get());
                a.accept(SULFUR.get());
                a.accept(AQUA_FORTIS.get());
                a.accept(UPGRADE_KIT.get());
                a.accept(RAW_LIMONITE.get());
                a.accept(RAW_PYRITE.get());
                a.accept(RAW_MAGNETITE.get());
                a.accept(SMITHING_BELLOWS.get());
                a.accept(SMITHING_HAMMER.get());
                a.accept(SMITHING_TONGS.get());
                a.accept(LARGE_IRON_BARREL.get());
                a.accept(LARGE_GUNMETAL_BARREL.get());
                a.accept(IRON_BARREL.get());
                a.accept(GUNMETAL_BARREL.get());
                a.accept(SMALL_IRON_BARREL.get());
                a.accept(SMALL_GUNMETAL_BARREL.get());
                a.accept(GUN_TRIGGER.get());

                // Samurai Armory
                a.accept(ARMS_KOTE.get());
                a.accept(BROKEN_SWORD_BLADE.get());
                a.accept(CLAY_TEMPERED_HAGANE_BLADE.get());
                a.accept(CLAY_TEMPERED_TAMAHAGANE_BLADE.get());
                a.accept(TESTU_IRON_BLADE_PART.get());
                a.accept(TESTU_IRON_BLOOM.get());
                a.accept(TESTU_IRON_PLATE.get());
                a.accept(TESTU_IRON_INGOT.get());
                a.accept(TSUBA_GUARD.get());
                a.accept(WOVEN_FABRIC.get());
                a.accept(WRAPPED_WEAPON_HANDLE.get());
                a.accept(TAMAHAGANE_STEEL_BLADE_PART.get());
                a.accept(TAMAHAGANE_STEEL_BLOOM.get());
                a.accept(TAMAHAGANE_STEEL_INGOT.get());
                a.accept(TAMAHAGANE_STEEL_PLATE.get());
                a.accept(HAGANE_STEEL_BLADE_PART.get());
                a.accept(HAGANE_STEEL_BLOOM.get());
                a.accept(HAGANE_STEEL_INGOT.get());
                a.accept(HAGANE_STEEL_PLATE.get());
                a.accept(IRON_SAND.get());
                a.accept(KOBUTO_HELMET_SHELL.get());
                a.accept(KUSARI_LINK.get());
                a.accept(LAMINAR_PLATE.get());
                a.accept(STRING_STRAP.get());

                // Tools
                a.accept(JAP_SMITHING_HAMMER.get());
                a.accept(SMITHING_CHOPSTICKS.get());
                a.accept(SMITHING_CLAYTUBE.get());
            })
            .build());
}
