package net.cinchtail.cinchstoolvariants.item;

import net.cinchtail.cinchstoolvariants.CinchsToolVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            CinchsToolVariants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CINCHSTOOLVARIANTS_TAB = CREATIVE_MODE_TABS.register("cinchstoolvariants_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEEPSLATE_PICKAXE.get()))
                    .title(Component.literal("Cinch's Tool Variants"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.DEEPSLATE_SWORD.get());
                        output.accept(ModItems.DEEPSLATE_PICKAXE.get());
                        output.accept(ModItems.DEEPSLATE_AXE.get());
                        output.accept(ModItems.DEEPSLATE_SHOVEL.get());
                        output.accept(ModItems.DEEPSLATE_HOE.get());
                        output.accept(ModItems.BLACKSTONE_SWORD.get());
                        output.accept(ModItems.BLACKSTONE_PICKAXE.get());
                        output.accept(ModItems.BLACKSTONE_AXE.get());
                        output.accept(ModItems.BLACKSTONE_SHOVEL.get());
                        output.accept(ModItems.BLACKSTONE_HOE.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}