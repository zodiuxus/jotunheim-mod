package net.zodiuxus.jotunheim;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.zodiuxus.jotunheim.registry.ClientRendererRegistry;

@Environment(EnvType.CLIENT)
public class JotunheimClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientRendererRegistry.register();
    }
}
