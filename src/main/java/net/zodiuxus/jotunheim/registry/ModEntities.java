package net.zodiuxus.jotunheim.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;
import net.zodiuxus.jotunheim.Utils;
import net.zodiuxus.jotunheim.entity.BlacksmithGiantEntity;

public class ModEntities {
    public static final EntityType<BlacksmithGiantEntity> BMG = Registry.register(
            Registry.ENTITY_TYPE,
            Utils.getID("bmg"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BlacksmithGiantEntity::new).dimensions(EntityDimensions.fixed(5f, 10f)).build()
    );

    public static void registerEntities () {
        FabricDefaultAttributeRegistry.register(BMG, BlacksmithGiantEntity.createBlacksmithGiantAttributes());
    }
}
