package minecraftgate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MinecraftGate.MODID, version = MinecraftGate.VERSION)
public class MinecraftGate
{
    public static final String MODID = "minecraftgate";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Yes. Hello, world. ");
    }
}
