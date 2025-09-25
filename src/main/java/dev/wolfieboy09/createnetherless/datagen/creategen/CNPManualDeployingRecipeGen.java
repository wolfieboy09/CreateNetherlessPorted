package dev.wolfieboy09.createnetherless.datagen.creategen;

import com.simibubi.create.api.data.recipe.ItemApplicationRecipeGen;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CNPManualDeployingRecipeGen extends ItemApplicationRecipeGen {
    public CNPManualDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe CRIMSON_NYLIUM_DEPLOYING = create("crimson_nylium_manual_deploying", b ->
            b.require(Items.MYCELIUM)
                    .require(Items.CRIMSON_FUNGUS)
                    .output(Items.CRIMSON_NYLIUM));

    GeneratedRecipe SOUL_SAND = create("soulsand_manual_deploying", b ->
            b.require(Items.SAND)
                    .require(Items.BONE_BLOCK)
                    .output(Items.SOUL_SAND));

    GeneratedRecipe WARPED_NYLIUM = create("warped_nylium_manual_deploying", b ->
            b.require(Items.MYCELIUM)
                    .require(Items.WARPED_FUNGUS)
                    .output(Items.WARPED_NYLIUM));
}
