package com.fuzzy.fuzzysmod.item;

import com.fox2code.foxloader.registry.RegisteredItem;
import net.minecraft.src.game.item.EnumToolMaterial;
import net.minecraft.src.game.item.Item;
import net.minecraft.src.game.item.ItemToolSword;

public class ItemFuzzyItemClient extends ItemToolSword implements RegisteredItem {
    public ItemFuzzyItemClient(int id) {
        super(id - 256, EnumToolMaterial.IRON);
    }
}
