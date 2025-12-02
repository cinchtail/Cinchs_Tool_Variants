package net.cinchtail.cinchstoolvariants.item;

import net.cinchtail.cinchstoolvariants.CinchsToolVariants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CINCHSBETTERDEEPSLATE_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CinchsToolVariants.MOD_ID, "cinchstoolvariants_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cinchstoolvariants_tab"))
                    .icon(() -> new ItemStack(ModItems.DEEPSLATE_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DEEPSLATE_SWORD);
                        entries.add(ModItems.DEEPSLATE_PICKAXE);
                        entries.add(ModItems.DEEPSLATE_AXE);
                        entries.add(ModItems.DEEPSLATE_SHOVEL);
                        entries.add(ModItems.DEEPSLATE_HOE);
                        entries.add(ModItems.BLACKSTONE_SWORD);
                        entries.add(ModItems.BLACKSTONE_PICKAXE);
                        entries.add(ModItems.BLACKSTONE_AXE);
                        entries.add(ModItems.BLACKSTONE_SHOVEL);
                        entries.add(ModItems.BLACKSTONE_HOE);
                    }).build());


    public static void registerItemGroups() {
        CinchsToolVariants.LOGGER.info("Registering Item Groups for " + CinchsToolVariants.MOD_ID);
    }
}
