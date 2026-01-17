package net.cinchtail.cinchstoolvariants;


import net.cinchtail.cinchstoolvariants.item.ModCreativeModeTabs;
import net.cinchtail.cinchstoolvariants.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CinchsToolVariants.MOD_ID)
public class CinchsToolVariants {
    public static final String MOD_ID = "cinchstoolvariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(CinchsToolVariants.class);

    public CinchsToolVariants(@NotNull IEventBus bus) {
        ModItems.ITEMS.register(bus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(bus);
    }
}