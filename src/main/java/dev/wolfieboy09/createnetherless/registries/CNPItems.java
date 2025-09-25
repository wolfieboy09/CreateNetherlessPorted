package dev.wolfieboy09.createnetherless.registries;

import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CNPItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateNetherless.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(CreateNetherless.MOD_ID);

    public static final DeferredItem<Item> COAL_ROD = ITEMS.registerSimpleItem("coal_rod");
    public static final DeferredItem<Item> ECTOPLASM = ITEMS.registerSimpleItem("ectoplasm");
    public static final DeferredItem<Item> INCOMPLETE_BLAZE_ROD = ITEMS.registerSimpleItem("incomplete_blaze_rod");
    public static final DeferredItem<BlockItem> INCOMPLETE_SOUL_SAND = BLOCK_ITEMS.registerSimpleBlockItem(CNPBlocks.INCOMPLETE_SOUL_SAND);

    public static final DeferredItem<Item> NETHERITE_FRAGMENT = ITEMS.registerSimpleItem("netherite_fragment");
}
