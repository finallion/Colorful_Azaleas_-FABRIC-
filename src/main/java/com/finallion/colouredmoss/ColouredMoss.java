package com.finallion.colouredmoss;

import com.finallion.colouredmoss.registry.ModBlocks;
import com.finallion.colouredmoss.registry.ModItems;
import com.finallion.colouredmoss.registry.ModTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColouredMoss implements ModInitializer {
    public static final String MOD_ID = "colouredmoss";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModTags.init();

    }


    public static ItemGroup MOSS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "moss"))
            .icon(() -> new ItemStack(ModItems.RED_FLOWERING_AZALEA)).build();

}
