package wtf.opal.sdk.utils.player;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.*;

/**
 * These do not represent the actual function implementations, but the structure is correct
 */
public class RotationUtil {

    public static Vec3d getRotationVector(final float pitch, final float yaw) {
        return Vec3d.ZERO;
    }

    public static Vec2f applyGCDPatch(final Vec2f rotation, final Vec2f lastRotation) {
        return Vec2f.ZERO;
    }

    public static Vec2f rotateTowardsWithLimit(final Vec2f rotation, final Vec2f lastRotation, final float limitYaw, final float limitPitch) {
        return Vec2f.ZERO;
    }

    private static float rotateTowardsWithLimitYaw(final float yaw, final float lastYaw, final float limit) {
        return 0;
    }

    private static float rotateTowardsWithLimitPitch(final float pitch, final float lastPitch, final float limit) {
        return 0;
    }

    public static double[] yawPos(final double value) {
        return new double[]{};
    }

    public static double[] yawPos(final float yaw, final double value) {
        return new double[]{};
    }

    public static Vec2f getRotationFromTarget(final Entity entity) {
        return Vec2f.ZERO;
    }

    public static Vec2f getRotationFromPos(final Vec3d pos) {
        return Vec2f.ZERO;
    }

    public static Vec2f getRotationFromBlock(final BlockPos blockPos, final Direction direction) {
       return Vec2f.ZERO;
    }
}
