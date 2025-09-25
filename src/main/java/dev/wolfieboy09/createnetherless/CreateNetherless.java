package dev.wolfieboy09.createnetherless;

import dev.wolfieboy09.createnetherless.registries.CNPBlocks;
import dev.wolfieboy09.createnetherless.registries.CNPCreativeTab;
import dev.wolfieboy09.createnetherless.registries.CNPItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CreateNetherless.MOD_ID)
public class CreateNetherless {
    public static final String MOD_ID = "create_netherless";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateNetherless(IEventBus modEventBus, ModContainer modContainer) {
        CNPItems.ITEMS.register(modEventBus);
        CNPItems.BLOCK_ITEMS.register(modEventBus);
        CNPBlocks.BLOCKS.register(modEventBus);
        CNPCreativeTab.CREATIVE_TAB.register(modEventBus);
        NeoForge.EVENT_BUS.addListener(CreateNetherless::coalRodBurnTime);
    }

    @SubscribeEvent
    public static void coalRodBurnTime(@NotNull FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == CNPItems.COAL_ROD.get()) {
            event.setBurnTime(2800);
        }
    }
}
