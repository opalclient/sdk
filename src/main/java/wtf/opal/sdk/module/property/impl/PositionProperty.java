package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

import java.util.HashMap;

import static wtf.opal.sdk.Opal.mc;

public final class PositionProperty extends Property<HashMap<String, Float>> {

    private float x, y, width, height;
    private float startX, startY;
    private boolean dragging;
    private float radius = 6;

    public PositionProperty(final float x, final float y) {
        super("Position");
        this.x = x;
        this.y = y;
        updateValue();
    }

    public PositionProperty(final float x, final float y, final float width, final float height) {
        this(x, y);
        this.width = width;
        this.height = height;
    }

    public float getX() {
        final float actualX = x  * mc.getWindow().getScaledWidth();
        return x > 0.5f ? actualX - width : actualX;
    }

    public float getY() {
        return y * mc.getWindow().getScaledHeight() ;
    }

    public void setX(final float x) {
        final int scaledWidth = mc.getWindow().getScaledWidth();
        this.x = x / scaledWidth;
        if (this.x > 0.5f) {
            this.x += width / scaledWidth;
        }
        updateValue();
    }

    public void setY(final float y) {
        this.y = y / mc.getWindow().getScaledHeight();
        updateValue();
    }

    public float getRelativeX() {
        return x;
    }

    public float getRelativeY() {
        return y;
    }

    public void setRelativeX(final float x) {
        this.x = x;
        updateValue();
    }

    public void setRelativeY(final float y) {
        this.y = y;
        updateValue();
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(final float radius) {
        this.radius = radius;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(final float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(final float height) {
        this.height = height;
    }

    public void setDimensions(final float width, final float height) {
        this.width = width;
        this.height = height;
    }

    public boolean isDragging() {
        return dragging;
    }

    public void setDragging(final boolean dragging) {
        this.dragging = dragging;
    }

    public float getStartX() {
        return startX > mc.getWindow().getScaledWidth() / 2f ? startX - width : startX;
    }

    public void setStartX(final float startX) {
        this.startX = startX;
    }

    public float getStartY() {
        return startY;
    }

    public void setStartY(final float startY) {
        this.startY = startY;
    }

    private void updateValue() {
        final HashMap<String, Float> map = new HashMap<>();
        map.put("x", x);
        map.put("y", y);
        setValue(map);
    }

}
