package net.cyntax.scpcraftreinforced.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class GlassTableBlock extends HorizontalFacingBlock {
    public static final MapCodec<GlassTableBlock> CODEC = createCodec(GlassTableBlock::new);
    private static final VoxelShape SHAPE = Stream.of(
                    Block.createCuboidShape(1.0, 0.0, 1.0, 2.0, 14.0, 2.0),
                    Block.createCuboidShape(1.0, 0.0, 14.0, 2.0, 14.0, 15.0),
                    Block.createCuboidShape(14.0, 0.0, 1.0, 15.0, 14.0, 2.0),
                    Block.createCuboidShape(14.0, 0.0, 14.0, 15.0, 14.0, 15.0),
                    Block.createCuboidShape(1.0, 13.0, 1.0, 2.0, 14.0, 15.0),
                    Block.createCuboidShape(1.0, 13.0, 1.0, 15.0, 14.0, 2.0),
                    Block.createCuboidShape(14.0, 13.0, 1.0, 15.0, 15.0, 15.0),
                    Block.createCuboidShape(1.0, 13.0, 14.0, 15.0, 14.0, 15.0),
                    Block.createCuboidShape(0.0, 14.0, 0.0, 16.0, 16.0, 16.0))
            .reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public GlassTableBlock(Settings settings) {
        super(settings.nonOpaque());
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    @Override
    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }

    @Override
    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }




}