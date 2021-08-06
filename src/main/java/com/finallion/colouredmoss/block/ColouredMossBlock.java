package com.finallion.colouredmoss.block;

import com.finallion.colouredmoss.feature.CMConfiguredFeatures;
import com.finallion.colouredmoss.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class ColouredMossBlock extends Block implements Fertilizable {

    public ColouredMossBlock(Settings settings) {
        super(settings);
    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {

        if (this.getDefaultState().isOf(ModBlocks.WHITE_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.WHITE_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_GREY_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.LIGHT_GREY_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.GREY_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.GREY_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.BLACK_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.BLACK_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.BROWN_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.BROWN_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.BLUE_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.BLUE_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.CYAN_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.CYAN_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_BLUE_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.LIGHT_BLUE_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.PINK_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.PINK_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.MAGENTA_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.MAGENTA_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.PURPLE_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.PURPLE_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.RED_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.RED_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.ORANGE_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.ORANGE_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.YELLOW_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.YELLOW_MOSS_PATCH_BONEMEAL.getConfig()));
        } else if (this.getDefaultState().isOf(ModBlocks.LIME_MOSS_BLOCK)) {
            Feature.VEGETATION_PATCH.generate(new FeatureContext(world, world.getChunkManager().getChunkGenerator(), random, pos.up(), CMConfiguredFeatures.LIME_MOSS_PATCH_BONEMEAL.getConfig()));
        }


    }
}