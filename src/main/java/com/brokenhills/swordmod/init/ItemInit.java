package com.brokenhills.swordmod.init;

import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import static com.brokenhills.swordmod.SwordMod.MODID;

@EventBusSubscriber(modid = MODID, bus = Bus.MOD)
@ObjectHolder(MODID)
public class ItemInit {


    public static final Item my_sword = null;
    public static final Item my_pickaxe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new SwordItem(ItemTier.DIAMOND,
                        10,
                        -2.4F,
                        new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("my_sword"),
                new PickaxeItem(ItemTier.DIAMOND,
                        10,
                        -2.4F,
                        new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("my_pickaxe")
        );
    }
}
