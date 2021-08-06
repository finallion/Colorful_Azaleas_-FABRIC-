package com.finallion.colouredmoss.block.sapling;

import com.finallion.colouredmoss.feature.CMConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlueAzaleaSaplingGenerator extends SaplingGenerator {

    public BlueAzaleaSaplingGenerator() { }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return CMConfiguredFeatures.BLUE_AZALEA_TREE;
    }
}