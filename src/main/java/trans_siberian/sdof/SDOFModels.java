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
		// single vanilla bta texture with a basic model
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.BASIC_BLOCK)
			.setTex("minecraft:block/cobbled_stone", Side.sides)
		); // close it
		// single custom texture (/assets/blockexamplemod/textures/block)
		dispatcher.addDispatch(new BlockModelStandard<>(SDOFBlocks.CUSTOM_BLOCK)
			.setTex("sdof:block/custom_block", Side.sides)
		); // close it
		// workbench style rotatable texture.
		// try in game to see which Side.* works for your block
		dispatcher.addDispatch(new BlockModelRotatable<>(SDOFBlocks.ROTATABLE_BLOCK)
			.setTex("sdof:block/rotatable_block/north", Side.NORTH)
			.setTex("sdof:block/rotatable_block/east", Side.EAST)
			.setTex("sdof:block/rotatable_block/south", Side.SOUTH)
			.setTex("sdof:block/rotatable_block/west", Side.WEST)
			.setTex("sdof:block/rotatable_block/top", Side.TOP)
			.setTex("sdof:block/rotatable_block/bottom", Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelVeryRotatable<>(SDOFBlocks.VERY_ROTATABLE_BLOCK)
			.setTex("sdof:block/rotatable_block/north", Side.NORTH)
			.setTex("sdof:block/rotatable_block/east", Side.EAST)
			.setTex("sdof:block/rotatable_block/south", Side.SOUTH)
			.setTex("sdof:block/rotatable_block/west", Side.WEST)
			.setTex("sdof:block/rotatable_block/top", Side.TOP)
			.setTex("sdof:block/rotatable_block/bottom", Side.BOTTOM)
		);
		// model for the stair block
		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.STAIR_BLOCK)
			.setTex("sdof:block/custom_block", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.SLAB_BLOCK)
			.setTex("sdof:block/custom_block", Side.sides)
		);



		// texture gooning
		//

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
			.setTex("sdof:block/bricks_polished_limestone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_STAIRS)
			.setTex("minecraft:block/stone", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_SLAB)
			.setTex("minecraft:block/stone", Side.sides)
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
