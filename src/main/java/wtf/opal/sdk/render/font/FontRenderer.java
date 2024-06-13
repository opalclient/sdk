package wtf.opal.sdk.render.font;

import net.minecraft.client.gui.DrawContext;

/**
 * Represents a font renderer.
 */
public interface FontRenderer {

    void drawString(final DrawContext context, String text, final float x,
                    final float y, final float size, final int color);

    void drawString(final DrawContext context, final String text, final float x,
                    final float y, final float size, final int color, final boolean shadow);

    void drawString(final FontWeight weight, final DrawContext context, final String text,
                    final float x, final float y, final float size, final int color, final boolean shadow);

    float getStringWidth(final String text, final float size);

    float getStringWidth(final FontWeight weight, final String text, final float size);

    float getStringHeight(final String text, final float size);

    float getStringHeight(final FontWeight weight, final String text, final float size);
}
