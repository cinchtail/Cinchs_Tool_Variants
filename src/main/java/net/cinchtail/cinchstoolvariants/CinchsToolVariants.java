package net.cinchtail.cinchstoolvariants;

import net.cinchtail.cinchstoolvariants.item.ModItemGroups;
import net.cinchtail.cinchstoolvariants.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsToolVariants implements ModInitializer {
	public static final String MOD_ID = "cinchstoolvariants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}