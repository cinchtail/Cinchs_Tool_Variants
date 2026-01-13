package net.cinchtail.item;

import net.cinchtail.CinchsToolVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashSet;
import java.util.Set;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CinchsToolVariants.MOD_ID);

    public static String CINCHSTOOLVARIANTS_TAB_TITLE = "cinchstoolvariants.tab";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CINCHSTOOLVARIANTS_TAB = CREATIVE_MODE_TABS.register("cinchstoolvariants_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplay, output) -> {
            Set<Item> addedItems = new HashSet<>();

            ModItems.ITEMS.getEntries()
                    .stream()
                    .map((item) -> item.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);

        });

        builder.icon(() -> new ItemStack(ModItems.DEEPSLATE_PICKAXE.get()));
        builder.title(Component.translatable(CINCHSTOOLVARIANTS_TAB_TITLE));

        return builder.build();
    });
}