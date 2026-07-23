package trans_siberian.sdof;

import net.minecraft.core.block.*;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

import static trans_siberian.sdof.SDOF.MOD_ID;

public class SDOFRecipes {
	private SDOFRecipes(){}

	public static void init(){
		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.STONE)
			.create("stone_stairs", new ItemStack(SDOFBlocks.STONE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.STONE)
			.create("stone_slab", new ItemStack(SDOFBlocks.STONE_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.LIMESTONE)
			.create("limestone_stairs", new ItemStack(SDOFBlocks.LIMESTONE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.LIMESTONE)
			.create("limestone_slab", new ItemStack(SDOFBlocks.LIMESTONE_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.GRANITE)
			.create("granite_stairs", new ItemStack(SDOFBlocks.GRANITE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.GRANITE)
			.create("granite_slab", new ItemStack(SDOFBlocks.GRANITE_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.BASALT)
			.create("basalt_stairs", new ItemStack(SDOFBlocks.BASALT_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.BASALT)
			.create("basalt_slab", new ItemStack(SDOFBlocks.BASALT_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.PERMAFROST)
			.create("permafrost_stairs", new ItemStack(SDOFBlocks.PERMAFROST_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.PERMAFROST)
			.create("permafrost_slab", new ItemStack(SDOFBlocks.PERMAFROST_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.SLATE)
			.create("slate_stairs", new ItemStack(SDOFBlocks.SLATE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', Blocks.SLATE)
			.create("slate_slab", new ItemStack(SDOFBlocks.SLATE_SLAB, 6));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', Blocks.MARBLE)
			.create("marble_stairs", new ItemStack(SDOFBlocks.MARBLE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "##")
			.addInput('#', Blocks.MARBLE)
			.create("marble_slab", new ItemStack(SDOFBlocks.MARBLE_SLAB, 6));


		//smooth sandstone
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Blocks.SANDSTONE)
			.create("smooth_sandstone", new ItemStack(SDOFBlocks.SMOOTH_SANDSTONE, 1));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.SMOOTH_SANDSTONE)
			.create("smooth_sandstone_stairs", new ItemStack(SDOFBlocks.SMOOTH_SANDSTONE_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.SMOOTH_SANDSTONE)
			.create("smooth_sandstone_slab", new ItemStack(SDOFBlocks.SMOOTH_SANDSTONE_SLAB, 6));


		//polished limestone bricks
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.LIMESTONE_POLISHED)
			.create("polished_limestone_bricks", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_BRICKS, 4));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_LIMESTONE_BRICKS)
			.create("polished_limestone_bricks_stairs", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_LIMESTONE_BRICKS)
			.create("polished_limestone_bricks_slab", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_BRICKS_SLAB, 6));


		//polished stone tiles
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.SLAB_STONE_POLISHED)
			.create("polished_stone_tiles", new ItemStack(SDOFBlocks.POLISHED_STONE_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_STONE_TILES)
			.create("polished_stone_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_STONE_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_STONE_TILES)
			.create("polished_stone_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_STONE_TILES_SLAB, 6));


		//polished limestone tiles
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.SLAB_LIMESTONE_POLISHED)
			.create("polished_limestone_tiles", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_LIMESTONE_TILES)
			.create("polished_limestone_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_LIMESTONE_TILES)
			.create("polished_limestone_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_LIMESTONE_TILES_SLAB, 6));


		//polished granite tiles
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.SLAB_GRANITE_POLISHED)
			.create("polished_granite_tiles", new ItemStack(SDOFBlocks.POLISHED_GRANITE_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_GRANITE_TILES)
			.create("polished_granite_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_GRANITE_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_GRANITE_TILES)
			.create("polished_granite_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_GRANITE_TILES_SLAB, 6));


		//polished basalt tiles
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.SLAB_BASALT_POLISHED)
			.create("polished_basalt_tiles", new ItemStack(SDOFBlocks.POLISHED_BASALT_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_BASALT_TILES)
			.create("polished_basalt_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_BASALT_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_BASALT_TILES)
			.create("polished_basalt_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_BASALT_TILES_SLAB, 6));


		//polished marble tiles
		RecipeBuilder.Shaped(MOD_ID, "##", "##")
			.addInput('#', Blocks.SLAB_BRICK_MARBLE)
			.create("polished_marble_tiles", new ItemStack(SDOFBlocks.POLISHED_MARBLE_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_MARBLE_TILES)
			.create("polished_marble_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_MARBLE_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_MARBLE_TILES)
			.create("polished_marble_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_MARBLE_TILES_SLAB, 6));


		//polished checkered tiles
		RecipeBuilder.Shaped(MOD_ID, "MB", "BM")
			.addInput('M', Blocks.SLAB_BRICK_MARBLE)
			.addInput('B', Blocks.SLAB_BASALT_POLISHED)
			.create("polished_checkered_tiles", new ItemStack(SDOFBlocks.POLISHED_CHECKERED_TILES, 2));

		RecipeBuilder.Shaped(MOD_ID, "#", "##", "###")
			.addInput('#', SDOFBlocks.POLISHED_CHECKERED_TILES)
			.create("polished_checkered_tiles_stairs", new ItemStack(SDOFBlocks.POLISHED_CHECKERED_TILES_STAIRS, 6));

		RecipeBuilder.Shaped(MOD_ID, "###")
			.addInput('#', SDOFBlocks.POLISHED_MARBLE_TILES)
			.create("polished_checkered_tiles_slab", new ItemStack(SDOFBlocks.POLISHED_CHECKERED_TILES_SLAB, 6));

	}
}
