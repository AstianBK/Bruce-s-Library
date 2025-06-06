package com.TBK.bruce_library.server.data;

import com.TBK.bruce_library.BruceLibrary;
import com.TBK.bruce_library.server.world.gen.MBBiomeModifiers;
import com.TBK.bruce_library.server.world.gen.MBConfiguredFeatured;
import com.TBK.bruce_library.server.world.gen.MBPlacedFeatured;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MBGenWorld extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.PLACED_FEATURE, MBPlacedFeatured::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, MBConfiguredFeatured::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, MBBiomeModifiers::bootstrap);

    public MBGenWorld(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries,BUILDER, Set.of(BruceLibrary.MODID));
    }
}
