package com.brokenhills.swordmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import static com.brokenhills.swordmod.SwordMod.MODID;

@EventBusSubscriber(modid = MODID, bus = Bus.MOD)
@ObjectHolder(MODID)
public class BlockInit {

    public static final Block my_block = null;
    public static final Block my_block_a = null;
    public static final Block my_block_r = null;
    public static final Block my_block_s = null;
    public static final Block my_block_e = null;
    public static final Block my_block_n = null;
    public static final Block my_block_i = null;
    public static final Block my_block_ii = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.GLASS)).setRegistryName("my_block"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_a"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_r"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_s"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_e"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_n"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_i"),
                new Block(Block.Properties.create(Material.DRAGON_EGG)
                        .hardnessAndResistance(0.7f, 15.0f)
                        .sound(SoundType.NETHERITE)).setRegistryName("my_block_ii")
        );
    }

    @SubscribeEvent
    public static void registerBlockItem(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BlockItem(my_block, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block"),
                new BlockItem(my_block_a, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_a"),
                new BlockItem(my_block_r, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_r"),
                new BlockItem(my_block_s, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_s"),
                new BlockItem(my_block_e, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_e"),
                new BlockItem(my_block_n, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_n"),
                new BlockItem(my_block_i, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_i"),
                new BlockItem(my_block_ii, new Item.Properties()
                        .maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("my_block_ii")
        );
    }
}
