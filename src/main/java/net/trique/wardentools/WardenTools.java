package net.trique.wardentools;

import net.fabricmc.api.ModInitializer;
import net.trique.wardentools.block.ModBlocks;
import net.trique.wardentools.item.ModItems;
import net.trique.wardentools.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WardenTools implements ModInitializer {
	public static final String MOD_ID = "wardentools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

	}
}
