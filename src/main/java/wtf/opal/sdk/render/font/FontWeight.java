package wtf.opal.sdk.render.font;

public enum FontWeight {
    REGULAR("Regular"),
    MEDIUM("Medium"),
    SEMI_BOLD("SemiBold"),
    BOLD("Bold");

    private final String name;

    FontWeight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
