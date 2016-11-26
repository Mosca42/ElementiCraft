package elementicraft.common.capabilities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CapabilitiesRegister {

	public static void init(FMLInitializationEvent event) {
		MagicCapabilities.register();
		ElementsCapabilities.register();		
	}

}
