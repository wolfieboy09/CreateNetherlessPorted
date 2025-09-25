package dev.wolfieboy09.createnetherless.datagen.creategen;

import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

public class CNPFillingRecipeGen extends FillingRecipeGen {
    public CNPFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe MAGMA = create("magma_from_filling", b ->
            b.require(Items.BLACKSTONE)
                    .require(Fluids.LAVA, 500)
                    .output(Items.MAGMA_BLOCK));

    GeneratedRecipe NETHERRACK = create("netherrack_from_filling", b ->
            b.require(Items.MAGMA_BLOCK)
                    .require(Fluids.LAVA, 1000)
                    .output(Items.NETHERRACK));
}
