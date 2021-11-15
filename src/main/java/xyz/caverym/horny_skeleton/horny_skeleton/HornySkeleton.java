package xyz.caverym.horny_skeleton.horny_skeleton;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.world.World;

public class HornySkeleton extends SkeletonEntity {
    public HornySkeleton(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }
}
