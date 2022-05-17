package me.nodedigital.minecraftdrive;

import net.minecraft.util.math.Vec3d;

public interface IPlayerEntityMixin {

    Vec3d getDestination();
    void setDestination(Vec3d pos);

    Vec3d getLookAt();
    void setLookAt(Vec3d pos);

}
