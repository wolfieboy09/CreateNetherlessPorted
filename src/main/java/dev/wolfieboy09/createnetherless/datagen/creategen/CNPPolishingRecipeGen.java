package dev.wolfieboy09.createnetherless.datagen.creategen;

import com.simibubi.create.api.data.recipe.PolishingRecipeGen;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import dev.wolfieboy09.createnetherless.api.ItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class CNPPolishingRecipeGen extends PolishingRecipeGen {
    public CNPPolishingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe COAL_ROD = create("coal_rod_recipe", r ->
            r.require(Ingredient.of(ItemTags.StorageBlocks.COAL))
                    .output(CNPItems.COAL_ROD));
}
