package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

public final class BooleanProperty extends Property<Boolean> {

    public BooleanProperty(final String name, final boolean value) {
        super(name);
        setValue(value);
    }

    public void toggle() {
        setValue(!getValue());
    }

}
