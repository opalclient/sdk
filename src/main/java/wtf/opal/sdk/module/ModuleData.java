package wtf.opal.sdk.module;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleData {
    String name();
    String description();
    ModuleCategory category() default ModuleCategory.OTHER;
}
