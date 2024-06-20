package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

public final class StringProperty extends Property<String> {

    public StringProperty(final String name, final String value) {
        super(name);
        setValue(value);
    }
}
