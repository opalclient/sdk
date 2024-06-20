package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;
import wtf.opal.sdk.utils.misc.MathUtil;

public final class NumberProperty extends Property<Double> {

    private final double minValue, maxValue, increment;

    private boolean waitTilRelease;

    public NumberProperty(final String name, final double defaultValue, final double minValue, final double maxValue, final double increment) {
        super(name);
        setValue(defaultValue);
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.increment = increment;
    }

    public NumberProperty(final String name, final double defaultValue, final double minValue, final double maxValue, final double increment, final boolean waitTilRelease) {
        super(name);
        setValue(defaultValue);
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.increment = increment;
        this.waitTilRelease = waitTilRelease;
    }

    public boolean shouldWaitTilRelease() {
        return waitTilRelease;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public double getIncrement() {
        return increment;
    }

    public void setValueCustom(double value) {
        value = MathUtil.clamp(value, minValue, maxValue);
        value = Math.round(value * (1 / increment)) / (1 / increment);
        setValue(value);
    }

}
