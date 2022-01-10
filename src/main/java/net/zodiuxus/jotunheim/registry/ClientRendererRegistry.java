package net.zodiuxus.jotunheim.registry;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.zodiuxus.jotunheim.Utils;
import net.zodiuxus.jotunheim.client.model.BMGModel;
import net.zodiuxus.jotunheim.client.renderer.BMGRenderer;

public class ClientRendererRegistry {

    public static final EntityModelLayer MODEL_BMG_LAYER = new EntityModelLayer(Utils.getID("bmg"), "main");

    public static void register() {
        EntityRendererRegistry.register(ModEntities.BMG, BMGRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BMG_LAYER, BMGModel::getModelData);
    }
}
