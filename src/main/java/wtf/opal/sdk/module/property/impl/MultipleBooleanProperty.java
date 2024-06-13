package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

import java.util.Arrays;
import java.util.HashMap;

public final class MultipleBooleanProperty extends Property<HashMap<String, BooleanProperty>> {

    private boolean isExpanded;

    public MultipleBooleanProperty(final String name, final BooleanProperty... booleanProperties) {
        super(name);

        setValue(new HashMap<>());
        Arrays.stream(booleanProperties).forEach(booleanProperty -> getValue().put(booleanProperty.getName().toLowerCase(), booleanProperty));
    }

    public BooleanProperty getProperty(final String propertyName) {
        return getValue().computeIfAbsent(propertyName.toLowerCase(), k -> null);
    }

    public void setExpanded(final boolean expanded) {
        isExpanded = expanded;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

}
