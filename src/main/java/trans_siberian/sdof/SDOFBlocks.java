package trans_siberian.sdof;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import trans_siberian.sdof.definition.BlockDefinition;
import trans_siberian.sdof.definition.BlockMetaDefinition;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static trans_siberian.sdof.SDOF.MOD_ID;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;

/*
 - Simple blocks using basic models
 - Rotatable blocks using block logic

*/
// implement BlockInitEntrypoint
public class SDOFBlocks {

	// we will create a couple extra functions

	public static int newBlockID() {
		return BlockDefinition.idIncr ++;
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

	public static final List<BlockDefinition<?>> blocks = new ArrayList<>();

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


	// add more definitions if we have blocks that aren't stones
	private static final BlockMetaDefinition STONE_ISH = new BlockMetaDefinition(
		Materials.STONE,
		new BlockBuilder(MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.STONE))
			.setHardness(1.5F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
	);

	private static <Logic extends BlockLogic> @NotNull Block<Logic> make(
		final @NotNull BlockDefinition<Logic> definition
	) {
		blocks.add(definition);
		return definition.block();
	}

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

		// 		STONE_STAIRS                     = make(STONE_ISH.stairs("stone_stair", Blocks.STONE));
		STONE_SLAB                       = make(STONE_ISH.slab("stone_slab", Blocks.STONE));
		LIMESTONE_STAIRS                 = make(STONE_ISH.stairs("limestone_stair", Blocks.LIMESTONE));
		LIMESTONE_SLAB                   = make(STONE_ISH.slab("limestone_slab", Blocks.LIMESTONE));
		GRANITE_STAIRS                   = make(STONE_ISH.stairs("granite_stair", Blocks.GRANITE));
		GRANITE_SLAB                     = make(STONE_ISH.slab("granite_slab", Blocks.GRANITE));
		BASALT_STAIRS                    = make(STONE_ISH.stairs("basalt_stair", Blocks.BASALT));
		BASALT_SLAB                      = make(STONE_ISH.slab("basalt_slab", Blocks.BASALT));
		PERMAFROST_STAIRS                = make(STONE_ISH.stairs("permafrost_stair", Blocks.PERMAFROST));
		PERMAFROST_SLAB                  = make(STONE_ISH.slab("permafrost_slab", Blocks.PERMAFROST));
		SLATE_STAIRS                     = make(STONE_ISH.stairs("slate_stair", Blocks.SLATE));
		SLATE_SLAB                       = make(STONE_ISH.slab("slate_slab", Blocks.SLATE));
		MARBLE_STAIRS                    = make(STONE_ISH.stairs("marble_stair", Blocks.MARBLE));
		MARBLE_SLAB                      = make(STONE_ISH.slab("marble_slab", Blocks.MARBLE));

		////////////////////////////////////////////////////
		/// SMOOTH SANDSTONE & POLISHED LIMESTONE BRICKS ///
		////////////////////////////////////////////////////


		// smooth sandstone
		SMOOTH_SANDSTONE                 = make(STONE_ISH.simple("smooth_sandstone"));
		SMOOTH_SANDSTONE_STAIRS          = make(STONE_ISH.stairs("smooth_sandstone_stair", SMOOTH_SANDSTONE));
		SMOOTH_SANDSTONE_SLAB            = make(STONE_ISH.slab("smooth_sandstone_slab", SMOOTH_SANDSTONE));


		// polished limestone bricks
		POLISHED_LIMESTONE_BRICKS        = make(STONE_ISH.bricks("polished_limestone_bricks", Blocks.LIMESTONE_POLISHED));
		POLISHED_LIMESTONE_BRICKS_STAIRS = make(STONE_ISH.stairs("polished_limestone_bricks_stair", POLISHED_LIMESTONE_BRICKS));
		POLISHED_LIMESTONE_BRICKS_SLAB   = make(STONE_ISH.slab("polished_limestone_bricks_slab", POLISHED_LIMESTONE_BRICKS));

		//////////////////////
		/// POLISHED TILES ///
		//////////////////////


		// polished stone tiles
		POLISHED_STONE_TILES             = make(STONE_ISH.tiles("polished_stone_tiles", Blocks.SLAB_STONE_POLISHED));
		POLISHED_STONE_TILES_STAIRS      = make(STONE_ISH.stairs("polished_stone_tiles_stair", POLISHED_STONE_TILES));
		POLISHED_STONE_TILES_SLAB        = make(STONE_ISH.slab("polished_stone_tiles_slab", POLISHED_STONE_TILES));

		// polished limestone tiles
		POLISHED_LIMESTONE_TILES         = make(STONE_ISH.tiles("polished_limestone_tiles", Blocks.SLAB_LIMESTONE_POLISHED));
		POLISHED_LIMESTONE_TILES_STAIRS  = make(STONE_ISH.stairs("polished_limestone_tiles_stair", POLISHED_LIMESTONE_TILES));
		POLISHED_LIMESTONE_TILES_SLAB    = make(STONE_ISH.slab("polished_limestone_tiles_slab", POLISHED_LIMESTONE_TILES));

		// polished granite tiles
		POLISHED_GRANITE_TILES           = make(STONE_ISH.tiles("polished_granite_tiles", Blocks.SLAB_GRANITE_POLISHED));
		POLISHED_GRANITE_TILES_STAIRS    = make(STONE_ISH.stairs("polished_granite_tiles_stair", POLISHED_GRANITE_TILES));
		POLISHED_GRANITE_TILES_SLAB      = make(STONE_ISH.slab("polished_granite_tiles_slab", POLISHED_GRANITE_TILES));

		// polished basalt tiles
		POLISHED_BASALT_TILES            = make(STONE_ISH.tiles("polished_basalt_tiles", Blocks.SLAB_BASALT_POLISHED));
		POLISHED_BASALT_TILES_STAIRS     = make(STONE_ISH.stairs("polished_basalt_tiles_stair", POLISHED_BASALT_TILES));
		POLISHED_BASALT_TILES_SLAB       = make(STONE_ISH.slab("polished_basalt_tiles_slab", POLISHED_BASALT_TILES));

		// polished marble tiles
		POLISHED_MARBLE_TILES            = make(STONE_ISH.tiles("polished_marble_tiles", Blocks.SLAB_BRICK_MARBLE));
		POLISHED_MARBLE_TILES_STAIRS     = make(STONE_ISH.stairs("polished_marble_tiles_stair", POLISHED_MARBLE_TILES));
		POLISHED_MARBLE_TILES_SLAB       = make(STONE_ISH.slab("polished_marble_tiles_slab", POLISHED_MARBLE_TILES));

		// polished checkered tiles
		POLISHED_CHECKERED_TILES         = make(STONE_ISH.simple("polished_checkered_tiles"));
		POLISHED_CHECKERED_TILES_STAIRS  = make(STONE_ISH.stairs("polished_checkered_tiles_stair", POLISHED_CHECKERED_TILES));
		POLISHED_CHECKERED_TILES_SLAB    = make(STONE_ISH.slab("polished_checkered_tiles_slab", POLISHED_CHECKERED_TILES));

		///////////////////
		/// COMPRESSEDS ///
		///////////////////


		// compressed cobblestone
		COMPRESSED_COBBLESTONE           = make(STONE_ISH.simple("compressed_cobblestone"));
		COMPRESSED_COBBLESTONE_CARVED    = make(STONE_ISH.simple("compressed_cobblestone_carved"));
		COMPRESSED_COBBLESTONE_SLAB      = make(STONE_ISH.slab("compressed_cobblestone_slab", COMPRESSED_COBBLESTONE_CARVED));


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
