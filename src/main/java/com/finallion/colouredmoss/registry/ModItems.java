package com.finallion.colouredmoss.registry;

import com.finallion.colouredmoss.ColouredMoss;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static List<Item> itemsList = new ArrayList<>();

    public static Item createItem(Item item, Identifier id) {
        if (id != null && !id.equals(new Identifier("minecraft:air"))) {
            Registry.register(Registry.ITEM, id, item);
            itemsList.add(item);
            return item;
        } else {
            return null;
        }
    }

    public static Item createItem(Item item, String id) {
        Registry.register(Registry.ITEM, new Identifier(ColouredMoss.MOD_ID, id), item);
        itemsList.add(item);
        return item;
    }


    public static void registerItems() {
    }

    public static final Item WHITE_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.WHITE_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_MOSS_BLOCK));
    public static final Item WHITE_MOSS_CARPET = createItem(new BlockItem(ModBlocks.WHITE_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_MOSS_CARPET));
    public static final Item WHITE_AZALEA = createItem(new BlockItem(ModBlocks.WHITE_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_AZALEA));
    public static final Item WHITE_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.WHITE_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_FLOWERING_AZALEA));
    public static final Item WHITE_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.WHITE_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_FLOWERING_AZALEA_VARIANT));
    public static final Item WHITE_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.WHITE_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_AZALEA_LEAVES));
    public static final Item WHITE_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES));
    public static final Item WHITE_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item ORANGE_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.ORANGE_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_MOSS_BLOCK));
    public static final Item ORANGE_MOSS_CARPET = createItem(new BlockItem(ModBlocks.ORANGE_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_MOSS_CARPET));
    public static final Item ORANGE_AZALEA = createItem(new BlockItem(ModBlocks.ORANGE_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_AZALEA));
    public static final Item ORANGE_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.ORANGE_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_FLOWERING_AZALEA));
    public static final Item ORANGE_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.ORANGE_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_FLOWERING_AZALEA_VARIANT));
    public static final Item ORANGE_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.ORANGE_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_AZALEA_LEAVES));
    public static final Item ORANGE_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES));
    public static final Item ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item MAGENTA_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.MAGENTA_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_MOSS_BLOCK));
    public static final Item MAGENTA_MOSS_CARPET = createItem(new BlockItem(ModBlocks.MAGENTA_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_MOSS_CARPET));
    public static final Item MAGENTA_AZALEA = createItem(new BlockItem(ModBlocks.MAGENTA_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_AZALEA));
    public static final Item MAGENTA_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.MAGENTA_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_FLOWERING_AZALEA));
    public static final Item MAGENTA_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.MAGENTA_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_FLOWERING_AZALEA_VARIANT));
    public static final Item MAGENTA_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.MAGENTA_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_AZALEA_LEAVES));
    public static final Item MAGENTA_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES));
    public static final Item MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item LIGHT_BLUE_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_MOSS_BLOCK));
    public static final Item LIGHT_BLUE_MOSS_CARPET = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_MOSS_CARPET));
    public static final Item LIGHT_BLUE_AZALEA = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_AZALEA));
    public static final Item LIGHT_BLUE_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA));
    public static final Item LIGHT_BLUE_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_VARIANT));
    public static final Item LIGHT_BLUE_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_AZALEA_LEAVES));
    public static final Item LIGHT_BLUE_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES));
    public static final Item LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item YELLOW_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.YELLOW_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_MOSS_BLOCK));
    public static final Item YELLOW_MOSS_CARPET = createItem(new BlockItem(ModBlocks.YELLOW_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_MOSS_CARPET));
    public static final Item YELLOW_AZALEA = createItem(new BlockItem(ModBlocks.YELLOW_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_AZALEA));
    public static final Item YELLOW_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.YELLOW_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_FLOWERING_AZALEA));
    public static final Item YELLOW_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.YELLOW_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_FLOWERING_AZALEA_VARIANT));
    public static final Item YELLOW_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.YELLOW_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_AZALEA_LEAVES));
    public static final Item YELLOW_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES));
    public static final Item YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item LIME_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.LIME_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_MOSS_BLOCK));
    public static final Item LIME_MOSS_CARPET = createItem(new BlockItem(ModBlocks.LIME_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_MOSS_CARPET));
    public static final Item LIME_AZALEA = createItem(new BlockItem(ModBlocks.LIME_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_AZALEA));
    public static final Item LIME_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.LIME_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_FLOWERING_AZALEA));
    public static final Item LIME_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.LIME_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_FLOWERING_AZALEA_VARIANT));
    public static final Item LIME_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIME_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_AZALEA_LEAVES));
    public static final Item LIME_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIME_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_FLOWERING_AZALEA_LEAVES));
    public static final Item LIME_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.LIME_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIME_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item PINK_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.PINK_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_MOSS_BLOCK));
    public static final Item PINK_MOSS_CARPET = createItem(new BlockItem(ModBlocks.PINK_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_MOSS_CARPET));
    public static final Item PINK_AZALEA = createItem(new BlockItem(ModBlocks.PINK_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_AZALEA));
    public static final Item PINK_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.PINK_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_FLOWERING_AZALEA));
    public static final Item PINK_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.PINK_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_FLOWERING_AZALEA_VARIANT));
    public static final Item PINK_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.PINK_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_AZALEA_LEAVES));
    public static final Item PINK_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.PINK_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_FLOWERING_AZALEA_LEAVES));
    public static final Item PINK_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.PINK_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PINK_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item LIGHT_GREY_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.LIGHT_GREY_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_MOSS_BLOCK));
    public static final Item LIGHT_GREY_MOSS_CARPET = createItem(new BlockItem(ModBlocks.LIGHT_GREY_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_MOSS_CARPET));
    public static final Item LIGHT_GREY_AZALEA = createItem(new BlockItem(ModBlocks.LIGHT_GREY_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_AZALEA));
    public static final Item LIGHT_GREY_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA));
    public static final Item LIGHT_GREY_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_VARIANT));
    public static final Item LIGHT_GREY_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIGHT_GREY_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_AZALEA_LEAVES));
    public static final Item LIGHT_GREY_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES));
    public static final Item LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item GREY_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.GREY_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_MOSS_BLOCK));
    public static final Item GREY_MOSS_CARPET = createItem(new BlockItem(ModBlocks.GREY_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_MOSS_CARPET));
    public static final Item GREY_AZALEA = createItem(new BlockItem(ModBlocks.GREY_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_AZALEA));
    public static final Item GREY_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.GREY_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_FLOWERING_AZALEA));
    public static final Item GREY_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.GREY_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_FLOWERING_AZALEA_VARIANT));
    public static final Item GREY_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.GREY_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_AZALEA_LEAVES));
    public static final Item GREY_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.GREY_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_FLOWERING_AZALEA_LEAVES));
    public static final Item GREY_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.GREY_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.GREY_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item CYAN_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.CYAN_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_MOSS_BLOCK));
    public static final Item CYAN_MOSS_CARPET = createItem(new BlockItem(ModBlocks.CYAN_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_MOSS_CARPET));
    public static final Item CYAN_AZALEA = createItem(new BlockItem(ModBlocks.CYAN_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_AZALEA));
    public static final Item CYAN_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.CYAN_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_FLOWERING_AZALEA));
    public static final Item CYAN_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.CYAN_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_FLOWERING_AZALEA_VARIANT));
    public static final Item CYAN_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.CYAN_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_AZALEA_LEAVES));
    public static final Item CYAN_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES));
    public static final Item CYAN_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item PURPLE_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.PURPLE_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_MOSS_BLOCK));
    public static final Item PURPLE_MOSS_CARPET = createItem(new BlockItem(ModBlocks.PURPLE_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_MOSS_CARPET));
    public static final Item PURPLE_AZALEA = createItem(new BlockItem(ModBlocks.PURPLE_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_AZALEA));
    public static final Item PURPLE_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.PURPLE_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_FLOWERING_AZALEA));
    public static final Item PURPLE_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.PURPLE_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_FLOWERING_AZALEA_VARIANT));
    public static final Item PURPLE_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.PURPLE_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_AZALEA_LEAVES));
    public static final Item PURPLE_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES));
    public static final Item PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item BLUE_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.BLUE_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_MOSS_BLOCK));
    public static final Item BLUE_MOSS_CARPET = createItem(new BlockItem(ModBlocks.BLUE_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_MOSS_CARPET));
    public static final Item BLUE_AZALEA = createItem(new BlockItem(ModBlocks.BLUE_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_AZALEA));
    public static final Item BLUE_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.BLUE_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_FLOWERING_AZALEA));
    public static final Item BLUE_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.BLUE_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_FLOWERING_AZALEA_VARIANT));
    public static final Item BLUE_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BLUE_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_AZALEA_LEAVES));
    public static final Item BLUE_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES));
    public static final Item BLUE_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item BROWN_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.BROWN_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_MOSS_BLOCK));
    public static final Item BROWN_MOSS_CARPET = createItem(new BlockItem(ModBlocks.BROWN_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_MOSS_CARPET));
    public static final Item BROWN_AZALEA = createItem(new BlockItem(ModBlocks.BROWN_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_AZALEA));
    public static final Item BROWN_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.BROWN_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_FLOWERING_AZALEA));
    public static final Item BROWN_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.BROWN_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_FLOWERING_AZALEA_VARIANT));
    public static final Item BROWN_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BROWN_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_AZALEA_LEAVES));
    public static final Item BROWN_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES));
    public static final Item BROWN_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item RED_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.RED_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_MOSS_BLOCK));
    public static final Item RED_MOSS_CARPET = createItem(new BlockItem(ModBlocks.RED_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_MOSS_CARPET));
    public static final Item RED_AZALEA = createItem(new BlockItem(ModBlocks.RED_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_AZALEA));
    public static final Item RED_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.RED_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_FLOWERING_AZALEA));
    public static final Item RED_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.RED_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_FLOWERING_AZALEA_VARIANT));
    public static final Item RED_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.RED_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_AZALEA_LEAVES));
    public static final Item RED_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.RED_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_FLOWERING_AZALEA_LEAVES));
    public static final Item RED_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.RED_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.RED_FLOWERING_AZALEA_LEAVES_VARIANT));

    public static final Item BLACK_MOSS_BLOCK = createItem(new BlockItem(ModBlocks.BLACK_MOSS_BLOCK, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_MOSS_BLOCK));
    public static final Item BLACK_MOSS_CARPET = createItem(new BlockItem(ModBlocks.BLACK_MOSS_CARPET, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_MOSS_CARPET));
    public static final Item BLACK_AZALEA = createItem(new BlockItem(ModBlocks.BLACK_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_AZALEA));
    public static final Item BLACK_FLOWERING_AZALEA = createItem(new BlockItem(ModBlocks.BLACK_FLOWERING_AZALEA, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_FLOWERING_AZALEA));
    public static final Item BLACK_FLOWERING_AZALEA_VARIANT = createItem(new BlockItem(ModBlocks.BLACK_FLOWERING_AZALEA_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_FLOWERING_AZALEA_VARIANT));
    public static final Item BLACK_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BLACK_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_AZALEA_LEAVES));
    public static final Item BLACK_FLOWERING_AZALEA_LEAVES = createItem(new BlockItem(ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES));
    public static final Item BLACK_FLOWERING_AZALEA_LEAVES_VARIANT = createItem(new BlockItem(ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES_VARIANT, new Item.Settings().group(ColouredMoss.MOSS)), Registry.BLOCK.getId(ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES_VARIANT));



}
