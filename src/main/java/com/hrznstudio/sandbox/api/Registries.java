package com.hrznstudio.sandbox.api;

import com.hrznstudio.sandbox.api.block.IBlock;
import com.hrznstudio.sandbox.api.block.entity.IBlockEntity;
import com.hrznstudio.sandbox.api.item.Item;
import com.hrznstudio.sandbox.api.registry.Registry;
import com.hrznstudio.sandbox.api.util.Functions;

public interface Registries {

    Registry<IBlock> BLOCK = get(IBlock.class);
    Registry<Item> ITEM = get(Item.class);
    Registry<IBlockEntity.Type> BLOCK_ENTITY = get(IBlockEntity.Type.class);

    static <T> Registry<T> get(Class<T> tClass) {
        return (Registry<T>) Functions.registryFunction.apply(tClass);
    }
}