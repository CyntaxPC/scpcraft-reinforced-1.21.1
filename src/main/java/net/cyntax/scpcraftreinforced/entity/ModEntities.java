package net.cyntax.scpcraftreinforced.entity;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.entity.custom.ChairEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<ChairEntity> CHAIR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(SCPcraftReinforced.MOD_ID, "chair_entity"),
            EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f).build());


    public static void registerModEntities() {
        SCPcraftReinforced.LOGGER.info("Registering modded entities from " + SCPcraftReinforced.MOD_ID);
    }
}
