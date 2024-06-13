package wtf.opal.sdk.module.property;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Property<T> {

    private final String name;

    private final List<ParentAttribute<? extends Property<?>>> parentAttributeList = new ArrayList<>();

    private T value;

    protected Property(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final boolean hasParent() {
        return !parentAttributeList.isEmpty();
    }

    public final List<ParentAttribute<? extends Property<?>>> getParentAttributeList() {
        return parentAttributeList;
    }

    public final void addParent(final ParentAttribute<? extends Property<?>> parent) {
        parentAttributeList.add(parent);
    }

    public final <P extends Property<?>> void addParent(final P parent, final Predicate<P> condition) {
        parentAttributeList.add(new ParentAttribute<>(parent, condition));
    }

    public final T getValue() {
        return value;
    }

    public final void setValue(final T value) {
        this.value = value;
    }
}
