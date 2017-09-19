package lain.mods.cleanview;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "cleanview", useMetadata = true, acceptedMinecraftVersions = "[1.12,)", certificateFingerprint = "aaaf83332a11df02406e9f266b1b65c1306f0f76")
public class CleanView
{

    @Mod.EventHandler
    public void handleEvent(FMLInitializationEvent event)
    {
        if (event.getSide().isClient())
            Proxy.setup();
        else
            System.err.println("This mod is client-only, please remove it from your server");
    }

}
