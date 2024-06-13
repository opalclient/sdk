package wtf.opal.sdk.module;

import wtf.opal.sdk.event.Events;
import wtf.opal.sdk.module.property.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Module extends Events {
    private boolean hidden;
    private boolean expanded;

    private final List<Property<?>> propertyList = new ArrayList<>();


    public void init() {}

    public boolean isHidden() {
        return false;
    }

    public final void addProperties(final Property<?>... properties) {
        propertyList.addAll(Arrays.asList(properties));
    }
}