package com.finallion.colouredmoss.block.sapling;

import com.finallion.colouredmoss.feature.CMConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PinkAzaleaSaplingGenerator extends SaplingGenerator {

    public PinkAzaleaSaplingGenerator() { }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return CMConfiguredFeatures.PINK_AZALEA_TREE;
    }
}