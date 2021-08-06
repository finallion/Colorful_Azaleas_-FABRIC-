package com.finallion.colouredmoss.block;

import com.finallion.colouredmoss.block.sapling.*;
import com.finallion.colouredmoss.registry.ModBlocks;
import net.minecraft.block.AzaleaBlock;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;


public class ColouredAzaleaVariantBlock extends AzaleaBlock {
    private static final WhiteAzaleaVariantSaplingGenerator whiteGenerator = new WhiteAzaleaVariantSaplingGenerator();
    private static final LightGreyAzaleaVariantSaplingGenerator lightGreyGenerator = new LightGreyAzaleaVariantSaplingGenerator();
    private static final GreyAzaleaVariantSaplingGenerator greyGenerator = new GreyAzaleaVariantSaplingGenerator();
    private static final BlackAzaleaVariantSaplingGenerator blackGenerator = new BlackAzaleaVariantSaplingGenerator();
    private static final BrownAzaleaVariantSaplingGenerator brownGenerator = new BrownAzaleaVariantSaplingGenerator();
    private static final BlueAzaleaVariantSaplingGenerator blueGenerator = new BlueAzaleaVariantSaplingGenerator();
    private static final CyanAzaleaVariantSaplingGenerator cyanGenerator = new CyanAzaleaVariantSaplingGenerator();
    private static final LightBlueAzaleaVariantSaplingGenerator lightBlueGenerator = new LightBlueAzaleaVariantSaplingGenerator();
    private static final PinkAzaleaVariantSaplingGenerator pinkGenerator = new PinkAzaleaVariantSaplingGenerator();
    private static final MagentaAzaleaVariantSaplingGenerator magentaGenerator = new MagentaAzaleaVariantSaplingGenerator();
    private static final PurpleAzaleaVariantSaplingGenerator purpleGenerator = new PurpleAzaleaVariantSaplingGenerator();
    private static final RedAzaleaVariantSaplingGenerator redGenerator = new RedAzaleaVariantSaplingGenerator();
    private static final OrangeAzaleaVariantSaplingGenerator orangeGenerator = new OrangeAzaleaVariantSaplingGenerator();
    private static final YellowAzaleaVariantSaplingGenerator yellowGenerator = new YellowAzaleaVariantSaplingGenerator();
    private static final LimeAzaleaVariantSaplingGenerator limeGenerator = new LimeAzaleaVariantSaplingGenerator();


    public ColouredAzaleaVariantBlock(Settings settings) {
        super(settings);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {

        // variant azalea = variant tree
        if (this.getDefaultState().isOf(ModBlocks.WHITE_FLOWERING_AZALEA_VARIANT) ) {
            whiteGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_VARIANT) ) {
            lightGreyGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.GREY_FLOWERING_AZALEA_VARIANT) ) {
            greyGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BLACK_FLOWERING_AZALEA_VARIANT) ) {
            blackGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BROWN_FLOWERING_AZALEA_VARIANT) ) {
            brownGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BLUE_FLOWERING_AZALEA_VARIANT) ) {
            blueGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.CYAN_FLOWERING_AZALEA_VARIANT) ) {
            cyanGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_VARIANT) ) {
            lightBlueGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.PINK_FLOWERING_AZALEA_VARIANT) ) {
            pinkGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.MAGENTA_FLOWERING_AZALEA_VARIANT) ) {
            magentaGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.PURPLE_FLOWERING_AZALEA_VARIANT) ) {
            purpleGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.RED_FLOWERING_AZALEA_VARIANT) ) {
            redGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.ORANGE_FLOWERING_AZALEA_VARIANT) ) {
            orangeGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.YELLOW_FLOWERING_AZALEA_VARIANT) ) {
            yellowGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIME_FLOWERING_AZALEA_VARIANT) ) {
            limeGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        }
    }
}


