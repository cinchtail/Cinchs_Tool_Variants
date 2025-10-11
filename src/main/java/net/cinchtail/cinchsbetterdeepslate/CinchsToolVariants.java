package net.cinchtail.cinchsbetterdeepslate;

import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsToolVariants implements ModInitializer {
	public static final String MOD_ID = "cinchstoolvariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}