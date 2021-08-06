package com.finallion.colouredmoss.block.sapling;

import com.finallion.colouredmoss.feature.CMConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlackAzaleaVariantSaplingGenerator extends SaplingGenerator {

    public BlackAzaleaVariantSaplingGenerator() { }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return CMConfiguredFeatures.BLACK_AZALEA_TREE_VARIANT;
    }
}