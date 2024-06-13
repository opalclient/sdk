package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

public final class ColorProperty extends Property<Integer> {

    public ColorProperty(final String name, final int value) {
        super(name);
        setValue(value);
    }
}
