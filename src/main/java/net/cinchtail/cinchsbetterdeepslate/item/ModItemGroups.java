package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsToolVariants;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CINCHSTOOLVARIANTS_TAB = FabricItemGroupBuilder.build(
            new Identifier(CinchsToolVariants.MOD_ID, "cinchstoolvariants_tab"), () -> new ItemStack(ModItems.DEEPSLATE_PICKAXE));
}