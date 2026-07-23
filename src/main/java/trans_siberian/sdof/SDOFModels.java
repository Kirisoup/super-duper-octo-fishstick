package trans_siberian.sdof;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.util.ModelEntrypoint;

public class SDOFModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		// texture gooning

		// ACTUAL BLOCKS START!!!!!!

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


	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

	}

	@Override
	public void initEntityModels(EntityRendererDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
