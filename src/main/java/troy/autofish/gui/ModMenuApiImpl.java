package troy.autofish.gui;

import troy.autofish.FabricModAutofish;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import net.minecraft.client.MinecraftClient;

public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return screen -> {
			return AutofishScreenBuilder.buildScreen(FabricModAutofish.getInstance(), MinecraftClient.getInstance());
		};
	}
}
