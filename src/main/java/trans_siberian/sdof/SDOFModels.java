package trans_siberian.sdof;

import org.jetbrains.annotations.NotNull;

import net.minecraft.client.render.block.model.*;
import net.minecraft.core.util.helper.Side;

public class SDOFModels {
	public static boolean hasInit = false;

	public static void init(final @NotNull BlockModelDispatcher dispatcher) {
		// texture gooning

		// ACTUAL BLOCKS START!!!!!!

		assert !hasInit : "double initialization";
		hasInit = true;

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.STONE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.STONE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.LIMESTONE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.LIMESTONE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.GRANITE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.GRANITE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.BASALT_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.BASALT_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.PERMAFROST_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.PERMAFROST_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SLATE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SLATE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.MARBLE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.MARBLE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);


		//smooth sandstone
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.SMOOTH_SANDSTONE)
			.setTex("minecraft:block/sandstone/top", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.SMOOTH_SANDSTONE_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SMOOTH_SANDSTONE_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);


		//polished limestone bricks
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_LIMESTONE_BRICKS)
			.setTex("sdof:block/bricks/bricks_polished_limestone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
		);


		//polished stone tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_STONE_TILES)
			.setTex("sdof:block/tiles/tiles_polished_stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_STONE_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_STONE_TILES_SLAB)
		);


		//polished limestone tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_LIMESTONE_TILES)
			.setTex("sdof:block/tiles/tiles_polished_limestone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_LIMESTONE_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_LIMESTONE_TILES_SLAB)
		);


		//polished granite tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_GRANITE_TILES)
			.setTex("sdof:block/tiles/tiles_polished_granite", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_GRANITE_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_GRANITE_TILES_SLAB)
		);


		//polished basalt tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_BASALT_TILES)
			.setTex("sdof:block/tiles/tiles_polished_basalt", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_BASALT_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_BASALT_TILES_SLAB)
		);


		//polished marble tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_MARBLE_TILES)
			.setTex("sdof:block/tiles/tiles_polished_marble", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_MARBLE_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_MARBLE_TILES_SLAB)
		);


		//polished checkered tiles
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.POLISHED_CHECKERED_TILES)
			.setTex("sdof:block/tiles/tiles_polished_checkered", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_CHECKERED_TILES_STAIRS)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_CHECKERED_TILES_SLAB)
		);


		//compressed cobblestone
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_COBBLESTONE)
			.setTex("minecraft:block/furnace_stone/top", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.COMPRESSED_COBBLESTONE_CARVED)
			.setTex("sdof:block/compressed/carved_compact_cobblestone", Side.sides)
			.setTex("minecraft:block/furnace_stone/top", Side.TOP)
			.setTex("minecraft:block/furnace_stone/top", Side.BOTTOM)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.COMPRESSED_COBBLESTONE_SLAB)
		);


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

	}
}
