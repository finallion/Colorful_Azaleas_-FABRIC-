package com.finallion.colouredmoss.registry;

import com.finallion.colouredmoss.ColouredMoss;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static final Tag<Item> MOSS_COLOURS = createTag("moss_colours");
    public static final Tag<Item> MOSS = createTag("moss");

    public static Tag<Item> createTag(String id) {
        return TagRegistry.item(new Identifier(ColouredMoss.MOD_ID, id));
    }


    public static void init() {
    }
}
