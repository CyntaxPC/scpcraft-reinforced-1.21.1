package net.cyntax.scpcraftreinforced.block.custom;

import com.mojang.serialization.MapCodec;
import net.cyntax.scpcraftreinforced.entity.ModEntities;
import net.cyntax.scpcraftreinforced.entity.custom.ChairEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Stream;

public class ChairBlock extends HorizontalFacingBlock {
    public static final MapCodec<ChairBlock> CODEC = createCodec(ChairBlock::new);
    private static final VoxelShape SHAPEE = Stream.of(
                    Block.createCuboidShape(5.0, 0.0, 3.0, 6.0, 9.0, 4.0),
                    Block.createCuboidShape(5.0, 0.0, 12.0, 6.0, 9.0, 13.0),
                    Block.createCuboidShape(14.0, 0.0, 3.0, 15.0, 9.0, 4.0),
                    Block.createCuboidShape(14.0, 0.0, 12.0, 15.0, 9.0, 13.0),
                    Block.createCuboidShape(4.0, 9.0, 2.0, 16.0, 10.0, 14.0),
                    Block.createCuboidShape(4.0, 11.0, 2.0, 5.0, 23.0, 14.0),
                    Block.createCuboidShape(4.0, 10.0, 4.0, 5.0, 11.0, 6.0),
                    Block.createCuboidShape(4.0, 10.0, 10.0, 5.0, 11.0, 12.0),
                    Block.createCuboidShape(4.0, 23.0, 3.0, 5.0, 24.0, 13.0))
            .reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPEW = Stream.of(
                    Block.createCuboidShape(1.0, 0.0, 3.0, 2.0, 9.0, 4.0),
                    Block.createCuboidShape(1.0, 0.0, 12.0, 2.0, 9.0, 13.0),
                    Block.createCuboidShape(10.0, 0.0, 3.0, 11.0, 9.0, 4.0),
                    Block.createCuboidShape(10.0, 0.0, 12.0, 11.0, 9.0, 13.0),
                    Block.createCuboidShape(0.0, 9.0, 2.0, 12.0, 10.0, 14.0),
                    Block.createCuboidShape(11.0, 11.0, 2.0, 12.0, 23.0, 14.0),
                    Block.createCuboidShape(11.0, 10.0, 4.0, 12.0, 11.0, 6.0),
                    Block.createCuboidShape(11.0, 10.0, 10.0, 12.0, 11.0, 12.0),
                    Block.createCuboidShape(11.0, 23.0, 3.0, 12.0, 24.0, 13.0))
            .reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();


    private static final VoxelShape SHAPES = Stream.of(
                    Block.createCuboidShape(3.0, 0.0, 5.0, 4.0, 9.0, 6.0),
                    Block.createCuboidShape(12.0, 0.0, 5.0, 13.0, 9.0, 6.0),
                    Block.createCuboidShape(3.0, 0.0, 14.0, 4.0, 9.0, 15.0),
                    Block.createCuboidShape(12.0, 0.0, 14.0, 13.0, 9.0, 15.0),
                    Block.createCuboidShape(2.0, 9.0, 4.0, 14.0, 10.0, 16.0),
                    Block.createCuboidShape(2.0, 11.0, 4.0, 14.0, 23.0, 5.0),
                    Block.createCuboidShape(4.0, 10.0, 4.0, 6.0, 11.0, 5.0),
                    Block.createCuboidShape(10.0, 10.0, 4.0, 12.0, 11.0, 5.0),
                    Block.createCuboidShape(3.0, 23.0, 4.0, 13.0, 24.0, 5.0))
            .reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPEN = Stream.of(
                    Block.createCuboidShape(3.0, 0.0, 1.0, 4.0, 9.0, 2.0),
                    Block.createCuboidShape(12.0, 0.0, 1.0, 13.0, 9.0, 2.0),
                    Block.createCuboidShape(3.0, 0.0, 10.0, 4.0, 9.0, 11.0),
                    Block.createCuboidShape(12.0, 0.0, 10.0, 13.0, 9.0, 11.0),
                    Block.createCuboidShape(2.0, 9.0, 0.0, 14.0, 10.0, 12.0),
                    Block.createCuboidShape(2.0, 11.0, 11.0, 14.0, 23.0, 12.0),
                    Block.createCuboidShape(4.0, 10.0, 11.0, 6.0, 11.0, 12.0),
                    Block.createCuboidShape(10.0, 10.0, 11.0, 12.0, 11.0, 12.0),
                    Block.createCuboidShape(3.0, 23.0, 11.0, 13.0, 24.0, 12.0))
            .reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public ChairBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> SHAPEN;
            case SOUTH -> SHAPES;
            case EAST -> SHAPEE;
            case WEST -> SHAPEW;
            default -> SHAPEW;
        };
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
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            Entity entity = null;
            List<ChairEntity> entities = world.getEntitiesByType(ModEntities.CHAIR, new Box(pos), chair -> true);
            if(entities.isEmpty()) {
                entity = ModEntities.CHAIR.spawn((ServerWorld) world, pos, SpawnReason.TRIGGERED);
            } else {
                entity = entities.getFirst();
            }

            player.startRiding(entity);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}