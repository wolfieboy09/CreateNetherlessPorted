package dev.wolfieboy09.createnetherless.registries;

import dev.wolfieboy09.createnetherless.CreateNetherless;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CNPBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CreateNetherless.MOD_ID);

    public static final DeferredBlock<Block> INCOMPLETE_SOUL_SAND = BLOCKS.registerSimpleBlock("incomplete_soul_sand", BlockBehaviour.Properties.of().sound(SoundType.SAND));

}
