package wtf.opal.sdk;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wtf.opal.sdk.game.FriendManager;
import wtf.opal.sdk.game.RotationManager;
import wtf.opal.sdk.game.TimerManager;
import wtf.opal.sdk.module.property.impl.ColorProperty;
import wtf.opal.sdk.utils.render.font.FontRenderer;

// This does not represent the actual class names or methods, but the structure is correct
public class OpalSDK {

    @NotNull
    public static String getVersion() { return null; }

    @NotNull
    public static FontRenderer getFontRenderer() { return null; }

    @NotNull
    public static RotationManager getRotationManager() { return null; }

    @NotNull
    public static FriendManager getFriendManager() { return null; }

    @NotNull
    public static TimerManager getTimerManager() { return null; }

    // Assume this is initialized somewhere
    @NotNull
    public static MinecraftClient mc = null;

    @Nullable
    public static LivingEntity getKillAuraTarget() { return null; }

    @NotNull
    public static int getPrimaryColor() { return 0; }

    @NotNull
    public static int getSecondaryColor() { return 0; }
}
