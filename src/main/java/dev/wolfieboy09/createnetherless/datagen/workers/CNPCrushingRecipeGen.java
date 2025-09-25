package dev.wolfieboy09.createnetherless.datagen.workers;

import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CNPCrushingRecipeGen extends CrushingRecipeGen {
    public CNPCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe NETHERITE_FRAGMENT = create("netherite_fragment_by_crushing", b ->
            b.require(Items.BLACKSTONE)
                    .output(0.5f, Items.COAL)
                    .output(0.01f, CNPItems.NETHERITE_FRAGMENT)
                    .duration(250));
}
