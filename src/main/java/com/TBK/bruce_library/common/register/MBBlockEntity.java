package com.TBK.bruce_library.common.register;

import com.TBK.bruce_library.BruceLibrary;
import com.TBK.bruce_library.common.block_entity.JapFurnaceEntity;
import com.TBK.bruce_library.common.block_entity.RKFurnaceEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITY =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BruceLibrary.MODID);

    public static final RegistryObject<BlockEntityType<RKFurnaceEntity>> RK_FURNACE_ENTITY =
            BLOCKS_ENTITY.register("rk_furnace_entity", () ->
                    BlockEntityType.Builder.of(RKFurnaceEntity::new,
                            MBBlocks.SMITHING_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<JapFurnaceEntity>> JAP_FURNACE_ENTITY =
            BLOCKS_ENTITY.register("jap_furnace_entity", () ->
                    BlockEntityType.Builder.of(JapFurnaceEntity::new,
                            MBBlocks.JAP_FURNACE.get()).build(null));
}
