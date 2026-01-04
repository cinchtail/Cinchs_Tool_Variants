package net.cinchtail.cinchstoolvariants.item;

import net.cinchtail.cinchstoolvariants.CinchsToolVariants;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModCreativeModeTabs {
    public static final ItemGroup CINCHSTOOLVARIANTS_TAB = FabricItemGroupBuilder.build(
            new Identifier(CinchsToolVariants.MOD_ID, "cinchstoolvariants_tab"), () -> new ItemStack(ModItems.DEEPSLATE_PICKAXE));
}