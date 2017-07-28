package minecraftgate;

import minecraftgate.simple.BlockSimple;
import minecraftgate.not_gate.BlockNotGate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public abstract class Proxy {
  public static BlockSimple blockSimple;
  public static ItemBlock itemBlockSimple;
  public static BlockNotGate blockNotGate;
  public static ItemBlock itemBlockNotGate;

  public void preInit() {
    blockSimple = (BlockSimple)(new BlockSimple().setUnlocalizedName("simple"));
    blockSimple.setRegistryName("simple_registry_name");
    ForgeRegistries.BLOCKS.register(blockSimple);

    itemBlockSimple = new ItemBlock(blockSimple);
    itemBlockSimple.setRegistryName(blockSimple.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockSimple);

    blockNotGate = (BlockNotGate)(new BlockNotGate().setUnlocalizedName("not_gate"));
    blockNotGate.setRegistryName("not_gate_registry_name");
    ForgeRegistries.BLOCKS.register(blockNotGate);

    itemBlockNotGate = new ItemBlock(blockNotGate);
    itemBlockNotGate.setRegistryName(blockNotGate.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockNotGate);
  }

  public void init() {
  }

  public void postInit() {
  }

  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

  abstract public boolean isDedicatedServer();

}
