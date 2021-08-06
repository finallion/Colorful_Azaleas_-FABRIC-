package com.finallion.colouredmoss.feature;

import com.finallion.colouredmoss.ColouredMoss;
import com.finallion.colouredmoss.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class CMConfiguredFeatures {

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ColouredMoss.MOD_ID, id), feature);
    }

    private static ConfiguredFeature<SimpleBlockFeatureConfig, ?> buildMossFeature(Block floweringAzalea, Block azalea, Block mossCarpet, Block floweringAzaleaVariant) {
        return Feature.SIMPLE_BLOCK.configure(
                new SimpleBlockFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(floweringAzalea.getDefaultState(), 4)
                                .add(floweringAzaleaVariant.getDefaultState(), 2)
                                .add(azalea.getDefaultState(), 7)
                                .add(mossCarpet.getDefaultState(), 25)
                                .add(Blocks.GRASS.getDefaultState(), 50)
                                .add(Blocks.TALL_GRASS.getDefaultState(), 10)
                                .build())));
    }

    // tree gen
    public static final ConfiguredFeature<TreeFeatureConfig, ?> WHITE_AZALEA_TREE = register("white_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.WHITE_AZALEA_TREE_CONFIG));


    // moss gen
    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> WHITE_MOSS_VEGETATION = register("white_moss_vegetation", buildMossFeature(ModBlocks.WHITE_FLOWERING_AZALEA, ModBlocks.WHITE_AZALEA, ModBlocks.WHITE_MOSS_CARPET, ModBlocks.WHITE_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> WHITE_MOSS_PATCH_BONEMEAL = register("white_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.WHITE_MOSS_BLOCK.getDefaultState()), () -> { return WHITE_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIGHT_GREY_AZALEA_TREE = register("light_grey_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.LIGHT_GREY_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> LIGHT_GREY_MOSS_VEGETATION = register("light_grey_moss_vegetation", buildMossFeature(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA, ModBlocks.LIGHT_GREY_AZALEA, ModBlocks.LIGHT_GREY_MOSS_CARPET, ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> LIGHT_GREY_MOSS_PATCH_BONEMEAL = register("light_grey_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.LIGHT_GREY_MOSS_BLOCK.getDefaultState()), () -> { return LIGHT_GREY_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREY_AZALEA_TREE = register("grey_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.GREY_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> GREY_MOSS_VEGETATION = register("grey_moss_vegetation", buildMossFeature(ModBlocks.GREY_FLOWERING_AZALEA, ModBlocks.GREY_AZALEA, ModBlocks.GREY_MOSS_CARPET, ModBlocks.GREY_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> GREY_MOSS_PATCH_BONEMEAL = register("grey_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.GREY_MOSS_BLOCK.getDefaultState()), () -> { return GREY_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> BLACK_AZALEA_TREE = register("black_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.BLACK_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> BLACK_MOSS_VEGETATION = register("black_moss_vegetation", buildMossFeature(ModBlocks.BLACK_FLOWERING_AZALEA, ModBlocks.BLACK_AZALEA, ModBlocks.BLACK_MOSS_CARPET, ModBlocks.BLACK_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> BLACK_MOSS_PATCH_BONEMEAL = register("black_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.BLACK_MOSS_BLOCK.getDefaultState()), () -> { return BLACK_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> BROWN_AZALEA_TREE = register("brown_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.BROWN_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> BROWN_MOSS_VEGETATION = register("brown_moss_vegetation", buildMossFeature(ModBlocks.BROWN_FLOWERING_AZALEA, ModBlocks.BROWN_AZALEA, ModBlocks.BROWN_MOSS_CARPET, ModBlocks.BROWN_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> BROWN_MOSS_PATCH_BONEMEAL = register("brown_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.BROWN_MOSS_BLOCK.getDefaultState()), () -> { return BROWN_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> BLUE_AZALEA_TREE = register("blue_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.BLUE_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> BLUE_MOSS_VEGETATION = register("blue_moss_vegetation", buildMossFeature(ModBlocks.BLUE_FLOWERING_AZALEA, ModBlocks.BLUE_AZALEA, ModBlocks.BLUE_MOSS_CARPET, ModBlocks.BLUE_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> BLUE_MOSS_PATCH_BONEMEAL = register("blue_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.BLUE_MOSS_BLOCK.getDefaultState()), () -> { return BLUE_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> CYAN_AZALEA_TREE = register("cyan_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.CYAN_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> CYAN_MOSS_VEGETATION = register("cyan_moss_vegetation", buildMossFeature(ModBlocks.CYAN_FLOWERING_AZALEA, ModBlocks.CYAN_AZALEA, ModBlocks.CYAN_MOSS_CARPET, ModBlocks.CYAN_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> CYAN_MOSS_PATCH_BONEMEAL = register("cyan_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.CYAN_MOSS_BLOCK.getDefaultState()), () -> { return CYAN_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));



    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIGHT_BLUE_AZALEA_TREE = register("light_blue_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.LIGHT_BLUE_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> LIGHT_BLUE_MOSS_VEGETATION = register("light_blue_moss_vegetation", buildMossFeature(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA, ModBlocks.LIGHT_BLUE_AZALEA, ModBlocks.LIGHT_BLUE_MOSS_CARPET, ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> LIGHT_BLUE_MOSS_PATCH_BONEMEAL = register("light_blue_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.LIGHT_BLUE_MOSS_BLOCK.getDefaultState()), () -> { return LIGHT_BLUE_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> PINK_AZALEA_TREE = register("pink_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.PINK_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> PINK_MOSS_VEGETATION = register("pink_moss_vegetation", buildMossFeature(ModBlocks.PINK_FLOWERING_AZALEA, ModBlocks.PINK_AZALEA, ModBlocks.PINK_MOSS_CARPET, ModBlocks.PINK_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> PINK_MOSS_PATCH_BONEMEAL = register("pink_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.PINK_MOSS_BLOCK.getDefaultState()), () -> { return PINK_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> MAGENTA_AZALEA_TREE = register("magenta_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.MAGENTA_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> MAGENTA_MOSS_VEGETATION = register("magenta_moss_vegetation", buildMossFeature(ModBlocks.MAGENTA_FLOWERING_AZALEA, ModBlocks.MAGENTA_AZALEA, ModBlocks.MAGENTA_MOSS_CARPET, ModBlocks.MAGENTA_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> MAGENTA_MOSS_PATCH_BONEMEAL = register("magenta_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.MAGENTA_MOSS_BLOCK.getDefaultState()), () -> { return MAGENTA_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> PURPLE_AZALEA_TREE = register("purple_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.PURPLE_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> PURPLE_MOSS_VEGETATION = register("purple_moss_vegetation", buildMossFeature(ModBlocks.PURPLE_FLOWERING_AZALEA, ModBlocks.PURPLE_AZALEA, ModBlocks.PURPLE_MOSS_CARPET, ModBlocks.PURPLE_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> PURPLE_MOSS_PATCH_BONEMEAL = register("purple_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.PURPLE_MOSS_BLOCK.getDefaultState()), () -> { return PURPLE_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> RED_AZALEA_TREE = register("red_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.RED_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> RED_MOSS_VEGETATION = register("red_moss_vegetation", buildMossFeature(ModBlocks.RED_FLOWERING_AZALEA, ModBlocks.RED_AZALEA, ModBlocks.RED_MOSS_CARPET, ModBlocks.RED_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> RED_MOSS_PATCH_BONEMEAL = register("red_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.RED_MOSS_BLOCK.getDefaultState()), () -> { return RED_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_AZALEA_TREE = register("orange_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.ORANGE_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> ORANGE_MOSS_VEGETATION = register("orange_moss_vegetation", buildMossFeature(ModBlocks.ORANGE_FLOWERING_AZALEA, ModBlocks.ORANGE_AZALEA, ModBlocks.ORANGE_MOSS_CARPET, ModBlocks.ORANGE_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> ORANGE_MOSS_PATCH_BONEMEAL = register("orange_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.ORANGE_MOSS_BLOCK.getDefaultState()), () -> { return ORANGE_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));


    public static final ConfiguredFeature<TreeFeatureConfig, ?> YELLOW_AZALEA_TREE = register("yellow_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.YELLOW_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> YELLOW_MOSS_VEGETATION = register("yellow_moss_vegetation", buildMossFeature(ModBlocks.YELLOW_FLOWERING_AZALEA, ModBlocks.YELLOW_AZALEA, ModBlocks.YELLOW_MOSS_CARPET, ModBlocks.YELLOW_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> YELLOW_MOSS_PATCH_BONEMEAL = register("yellow_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.YELLOW_MOSS_BLOCK.getDefaultState()), () -> { return YELLOW_MOSS_VEGETATION;
            }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));



    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIME_AZALEA_TREE = register("lime_azalea_tree", Feature.TREE.configure(CMFeatureConfigs.LIME_AZALEA_TREE_CONFIG));

    public static final ConfiguredFeature<SimpleBlockFeatureConfig, ?> LIME_MOSS_VEGETATION = register("lime_moss_vegetation", buildMossFeature(ModBlocks.LIME_FLOWERING_AZALEA, ModBlocks.LIME_AZALEA, ModBlocks.LIME_MOSS_CARPET, ModBlocks.LIME_FLOWERING_AZALEA_VARIANT));

    public static final ConfiguredFeature<VegetationPatchFeatureConfig, ?> LIME_MOSS_PATCH_BONEMEAL = register("lime_moss_patch_bonemeal", Feature.VEGETATION_PATCH.configure(
            new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(ModBlocks.LIME_MOSS_BLOCK.getDefaultState()), () -> { return LIME_MOSS_VEGETATION;
    }, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F)));





    // variant trees

    public static final ConfiguredFeature<TreeFeatureConfig, ?> WHITE_AZALEA_TREE_VARIANT = register("white_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.WHITE_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIGHT_GREY_AZALEA_TREE_VARIANT = register("light_grey_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.LIGHT_GREY_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREY_AZALEA_TREE_VARIANT = register("grey_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.GREY_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> BLACK_AZALEA_TREE_VARIANT = register("black_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.BLACK_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> BROWN_AZALEA_TREE_VARIANT = register("brown_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.BROWN_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> BLUE_AZALEA_TREE_VARIANT = register("blue_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.BLUE_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIGHT_BLUE_AZALEA_TREE_VARIANT = register("light_blue_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.LIGHT_BLUE_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> CYAN_AZALEA_TREE_VARIANT = register("cyan_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.CYAN_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> PURPLE_AZALEA_TREE_VARIANT = register("purple_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.PURPLE_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> MAGENTA_AZALEA_TREE_VARIANT = register("magenta_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.MAGENTA_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> PINK_AZALEA_TREE_VARIANT = register("pink_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.PINK_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> RED_AZALEA_TREE_VARIANT = register("red_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.RED_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_AZALEA_TREE_VARIANT = register("orange_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.ORANGE_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> YELLOW_AZALEA_TREE_VARIANT = register("yellow_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.YELLOW_AZALEA_TREE_VARIANT_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIME_AZALEA_TREE_VARIANT = register("lime_azalea_tree_variant", Feature.TREE.configure(CMFeatureConfigs.LIME_AZALEA_TREE_VARIANT_CONFIG));





}
