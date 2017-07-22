package minecraftgate.mbe01_block_simple;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSimple extends Block
{
  public BlockSimple()
  {
    super(Material.ROCK);
    this.setCreativeTab(CreativeTabs.REDSTONE);
  }

  @SideOnly(Side.CLIENT)
  public BlockRenderLayer getBlockLayer()
  {
    return BlockRenderLayer.SOLID;
  }

  @Override
  public boolean isOpaqueCube(IBlockState iBlockState) {
    return true;
  }

  @Override
  public boolean isFullCube(IBlockState iBlockState) {
    return true;
  }

  @Override
  public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
    return EnumBlockRenderType.MODEL;
  }
}
