package com.TBK.bruce_library.client.gui;

import com.TBK.bruce_library.BruceLibrary;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import net.minecraft.client.gui.screens.recipebook.RecipeUpdateListener;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class JapFurnaceScreenMenu extends AbstractContainerScreen<JapFurnaceContainerMenu> implements RecipeUpdateListener {
    private static final ResourceLocation TEXTURE = new ResourceLocation(BruceLibrary.MODID,"textures/gui/jap_furnace.png");

    public final RKFurnaceRecipeBookComponent recipeBookComponent;
    private boolean widthTooNarrow;

    private final ResourceLocation texture;

    public JapFurnaceScreenMenu(JapFurnaceContainerMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
        this.recipeBookComponent = new RKFurnaceRecipeBookComponent();
        this.texture = TEXTURE;
    }

    public void init() {
        super.init();
        this.widthTooNarrow = this.width < 379;
        this.titleLabelX = ((this.imageWidth - this.font.width(this.title)) / 2)-30;

    }

    @Override
    protected void renderLabels(GuiGraphics p_281635_, int p_282681_, int p_283686_) {
        p_281635_.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, 4210752, false);
    }


    public void render(GuiGraphics p_282573_, int p_97859_, int p_97860_, float p_97861_) {
        this.renderBackground(p_282573_);
        if (this.widthTooNarrow) {
            this.renderBg(p_282573_, p_97861_, p_97859_, p_97860_);
        } else {
            super.render(p_282573_, p_97859_, p_97860_, p_97861_);
        }

        this.renderTooltip(p_282573_, p_97859_, p_97860_);
    }

    protected void renderBg(GuiGraphics p_282928_, float p_281631_, int p_281252_, int p_281891_) {
        int i = this.leftPos;
        int j = this.topPos;
        p_282928_.blit(this.texture, i, j, 0, 0, this.imageWidth, this.imageHeight);
        if (this.menu.isLit()) {
            int k = this.menu.getLitProgress();
            p_282928_.blit(this.texture, i + 89, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.menu.getBurnProgress();
        p_282928_.blit(this.texture, i + 45 , j+9, 176, 14, l + 1, 16);
    }

    @Override
    public void recipesUpdated() {

    }

    @Override
    public RecipeBookComponent getRecipeBookComponent() {
        return this.recipeBookComponent;
    }
}
