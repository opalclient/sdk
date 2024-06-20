package wtf.opal.sdk.module.property.impl;

import wtf.opal.sdk.module.property.Property;

public final class ModeProperty<T extends Enum<T>> extends Property<T> {

    private final T[] values;
    private boolean expanded;

    public ModeProperty(final String name, final T value) {
        super(name);
        setValue(value);
        this.values = getEnumConstants();
    }

    public void setExpanded(final boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isExpanded() {
        return expanded;
    }

    @SuppressWarnings("unchecked")
    private T[] getEnumConstants() {
        return (T[]) getValue().getClass().getEnumConstants();
    }

    public T[] getValues() {
        return values;
    }

    public void setValueCustom(final int value) {
        setValue(values[value]);
    }

}
