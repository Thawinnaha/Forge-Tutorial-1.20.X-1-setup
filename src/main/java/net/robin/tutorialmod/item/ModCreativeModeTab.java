package net.robin.tutorialmod.item;

import net.robin.tutorialmod.TutorialMod;
import net.robin.tutorialmod.block.ModdedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> First_Tab =
            Creative_Mode_TAB.register("tabmenu",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItem.PEW_PEW.get()))
                            .title(Component.translatable("creativetab.tutorial_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModdedItem.PEW_PEW.get());
                                output.accept(ModdedBlocks.BLOCK_OF_STEEL.get());
                                output.accept(ModdedItem.KOHLENSTOFF.get());
                                output.accept(ModdedItem.SULFUR.get());
                                output.accept(ModdedItem.RAW_STEEL.get());
                                output.accept(ModdedBlocks.SULFUR_ORE.get());
                                output.accept(ModdedBlocks.BLOCK_OF_SULFUR.get());
                                output.accept(ModdedBlocks.COBALT_ORE.get());
                                output.accept(ModdedBlocks.COBALT_BLOCK.get());
                                output.accept(ModdedItem.COBALT.get());
                                output.accept(ModdedBlocks.RAW_COBALT_BLOCK.get());
                                output.accept(ModdedItem.RAW_COBALT.get());
                                output.accept(ModdedItem.RAW_ZINC.get());
                                output.accept(ModdedItem.ZINC.get());
                                output.accept(ModdedBlocks.RAW_ZINC_BLOCK.get());
                                output.accept(ModdedBlocks.ZINC_BLOCK.get());
                                output.accept(ModdedBlocks.ZINC_ORE.get());
                                output.accept(ModdedItem.RAW_LEAD.get());
                                output.accept(ModdedItem.LEAD.get());
                                output.accept(ModdedBlocks.RAW_LEAD_BLOCK.get());
                                output.accept(ModdedBlocks.LEAD_BLOCK.get());
                                output.accept(ModdedBlocks.LEAD_ORE.get());
                                output.accept(Items.BOW);
                                output.accept(Items.CROSSBOW);
                                output.accept(Items.ARROW);
                                output.accept(Items.SPECTRAL_ARROW);

                            })
                            .build());

    public static void register(IEventBus eventBus) {
        Creative_Mode_TAB.register(eventBus);
    }
}
