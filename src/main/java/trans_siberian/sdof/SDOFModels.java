package trans_siberian.sdof;

import static trans_siberian.sdof.SDOF.LOGGER;
import static trans_siberian.sdof.SDOF.MOD_ID;

import org.jetbrains.annotations.NotNull;

import net.minecraft.client.render.block.model.*;
import trans_siberian.sdof.definition.BlockDefinition;
import trans_siberian.sdof.model.BlockModelGenericCheckeredStairs;

public class SDOFModels {
	public static boolean hasInit = false;

	public static void init(final @NotNull BlockModelDispatcher dispatcher) {
		// texture gooning

		// ACTUAL BLOCKS START!!!!!!

		assert !hasInit : "double initialization";
		assert SDOFBlocks.hasInit;
		hasInit = true;

		dispatcher.addDispatch(new BlockModelGenericCheckeredStairs<>(
			SDOFBlocks.POLISHED_CHECKERED_TILES_STAIRS,
			BlockModelDispatcher.loadDataModel(MOD_ID + ":block/stairs/polished_checkered_tiles_stair/north_south").asModel(),
			BlockModelDispatcher.loadDataModel(MOD_ID + ":block/stairs/polished_checkered_tiles_stair/west_east").asModel()
		));

		for (final var block : SDOFBlocks.blocks) {
			if (!(block instanceof BlockDefinition.IModel model)) continue;
			final var existing = dispatcher.getDispatch(block.block());
			if (existing != BlockModelDispatcher.modelEmpty) continue;

			LOGGER.info("adding model {}", block.block());
			final var blockModel = model.getModel();
			if (blockModel == null) {
				LOGGER.warn("{} missing model json", block.block());
				continue;
			}
			dispatcher.addDispatch(blockModel);
		}
	}
}
