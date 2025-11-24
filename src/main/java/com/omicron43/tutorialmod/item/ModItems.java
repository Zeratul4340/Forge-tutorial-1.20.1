package com.omicron43.tutorialmod.item;

import com.omicron43.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//holds all items to be registered for the mod
public class ModItems {
    //long list of things (items here), registered when Forge loads the item
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //need to register the registrar itself
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
