package net.zodiuxus.jotunheim.client.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.zodiuxus.jotunheim.Utils;
import net.zodiuxus.jotunheim.entity.BlacksmithGiantEntity;
import net.zodiuxus.jotunheim.client.model.BMGModel;
import net.zodiuxus.jotunheim.registry.ClientRendererRegistry;

@Environment(EnvType.CLIENT)
public class BMGRenderer extends MobEntityRenderer<BlacksmithGiantEntity, BMGModel> {

    private static final Identifier TEXTURE = Utils.getID("textures/entity/bmg/bmg.png");

    public BMGRenderer(EntityRendererFactory.Context context) {
        super(context, new BMGModel(context.getPart(ClientRendererRegistry.MODEL_BMG_LAYER)),0.7f);
    }

    @Override
    public Identifier getTexture(BlacksmithGiantEntity entity) {
        return TEXTURE;
    }

}
