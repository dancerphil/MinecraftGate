package minecraftbyexample;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = MinecraftGate.MODID, version = MinecraftGate.VERSION)
public class MinecraftGate
{
    public static final String MODID = "minecraftbyexample";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide="minecraftbyexample.ClientOnlyProxy", serverSide="minecraftbyexample.DedicatedServerProxy")
    public static Proxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
