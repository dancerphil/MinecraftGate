package minecraftgate;

import net.minecraft.entity.player.EntityPlayer;

public abstract class Proxy {

  public void preInit()
  {
    minecraftgate.mbe01_block_simple.StartupCommon.preInitCommon();
  }

  public void init()
  {
    minecraftgate.mbe01_block_simple.StartupCommon.initCommon();
  }

  public void postInit()
  {
    minecraftgate.mbe01_block_simple.StartupCommon.postInitCommon();
  }

  // helper to determine whether the given player is in creative mode
  //  not necessary for most examples
  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

  /**
   * is this a dedicated server?
   * @return true if this is a dedicated server, false otherwise
   */
  abstract public boolean isDedicatedServer();

}
