package com.finallion.colouredmoss;

import com.finallion.colouredmoss.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


@Environment(EnvType.CLIENT)
public class ColouredMossClient implements ClientModInitializer {
    public static final RenderLayer LEAVE_BLOCK_LAYER = RenderLayer.getTranslucent();
    public static final RenderLayer PLANT_BLOCK_LAYER = RenderLayer.getCutout();

    @Override
    public void onInitializeClient() {

        // bushes
        BlockRenderLayerMap.INSTANCE.putBlocks(PLANT_BLOCK_LAYER,
                ModBlocks.WHITE_AZALEA,
                ModBlocks.WHITE_FLOWERING_AZALEA,
                ModBlocks.GREY_AZALEA,
                ModBlocks.GREY_FLOWERING_AZALEA,
                ModBlocks.LIGHT_GREY_AZALEA,
                ModBlocks.LIGHT_GREY_FLOWERING_AZALEA,
                ModBlocks.BLACK_AZALEA,
                ModBlocks.BLACK_FLOWERING_AZALEA,
                ModBlocks.BROWN_AZALEA,
                ModBlocks.BROWN_FLOWERING_AZALEA,
                ModBlocks.BLUE_AZALEA,
                ModBlocks.BLUE_FLOWERING_AZALEA,
                ModBlocks.CYAN_AZALEA,
                ModBlocks.CYAN_FLOWERING_AZALEA,
                ModBlocks.LIGHT_BLUE_AZALEA,
                ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA,
                ModBlocks.PINK_AZALEA,
                ModBlocks.PINK_FLOWERING_AZALEA,
                ModBlocks.MAGENTA_AZALEA,
                ModBlocks.MAGENTA_FLOWERING_AZALEA,
                ModBlocks.PURPLE_AZALEA,
                ModBlocks.PURPLE_FLOWERING_AZALEA,
                ModBlocks.RED_AZALEA,
                ModBlocks.RED_FLOWERING_AZALEA,
                ModBlocks.ORANGE_AZALEA,
                ModBlocks.ORANGE_FLOWERING_AZALEA,
                ModBlocks.YELLOW_AZALEA,
                ModBlocks.YELLOW_FLOWERING_AZALEA,
                ModBlocks.LIME_AZALEA,
                ModBlocks.LIME_FLOWERING_AZALEA,

                ModBlocks.WHITE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.GREY_FLOWERING_AZALEA_VARIANT,
                ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_VARIANT,
                ModBlocks.BLACK_FLOWERING_AZALEA_VARIANT,
                ModBlocks.BROWN_FLOWERING_AZALEA_VARIANT,
                ModBlocks.BLUE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.CYAN_FLOWERING_AZALEA_VARIANT,
                ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.PINK_FLOWERING_AZALEA_VARIANT,
                ModBlocks.MAGENTA_FLOWERING_AZALEA_VARIANT,
                ModBlocks.PURPLE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.RED_FLOWERING_AZALEA_VARIANT,
                ModBlocks.ORANGE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.YELLOW_FLOWERING_AZALEA_VARIANT,
                ModBlocks.LIME_FLOWERING_AZALEA_VARIANT
        );


        // leaves
        BlockRenderLayerMap.INSTANCE.putBlocks(LEAVE_BLOCK_LAYER,
                ModBlocks.WHITE_AZALEA_LEAVES,
                ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES,
                ModBlocks.GREY_AZALEA_LEAVES,
                ModBlocks.GREY_FLOWERING_AZALEA_LEAVES,
                ModBlocks.LIGHT_GREY_AZALEA_LEAVES,
                ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES,
                ModBlocks.BLACK_AZALEA_LEAVES,
                ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES,
                ModBlocks.BROWN_AZALEA_LEAVES,
                ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES,
                ModBlocks.BLUE_AZALEA_LEAVES,
                ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES,
                ModBlocks.CYAN_AZALEA_LEAVES,
                ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES,
                ModBlocks.LIGHT_BLUE_AZALEA_LEAVES,
                ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES,
                ModBlocks.PINK_AZALEA_LEAVES,
                ModBlocks.PINK_FLOWERING_AZALEA_LEAVES,
                ModBlocks.MAGENTA_AZALEA_LEAVES,
                ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES,
                ModBlocks.PURPLE_AZALEA_LEAVES,
                ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES,
                ModBlocks.RED_AZALEA_LEAVES,
                ModBlocks.RED_FLOWERING_AZALEA_LEAVES,
                ModBlocks.ORANGE_AZALEA_LEAVES,
                ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES,
                ModBlocks.YELLOW_AZALEA_LEAVES,
                ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES,
                ModBlocks.LIME_AZALEA_LEAVES,
                ModBlocks.LIME_FLOWERING_AZALEA_LEAVES,

                ModBlocks.WHITE_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.GREY_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.LIGHT_GREY_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.BLACK_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.BROWN_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.BLUE_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.CYAN_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.PINK_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.PURPLE_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.RED_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.ORANGE_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.YELLOW_FLOWERING_AZALEA_LEAVES_VARIANT,
                ModBlocks.LIME_FLOWERING_AZALEA_LEAVES_VARIANT
        );


        // potted
        BlockRenderLayerMap.INSTANCE.putBlocks(PLANT_BLOCK_LAYER,
                ModBlocks.POTTED_WHITE_AZALEA,
                ModBlocks.POTTED_WHITE_FLOWERING_AZALEA,
                ModBlocks.POTTED_GREY_AZALEA,
                ModBlocks.POTTED_GREY_FLOWERING_AZALEA,
                ModBlocks.POTTED_LIGHT_GREY_AZALEA,
                ModBlocks.POTTED_LIGHT_GREY_FLOWERING_AZALEA,
                ModBlocks.POTTED_BLACK_AZALEA,
                ModBlocks.POTTED_BLACK_FLOWERING_AZALEA,
                ModBlocks.POTTED_BROWN_AZALEA,
                ModBlocks.POTTED_BROWN_FLOWERING_AZALEA,
                ModBlocks.POTTED_BLUE_AZALEA,
                ModBlocks.POTTED_BLUE_FLOWERING_AZALEA,
                ModBlocks.POTTED_CYAN_AZALEA,
                ModBlocks.POTTED_CYAN_FLOWERING_AZALEA,
                ModBlocks.POTTED_LIGHT_BLUE_AZALEA,
                ModBlocks.POTTED_LIGHT_BLUE_FLOWERING_AZALEA,
                ModBlocks.POTTED_PINK_AZALEA,
                ModBlocks.POTTED_PINK_FLOWERING_AZALEA,
                ModBlocks.POTTED_MAGENTA_AZALEA,
                ModBlocks.POTTED_MAGENTA_FLOWERING_AZALEA,
                ModBlocks.POTTED_PURPLE_AZALEA,
                ModBlocks.POTTED_PURPLE_FLOWERING_AZALEA,
                ModBlocks.POTTED_RED_AZALEA,
                ModBlocks.POTTED_RED_FLOWERING_AZALEA,
                ModBlocks.POTTED_ORANGE_AZALEA,
                ModBlocks.POTTED_ORANGE_FLOWERING_AZALEA,
                ModBlocks.POTTED_YELLOW_AZALEA,
                ModBlocks.POTTED_YELLOW_FLOWERING_AZALEA,
                ModBlocks.POTTED_LIME_AZALEA,
                ModBlocks.POTTED_LIME_FLOWERING_AZALEA,

                ModBlocks.POTTED_WHITE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_GREY_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_LIGHT_GREY_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_BLACK_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_BROWN_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_BLUE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_CYAN_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_LIGHT_BLUE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_PINK_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_MAGENTA_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_PURPLE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_RED_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_ORANGE_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_YELLOW_FLOWERING_AZALEA_VARIANT,
                ModBlocks.POTTED_LIME_FLOWERING_AZALEA_VARIANT
        );

    }
}
