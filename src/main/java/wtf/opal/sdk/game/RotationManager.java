package wtf.opal.sdk.game;

import net.minecraft.util.math.Vec2f;

public interface RotationManager {
    void setRotation(final Vec2f rotation, final float yawSpeed, final float pitchSpeed);
}
