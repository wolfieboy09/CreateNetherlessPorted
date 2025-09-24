package dev.wolfieboy09.createnetherless;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CreateNetherless.MODID)
public class CreateNetherless {
    public static final String MODID = "examplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateNetherless(IEventBus modEventBus, ModContainer modContainer) {

    }
}
