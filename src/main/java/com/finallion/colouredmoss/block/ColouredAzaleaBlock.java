package com.finallion.colouredmoss.block;

import com.finallion.colouredmoss.block.sapling.*;
import com.finallion.colouredmoss.registry.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.sapling.AzaleaSaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;


public class ColouredAzaleaBlock extends AzaleaBlock {
    private static final WhiteAzaleaSaplingGenerator whiteGenerator = new WhiteAzaleaSaplingGenerator();
    private static final LightGreyAzaleaSaplingGenerator lightGreyGenerator = new LightGreyAzaleaSaplingGenerator();
    private static final GreyAzaleaSaplingGenerator greyGenerator = new GreyAzaleaSaplingGenerator();
    private static final BlackAzaleaSaplingGenerator blackGenerator = new BlackAzaleaSaplingGenerator();
    private static final BrownAzaleaSaplingGenerator brownGenerator = new BrownAzaleaSaplingGenerator();
    private static final BlueAzaleaSaplingGenerator blueGenerator = new BlueAzaleaSaplingGenerator();
    private static final CyanAzaleaSaplingGenerator cyanGenerator = new CyanAzaleaSaplingGenerator();
    private static final LightBlueAzaleaSaplingGenerator lightBlueGenerator = new LightBlueAzaleaSaplingGenerator();
    private static final PinkAzaleaSaplingGenerator pinkGenerator = new PinkAzaleaSaplingGenerator();
    private static final MagentaAzaleaSaplingGenerator magentaGenerator = new MagentaAzaleaSaplingGenerator();
    private static final PurpleAzaleaSaplingGenerator purpleGenerator = new PurpleAzaleaSaplingGenerator();
    private static final RedAzaleaSaplingGenerator redGenerator = new RedAzaleaSaplingGenerator();
    private static final OrangeAzaleaSaplingGenerator orangeGenerator = new OrangeAzaleaSaplingGenerator();
    private static final YellowAzaleaSaplingGenerator yellowGenerator = new YellowAzaleaSaplingGenerator();
    private static final LimeAzaleaSaplingGenerator limeGenerator = new LimeAzaleaSaplingGenerator();


    public ColouredAzaleaBlock(Settings settings) {
        super(settings);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {

        // normal and flowering azalea = normal tree
        if (this.getDefaultState().isOf(ModBlocks.WHITE_AZALEA) || this.getDefaultState().isOf(ModBlocks.WHITE_FLOWERING_AZALEA) ) {
            whiteGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_GREY_AZALEA) || this.getDefaultState().isOf(ModBlocks.LIGHT_GREY_FLOWERING_AZALEA) ) {
            lightGreyGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.GREY_AZALEA) || this.getDefaultState().isOf(ModBlocks.GREY_FLOWERING_AZALEA) ) {
            greyGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BLACK_AZALEA) || this.getDefaultState().isOf(ModBlocks.BLACK_FLOWERING_AZALEA) ) {
            blackGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BROWN_AZALEA) || this.getDefaultState().isOf(ModBlocks.BROWN_FLOWERING_AZALEA) ) {
            brownGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.BLUE_AZALEA) || this.getDefaultState().isOf(ModBlocks.BLUE_FLOWERING_AZALEA) ) {
            blueGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.CYAN_AZALEA) || this.getDefaultState().isOf(ModBlocks.CYAN_FLOWERING_AZALEA) ) {
            cyanGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIGHT_BLUE_AZALEA) || this.getDefaultState().isOf(ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA) ) {
            lightBlueGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.PINK_AZALEA) || this.getDefaultState().isOf(ModBlocks.PINK_FLOWERING_AZALEA) ) {
            pinkGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.MAGENTA_AZALEA) || this.getDefaultState().isOf(ModBlocks.MAGENTA_FLOWERING_AZALEA) ) {
            magentaGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.PURPLE_AZALEA) || this.getDefaultState().isOf(ModBlocks.PURPLE_FLOWERING_AZALEA) ) {
            purpleGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.RED_AZALEA) || this.getDefaultState().isOf(ModBlocks.RED_FLOWERING_AZALEA) ) {
            redGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.ORANGE_AZALEA) || this.getDefaultState().isOf(ModBlocks.ORANGE_FLOWERING_AZALEA) ) {
            orangeGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.YELLOW_AZALEA) || this.getDefaultState().isOf(ModBlocks.YELLOW_FLOWERING_AZALEA) ) {
            yellowGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        } else if (this.getDefaultState().isOf(ModBlocks.LIME_AZALEA) || this.getDefaultState().isOf(ModBlocks.LIME_FLOWERING_AZALEA) ) {
            limeGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
        }
    }
}


