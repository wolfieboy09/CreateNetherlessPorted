package dev.wolfieboy09.createnetherless.datagen.workers;

import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import dev.wolfieboy09.createnetherless.CreateNetherless;
import dev.wolfieboy09.createnetherless.api.ItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CNPCompactingRecipeGen extends CompactingRecipeGen {
    public CNPCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    GeneratedRecipe DEEPSLATE_FROM_COMPACTING_COALS = create("deepslate_from_compacting_coals", b ->
            b.require(Items.CHARCOAL)
                    .require(ItemTags.COALS)
                    .require(Items.STONE)
                    .output(Items.DEEPSLATE));
}
