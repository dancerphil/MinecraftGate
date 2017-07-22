package minecraftgate.mbe01_block_simple;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon
{
  public static BlockSimple blockSimple;  // this holds the unique instance of your block
  public static ItemBlock itemBlockSimple;  // this holds the unique instance of the ItemBlock corresponding to your block

  public static void preInitCommon()
  {
    blockSimple = (BlockSimple)(new BlockSimple().setUnlocalizedName("mbe01_block_simple_unlocalised_name"));
    blockSimple.setRegistryName("mbe01_block_simple_registry_name");
    ForgeRegistries.BLOCKS.register(blockSimple);

    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
    itemBlockSimple = new ItemBlock(blockSimple);
    itemBlockSimple.setRegistryName(blockSimple.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockSimple);

    System.out.println("fuck!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! i am done.");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
