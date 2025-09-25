package dev.wolfieboy09.createnetherless.api;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ItemTags {
    public static class StorageBlocks {
        public static final TagKey<Item> COAL = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/coal"));
    }

    public static final TagKey<Item> COALS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("minecraft", "coals"));
}
