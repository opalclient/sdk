package wtf.opal.sdk.module.property;

import java.util.function.Predicate;

public final class ParentAttribute<T extends Property<?>> {

    private final T parent;
    private final Predicate<T> condition;

    public ParentAttribute(final T parent, final Predicate<T> condition) {
        this.parent = parent;
        this.condition = condition;
    }

    public boolean isValid() {
        return condition.test(parent) && parent.getParentAttributeList().stream().allMatch(ParentAttribute::isValid);
    }

    public T getParent() {
        return parent;
    }
}
