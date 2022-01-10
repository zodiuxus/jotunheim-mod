package net.zodiuxus.jotunheim.client.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.zodiuxus.jotunheim.entity.BlacksmithGiantEntity;

@Environment(EnvType.CLIENT)
public class BMGModel extends EntityModel<BlacksmithGiantEntity> {

    private final ModelPart lleg_upper; //done
    private final ModelPart lleg_lower; //done

    private final ModelPart rleg_upper; //done
    private final ModelPart rleg_lower; //done

    private final ModelPart larm_upper; //done
    private final ModelPart larm_lower; //done

    private final ModelPart rarm_upper; //done
    private final ModelPart rarm_lower; //done

    private final ModelPart torso_upper; //done
    private final ModelPart torso_lower; //done

    private final ModelPart head; //done
    private final ModelPart nose; //done


    public BMGModel(ModelPart root) {

        this.torso_upper = root.getChild("torso_upper");
        this.torso_lower = this.torso_upper.getChild("torso_lower");
        this.head = this.torso_upper.getChild("head");
        this.nose = this.head.getChild("nose");
        this.rarm_upper = this.torso_upper.getChild("rarm_upper");
        this.rarm_lower = this.rarm_upper.getChild("rarm_lower");
        this.larm_upper = this.torso_upper.getChild("larm_upper");
        this.larm_lower = this.larm_upper.getChild("larm_lower");
        this.rleg_upper = this.torso_lower.getChild("rleg_upper");
        this.rleg_lower = this.rleg_upper.getChild("rleg_lower");
        this.lleg_upper = this.torso_lower.getChild("lleg_upper");
        this.lleg_lower = this.lleg_upper.getChild("lleg_lower");

    }

    public static TexturedModelData getModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelRoot = modelData.getRoot();

        ModelPartData torso_upper = modelRoot.addChild("torso_upper", ModelPartBuilder.create().uv(0, 0).cuboid(-12.0F, -22.0F, 3.0F, 8.0F, 6.0F, 4.0F), ModelTransform.NONE);
        ModelPartData torsoLower = torso_upper.addChild("torso_lower", ModelPartBuilder.create().uv(0, 0).cuboid(-11.0F, -16.0F, 3.0F, 6.0F, 4.0F, 3.0F), ModelTransform.NONE);

        ModelPartData head = torso_upper.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-9.5F, -26.0F, 5.0F, 3.0F, 4.0F, 3.0F), ModelTransform.NONE);
        ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(0, 0).cuboid(-8.5F, -23.0F, 8.0F, 1.0F, 2.0F, 1.0F), ModelTransform.NONE);

        ModelPartData rarm_upper = torso_upper.addChild("rarm_upper", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -22.0F, 3.5F, 2.0F, 4.0F, 3.0F), ModelTransform.NONE);
        ModelPartData rarm_lower = rarm_upper.addChild("rarm_lower", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -18.0F, 3.5F, 2.0F, 7.0F, 3.0F), ModelTransform.NONE);

        ModelPartData larm_upper = torso_upper.addChild("larm_upper", ModelPartBuilder.create().uv(0, 0).cuboid(-14.0F, -22.0F, 3.5F, 2.0F, 4.0F, 3.0F), ModelTransform.NONE);
        ModelPartData larm_lower = larm_upper.addChild("larm_lower", ModelPartBuilder.create().uv(0, 0).cuboid(-14.0F, -18.0F, 3.5F, 2.0F, 7.0F, 3.0F), ModelTransform.NONE);

        ModelPartData lleg_upper = torsoLower.addChild("lleg_upper", ModelPartBuilder.create().uv(0, 0).cuboid(-12.0F, -12.0F, 3.0F, 3F, 6F, 3F), ModelTransform.NONE);
        ModelPartData lleg_lower = lleg_upper.addChild("lleg_lower", ModelPartBuilder.create().uv(0, 0).cuboid(-11.5F, -6.0F, 4.0F, 2F, 6F, 2F), ModelTransform.NONE);

        ModelPartData rleg_upper = torsoLower.addChild("rleg_upper", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, -12.0F, 3.0F, 3F, 6F, 3F), ModelTransform.NONE);
        ModelPartData rleg_lower = rleg_upper.addChild("rleg_lower", ModelPartBuilder.create().uv(0, 0).cuboid(-6.5F, -6.0F, 4.0F, 2F, 6F, 2F), ModelTransform.NONE);

        return TexturedModelData.of(modelData, 64, 64);
    }


    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        ImmutableList.of(this.torso_upper).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        });
    }

    @Override
    public void setAngles(BlacksmithGiantEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}