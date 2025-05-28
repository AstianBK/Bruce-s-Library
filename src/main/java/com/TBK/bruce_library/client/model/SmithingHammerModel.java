package com.TBK.bruce_library.client.model;

import com.TBK.bruce_library.BruceLibrary;
import com.TBK.bruce_library.common.item.HammerItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SmithingHammerModel<T extends HammerItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
        return new ResourceLocation(BruceLibrary.MODID,"geo/smithinghammer.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(BruceLibrary.MODID,"textures/item/smithing_hammer_3d.png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(BruceLibrary.MODID,"animations/ashigaru_armor.animation.json");
    }
}
