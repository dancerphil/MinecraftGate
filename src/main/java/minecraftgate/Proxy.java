package minecraftgate;

import net.minecraft.entity.player.EntityPlayer;

public abstract class Proxy {

  public void preInit()
  {
    minecraftgate.simple.StartupCommon.preInitCommon();
    minecraftgate.not_gate.StartupCommon.preInitCommon();
  }

  public void init()
  {
    minecraftgate.simple.StartupCommon.initCommon();
    minecraftgate.not_gate.StartupCommon.initCommon();
  }

  public void postInit()
  {
    minecraftgate.simple.StartupCommon.postInitCommon();
    minecraftgate.not_gate.StartupCommon.postInitCommon();
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
