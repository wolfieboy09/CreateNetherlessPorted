package dev.wolfieboy09.createnetherless.datagen.creategen;

import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

public final class CNPMixingRecipeGen extends MixingRecipeGen {

    GeneratedRecipe BASALT = create("basalt_by_mixing", b ->
            b.require(Items.PACKED_ICE)
                    .require(Items.SOUL_SOIL)
                    .require(Fluids.LAVA, 250)
                    .output(Items.BASALT)
                    .requiresHeat(HeatCondition.HEATED)
    );

    public CNPMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }
}
