package wtf.opal.sdk.module;

public enum ModuleCategory {

    COMBAT("Combat"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    WORLD("World"),
    VISUAL("Visual"),
    EXPLOIT("Exploit"),
    OTHER("Other");

    private final String name;

    ModuleCategory(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

}
