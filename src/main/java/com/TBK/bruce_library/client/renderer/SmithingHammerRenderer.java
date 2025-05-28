package com.TBK.bruce_library.client.renderer;

import com.TBK.bruce_library.client.model.SmithingHammerModel;
import com.TBK.bruce_library.common.item.HammerItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SmithingHammerRenderer<T extends HammerItem> extends GeoItemRenderer<T> {
    public SmithingHammerRenderer() {
        super(new SmithingHammerModel<>());
    }
}
