package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.item.ExperienceBottleEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ThrownExpBottle;

public class CraftThrownExpBottle extends CraftThrowableProjectile implements ThrownExpBottle {

    public CraftThrownExpBottle(CraftServer server, ExperienceBottleEntity entity) {
        super(server, entity);
    }

    @Override
    public ExperienceBottleEntity getHandle() {
        return (ExperienceBottleEntity) entity;
    }

    @Override
    public String toString() {
        return "ExperienceBottleEntity";
    }

    @Override
    public EntityType getType() {
        return EntityType.THROWN_EXP_BOTTLE;
    }
}
