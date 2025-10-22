package net.cinchtail.cinchstoolvariants;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchstoolvariants.item.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(CinchsToolVariants.MOD_ID)
public class CinchsToolVariants {
    public static final String MOD_ID = "cinchstoolvariants";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CinchsToolVariants(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    public static int index = 0;
    public static final CreativeModeTab CINCHSTOOLVARIANTS_TAB = new CreativeModeTab("cinchstoolvariants_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEEPSLATE_PICKAXE.get());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            super.fillItemList(items);
            index = 0;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_SWORD.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_PICKAXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_AXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_SHOVEL.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_HOE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_SWORD.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_PICKAXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_AXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_SHOVEL.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_HOE.get()));
            index++;
        }
    };
}