package wtf.opal.sdk.utils.render;

public class RenderUtil {
    /**
     * Renders the content immediately.
     * This method is needed for the newer NanoVG render system that is in Opal
     *
     * @param content the content to render
     */
    public static void immediateRender(final Runnable content){}

    public static void rect(final float x, final float y, final float width,
              final float height, final int color){}

    public static void rectGradient(final float x, final float y, final float width,
                      final float height, final int color1, final int color2,
                      final float angleDegrees){}

    public static void roundedRect(final float x, final float y, final float width,
                     final float height, final float radius, final int color){}

    public static void roundedRectVarying(final float x, final float y, final float width,
                            final float height, final float radiusTopLeft,
                            final float radiusTopRight, final float radiusBottomRight,
                            final float radiusBottomLeft, final int color){}

    public static void roundedRectGradient(final float x, final float y, final float width,
                             final float height, final float radius, final int color1,
                             final int color2, final float angleDegrees){}

    public static void roundedRectGradientVarying(final float x, final float y, final float width,
                                    final float height, final float radiusTopLeft,
                                    final float radiusTopRight, final float radiusBottomRight,
                                    final float radiusBottomLeft, final int color1, final int color2,
                                    final float angleDegrees){}

    public static void rectOutline(final float x, final float y, final float width,
                     final float height, final float thickness, final int color){}

    public static void roundedRectOutline(final float x, final float y, final float width,
                            final float height, final float radius, final float thickness, final int color){}

    /**
     * Rotates the content by the specified degrees around the specified point.
     * @param content the content to rotate
     */
    public static void rotate(final double degrees, final float x, final float y, final float width,
                final float height, final Runnable content){}


    /**
     * Scales the content by the specified factor around the specified point.
     * @param content the content to scale
     */
    public static void scale(final float factor, final float x, final float y,
               final float width, final float height, final Runnable content){}

    /**
     * Cuts the content to the specified rectangle.
     * @param content the content to cut
     */
    public static void scissor(final float x, final float y, final float width,
                 final float height, final Runnable content){}




}
