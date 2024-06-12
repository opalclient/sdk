package wtf.opal.sdk.render;

public interface RenderUtil {
    /**
     * Renders the content immediately.
     * This method is needed for the newer NanoVG render system that is in Opal
     *
     * @param content the content to render
     */
    void immediateRender(final Runnable content);

    void rect(final float x, final float y, final float width,
              final float height, final int color);

    void rectGradient(final float x, final float y, final float width,
                      final float height, final int color1, final int color2,
                      final float angleDegrees);

    void roundedRect(final float x, final float y, final float width,
                     final float height, final float radius, final int color);

    void roundedRectVarying(final float x, final float y, final float width,
                            final float height, final float radiusTopLeft,
                            final float radiusTopRight, final float radiusBottomRight,
                            final float radiusBottomLeft, final int color);

    void roundedRectGradient(final float x, final float y, final float width,
                             final float height, final float radius, final int color1,
                             final int color2, final float angleDegrees);

    void roundedRectGradientVarying(final float x, final float y, final float width,
                                    final float height, final float radiusTopLeft,
                                    final float radiusTopRight, final float radiusBottomRight,
                                    final float radiusBottomLeft, final int color1, final int color2,
                                    final float angleDegrees);

    void rectOutline(final float x, final float y, final float width,
                     final float height, final float thickness, final int color);

    void roundedRectOutline(final float x, final float y, final float width,
                            final float height, final float radius, final float thickness, final int color);

    /**
     * Rotates the content by the specified degrees around the specified point.
     * @param content the content to rotate
     */
    void rotate(final double degrees, final float x, final float y, final float width,
                final float height, final Runnable content);


    /**
     * Scales the content by the specified factor around the specified point.
     * @param content the content to scale
     */
    void scale(final float factor, final float x, final float y,
               final float width, final float height, final Runnable content);

    /**
     * Cuts the content to the specified rectangle.
     * @param content the content to cut
     */
    void scissor(final float x, final float y, final float width,
                 final float height, final Runnable content);




}
