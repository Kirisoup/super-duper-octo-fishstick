package trans_siberian.sdof.definition;

import org.jetbrains.annotations.NotNull;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicSlab;
import net.minecraft.core.block.BlockLogicSupplier;
import net.minecraft.core.block.material.Material;
import turniplabs.halplibe.helper.BlockBuilder;

public final record BlockMetaDefinition(
	@NotNull Material materialOverride,
	@NotNull BlockBuilder builder
) {
	public @NotNull BlockDefinition.Simple simple(final @NotNull String nameKey) {
		return new BlockDefinition.Simple(this.builder, nameKey, this.materialOverride);
	}

	public @NotNull <Logic extends BlockLogic> BlockDefinition.Custom<Logic> custom(
		final @NotNull String nameKey,
		final @NotNull BlockLogicSupplier<Logic> logic
	) {
		return new BlockDefinition.Custom<>(this.builder, nameKey, logic);
	}

	public @NotNull BlockDefinition.Stairs stairs(
		final @NotNull String nameKey,
		final @NotNull Block<?> base
	) {
		return new BlockDefinition.Stairs(this.builder, nameKey, base);
	}

	public @NotNull BlockDefinition.Slab slab(
		final @NotNull String nameKey,
		final @NotNull Block<?> base
	) {
		return new BlockDefinition.Slab(this.builder, nameKey, base);
	}

	public @NotNull BlockDefinition.Bricks bricks(
		final @NotNull String nameKey,
		final @NotNull Block<?> base
	) {
		return new BlockDefinition.Bricks(builder, nameKey, base);
	}

	public @NotNull BlockDefinition.Tiles tiles(
		final @NotNull String nameKey,
		final @NotNull Block<? extends BlockLogicSlab> base
	) {
		return new BlockDefinition.Tiles(builder, nameKey, base);
	}
}
