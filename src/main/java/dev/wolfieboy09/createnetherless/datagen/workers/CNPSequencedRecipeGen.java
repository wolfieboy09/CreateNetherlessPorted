package dev.wolfieboy09.createnetherless.datagen.workers;

import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.fluids.transfer.FillingRecipe;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

public class CNPSequencedRecipeGen extends SequencedAssemblyRecipeGen {
    public CNPSequencedRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe BLAZE_ROD = create("blaze_rod_recipe_sequenced", b ->
            b.require(CNPItems.COAL_ROD)
                    .transitionTo(CNPItems.INCOMPLETE_BLAZE_ROD)
                    .addOutput(Items.BLAZE_ROD, 1)
                    .loops(4)
                    .addStep(FillingRecipe::new, rb -> rb.require(Fluids.LAVA, 250))
                    .addStep(FillingRecipe::new, rb -> rb.require(Fluids.LAVA, 250))
                    .addStep(PressingRecipe::new, rb -> rb)
        );

    GeneratedRecipe SOUL_SAND = create("soul_sand_recipe_sequenced", b ->
            b.require(Items.SAND)
                    .transitionTo(CNPItems.INCOMPLETE_SOUL_SAND)
                    .addOutput(Items.SOUL_SAND, 1)
                    .loops(8)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.BONE)));
}
