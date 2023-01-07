package net.trique.wardentools.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class LootVase extends Block {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;


    public LootVase(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
                    Block.createCuboidShape(4, 11, 4, 12, 15, 5),
                    Block.createCuboidShape(0, 0, 0, 16, 1, 16),
                    Block.createCuboidShape(13, 9, 1, 15, 10, 15),
                    Block.createCuboidShape(1, 9, 1, 3, 10, 15),
                    Block.createCuboidShape(15, 1, 0, 16, 9, 16),
                    Block.createCuboidShape(0, 1, 0, 1, 9, 16),
                    Block.createCuboidShape(1, 1, 0, 15, 9, 1),
                    Block.createCuboidShape(3, 9, 1, 13, 10, 3),
                    Block.createCuboidShape(1, 1, 15, 15, 9, 16),
                    Block.createCuboidShape(3, 9, 13, 13, 10, 15),
                    Block.createCuboidShape(3, 10, 12, 13, 11, 13),
                    Block.createCuboidShape(3, 15, 12, 13, 16, 13),
                    Block.createCuboidShape(3, 15, 3, 13, 16, 4),
                    Block.createCuboidShape(3, 15, 4, 4, 16, 12),
                    Block.createCuboidShape(12, 15, 4, 13, 16, 12),
                    Block.createCuboidShape(3, 10, 3, 13, 11, 4),
                    Block.createCuboidShape(3, 10, 4, 5, 11, 12),
                    Block.createCuboidShape(11, 10, 4, 13, 11, 12),
                    Block.createCuboidShape(11, 11, 5, 12, 15, 11),
                    Block.createCuboidShape(4, 11, 5, 5, 15, 11),
                    Block.createCuboidShape(4, 11, 11, 12, 15, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(4, 11, 4, 5, 15, 12),
            Block.createCuboidShape(0, 0, 0, 16, 1, 16),
            Block.createCuboidShape(1, 9, 1, 15, 10, 3),
            Block.createCuboidShape(1, 9, 13, 15, 10, 15),
            Block.createCuboidShape(0, 1, 0, 16, 9, 1),
            Block.createCuboidShape(0, 1, 15, 16, 9, 16),
            Block.createCuboidShape(0, 1, 1, 1, 9, 15),
            Block.createCuboidShape(1, 9, 3, 3, 10, 13),
            Block.createCuboidShape(15, 1, 1, 16, 9, 15),
            Block.createCuboidShape(13, 9, 3, 15, 10, 13),
            Block.createCuboidShape(12, 10, 3, 13, 11, 13),
            Block.createCuboidShape(12, 15, 3, 13, 16, 13),
            Block.createCuboidShape(3, 15, 3, 4, 16, 13),
            Block.createCuboidShape(4, 15, 12, 12, 16, 13),
            Block.createCuboidShape(4, 15, 3, 12, 16, 4),
            Block.createCuboidShape(3, 10, 3, 4, 11, 13),
            Block.createCuboidShape(4, 10, 11, 12, 11, 13),
            Block.createCuboidShape(4, 10, 3, 12, 11, 5),
            Block.createCuboidShape(5, 11, 4, 11, 15, 5),
            Block.createCuboidShape(5, 11, 11, 11, 15, 12),
            Block.createCuboidShape(11, 11, 4, 12, 15, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(4, 11, 11, 12, 15, 12),
            Block.createCuboidShape(0, 0, 0, 16, 1, 16),
            Block.createCuboidShape(1, 9, 1, 3, 10, 15),
            Block.createCuboidShape(13, 9, 1, 15, 10, 15),
            Block.createCuboidShape(0, 1, 0, 1, 9, 16),
            Block.createCuboidShape(15, 1, 0, 16, 9, 16),
            Block.createCuboidShape(1, 1, 15, 15, 9, 16),
            Block.createCuboidShape(3, 9, 13, 13, 10, 15),
            Block.createCuboidShape(1, 1, 0, 15, 9, 1),
            Block.createCuboidShape(3, 9, 1, 13, 10, 3),
            Block.createCuboidShape(3, 10, 3, 13, 11, 4),
            Block.createCuboidShape(3, 15, 3, 13, 16, 4),
            Block.createCuboidShape(3, 15, 12, 13, 16, 13),
            Block.createCuboidShape(12, 15, 4, 13, 16, 12),
            Block.createCuboidShape(3, 15, 4, 4, 16, 12),
            Block.createCuboidShape(3, 10, 12, 13, 11, 13),
            Block.createCuboidShape(11, 10, 4, 13, 11, 12),
            Block.createCuboidShape(3, 10, 4, 5, 11, 12),
            Block.createCuboidShape(4, 11, 5, 5, 15, 11),
            Block.createCuboidShape(11, 11, 5, 12, 15, 11),
            Block.createCuboidShape(4, 11, 4, 12, 15, 5)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(11, 11, 4, 12, 15, 12),
            Block.createCuboidShape(0, 0, 0, 16, 1, 16),
            Block.createCuboidShape(1, 9, 13, 15, 10, 15),
            Block.createCuboidShape(1, 9, 1, 15, 10, 3),
            Block.createCuboidShape(0, 1, 15, 16, 9, 16),
            Block.createCuboidShape(0, 1, 0, 16, 9, 1),
            Block.createCuboidShape(15, 1, 1, 16, 9, 15),
            Block.createCuboidShape(13, 9, 3, 15, 10, 13),
            Block.createCuboidShape(0, 1, 1, 1, 9, 15),
            Block.createCuboidShape(1, 9, 3, 3, 10, 13),
            Block.createCuboidShape(3, 10, 3, 4, 11, 13),
            Block.createCuboidShape(3, 15, 3, 4, 16, 13),
            Block.createCuboidShape(12, 15, 3, 13, 16, 13),
            Block.createCuboidShape(4, 15, 3, 12, 16, 4),
            Block.createCuboidShape(4, 15, 12, 12, 16, 13),
            Block.createCuboidShape(12, 10, 3, 13, 11, 13),
            Block.createCuboidShape(4, 10, 3, 12, 11, 5),
            Block.createCuboidShape(4, 10, 11, 12, 11, 13),
            Block.createCuboidShape(5, 11, 11, 11, 15, 12),
            Block.createCuboidShape(5, 11, 4, 11, 15, 5),
            Block.createCuboidShape(4, 11, 4, 5, 15, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));

    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
