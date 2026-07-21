package trans_siberian.sdof;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class SDOF implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

	// register your mod ID. The mod ID must be the same everywhere.
	// e.g. /src/main/java/turniplabs/blockexamplemod/ or sdof.mixins.json
	//															make sure to set preloadAssets: true v
	public static final String MOD_ID = HalpLibe.registerMod("sdof", true);
	// make sure to change mod ID in fabric.mod.json!!
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("SDOF initialized");
	}

	@Override
	public void beforeGameStart() {
		SDOFBlocks.init();
		LOGGER.info("SDOF blocks initialized");
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		SDOFRecipes.init();
		LOGGER.info("SDOF recipes initialized");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(SDOF.MOD_ID);
		RecipeBuilder.getRecipeNamespace(SDOF.MOD_ID);
	}
}
