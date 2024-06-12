package wtf.opal.sdk.util.math;

public class Vec2 {
    public static final Vec2 ZERO = new Vec2(0.0F, 0.0F);
    public static final Vec2 SOUTH_EAST_UNIT = new Vec2(1.0F, 1.0F);
    public static final Vec2 EAST_UNIT = new Vec2(1.0F, 0.0F);
    public static final Vec2 WEST_UNIT = new Vec2(-1.0F, 0.0F);
    public static final Vec2 SOUTH_UNIT = new Vec2(0.0F, 1.0F);
    public static final Vec2 NORTH_UNIT = new Vec2(0.0F, -1.0F);
    public static final Vec2 MAX_SOUTH_EAST = new Vec2(Float.MAX_VALUE, Float.MAX_VALUE);
    public static final Vec2 MIN_SOUTH_EAST = new Vec2(Float.MIN_VALUE, Float.MIN_VALUE);
    public final float x;
    public final float y;

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2 multiply(float value) {
        return new Vec2(this.x * value, this.y * value);
    }

    public float dot(Vec2 vec) {
        return this.x * vec.x + this.y * vec.y;
    }

    public Vec2 add(Vec2 vec) {
        return new Vec2(this.x + vec.x, this.y + vec.y);
    }

    public Vec2 add(float value) {
        return new Vec2(this.x + value, this.y + value);
    }

    public boolean equals(Vec2 other) {
        return this.x == other.x && this.y == other.y;
    }

    public Vec2 normalize() {
        float f = MathUtility.sqrt(this.x * this.x + this.y * this.y);
        return f < 1.0E-4F ? ZERO : new Vec2(this.x / f, this.y / f);
    }

    public float length() {
        return MathUtility.sqrt(this.x * this.x + this.y * this.y);
    }

    public float lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }

    public float distanceSquared(Vec2 vec) {
        float f = vec.x - this.x;
        float g = vec.y - this.y;
        return f * f + g * g;
    }

    public Vec2 negate() {
        return new Vec2(-this.x, -this.y);
    }
}
