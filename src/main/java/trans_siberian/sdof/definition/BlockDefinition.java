package trans_siberian.sdof.definition;

import static trans_siberian.sdof.SDOF.MOD_ID;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelSlab;
import net.minecraft.client.render.block.model.BlockModelStairs;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.client.render.block.model.generic.BlockModelGenericSlab;
import net.minecraft.client.render.block.model.generic.BlockModelGenericStairs;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicSlab;
import net.minecraft.core.block.BlockLogicStairs;
import net.minecraft.core.block.BlockLogicSupplier;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.RecipeBuilder;

public abstract class BlockDefinition<Logic extends BlockLogic> {
	public static int idIncr = 7000;
    protected static final NamespaceID MISSING_MODEL_ID = new NamespaceID("minecraft", "block/missing");

	public final @NotNull String nameKey;
	protected final @NotNull BlockBuilder builder;

	private @Nullable Block<Logic> block = null;

	protected BlockDefinition(
		final @NotNull BlockBuilder builder,
		final @NotNull String nameKey
	) {
		this.nameKey = nameKey;
		this.builder = builder;
	}

	protected abstract Logic makeLogic(final @NotNull Block<Logic> block);

	public final @NotNull Block<Logic> block() {
		return (this.block != null)
			? this.block
			: (this.block = this.builder.build(this.nameKey, this.nameKey, idIncr++, this::makeLogic));
	}

	public interface IWorkbenchRecipe {
		void makeWorkbenchRecipe();
	}

	public interface IModel<Logic extends BlockLogic> {
		@Nullable BlockModel<Logic> getModel();
	}

	public static class Simple extends BlockDefinition<BlockLogic> implements IModel<BlockLogic> {
		public final @NotNull Material mat;

		public Simple(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Material mat
		) {
			super(builder, nameKey);
			this.mat = mat;
		}

		@Override
		protected BlockLogic makeLogic(@NotNull Block<BlockLogic> block) {
			return new BlockLogic(block, this.mat);
		}

		@Override
		public @Nullable BlockModel<BlockLogic> getModel() {
			final var jsonModel = BlockModelDispatcher.loadDataModel(MOD_ID + ":block/" + this.nameKey);
			if (!MISSING_MODEL_ID.equals(jsonModel.modelId())) return new BlockModelGeneric<>(this.block(), jsonModel);
			return null;
		}
	}

	public static final class Custom<Logic extends BlockLogic> extends BlockDefinition<Logic> {
		private final @NotNull BlockLogicSupplier<Logic> logic;

		public Custom(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull BlockLogicSupplier<Logic> logic
		) {
			super(builder, nameKey);
			this.logic = logic;
		}

		@Override
		protected Logic makeLogic(@NotNull Block<Logic> block) {
			return this.logic.get(block);
		}
	}

	public static abstract class Derived<Logic extends BlockLogic, BaseLogic extends BlockLogic> extends BlockDefinition<Logic> {
		public final @NotNull Block<? extends BaseLogic> base;

		public Derived(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Block<? extends BaseLogic> base
		) {
			super(builder, nameKey);
			assert base != null : nameKey;
			this.base = base;
		}

		public void makeShapedWorkbenchRecipe(@NotNull String @NotNull... shape) {
			RecipeBuilder.Shaped(MOD_ID, shape).addInput('X', this.base).create(this.nameKey, this.block());
		}
	}

	public static class Stairs extends Derived<BlockLogicStairs, BlockLogic> implements IWorkbenchRecipe, IModel<BlockLogicStairs> {
		public Stairs(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Block<?> base
		) {
			super(builder, nameKey, base);
		}

		@Override
		protected BlockLogicStairs makeLogic(@NotNull Block<BlockLogicStairs> block) {
			return new BlockLogicStairs(block, this.base);
		}

		@Override
		public void makeWorkbenchRecipe() {
			this.makeShapedWorkbenchRecipe(
				"X  ",
				"XX ",
				"XXX"
			);
		}

		@Override
		public @Nullable BlockModel<BlockLogicStairs> getModel() {
			final var jsonModel = BlockModelDispatcher.loadDataModel(MOD_ID + ":block/stairs/" + this.nameKey);
			if (!MISSING_MODEL_ID.equals(jsonModel.modelId())) return new BlockModelGenericStairs<>(this.block(), jsonModel);
			assert BlockModelDispatcher.getInstance().getDispatch(((BlockLogicStairs)this.block().getLogic()).modelBlock) != null : this.block();
			return new BlockModelStairs<>(this.block());
		}
	}

