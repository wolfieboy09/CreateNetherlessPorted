package dev.wolfieboy09.createnetherless.datagen.workers;

import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CNPHauntingRecipeGen extends HauntingRecipeGen {
    public CNPHauntingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe ENDER_PEARL = create("ender_pearl_by_haunting", b ->
            b.require(Items.SLIME_BALL)
                    .output(0.25f, Items.ENDER_PEARL));

    GeneratedRecipe GLOWSTONE_DUST = create("glowstone_dust_by_haunting", b ->
            b.require(Items.REDSTONE)
                    .output(Items.GLOWSTONE_DUST));

    GeneratedRecipe NETHER_QUARTZ = create("nether_quartz_by_haunting", b ->
            b.require(Items.AMETHYST_SHARD)
                    .output(Items.QUARTZ));

    GeneratedRecipe PIGSTEP = create("pigstep_from_haunting", b ->
            b.require(Items.MUSIC_DISC_OTHERSIDE)
                    .output(Items.MUSIC_DISC_PIGSTEP));

    GeneratedRecipe TWISTING_VINES = create("twisting_vines_haunting", b ->
            b.require(Items.BAMBOO)
                    .output(Items.TWISTING_VINES));

    GeneratedRecipe WEEPING_VINES = create("weeping_vines_haunting", b ->
            b.require(Items.VINE)
                    .output(Items.WEEPING_VINES));

    GeneratedRecipe WITHER_SKULL = create("wither_skull_haunting", b ->
            b.require(Items.SKELETON_SKULL)
                    .output(Items.WITHER_SKELETON_SKULL));
}
