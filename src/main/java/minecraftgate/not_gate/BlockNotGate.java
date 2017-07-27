package minecraftgate.not_gate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNotGate extends Block {
    public BlockNotGate() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }
    @Override
    public boolean canProvidePower(IBlockState iBlockState)
    {
        return true;
    }

    @Override
    public int getWeakPower(IBlockState state, IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        return 15;
    }

    // The variable source block does not provide strong power.  See BlockButton for a example of a block which does.
    @Override
    public int getStrongPower(IBlockState state, IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        return 0;
    }

    // When the block is broken, you may need to notify neighbours.
    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        final boolean CASCADE_UPDATE = false;  // not sure
        // except for calls by World.setBlockState()
        worldIn.notifyNeighborsOfStateChange(pos, this, CASCADE_UPDATE);
        super.breakBlock(worldIn, pos, state);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        //TODO
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState iBlockState) {
        //TODO
        return true;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.MODEL;
    }
}
