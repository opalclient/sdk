package wtf.opal.sdk.utils.render;

import wtf.opal.sdk.utils.misc.MathUtil;

import java.awt.*;

public final class ColorUtil {

    public static int[] hexToRGB(final int hex) {
        final int red = (hex >> 16) & 0xFF;
        final int green = (hex >> 8) & 0xFF;
        final int blue = hex & 0xFF;
        final int alpha = (hex >> 24) & 0xFF;

        return new int[]{red, green, blue, alpha};
    }

    public static Color applyOpacity(final Color color, float opacity) {
        opacity = Math.min(1, Math.max(0, opacity));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (color.getAlpha() * opacity));
    }

    public static int applyOpacity(final int color, float opacity) {
        opacity = Math.min(1, Math.max(0, opacity));
        final Color c = new Color(color);
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), (int) (c.getAlpha() * opacity)).getRGB();
    }

    public static float[] getColor(final Color c) {
        return new float[]{c.getRed() / 255f, c.getGreen() / 255f, c.getBlue() / 255f, c.getAlpha() / 255f};
    }

    public static int interpolateColors(final int color1, final int color2, float amount) {
        amount = Math.min(1, Math.max(0, amount));

        final Color c1 = new Color(color1, true);
        final Color c2 = new Color(color2, true);

        final int r = MathUtil.interpolateInt(c1.getRed(), c2.getRed(), amount);
        final int g = MathUtil.interpolateInt(c1.getGreen(), c2.getGreen(), amount);
        final int b = MathUtil.interpolateInt(c1.getBlue(), c2.getBlue(), amount);
        final int a = MathUtil.interpolateInt(c1.getAlpha(), c2.getAlpha(), amount);

        return new Color(r, g, b, a).getRGB();
    }

    public static int blendColors(final int[] colors, float progress) {
        final int size = colors.length;

        if (progress == 1) {
            return colors[0];
        }

        if (progress == 0) {
            return colors[size - 1];
        }

        progress = Math.max(0, (1 - progress) * (size - 1));

        final int idx = (int) progress;
        return interpolateColors(colors[idx], colors[idx + 1], progress - idx);
    }

    public static int interpolateColorsBackAndForth(final int speed, final int index, final int startColor, final int endColor) {
        int angle = (int) (((System.currentTimeMillis()) / speed - index) % 360);
        angle = (angle >= 180 ? 360 - angle : angle) * 2;
        return interpolateColors(startColor, endColor, angle / 360f);
    }

    public static int darker(final int color, final float factor) {
        final float f = 1 - factor;
        final int r = (int) ((color >> 16 & 0xFF) * f);
        final int g = (int) ((color >> 8 & 0xFF) * f);
        final int b = (int) ((color & 0xFF) * f);
        final int a = color >> 24 & 0xFF;
        return ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | (b & 0xFF) | ((a & 0xFF) << 24);
    }

    public static int darker(final int color) {
        return darker(color, 0.3F);
    }

    public static int brighter(final int color, final float factor) {
        int r = color >> 16 & 0xFF;
        int g = color >> 8 & 0xFF;
        int b = color & 0xFF;

        final int a = color >> 24 & 0xFF;

        /* From 2D group:
         * 1. black.brighter() should return grey
         * 2. applying brighter to blue will always return blue, brighter
         * 3. non-pure color (non-zero rgb) will eventually return white
         */
        final int i = (int) (1.0 / (1 - factor));

        if (r == 0 && g == 0 && b == 0) {
            return new Color(i, i, i, a).getRGB();
        }

        if (r > 0 && r < i) r = i;
        if (g > 0 && g < i) g = i;
        if (b > 0 && b < i) b = i;

        return new Color(Math.min((int) (r / factor), 255), Math.min((int) (g / factor), 255), Math.min((int) (b / factor), 255), a).getRGB();
    }

    public static int brighter(final int color) {
        return brighter(color, 0.7F);
    }

}
