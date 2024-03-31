package com.fuzzy.fuzzysmod;

import com.fox2code.foxloader.loader.ClientMod;
import com.fox2code.foxloader.registry.*;
import com.fuzzy.fuzzysmod.item.ItemFuzzyItemClient;
import net.minecraft.src.game.item.Item;

import java.awt.*;

public class SomeStuffClient extends SomeStuff implements ClientMod {
    public RegisteredItem fuzzyItem;
    public RegisteredBlock fuzzyBlock;

    public void initializeItems() {
        fuzzyItem = registerNewItem("fuzzy_thing", new ItemBuilder()
                        .setItemName("fuzzy_thing")
                        .setGameItemSource(ItemFuzzyItemClient.class));
        registerRecipe(fuzzyItem.newRegisteredItemStack(), new Object[] {
                "   ",
                " D ",
                " S ",
                Character.valueOf('D'),
                Item.diamond,
                Character.valueOf('S'),
                Item.stick
        });

        fuzzyBlock = registerNewBlock("fuzzpile", new BlockBuilder()
                .setBlockName("fuzzpile")
                .setBlockMaterial(GameRegistry.BuiltInMaterial.GRASS)
                .setBlockStepSounds(GameRegistry.BuiltInStepSounds.GRASS)
                .setBurnRate(30, 60).setBurnTime(300)
                .setBlockHardness(0.8F)
                .setTooltipColor(Color.GRAY)
                .setEffectiveTool(RegisteredToolType.SWORD));
    }

    public void onInit() {
        System.out.println("Fuzzy's mod client initializing");
        initializeItems();
    }
}
