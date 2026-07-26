package trans_siberian.sdof;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
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


	//compressed polished stone
	public static Block<?> COMPRESSED_POLISHED_STONE;
	public static Block<?> COMPRESSED_POLISHED_STONE_CARVED;
	public static Block<BlockLogicSlab> COMPRESSED_POLISHED_STONE_SLAB;


	//compressed polished stone tiles
	public static Block<?> COMPRESSED_POLISHED_STONE_TILES;
	public static Block<BlockLogicSlab> COMPRESSED_POLISHED_STONE_TILES_SLAB;


	//compressed polished netherrack
	public static Block<?> COMPRESSED_POLISHED_NETHERRACK;
	public static Block<?> COMPRESSED_POLISHED_NETHERRACK_CARVED;
	public static Block<BlockLogicSlab> COMPRESSED_POLISHED_NETHERRACK_SLAB;


	//shored gravel
	public static Block<?> SHORED_GRAVEL;
	public static Block<BlockLogicStairs> SHORED_GRAVEL_STAIRS;
	public static Block<BlockLogicSlab> SHORED_GRAVEL_SLAB;


	//shored sand
	public static Block<?> SHORED_SAND;
	public static Block<BlockLogicStairs> SHORED_SAND_STAIRS;
	public static Block<BlockLogicSlab> SHORED_SAND_SLAB;


	//iron plating
	public static Block<?> IRON_PLATING;
	public static Block<BlockLogicSlab> IRON_PLATING_SLAB;


	//steel plating
	public static Block<?> STEEL_PLATING;
	public static Block<BlockLogicSlab> STEEL_PLATING_SLAB;


	//small marble tiles
	public static Block<?> SMALL_MARBLE_TILES;
	public static Block<BlockLogicStairs> SMALL_MARBLE_TILES_STAIRS;
	public static Block<BlockLogicSlab> SMALL_MARBLE_TILES_SLAB;


	//small lapis tiles
	public static Block<?> SMALL_LAPIS_TILES;
	public static Block<BlockLogicStairs> SMALL_LAPIS_TILES_STAIRS;
	public static Block<BlockLogicSlab> SMALL_LAPIS_TILES_SLAB;


	//vent block
	public static Block<?> VENT_BLOCK;



	// the fun part
	// control + click BlockBuilder for more detailed info
	// there is WAY more in the BlockBuilder class so definitely investigate
	public static void init() {

		////////////////////////////////
		/// ACTUAL BLOCKS START!!!!! ///
		////////////////////////////////

		assert !hasInit : "double initialization";
		hasInit = true;


		//////////////////////////////
		/// STONE STAIRS AND SLABS ///
		//////////////////////////////


		BlockBuilder StoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		STONE_STAIRS=StoneStairs.
				build("stone_stair", "stone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.STONE));

		BlockBuilder StoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		STONE_SLAB=StoneSlab.
				build("stone_slab", "stone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.STONE));

		BlockBuilder LimestoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		LIMESTONE_STAIRS=LimestoneStairs.
				build("limestone_stair", "limestone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.LIMESTONE));

		BlockBuilder LimestoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		LIMESTONE_SLAB=LimestoneSlab.
				build("limestone_slab", "limestone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.LIMESTONE));

		BlockBuilder GraniteStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		GRANITE_STAIRS=GraniteStairs.
				build("granite_stair", "granite_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.GRANITE));

		BlockBuilder GraniteSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		GRANITE_SLAB=GraniteSlab.
				build("granite_slab", "granite_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.GRANITE));

		BlockBuilder BasaltStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		BASALT_STAIRS=BasaltStairs.
				build("basalt_stair", "basalt_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.BASALT));

		BlockBuilder BasaltSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		BASALT_SLAB=BasaltSlab.
				build("basalt_slab", "basalt_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.BASALT));

		BlockBuilder PermafrostStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		PERMAFROST_STAIRS=PermafrostStairs.
				build("permafrost_stair", "permafrost_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.PERMAFROST));

		BlockBuilder PermafrostSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		PERMAFROST_SLAB=PermafrostSlab.
				build("permafrost_slab", "permafrost_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.PERMAFROST));

		BlockBuilder SlateStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SLATE_STAIRS=SlateStairs.
				build("slate_stair", "slate_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.SLATE));

		BlockBuilder SlateSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SLATE_SLAB=SlateSlab.
				build("slate_slab", "slate_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.SLATE));

		BlockBuilder MarbleStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		MARBLE_STAIRS=MarbleStairs.
				build("marble_stair", "marble_stair",newBlockID(),
				b -> new BlockLogicStairs(b, Blocks.MARBLE));

		BlockBuilder MarbleSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		MARBLE_SLAB=MarbleSlab.
				build("marble_slab", "marble_slab",newBlockID(),
				b -> new BlockLogicSlab(b, Blocks.MARBLE));


		////////////////////////////////////////////////////
		/// SMOOTH SANDSTONE & POLISHED LIMESTONE BRICKS ///
		////////////////////////////////////////////////////


		// smooth sandstone
		BlockBuilder SmoothSandstone = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMOOTH_SANDSTONE=SmoothSandstone.
			build("smooth_sandstone","smooth_sandstone",newBlockID(),
				b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder SmoothSandstoneStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMOOTH_SANDSTONE_STAIRS=SmoothSandstoneStairs.
				build("smooth_sandstone_stair", "smooth_sandstone_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SMOOTH_SANDSTONE));

		BlockBuilder SmoothSandstoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMOOTH_SANDSTONE_SLAB=SmoothSandstoneSlab.
				build("smooth_sandstone_slab", "smooth_sandstone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SMOOTH_SANDSTONE));


		// polished limestone bricks
		BlockBuilder PolishedLimestoneBricks = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_BRICKS=PolishedLimestoneBricks.build("polished_limestone_bricks","polished_limestone_bricks",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedLimestoneBricksStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_BRICKS_STAIRS=PolishedLimestoneBricksStairs.
				build("polished_limestone_bricks_stair", "polished_limestone_bricks_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_LIMESTONE_BRICKS));

		BlockBuilder PolishedLimestoneBricksSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_BRICKS_SLAB=PolishedLimestoneBricksSlab.
				build("polished_limestone_bricks_slab", "polished_limestone_bricks_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_LIMESTONE_BRICKS));


		//////////////////////
		/// POLISHED TILES ///
		//////////////////////


		// polished stone tiles
		BlockBuilder PolishedStoneTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_STONE_TILES=PolishedStoneTiles.build("polished_stone_tiles","polished_stone_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedStoneTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_STONE_TILES_STAIRS=PolishedStoneTilesStairs.
				build("polished_stone_tiles_stair", "polished_stone_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_STONE_TILES));

		BlockBuilder PolishedStoneTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_STONE_TILES_SLAB=PolishedStoneTilesSlab.
				build("polished_stone_tiles_slab", "polished_stone_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_STONE_TILES));


		// polished limestone tiles
		BlockBuilder PolishedLimestoneTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_TILES=PolishedLimestoneTiles.build("polished_limestone_tiles","polished_limestone_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedLimestoneTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_TILES_STAIRS=PolishedLimestoneTilesStairs.
			build("polished_limestone_tiles_stair", "polished_limestone_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_LIMESTONE_TILES));

		BlockBuilder PolishedLimestoneTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_LIMESTONE_TILES_SLAB=PolishedLimestoneTilesSlab.
			build("polished_limestone_tiles_slab", "polished_limestone_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_LIMESTONE_TILES));


		// polished granite tiles
		BlockBuilder PolishedGraniteTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_GRANITE_TILES=PolishedGraniteTiles.build("polished_granite_tiles","polished_granite_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedGraniteTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_GRANITE_TILES_STAIRS=PolishedGraniteTilesStairs.
			build("polished_granite_tiles_stair", "polished_granite_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_GRANITE_TILES));

		BlockBuilder PolishedGraniteTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_GRANITE_TILES_SLAB=PolishedGraniteTilesSlab.
			build("polished_granite_tiles_slab", "polished_granite_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_GRANITE_TILES));


		// polished basalt tiles
		BlockBuilder PolishedBasaltTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_BASALT_TILES=PolishedBasaltTiles.build("polished_basalt_tiles","polished_basalt_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedBasaltTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_BASALT_TILES_STAIRS=PolishedBasaltTilesStairs.
			build("polished_basalt_tiles_stair", "polished_basalt_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_BASALT_TILES));

		BlockBuilder PolishedBasaltTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_BASALT_TILES_SLAB=PolishedBasaltTilesSlab.
			build("polished_basalt_tiles_slab", "polished_basalt_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_BASALT_TILES));


		// polished marble tiles
		BlockBuilder PolishedMarbleTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_MARBLE_TILES=PolishedMarbleTiles.build("polished_marble_tiles","polished_marble_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedMarbleTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_MARBLE_TILES_STAIRS=PolishedMarbleTilesStairs.
			build("polished_marble_tiles_stair", "polished_marble_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_MARBLE_TILES));

		BlockBuilder PolishedMarbleTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_MARBLE_TILES_SLAB=PolishedMarbleTilesSlab.
			build("polished_marble_tiles_slab", "polished_marble_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_MARBLE_TILES));


		// polished checkered tiles
		BlockBuilder PolishedCheckeredTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_CHECKERED_TILES=PolishedCheckeredTiles.build("polished_checkered_tiles","polished_checkered_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder PolishedCheckeredTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_CHECKERED_TILES_STAIRS=PolishedCheckeredTilesStairs.
			build("polished_checkered_tiles_stair", "polished_checkered_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, POLISHED_CHECKERED_TILES));

		BlockBuilder PolishedCheckeredTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		POLISHED_CHECKERED_TILES_SLAB=PolishedCheckeredTilesSlab.
			build("polished_checkered_tiles_slab", "polished_checkered_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, POLISHED_CHECKERED_TILES));


		///////////////////
		/// COMPRESSEDS ///
		///////////////////


		// compressed cobblestone
		BlockBuilder CompressedCobblestone = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE=CompressedCobblestone.build("compressed_cobblestone","compressed_cobblestone",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneCarved = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE_CARVED=CompressedCobblestoneCarved.build("compressed_cobblestone_carved","compressed_cobblestone_carved",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE_SLAB=CompressedCobblestoneSlab.
			build("compressed_cobblestone_slab", "compressed_cobblestone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_COBBLESTONE_CARVED));


		// compressed mossy cobblestone
		BlockBuilder CompressedCobblestoneMossy = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE_MOSSY=CompressedCobblestoneMossy.build("compressed_cobblestone_mossy","compressed_cobblestone_mossy",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneMossyCarved = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE_MOSSY_CARVED=CompressedCobblestoneMossyCarved.build("compressed_cobblestone_mossy_carved","compressed_cobblestone_mossy_carved",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedCobblestoneMossySlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_COBBLESTONE_MOSSY_SLAB=CompressedCobblestoneMossySlab.
			build("compressed_cobblestone_mossy_slab", "compressed_cobblestone_mossy_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_COBBLESTONE_MOSSY_CARVED));


		// compressed polished stone
		BlockBuilder CompressedPolishedStone = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_STONE=CompressedPolishedStone.build("compressed_polished_stone","compressed_polished_stone",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedPolishedStoneCarved = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_STONE_CARVED=CompressedPolishedStoneCarved.build("compressed_polished_stone_carved","compressed_polished_stone_carved",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedPolishedStoneSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_STONE_SLAB=CompressedPolishedStoneSlab.
			build("compressed_polished_stone_slab", "compressed_polished_stone_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_POLISHED_STONE_CARVED));


		// compressed polished stone tiles
			BlockBuilder CompressedPolishedStoneTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_STONE_TILES=CompressedPolishedStoneTiles.build("compressed_polished_stone_tiles","compressed_polished_stone_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedPolishedStoneTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(3.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_STONE_TILES_SLAB=CompressedPolishedStoneTilesSlab.
			build("compressed_polished_stone_tiles_slab", "compressed_polished_stone_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_POLISHED_STONE_TILES));


		// compressed polished netherrack
		BlockBuilder CompressedPolishedNetherrack = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(0.8F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_NETHERRACK=CompressedPolishedNetherrack.build("compressed_polished_netherrack","compressed_polished_netherrack",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedPolishedNetherrackCarved = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(0.8F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_NETHERRACK_CARVED=CompressedPolishedNetherrackCarved.build("compressed_polished_netherrack_carved","compressed_polished_netherrack_carved",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder CompressedPolishedNetherrackSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(0.8F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		COMPRESSED_POLISHED_NETHERRACK_SLAB=CompressedPolishedNetherrackSlab.
			build("compressed_polished_netherrack_slab", "compressed_polished_netherrack_slab",newBlockID(),
				b -> new BlockLogicSlab(b, COMPRESSED_POLISHED_NETHERRACK_CARVED));


		///////////////
		/// SHOREDS ///
		///////////////


		// shored gravel
		BlockBuilder ShoredGravel = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL);
		SHORED_GRAVEL=ShoredGravel.build("shored_gravel","shored_gravel",newBlockID(),b -> new BlockLogic(b, Materials.DIRT));

		BlockBuilder ShoredGravelStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL);
		SHORED_GRAVEL_STAIRS=ShoredGravelStairs.
			build("shored_gravel_stair", "shored_gravel_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SHORED_GRAVEL));

		BlockBuilder ShoredGravelSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL);
		SHORED_GRAVEL_SLAB=ShoredGravelSlab.
			build("shored_gravel_slab", "shored_gravel_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SHORED_GRAVEL));


		// shored sand
		BlockBuilder ShoredSand = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.5F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.SAND);
		SHORED_SAND=ShoredSand.build("shored_sand","shored_sand",newBlockID(),b -> new BlockLogic(b, Materials.SAND));

		BlockBuilder ShoredSandStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.5F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.SAND);
		SHORED_SAND_STAIRS=ShoredSandStairs.
			build("shored_sand_stair", "shored_sand_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SHORED_SAND));

		BlockBuilder ShoredSandSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.NATURAL))
			.setHardness(0.5F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.SAND);
		SHORED_SAND_SLAB=ShoredSandSlab.
			build("shored_sand_slab", "shored_sand_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SHORED_SAND));


		////////////////
		/// PLATINGS ///
		////////////////


		//iron plating
		BlockBuilder IronPlating = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.METAL);
		IRON_PLATING=IronPlating.build("iron_plating","iron_plating",newBlockID(),b -> new BlockLogic(b, Materials.METAL));

		BlockBuilder IronPlatingSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.METAL);
		IRON_PLATING_SLAB=IronPlatingSlab.
			build("iron_plating_slab", "iron_plating_slab",newBlockID(),
				b -> new BlockLogicSlab(b, IRON_PLATING));


		//steel plating
		BlockBuilder SteelPlating = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.METAL);
		STEEL_PLATING=SteelPlating.build("steel_plating","steel_plating",newBlockID(),b -> new BlockLogic(b, Materials.METAL));

		BlockBuilder SteelPlatingSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.METAL);
		STEEL_PLATING_SLAB=SteelPlatingSlab.
			build("steel_plating_slab", "steel_plating_slab",newBlockID(),
				b -> new BlockLogicSlab(b, STEEL_PLATING));


		///////////////////
		/// SMALL TILES ///
		///////////////////


		//small marble tiles
		BlockBuilder SmallMarbleTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_MARBLE_TILES=SmallMarbleTiles.build("small_marble_tiles","small_marble_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder SmallMarbleTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_MARBLE_TILES_STAIRS=SmallMarbleTilesStairs.
			build("small_marble_tiles_stair", "small_marble_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SMALL_MARBLE_TILES));

		BlockBuilder SmallMarbleTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_MARBLE_TILES_SLAB=SmallMarbleTilesSlab.
			build("small_marble_tiles_slab", "small_marble_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SMALL_MARBLE_TILES));


		//small lapis tiles
		BlockBuilder SmallLapisTiles = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_LAPIS_TILES=SmallLapisTiles.build("small_lapis_tiles","small_lapis_tiles",newBlockID(),b -> new BlockLogic(b, Materials.STONE));

		BlockBuilder SmallLapisTilesStairs = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_LAPIS_TILES_STAIRS=SmallLapisTilesStairs.
			build("small_lapis_tiles_stair", "small_lapis_tiles_stair",newBlockID(),
				b -> new BlockLogicStairs(b, SMALL_LAPIS_TILES));

		BlockBuilder SmallLapisTilesSlab = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		SMALL_LAPIS_TILES_SLAB=SmallLapisTilesSlab.
			build("small_lapis_tiles_slab", "small_lapis_tiles_slab",newBlockID(),
				b -> new BlockLogicSlab(b, SMALL_LAPIS_TILES));


		/////////////////////
		/// MISCELLANEOUS ///
		/////////////////////


		//vent block
		BlockBuilder VentBlock = new BlockBuilder((MOD_ID))
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE);
		VENT_BLOCK=VentBlock.build("vent_block","vent_block",newBlockID(),b -> new BlockLogic(b, Materials.STONE));


		SDOF.LOGGER.info("SDOF blocks initialized");
	}
}
