package org.sandboxpowered.sandbox.api.container;

import com.google.common.annotations.Beta;
import org.sandboxpowered.sandbox.api.component.Inventory;
import org.sandboxpowered.sandbox.api.entity.player.PlayerEntity;
import org.sandboxpowered.sandbox.api.item.ItemStack;
import org.sandboxpowered.sandbox.api.util.Mono;

@Beta
public interface Slot {

    int getXPosition();

    int getYPosition();

    Inventory getInventory();

    boolean canInsert(ItemStack stack);

    boolean canExtract(PlayerEntity player);

    int getMaxCount();

    boolean drawHovering();

    ItemStack getStack();

    void setStack(ItemStack stack);

    boolean hasStack();

    ItemStack takeStack(int amount);

    Mono<String> getBackgroundSprite();
}