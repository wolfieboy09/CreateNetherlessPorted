package dev.wolfieboy09.createnetherless.datagen;

import dev.wolfieboy09.createnetherless.CreateNetherless;
import dev.wolfieboy09.createnetherless.loot.AddItemModifier;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class CNPGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public CNPGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateNetherless.MOD_ID);
    }

    @Override
    protected void start() {
        add("phantom_ectoplasm",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(
                                ResourceLocation.withDefaultNamespace("entities/phantom")
                        ).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build(),
                        LootItemKilledByPlayerCondition.killedByPlayer().build()
                }, CNPItems.ECTOPLASM.get()));
    }
}
