package net.liam.tutorialmod;


import net.fabricmc.api.ModInitializer;
import net.liam.tutorialmod.block.ModBlocks;
import net.liam.tutorialmod.item.ModItemGroups;
import net.liam.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModblocks();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");


	}

}

