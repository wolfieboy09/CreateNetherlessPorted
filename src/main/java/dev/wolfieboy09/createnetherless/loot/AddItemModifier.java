package dev.wolfieboy09.createnetherless.loot;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class AddItemModifier extends LootModifier {
    public static final MapCodec<AddItemModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
            LootModifier.codecStart(inst).and(
                            BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(e -> e.item)
                    ).apply(inst, AddItemModifier::new)
    );

    private final Item item;

    public AddItemModifier(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext lootContext) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(lootContext)) {
                return generatedLoot;
            }
        }
        generatedLoot.add(new ItemStack(this.item));
        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
