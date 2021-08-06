package com.finallion.colouredmoss.feature;

import com.finallion.colouredmoss.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;

public class CMFeatureConfigs {
    public static final TreeFeatureConfig WHITE_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.WHITE_AZALEA_LEAVES, ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES, ModBlocks.WHITE_AZALEA);
    public static final TreeFeatureConfig LIGHT_GREY_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.LIGHT_GREY_AZALEA_LEAVES, ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES, ModBlocks.LIGHT_GREY_AZALEA);
    public static final TreeFeatureConfig GREY_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.GREY_AZALEA_LEAVES, ModBlocks.GREY_FLOWERING_AZALEA_LEAVES, ModBlocks.GREY_AZALEA);
    public static final TreeFeatureConfig BLACK_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.BLACK_AZALEA_LEAVES, ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES, ModBlocks.BLACK_AZALEA);
    public static final TreeFeatureConfig BROWN_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.BROWN_AZALEA_LEAVES, ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES, ModBlocks.BROWN_AZALEA);
    public static final TreeFeatureConfig BLUE_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.BLUE_AZALEA_LEAVES, ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES, ModBlocks.BLUE_AZALEA);
    public static final TreeFeatureConfig CYAN_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.CYAN_AZALEA_LEAVES, ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES, ModBlocks.CYAN_AZALEA);
    public static final TreeFeatureConfig LIGHT_BLUE_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.LIGHT_BLUE_AZALEA_LEAVES, ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES, ModBlocks.LIGHT_BLUE_AZALEA);
    public static final TreeFeatureConfig PINK_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.PINK_AZALEA_LEAVES, ModBlocks.PINK_FLOWERING_AZALEA_LEAVES, ModBlocks.PINK_AZALEA);
    public static final TreeFeatureConfig MAGENTA_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.MAGENTA_AZALEA_LEAVES, ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES, ModBlocks.MAGENTA_AZALEA);
    public static final TreeFeatureConfig PURPLE_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.PURPLE_AZALEA_LEAVES, ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES, ModBlocks.PURPLE_AZALEA);
    public static final TreeFeatureConfig RED_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.RED_AZALEA_LEAVES, ModBlocks.RED_FLOWERING_AZALEA_LEAVES, ModBlocks.RED_AZALEA);
    public static final TreeFeatureConfig ORANGE_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.ORANGE_AZALEA_LEAVES, ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES, ModBlocks.ORANGE_AZALEA);
    public static final TreeFeatureConfig YELLOW_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.YELLOW_AZALEA_LEAVES, ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES, ModBlocks.YELLOW_AZALEA);
    public static final TreeFeatureConfig LIME_AZALEA_TREE_CONFIG = azaleaTreeLike(ModBlocks.LIME_AZALEA_LEAVES, ModBlocks.LIME_FLOWERING_AZALEA_LEAVES, ModBlocks.LIME_AZALEA);

    // tree variants
    public static final TreeFeatureConfig WHITE_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.WHITE_AZALEA_LEAVES, ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.WHITE_AZALEA);
    public static final TreeFeatureConfig LIGHT_GREY_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.LIGHT_GREY_AZALEA_LEAVES, ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.LIGHT_GREY_AZALEA);
    public static final TreeFeatureConfig GREY_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.GREY_AZALEA_LEAVES, ModBlocks.GREY_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.GREY_AZALEA);
    public static final TreeFeatureConfig BLACK_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.BLACK_AZALEA_LEAVES, ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.BLACK_AZALEA);
    public static final TreeFeatureConfig BROWN_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.BROWN_AZALEA_LEAVES, ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.BROWN_AZALEA);
    public static final TreeFeatureConfig BLUE_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.BLUE_AZALEA_LEAVES, ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.BLUE_AZALEA);
    public static final TreeFeatureConfig CYAN_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.CYAN_AZALEA_LEAVES, ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.CYAN_AZALEA);
    public static final TreeFeatureConfig LIGHT_BLUE_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.LIGHT_BLUE_AZALEA_LEAVES, ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.LIGHT_BLUE_AZALEA);
    public static final TreeFeatureConfig PINK_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.PINK_AZALEA_LEAVES, ModBlocks.PINK_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.PINK_AZALEA);
    public static final TreeFeatureConfig MAGENTA_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.MAGENTA_AZALEA_LEAVES, ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.MAGENTA_AZALEA);
    public static final TreeFeatureConfig PURPLE_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.PURPLE_AZALEA_LEAVES, ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.PURPLE_AZALEA);
    public static final TreeFeatureConfig RED_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.RED_AZALEA_LEAVES, ModBlocks.RED_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.RED_AZALEA);
    public static final TreeFeatureConfig ORANGE_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.ORANGE_AZALEA_LEAVES, ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.ORANGE_AZALEA);
    public static final TreeFeatureConfig YELLOW_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.YELLOW_AZALEA_LEAVES, ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.YELLOW_AZALEA);
    public static final TreeFeatureConfig LIME_AZALEA_TREE_VARIANT_CONFIG = azaleaTreeLike(ModBlocks.LIME_AZALEA_LEAVES, ModBlocks.LIME_FLOWERING_AZALEA_LEAVES_VARIANT, ModBlocks.LIME_AZALEA);



    // copy of the vanilla azalea tree
    private static TreeFeatureConfig azaleaTreeLike(Block leaves, Block floweringLeaves, Block sapling) {
        return new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(floweringLeaves.getDefaultState(), 1)),
                new SimpleBlockStateProvider(sapling.getDefaultState()),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirtProvider(new SimpleBlockStateProvider(Blocks.ROOTED_DIRT.getDefaultState()))
                .forceDirt()
                .build();
    }


}
