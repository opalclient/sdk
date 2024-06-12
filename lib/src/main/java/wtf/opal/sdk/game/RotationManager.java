package wtf.opal.sdk.game;

import wtf.opal.sdk.util.math.Vec2;

public interface RotationManager {
    void setRotation(final Vec2 rotation, final float yawSpeed, final float pitchSpeed);
}
