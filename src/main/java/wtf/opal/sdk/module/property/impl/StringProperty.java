package wtf.opal.sdk.module.property.impl;

import wtf.opal.feature.module.Mode;
import wtf.opal.feature.module.property.Property;

public final class StringProperty extends Property<String> {

    public StringProperty(final String name, final String value) {
        super(name);
        setValue(value);
    }

    public StringProperty(final String name, final Mode<?> parent, final String value) {
        super(name, parent);
        setValue(value);
    }



}
