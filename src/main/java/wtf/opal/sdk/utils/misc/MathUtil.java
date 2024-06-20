package wtf.opal.sdk.utils.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil {

    public static float sqrt(float value) {
        return (float)Math.sqrt(value);
    }

    public static double clamp(double value, final double min, final double max) {
        value = Math.max(min, value);
        value = Math.min(max, value);
        return value;
    }

    public static Double interpolate(final double oldValue, final double newValue, final double interpolationValue){
        return (oldValue + (newValue - oldValue) * interpolationValue);
    }

    public static int interpolateInt(final int oldValue, final int newValue, final double interpolationValue){
        return interpolate(oldValue, newValue, (float) interpolationValue).intValue();
    }

    public static float roundToFloat(final double d) {
        return (float)((double)Math.round(d * 1.0E8D) / 1.0E8D);
    }

    public static int getRandomNumber(final int min, final int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static double roundToPlace(final double value, final int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
