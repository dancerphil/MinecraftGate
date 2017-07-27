package minecraftgate.simple;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon
{
  public static BlockSimple blockSimple;
  public static ItemBlock itemBlockSimple;

  public static void preInitCommon()
  {
    blockSimple = (BlockSimple)(new BlockSimple().setUnlocalizedName("simple_unlocalised_name"));
    blockSimple.setRegistryName("simple_registry_name");
    ForgeRegistries.BLOCKS.register(blockSimple);

    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
    itemBlockSimple = new ItemBlock(blockSimple);
    itemBlockSimple.setRegistryName(blockSimple.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockSimple);

  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
