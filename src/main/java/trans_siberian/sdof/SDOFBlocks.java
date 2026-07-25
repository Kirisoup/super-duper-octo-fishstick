package trans_siberian.sdof;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static trans_siberian.sdof.SDOF.MOD_ID;

/*
 - Simple blocks using basic models
 - Rotatable blocks using block logic

*/
// implement BlockInitEntrypoint
public class SDOFBlocks {

	// we will create a couple extra functions

	// this will increment blockID each time we use newID().
	// hardcoding blockIDs is also fine. this is optional
	// blockID can range 0-16000
	// vanilla bta blocks span from 0-1200~
	private static int startingBlockID = 7000; // compare IDs of other mods and find a range that works for you
	public static int newBlockID() {
		return startingBlockID++;
	}

	// this will allow us to initialize blocks in BlockExampleMod.java
	public static boolean hasInit = false;

	// ACTUAL BLOCKS START!!!!!!
	public static Block<BlockLogicStairs> STONE_STAIRS;
	public static Block<BlockLogicSlab> STONE_SLAB;

	public static Block<BlockLogicStairs> LIMESTONE_STAIRS;
	public static Block<BlockLogicSlab> LIMESTONE_SLAB;

	public static Block<BlockLogicStairs> GRANITE_STAIRS;
	public static Block<BlockLogicSlab> GRANITE_SLAB;

	public static Block<BlockLogicStairs> BASALT_STAIRS;
	public static Block<BlockLogicSlab> BASALT_SLAB;

	public static Block<BlockLogicStairs> PERMAFROST_STAIRS;
	public static Block<BlockLogicSlab> PERMAFROST_SLAB;

	public static Block<BlockLogicStairs> SLATE_STAIRS;
	public static Block<BlockLogicSlab> SLATE_SLAB;

	public static Block<BlockLogicStairs> MARBLE_STAIRS;
	public static Block<BlockLogicSlab> MARBLE_SLAB;


	//smooth sandstone
	public static Block<?> SMOOTH_SANDSTONE;
	public static Block<BlockLogicStairs> SMOOTH_SANDSTONE_STAIRS;
	public static Block<BlockLogicSlab> SMOOTH_SANDSTONE_SLAB;


	//polished limestone bricks
	public static Block<?> POLISHED_LIMESTONE_BRICKS;
	public static Block<BlockLogicStairs> POLISHED_LIMESTONE_BRICKS_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_LIMESTONE_BRICKS_SLAB;


	//polished stone tiles
	public static Block<?> POLISHED_STONE_TILES;
	public static Block<BlockLogicStairs> POLISHED_STONE_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_STONE_TILES_SLAB;


	//polished limestone tiles
	public static Block<?> POLISHED_LIMESTONE_TILES;
	public static Block<BlockLogicStairs> POLISHED_LIMESTONE_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_LIMESTONE_TILES_SLAB;


	//polished granite tiles
	public static Block<?> POLISHED_GRANITE_TILES;
	public static Block<BlockLogicStairs> POLISHED_GRANITE_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_GRANITE_TILES_SLAB;


	//polished basalt tiles
	public static Block<?> POLISHED_BASALT_TILES;
	public static Block<BlockLogicStairs> POLISHED_BASALT_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_BASALT_TILES_SLAB;


	//polished marble tiles
	public static Block<?> POLISHED_MARBLE_TILES;
	public static Block<BlockLogicStairs> POLISHED_MARBLE_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_MARBLE_TILES_SLAB;


	//polished checkered tiles
	public static Block<?> POLISHED_CHECKERED_TILES;
	public static Block<BlockLogicStairs> POLISHED_CHECKERED_TILES_STAIRS;
	public static Block<BlockLogicSlab> POLISHED_CHECKERED_TILES_SLAB;


	//compressed cobblestone
	public static Block<?> COMPRESSED_COBBLESTONE;
	public static Block<?> COMPRESSED_COBBLESTONE_CARVED;
	public static Block<BlockLogicSlab> COMPRESSED_COBBLESTONE_SLAB;


