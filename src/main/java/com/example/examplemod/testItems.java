package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

public class testItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(Registries.ITEM, ExampleMod.MODID);
    
    public static final DeferredHolder<Item, Item> TEST_ITEM = ITEMS.register("test_item", 
        () -> new Item(new Item.Properties().stacksTo(12)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
