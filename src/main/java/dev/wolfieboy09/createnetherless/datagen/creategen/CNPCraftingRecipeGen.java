package dev.wolfieboy09.createnetherless.datagen.creategen;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import dev.wolfieboy09.createnetherless.api.ItemTags;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CNPCraftingRecipeGen extends RecipeProvider {
    public CNPCraftingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AllBlocks.BLAZE_BURNER)
                .pattern("BBB")
                .pattern("BSB")
                .pattern("BEB")
                .define('B', Items.BLAZE_ROD)
                .define('S', Items.SOUL_SAND)
                .define('E', AllItems.EMPTY_BLAZE_BURNER)
                .unlockedBy("has_blaze_rod", has(Items.BLAZE_ROD))
                .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
                .unlockedBy("has_empty_blaze_burner", has(AllItems.EMPTY_BLAZE_BURNER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANCIENT_DEBRIS)
                .pattern("FFF")
                .pattern("FNF")
                .pattern("FFF")
                .define('F', CNPItems.NETHERITE_FRAGMENT)
                .define('N', Items.NETHERRACK)
                .unlockedBy("has_netherite_fragment", has(CNPItems.NETHERITE_FRAGMENT))
                .unlockedBy("has_netherrack", has(Items.NETHERRACK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SOUL_TORCH, 4)
                .pattern("C")
                .pattern("S")
                .pattern("E")
                .define('C', ItemTags.COALS)
                .define('S', Items.STICK)
                .define('E', CNPItems.ECTOPLASM)
                .unlockedBy("has_charcoal", has(ItemTags.COALS))
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_ectoplasm", has(CNPItems.ECTOPLASM))
                .save(recipeOutput);
    }
}
