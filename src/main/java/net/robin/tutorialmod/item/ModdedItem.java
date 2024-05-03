package net.robin.tutorialmod.item;

import net.robin.tutorialmod.TutorialMod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedItem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> PEW_PEW = ITEMS.register("pew_pew",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KOHLENSTOFF = ITEMS.register("carbon",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
