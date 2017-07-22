package minecraftbyexample;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ClientOnlyProxy extends Proxy
{

  public void preInit()
  {
    super.preInit();
    minecraftbyexample.mbe01_block_simple.StartupClientOnly.preInitClientOnly();
  }

  public void init()
  {
    super.init();
    minecraftbyexample.mbe01_block_simple.StartupClientOnly.initClientOnly();
  }

  public void postInit()
  {
    super.postInit();
    minecraftbyexample.mbe01_block_simple.StartupClientOnly.postInitClientOnly();
  }

  @Override
  public boolean playerIsInCreativeMode(EntityPlayer player) {
    if (player instanceof EntityPlayerMP) {
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
      return entityPlayerMP.interactionManager.isCreative();
    } else if (player instanceof EntityPlayerSP) {
      return Minecraft.getMinecraft().playerController.isInCreativeMode();
    }
    return false;
  }

  @Override
  public boolean isDedicatedServer() {return false;}

}
