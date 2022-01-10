package net.zodiuxus.jotunheim.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class BlacksmithGiantEntity extends PathAwareEntity {
    public BlacksmithGiantEntity(EntityType<? extends BlacksmithGiantEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createBlacksmithGiantAttributes () {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 120.0d)
                .add(EntityAttributes.GENERIC_ARMOR, 12.0d)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 25.0d);
    }
}
