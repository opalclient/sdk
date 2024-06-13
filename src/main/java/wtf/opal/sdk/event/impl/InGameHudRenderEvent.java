package wtf.opal.sdk.event.impl;

import net.minecraft.client.gui.DrawContext;

public record InGameHudRenderEvent(DrawContext drawContext, float tickDelta) {

}
