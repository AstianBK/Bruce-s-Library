package com.TBK.bruce_library;

import com.TBK.bruce_library.client.gui.JapFurnaceScreenMenu;
import com.TBK.bruce_library.client.gui.RKFurnaceScreenMenu;
import com.TBK.bruce_library.common.register.*;
import com.TBK.bruce_library.server.data.MBGenWorld;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BruceLibrary.MODID)
public class BruceLibrary
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "bruce_library";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BruceLibrary() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MBBlocks.BLOCKS.register(modEventBus);
        MBItems.ITEMS.register(modEventBus);
        MBCreativeTabs.TABS.register(modEventBus);
        MBRecipeSerializer.RECIPE_SERIALIZERS.register(modEventBus);
        MBRecipeSerializer.RECIPE_TYPES.register(modEventBus);
        MBMenuType.MENU_TYPE.register(modEventBus);
        MBBlockEntity.BLOCKS_ENTITY.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,()->()->{
            modEventBus.addListener(this::registerRenderers);
        });
        modEventBus.addListener(this::dataSetup);
    }

    @OnlyIn(Dist.CLIENT)
    private void registerRenderers(FMLCommonSetupEvent event){
        MenuScreens.register(MBMenuType.JAP_FURNACE_MENU.get(), JapFurnaceScreenMenu::new);
        MenuScreens.register(MBMenuType.FURNACE_MENU.get(), RKFurnaceScreenMenu::new);
    }
    private void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        boolean includeServer = event.includeServer();
        generator.addProvider(includeServer,new MBGenWorld(packOutput,event.getLookupProvider()));
    }
}
