package dev.wolfieboy09.createnetherless.registries;

import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CNPCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNetherless.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_MODE_TAB = CREATIVE_TAB.register("create_netherless", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(CNPItems.ECTOPLASM.get()))
            .title(Component.translatable("item_group.create_netherless.create_netherless"))
            .displayItems(((param, output) -> {
                output.accept(CNPItems.COAL_ROD);
                output.accept(CNPItems.ECTOPLASM);
                output.accept(CNPItems.NETHERITE_FRAGMENT);
            }))
            .build());
}
