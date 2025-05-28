package com.TBK.bruce_library.client.gui;

import com.TBK.bruce_library.common.register.MBRecipeSerializer;
import com.TBK.bruce_library.common.register.MBTags;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookMenu;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;

public class AbstractFurnaceMultiMenu extends RecipeBookMenu<Container> {
    public AbstractFurnaceMultiMenu(MenuType<?> p_40115_, int p_40116_) {
        super(p_40115_, p_40116_);
    }

    @Override
    public void fillCraftSlotsStackedContents(StackedContents p_40117_) {

    }

    @Override
    public void clearCraftingContent() {

    }

    @Override
    public boolean recipeMatches(Recipe<? super Container> p_40118_) {
        return false;
    }

    @Override
    public int getResultSlotIndex() {
        return 0;
    }
    protected boolean canSmelt(ItemStack p_38978_) {
        return false;
    }

    protected boolean isFuel(ItemStack p_38989_) {
        return false;
    }

    @Override
    public int getGridWidth() {
        return 0;
    }

    @Override
    public int getGridHeight() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public RecipeBookType getRecipeBookType() {
        return null;
    }

    @Override
    public boolean shouldMoveToInventory(int p_150635_) {
        return false;
    }

    @Override
    public ItemStack quickMoveStack(Player p_38941_, int p_38942_) {
        return null;
    }

    @Override
    public boolean stillValid(Player p_38874_) {
        return false;
    }
}