	public static class Slab extends Derived<BlockLogicSlab, BlockLogic> implements IWorkbenchRecipe, IModel<BlockLogicSlab> {
		public Slab(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Block<?> base
		) {
			super(builder, nameKey, base);
		}

		@Override
		protected BlockLogicSlab makeLogic(@NotNull Block<BlockLogicSlab> block) {
			return new BlockLogicSlab(block, this.base);
		}

		@Override
		public void makeWorkbenchRecipe() {
			this.makeShapedWorkbenchRecipe(
				"XXX"
			);
		}

		@Override
		public @Nullable BlockModel<BlockLogicSlab> getModel() {
			final var jsonModel = this.getJsonModel();
			if (jsonModel != null) return jsonModel;
			return new BlockModelSlab<>(this.block());
		}

		private @Nullable BlockModelGenericSlab<BlockLogicSlab> getJsonModel() {
			final String full = "/full";
			final String lower = "/lower";
			final String upper = "/upper";

			final var sb = new StringBuilder();
			sb.append(MOD_ID);
			sb.append(":block/slabs/");
			sb.append(this.nameKey);

			final var jsonModelFull = BlockModelDispatcher.loadDataModel(sb.append(full).toString());
			if (MISSING_MODEL_ID.equals(jsonModelFull.modelId())) return null;
			sb.setLength(sb.length() - full.length());

			final var jsonModelLower = BlockModelDispatcher.loadDataModel(sb.append(lower).toString());
			if (MISSING_MODEL_ID.equals(jsonModelLower.modelId())) return null;
			sb.setLength(sb.length() - lower.length());

			final var jsonModelUpper = BlockModelDispatcher.loadDataModel(sb.append(upper).toString());
			if (MISSING_MODEL_ID.equals(jsonModelUpper.modelId())) return null;

			return new BlockModelGenericSlab<>(this.block(), jsonModelLower, jsonModelUpper, jsonModelFull);
		}
	}

	public static class Bricks extends Derived<BlockLogic, BlockLogic> implements IWorkbenchRecipe, IModel<BlockLogic> {
		public Bricks(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Block<?> base
		) {
			super(builder, nameKey, base);
		}

		@Override
		protected BlockLogic makeLogic(@NotNull Block<BlockLogic> block) {
			return new BlockLogic(block, this.base.getMaterial());
		}

		@Override
		public void makeWorkbenchRecipe() {
			this.makeShapedWorkbenchRecipe(
				"XX",
				"XX"
			);
		}

		@Override
		public @Nullable BlockModel<BlockLogic> getModel() {
			final var jsonModel = BlockModelDispatcher.loadDataModel(MOD_ID + ":block/bricks/" + this.nameKey);
			if (!MISSING_MODEL_ID.equals(jsonModel.modelId())) return new BlockModelGeneric<>(this.block(), jsonModel);
			return null;
		}
	}

	public static class Tiles extends Derived<BlockLogic, BlockLogicSlab> implements IWorkbenchRecipe, IModel<BlockLogic> {
		public Tiles(
			final @NotNull BlockBuilder builder,
			final @NotNull String nameKey,
			final @NotNull Block<? extends BlockLogicSlab> baseSlab
		) {
			super(builder, nameKey, baseSlab);
		}

		@Override
		protected BlockLogic makeLogic(@NotNull Block<BlockLogic> block) {
			return new BlockLogic(block, this.base.getLogic().modelBlock.getMaterial());
		}

		@Override
		public void makeWorkbenchRecipe() {
			this.makeShapedWorkbenchRecipe(
				"XX",
				"XX"
			);
		}

		@Override
		public @Nullable BlockModel<BlockLogic> getModel() {
			final var jsonModel = BlockModelDispatcher.loadDataModel(MOD_ID + ":block/tiles/" + this.nameKey);
			if (!MISSING_MODEL_ID.equals(jsonModel.modelId())) return new BlockModelGeneric<>(this.block(), jsonModel);
			return null;
		}
	}
}
