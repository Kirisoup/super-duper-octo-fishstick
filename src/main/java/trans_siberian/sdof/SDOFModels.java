package trans_siberian.sdof;

import static trans_siberian.sdof.SDOF.LOGGER;
import static trans_siberian.sdof.SDOF.MOD_ID;

import org.jetbrains.annotations.NotNull;

import net.minecraft.client.render.block.model.*;
import net.minecraft.core.util.helper.Side;
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

		//compressed mossy cobblestone
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_COBBLESTONE_MOSSY)
			.setTex("minecraft:block/motion_sensor/side", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_COBBLESTONE_MOSSY_CARVED)
			.setTex("sdof:block/compressed/carved_compressed_mossy_cobblestone", Side.sides)
			.setTex("minecraft:block/motion_sensor/side", Side.TOP)
			.setTex("minecraft:block/motion_sensor/side", Side.BOTTOM)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.COMPRESSED_COBBLESTONE_MOSSY_SLAB)
		);


		//compressed polished stone
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_POLISHED_STONE)
			.setTex("minecraft:block/furnace_stone/bottom", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_POLISHED_STONE_CARVED)
			.setTex("sdof:block/compressed/carved_compressed_stone", Side.sides)
			.setTex("minecraft:block/furnace_stone/bottom", Side.TOP)
			.setTex("minecraft:block/furnace_stone/bottom", Side.BOTTOM)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.COMPRESSED_POLISHED_STONE_SLAB)
		);


		//compressed polished stone tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_POLISHED_STONE_TILES)
			.setTex("minecraft:block/piston_steel/bottom", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.COMPRESSED_POLISHED_STONE_TILES_SLAB)
		);


		//compressed polished netherrack
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_POLISHED_NETHERRACK)
			.setTex("minecraft:block/activator/bottom", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_POLISHED_NETHERRACK_CARVED)
			.setTex("sdof:block/compressed/carved_compressed_polished_netherrack", Side.sides)
			.setTex("minecraft:block/activator/bottom", Side.TOP)
			.setTex("minecraft:block/activator/bottom", Side.BOTTOM)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.COMPRESSED_POLISHED_NETHERRACK_SLAB)
		);


		//shored gravel
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.SHORED_GRAVEL)
			.setTex("sdof:block/shored/shored_gravel2", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SHORED_GRAVEL_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SHORED_GRAVEL_SLAB)
		);


		//shored sand
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.SHORED_SAND)
			.setTex("sdof:block/shored/shored_sand2", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SHORED_SAND_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SHORED_SAND_SLAB)
		);


		//iron plating
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.IRON_PLATING)
			.setTex("minecraft:block/furnace_blast/bottom", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.IRON_PLATING_SLAB)
		);


		//steel plating
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.STEEL_PLATING)
			.setTex("minecraft:block/furnace_blast/top", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.STEEL_PLATING_SLAB)
		);


		//small marble tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.SMALL_MARBLE_TILES)
			.setTex("sdof:block/tiles/tiles_small_marble", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SMALL_MARBLE_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SMALL_MARBLE_TILES_SLAB)
		);


		//small lapis tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.SMALL_LAPIS_TILES)
			.setTex("sdof:block/tiles/tiles_small_lapis", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SMALL_LAPIS_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SMALL_LAPIS_TILES_SLAB)
		);


		//vent block
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.VENT_BLOCK)
			.setTex("minecraft:block/trommel/top", Side.sides)
		);

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
