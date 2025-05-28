package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import com.TBK.bruce_library.client.gui.JapFurnaceContainerMenu;
import com.TBK.bruce_library.client.gui.RKFurnaceContainerMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBMenuType {
    public static final DeferredRegister<MenuType<?>> MENU_TYPE = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BruceLibrary.MODID);

    public static final RegistryObject<MenuType<RKFurnaceContainerMenu>> FURNACE_MENU = registerMenuType(RKFurnaceContainerMenu::new,"furnace_menu");
    public static final RegistryObject<MenuType<JapFurnaceContainerMenu>> JAP_FURNACE_MENU = registerMenuType(JapFurnaceContainerMenu::new,"jap_furnace_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENU_TYPE.register(name, () -> IForgeMenuType.create(factory));
    }
}
