package trans_siberian.sdof;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.dependency.Key;

public class SDOF implements ModInitializer, ClientModInitializer {

	public static final String MOD_ID = HalpLibe.registerMod("sdof", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Key KEY = Key.of(MOD_ID);

	@Override
	public void onInitialize() {
		CommonEvents.BEFORE_GAME_START.listen(KEY, SDOFBlocks::init);
		CommonEvents.RECIPES_READY.listen(KEY, SDOFRecipes::init);
		CommonEvents.RECIPES_NAMESPACE_INIT.listen(KEY, () -> {
			RecipeBuilder.initNameSpace(MOD_ID);
			RecipeBuilder.getRecipeNamespace(MOD_ID);
		});

		LOGGER.info("SDOF initialized");
	}

	@Override
	public void onInitializeClient() {
		ClientEvents.BLOCK_MODEL_RELOAD.listen(KEY, SDOFModels::init);
		LOGGER.info("SDOF initialized client");
	}
}
