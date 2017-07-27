package minecraftgate.not_gate;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon
{
  public static BlockNotGate blockSimple;
  public static ItemBlock itemBlockSimple;

  public static void preInitCommon()
  {
    blockSimple = (BlockNotGate)(new BlockNotGate().setUnlocalizedName("not_gate"));
    blockSimple.setRegistryName("not_gate_registry_name");
    ForgeRegistries.BLOCKS.register(blockSimple);

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
