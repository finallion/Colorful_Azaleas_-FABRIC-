package com.finallion.colouredmoss.registry;

import com.finallion.colouredmoss.ColouredMoss;
import com.finallion.colouredmoss.block.ColouredAzaleaBlock;
import com.finallion.colouredmoss.block.ColouredAzaleaVariantBlock;
import com.finallion.colouredmoss.block.ColouredMossBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static List<Block> blocksList = new ArrayList<>();

    public static void registerBlocks() { }

    public static Block createBlock(Block block, String id) {
        Registry.register(Registry.BLOCK, new Identifier(ColouredMoss.MOD_ID, id), block);
        blocksList.add(block);
        return block;
    }

    public static Block createPottedBlock(Block blockForPot, String id) {
        Block createBlock = new FlowerPotBlock(blockForPot, FabricBlockSettings.of(Material.REPLACEABLE_PLANT).breakInstantly().nonOpaque());
        Registry.register(Registry.BLOCK, new Identifier(ColouredMoss.MOD_ID, "potted_" + id), createBlock);
        blocksList.add(createBlock);
        return createBlock;
    }

    public static final Block WHITE_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "white_moss_block");
    public static final Block WHITE_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "white_moss_carpet");
    public static final Block WHITE_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "white_azalea");
    public static final Block WHITE_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "white_flowering_azalea");
    public static final Block WHITE_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "white_azalea_leaves");
    public static final Block WHITE_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "white_flowering_azalea_leaves");
    public static final Block WHITE_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "white_flowering_azalea_variant");
    public static final Block WHITE_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "white_flowering_azalea_leaves_variant");


    public static final Block LIGHT_GREY_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.LIGHT_GRAY).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "light_grey_moss_block");
    public static final Block LIGHT_GREY_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.LIGHT_GRAY).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "light_grey_moss_carpet");
    public static final Block LIGHT_GREY_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "light_grey_azalea");
    public static final Block LIGHT_GREY_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "light_grey_flowering_azalea");
    public static final Block LIGHT_GREY_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_grey_azalea_leaves");
    public static final Block LIGHT_GREY_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_grey_flowering_azalea_leaves");
    public static final Block LIGHT_GREY_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "light_grey_flowering_azalea_variant");
    public static final Block LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_grey_flowering_azalea_leaves_variant");


    public static final Block GREY_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.GRAY).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "grey_moss_block");
    public static final Block GREY_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GRAY).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "grey_moss_carpet");
    public static final Block GREY_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "grey_azalea");
    public static final Block GREY_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "grey_flowering_azalea");
    public static final Block GREY_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "grey_azalea_leaves");
    public static final Block GREY_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "grey_flowering_azalea_leaves");
    public static final Block GREY_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "grey_flowering_azalea_variant");
    public static final Block GREY_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "grey_flowering_azalea_leaves_variant");


    public static final Block BLACK_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.BLACK).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "black_moss_block");
    public static final Block BLACK_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.BLACK).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "black_moss_carpet");
    public static final Block BLACK_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "black_azalea");
    public static final Block BLACK_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "black_flowering_azalea");
    public static final Block BLACK_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "black_azalea_leaves");
    public static final Block BLACK_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "black_flowering_azalea_leaves");
    public static final Block BLACK_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "black_flowering_azalea_variant");
    public static final Block BLACK_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "black_flowering_azalea_leaves_variant");

    public static final Block BROWN_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.BROWN).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "brown_moss_block");
    public static final Block BROWN_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.BROWN).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "brown_moss_carpet");
    public static final Block BROWN_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "brown_azalea");
    public static final Block BROWN_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "brown_flowering_azalea");
    public static final Block BROWN_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "brown_azalea_leaves");
    public static final Block BROWN_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "brown_flowering_azalea_leaves");
    public static final Block BROWN_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "brown_flowering_azalea_variant");
    public static final Block BROWN_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "brown_flowering_azalea_leaves_variant");

    public static final Block BLUE_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.BLUE).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "blue_moss_block");
    public static final Block BLUE_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.BLUE).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "blue_moss_carpet");
    public static final Block BLUE_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "blue_azalea");
    public static final Block BLUE_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "blue_flowering_azalea");
    public static final Block BLUE_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "blue_azalea_leaves");
    public static final Block BLUE_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "blue_flowering_azalea_leaves");
    public static final Block BLUE_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "blue_flowering_azalea_variant");
    public static final Block BLUE_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "blue_flowering_azalea_leaves_variant");

    public static final Block CYAN_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.CYAN).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "cyan_moss_block");
    public static final Block CYAN_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.CYAN).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "cyan_moss_carpet");
    public static final Block CYAN_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "cyan_azalea");
    public static final Block CYAN_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "cyan_flowering_azalea");
    public static final Block CYAN_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "cyan_azalea_leaves");
    public static final Block CYAN_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "cyan_flowering_azalea_leaves");
    public static final Block CYAN_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "cyan_flowering_azalea_variant");
    public static final Block CYAN_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "cyan_flowering_azalea_leaves_variant");

    public static final Block LIGHT_BLUE_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.LIGHT_BLUE).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "light_blue_moss_block");
    public static final Block LIGHT_BLUE_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.LIGHT_BLUE).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "light_blue_moss_carpet");
    public static final Block LIGHT_BLUE_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "light_blue_azalea");
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "light_blue_flowering_azalea");
    public static final Block LIGHT_BLUE_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_blue_azalea_leaves");
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_blue_flowering_azalea_leaves");
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "light_blue_flowering_azalea_variant");
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "light_blue_flowering_azalea_leaves_variant");

    public static final Block PINK_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.PINK).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "pink_moss_block");
    public static final Block PINK_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.PINK).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "pink_moss_carpet");
    public static final Block PINK_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "pink_azalea");
    public static final Block PINK_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "pink_flowering_azalea");
    public static final Block PINK_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "pink_azalea_leaves");
    public static final Block PINK_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "pink_flowering_azalea_leaves");
    public static final Block PINK_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "pink_flowering_azalea_variant");
    public static final Block PINK_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "pink_flowering_azalea_leaves_variant");

    public static final Block MAGENTA_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.MAGENTA).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "magenta_moss_block");
    public static final Block MAGENTA_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.MAGENTA).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "magenta_moss_carpet");
    public static final Block MAGENTA_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "magenta_azalea");
    public static final Block MAGENTA_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "magenta_flowering_azalea");
    public static final Block MAGENTA_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "magenta_azalea_leaves");
    public static final Block MAGENTA_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "magenta_flowering_azalea_leaves");
    public static final Block MAGENTA_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "magenta_flowering_azalea_variant");
    public static final Block MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "magenta_flowering_azalea_leaves_variant");

    public static final Block PURPLE_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.PURPLE).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "purple_moss_block");
    public static final Block PURPLE_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.PURPLE).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "purple_moss_carpet");
    public static final Block PURPLE_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "purple_azalea");
    public static final Block PURPLE_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "purple_flowering_azalea");
    public static final Block PURPLE_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "purple_azalea_leaves");
    public static final Block PURPLE_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "purple_flowering_azalea_leaves");
    public static final Block PURPLE_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "purple_flowering_azalea_variant");
    public static final Block PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "purple_flowering_azalea_leaves_variant");

    public static final Block RED_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.RED).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "red_moss_block");
    public static final Block RED_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.RED).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "red_moss_carpet");
    public static final Block RED_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "red_azalea");
    public static final Block RED_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "red_flowering_azalea");
    public static final Block RED_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "red_azalea_leaves");
    public static final Block RED_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "red_flowering_azalea_leaves");
    public static final Block RED_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "red_flowering_azalea_variant");
    public static final Block RED_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "red_flowering_azalea_leaves_variant");

    public static final Block ORANGE_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.ORANGE).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "orange_moss_block");
    public static final Block ORANGE_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.ORANGE).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "orange_moss_carpet");
    public static final Block ORANGE_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "orange_azalea");
    public static final Block ORANGE_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "orange_flowering_azalea");
    public static final Block ORANGE_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "orange_azalea_leaves");
    public static final Block ORANGE_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "orange_flowering_azalea_leaves");
    public static final Block ORANGE_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "orange_flowering_azalea_variant");
    public static final Block ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "orange_flowering_azalea_leaves_variant");

    public static final Block YELLOW_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.YELLOW).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "yellow_moss_block");
    public static final Block YELLOW_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.YELLOW).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "yellow_moss_carpet");
    public static final Block YELLOW_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "yellow_azalea");
    public static final Block YELLOW_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "yellow_flowering_azalea");
    public static final Block YELLOW_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "yellow_azalea_leaves");
    public static final Block YELLOW_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "yellow_flowering_azalea_leaves");
    public static final Block YELLOW_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "yellow_flowering_azalea_variant");
    public static final Block YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "yellow_flowering_azalea_leaves_variant");

    public static final Block LIME_MOSS_BLOCK = createBlock(new ColouredMossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.LIME).strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)), "lime_moss_block");
    public static final Block LIME_MOSS_CARPET = createBlock(new CarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.LIME).strength(0.1F).sounds(BlockSoundGroup.MOSS_CARPET)), "lime_moss_carpet");
    public static final Block LIME_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.AZALEA).nonOpaque()), "lime_azalea");
    public static final Block LIME_FLOWERING_AZALEA = createBlock(new ColouredAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "lime_flowering_azalea");
    public static final Block LIME_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "lime_azalea_leaves");
    public static final Block LIME_FLOWERING_AZALEA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "lime_flowering_azalea_leaves");
    public static final Block LIME_FLOWERING_AZALEA_VARIANT = createBlock(new ColouredAzaleaVariantBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).nonOpaque()), "lime_flowering_azalea_variant");
    public static final Block LIME_FLOWERING_AZALEA_LEAVES_VARIANT = createBlock(new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()), "lime_flowering_azalea_leaves_variant");



    public static final Block POTTED_WHITE_AZALEA = createPottedBlock(WHITE_AZALEA, "white_azalea");
    public static final Block POTTED_WHITE_FLOWERING_AZALEA = createPottedBlock(WHITE_FLOWERING_AZALEA, "white_flowering_azalea");
    public static final Block POTTED_WHITE_FLOWERING_AZALEA_VARIANT = createPottedBlock(WHITE_FLOWERING_AZALEA_VARIANT, "white_flowering_azalea_variant");
    public static final Block POTTED_LIGHT_GREY_AZALEA = createPottedBlock(LIGHT_GREY_AZALEA, "light_grey_azalea");
    public static final Block POTTED_LIGHT_GREY_FLOWERING_AZALEA = createPottedBlock(LIGHT_GREY_FLOWERING_AZALEA, "light_grey_flowering_azalea");
    public static final Block POTTED_LIGHT_GREY_FLOWERING_AZALEA_VARIANT = createPottedBlock(LIGHT_GREY_FLOWERING_AZALEA_VARIANT, "light_grey_flowering_azalea_variant");
    public static final Block POTTED_GREY_AZALEA = createPottedBlock(GREY_AZALEA, "grey_azalea");
    public static final Block POTTED_GREY_FLOWERING_AZALEA = createPottedBlock(GREY_FLOWERING_AZALEA, "grey_flowering_azalea");
    public static final Block POTTED_GREY_FLOWERING_AZALEA_VARIANT = createPottedBlock(GREY_FLOWERING_AZALEA_VARIANT, "grey_flowering_azalea_variant");
    public static final Block POTTED_BLACK_AZALEA = createPottedBlock(BLACK_AZALEA, "black_azalea");
    public static final Block POTTED_BLACK_FLOWERING_AZALEA = createPottedBlock(BLACK_FLOWERING_AZALEA, "black_flowering_azalea");
    public static final Block POTTED_BLACK_FLOWERING_AZALEA_VARIANT = createPottedBlock(BLACK_FLOWERING_AZALEA_VARIANT, "black_flowering_azalea_variant");
    public static final Block POTTED_BROWN_AZALEA = createPottedBlock(BROWN_AZALEA, "brown_azalea");
    public static final Block POTTED_BROWN_FLOWERING_AZALEA = createPottedBlock(BROWN_FLOWERING_AZALEA, "brown_flowering_azalea");
    public static final Block POTTED_BROWN_FLOWERING_AZALEA_VARIANT = createPottedBlock(BROWN_FLOWERING_AZALEA_VARIANT, "brown_flowering_azalea_variant");
    public static final Block POTTED_BLUE_AZALEA = createPottedBlock(BLUE_AZALEA, "blue_azalea");
    public static final Block POTTED_BLUE_FLOWERING_AZALEA = createPottedBlock(BLUE_FLOWERING_AZALEA, "blue_flowering_azalea");
    public static final Block POTTED_BLUE_FLOWERING_AZALEA_VARIANT = createPottedBlock(BLUE_FLOWERING_AZALEA_VARIANT, "blue_flowering_azalea_variant");
    public static final Block POTTED_CYAN_AZALEA = createPottedBlock(CYAN_AZALEA, "cyan_azalea");
    public static final Block POTTED_CYAN_FLOWERING_AZALEA = createPottedBlock(CYAN_FLOWERING_AZALEA, "cyan_flowering_azalea");
    public static final Block POTTED_CYAN_FLOWERING_AZALEA_VARIANT = createPottedBlock(CYAN_FLOWERING_AZALEA_VARIANT, "cyan_flowering_azalea_variant");
    public static final Block POTTED_LIGHT_BLUE_AZALEA = createPottedBlock(LIGHT_BLUE_AZALEA, "light_blue_azalea");
    public static final Block POTTED_LIGHT_BLUE_FLOWERING_AZALEA = createPottedBlock(LIGHT_BLUE_FLOWERING_AZALEA, "light_blue_flowering_azalea");
    public static final Block POTTED_LIGHT_BLUE_FLOWERING_AZALEA_VARIANT = createPottedBlock(LIGHT_BLUE_FLOWERING_AZALEA_VARIANT, "light_blue_flowering_azalea_variant");
    public static final Block POTTED_PINK_AZALEA = createPottedBlock(PINK_AZALEA, "pink_azalea");
    public static final Block POTTED_PINK_FLOWERING_AZALEA = createPottedBlock(PINK_FLOWERING_AZALEA, "pink_flowering_azalea");
    public static final Block POTTED_PINK_FLOWERING_AZALEA_VARIANT = createPottedBlock(PINK_FLOWERING_AZALEA_VARIANT, "pink_flowering_azalea_variant");
    public static final Block POTTED_MAGENTA_AZALEA = createPottedBlock(MAGENTA_AZALEA, "magenta_azalea");
    public static final Block POTTED_MAGENTA_FLOWERING_AZALEA = createPottedBlock(MAGENTA_FLOWERING_AZALEA, "magenta_flowering_azalea");
    public static final Block POTTED_MAGENTA_FLOWERING_AZALEA_VARIANT = createPottedBlock(MAGENTA_FLOWERING_AZALEA_VARIANT, "magenta_flowering_azalea_variant");
    public static final Block POTTED_PURPLE_AZALEA = createPottedBlock(PURPLE_AZALEA, "purple_azalea");
    public static final Block POTTED_PURPLE_FLOWERING_AZALEA = createPottedBlock(PURPLE_FLOWERING_AZALEA, "purple_flowering_azalea");
    public static final Block POTTED_PURPLE_FLOWERING_AZALEA_VARIANT = createPottedBlock(PURPLE_FLOWERING_AZALEA_VARIANT, "purple_flowering_azalea_variant");
    public static final Block POTTED_RED_AZALEA = createPottedBlock(RED_AZALEA, "red_azalea");
    public static final Block POTTED_RED_FLOWERING_AZALEA = createPottedBlock(RED_FLOWERING_AZALEA, "red_flowering_azalea");
    public static final Block POTTED_RED_FLOWERING_AZALEA_VARIANT = createPottedBlock(RED_FLOWERING_AZALEA_VARIANT, "red_flowering_azalea_variant");
    public static final Block POTTED_ORANGE_AZALEA = createPottedBlock(ORANGE_AZALEA, "orange_azalea");
    public static final Block POTTED_ORANGE_FLOWERING_AZALEA = createPottedBlock(ORANGE_FLOWERING_AZALEA, "orange_flowering_azalea");
    public static final Block POTTED_ORANGE_FLOWERING_AZALEA_VARIANT = createPottedBlock(ORANGE_FLOWERING_AZALEA_VARIANT, "orange_flowering_azalea_variant");
    public static final Block POTTED_YELLOW_AZALEA = createPottedBlock(YELLOW_AZALEA, "yellow_azalea");
    public static final Block POTTED_YELLOW_FLOWERING_AZALEA = createPottedBlock(YELLOW_FLOWERING_AZALEA, "yellow_flowering_azalea");
    public static final Block POTTED_YELLOW_FLOWERING_AZALEA_VARIANT = createPottedBlock(YELLOW_FLOWERING_AZALEA_VARIANT, "yellow_flowering_azalea_variant");
    public static final Block POTTED_LIME_AZALEA = createPottedBlock(LIME_AZALEA, "lime_azalea");
    public static final Block POTTED_LIME_FLOWERING_AZALEA = createPottedBlock(LIME_FLOWERING_AZALEA, "lime_flowering_azalea");
    public static final Block POTTED_LIME_FLOWERING_AZALEA_VARIANT = createPottedBlock(LIME_FLOWERING_AZALEA_VARIANT, "lime_flowering_azalea_variant");


}
