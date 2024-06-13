package wtf.opal.sdk.module;

public @interface ModuleData {
    String name();
    String description();
    ModuleCategory category() default ModuleCategory.OTHER;
}
