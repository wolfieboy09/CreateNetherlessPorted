package dev.wolfieboy09.createnetherless.datagen;

import dev.wolfieboy09.createnetherless.CreateNetherless;
import dev.wolfieboy09.createnetherless.datagen.creategen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CreateNetherless.MOD_ID)
public class CNPDataGeneration {
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new CNPCompactingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPCraftingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPDeployingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPFillingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPHauntingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPCrushingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPManualDeployingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPMixingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPPolishingRecipeGen(output, lookupProvider));
        event.addProvider(new CNPSequencedRecipeGen(output, lookupProvider));

        event.addProvider(new CNPGlobalLootModifierProvider(output, lookupProvider));
    }
}