	//compressed mossy cobblestone
	public static Block<?> COMPRESSED_COBBLESTONE_MOSSY;
	public static Block<?> COMPRESSED_COBBLESTONE_MOSSY_CARVED;
	public static Block<BlockLogicSlab> COMPRESSED_COBBLESTONE_MOSSY_SLAB;



	// the fun part
	// control + click BlockBuilder for more detailed info
	// there is WAY more in the BlockBuilder class so definitely investigate
	public static void init() {

		////////////////////////////////
		/// ACTUAL BLOCKS START!!!!! ///
		////////////////////////////////

		assert !hasInit : "double initialization";
		hasInit = true;

		BlockBuilder StoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		STONE_STAIRS=StoneStairs.
				build("stone_stair", "stone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.STONE));

		BlockBuilder StoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		STONE_SLAB=StoneSlab.
				build("stone_slab", "stone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.STONE));

		BlockBuilder LimestoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		LIMESTONE_STAIRS=LimestoneStairs.
				build("limestone_stair", "limestone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.LIMESTONE));

		BlockBuilder LimestoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		LIMESTONE_SLAB=LimestoneSlab.
				build("limestone_slab", "limestone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.LIMESTONE));

		BlockBuilder GraniteStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		GRANITE_STAIRS=GraniteStairs.
				build("granite_stair", "granite_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.GRANITE));

		BlockBuilder GraniteSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		GRANITE_SLAB=GraniteSlab.
				build("granite_slab", "granite_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.GRANITE));

		BlockBuilder BasaltStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		BASALT_STAIRS=BasaltStairs.
				build("basalt_stair", "basalt_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.BASALT));

		BlockBuilder BasaltSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		BASALT_SLAB=BasaltSlab.
				build("basalt_slab", "basalt_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.BASALT));

		BlockBuilder PermafrostStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		PERMAFROST_STAIRS=PermafrostStairs.
				build("permafrost_stair", "permafrost_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.PERMAFROST));

		BlockBuilder PermafrostSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		PERMAFROST_SLAB=PermafrostSlab.
				build("permafrost_slab", "permafrost_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.PERMAFROST));

		BlockBuilder SlateStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		SLATE_STAIRS=SlateStairs.
				build("slate_stair", "slate_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.SLATE));

		BlockBuilder SlateSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		SLATE_SLAB=SlateSlab.
				build("slate_slab", "slate_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.SLATE));

		BlockBuilder MarbleStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		MARBLE_STAIRS=MarbleStairs.
				build("marble_stair", "marble_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.MARBLE));

		BlockBuilder MarbleSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		MARBLE_SLAB=MarbleSlab.
				build("marble_slab", "marble_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.MARBLE));


		// smooth sandstone
		BlockBuilder SmoothSandstone = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		SMOOTH_SANDSTONE=SmoothSandstone.
			build("smooth_sandstone","smooth_sandstone",newBlockID(),
				b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder SmoothSandstoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		SMOOTH_SANDSTONE_STAIRS=SmoothSandstoneStairs.
				build("smooth_sandstone_stair", "smooth_sandstone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SMOOTH_SANDSTONE));

		BlockBuilder SmoothSandstoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		SMOOTH_SANDSTONE_SLAB=SmoothSandstoneSlab.
				build("smooth_sandstone_slab", "smooth_sandstone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SMOOTH_SANDSTONE));


		// polished limestone bricks
		BlockBuilder PolishedLimestoneBricks = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_BRICKS=PolishedLimestoneBricks.build("polished_limestone_bricks","polished_limestone_bricks",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedLimestoneBricksStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_BRICKS_STAIRS=PolishedLimestoneBricksStairs.
				build("polished_limestone_bricks_stair", "polished_limestone_bricks_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_LIMESTONE_BRICKS));

		BlockBuilder PolishedLimestoneBricksSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_BRICKS_SLAB=PolishedLimestoneBricksSlab.
				build("polished_limestone_bricks_slab", "polished_limestone_bricks_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_LIMESTONE_BRICKS));


		// polished stone tiles
		BlockBuilder PolishedStoneTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_STONE_TILES=PolishedStoneTiles.build("polished_stone_tiles","polished_stone_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedStoneTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_STONE_TILES_STAIRS=PolishedStoneTilesStairs.
				build("polished_stone_tiles_stair", "polished_stone_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_STONE_TILES));

		BlockBuilder PolishedStoneTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_STONE_TILES_SLAB=PolishedStoneTilesSlab.
				build("polished_stone_tiles_slab", "polished_stone_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_STONE_TILES));


		// polished limestone tiles
		BlockBuilder PolishedLimestoneTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_TILES=PolishedLimestoneTiles.build("polished_limestone_tiles","polished_limestone_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedLimestoneTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_TILES_STAIRS=PolishedLimestoneTilesStairs.
			build("polished_limestone_tiles_stair", "polished_limestone_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_LIMESTONE_TILES));

		BlockBuilder PolishedLimestoneTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_LIMESTONE_TILES_SLAB=PolishedLimestoneTilesSlab.
			build("polished_limestone_tiles_slab", "polished_limestone_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_LIMESTONE_TILES));


		// polished granite tiles
		BlockBuilder PolishedGraniteTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_GRANITE_TILES=PolishedGraniteTiles.build("polished_granite_tiles","polished_granite_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedGraniteTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_GRANITE_TILES_STAIRS=PolishedGraniteTilesStairs.
			build("polished_granite_tiles_stair", "polished_granite_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_GRANITE_TILES));

		BlockBuilder PolishedGraniteTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_GRANITE_TILES_SLAB=PolishedGraniteTilesSlab.
			build("polished_granite_tiles_slab", "polished_granite_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_GRANITE_TILES));


		// polished basalt tiles
		BlockBuilder PolishedBasaltTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_BASALT_TILES=PolishedBasaltTiles.build("polished_basalt_tiles","polished_basalt_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedBasaltTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_BASALT_TILES_STAIRS=PolishedBasaltTilesStairs.
			build("polished_basalt_tiles_stair", "polished_basalt_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_BASALT_TILES));

		BlockBuilder PolishedBasaltTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_BASALT_TILES_SLAB=PolishedBasaltTilesSlab.
			build("polished_basalt_tiles_slab", "polished_basalt_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_BASALT_TILES));


		// polished marble tiles
		BlockBuilder PolishedMarbleTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_MARBLE_TILES=PolishedMarbleTiles.build("polished_marble_tiles","polished_marble_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedMarbleTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_MARBLE_TILES_STAIRS=PolishedMarbleTilesStairs.
			build("polished_marble_tiles_stair", "polished_marble_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_MARBLE_TILES));

		BlockBuilder PolishedMarbleTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_MARBLE_TILES_SLAB=PolishedMarbleTilesSlab.
			build("polished_marble_tiles_slab", "polished_marble_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_MARBLE_TILES));


		// polished checkered tiles
		BlockBuilder PolishedCheckeredTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_CHECKERED_TILES=PolishedCheckeredTiles.build("polished_checkered_tiles","polished_checkered_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedCheckeredTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_CHECKERED_TILES_STAIRS=PolishedCheckeredTilesStairs.
			build("polished_checkered_tiles_stair", "polished_checkered_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_CHECKERED_TILES));

		BlockBuilder PolishedCheckeredTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		POLISHED_CHECKERED_TILES_SLAB=PolishedCheckeredTilesSlab.
			build("polished_checkered_tiles_slab", "polished_checkered_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_CHECKERED_TILES));


		// compressed cobblestone
		BlockBuilder CompressedCobblestone = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		COMPRESSED_COBBLESTONE=CompressedCobblestone.build("compressed_cobblestone","compressed_cobblestone",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneCarved = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		COMPRESSED_COBBLESTONE_CARVED=CompressedCobblestoneCarved.build("compressed_cobblestone_carved","compressed_cobblestone_carved",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		COMPRESSED_COBBLESTONE_SLAB=CompressedCobblestoneSlab.
			build("compressed_cobblestone_slab", "compressed_cobblestone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_COBBLESTONE_CARVED));

		SDOF.LOGGER.info("SDOF blocks initialized");
	}
}
