package wtf.opal.sdk.utils.player;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.LivingEntity;
import org.lwjgl.glfw.GLFW;

import static wtf.opal.sdk.OpalSDK.mc;

public class GameUtil {

    public static boolean areOnSameTeam(final LivingEntity entity, final LivingEntity entity1) {
        if (entity.getDisplayName() == null || entity1.getDisplayName() == null) {
            return false;
        }

        final int entityColor = entity.getTeamColorValue();
        final int entity1Color = entity1.getTeamColorValue();

        return entityColor == entity1Color;
    }

    public static int teamToDyeColor(final int teamColor) {
        for (final BedwarsColor color : BedwarsColor.values()) {
            if (color.teamColor == teamColor) {
                return color.dyeColor;
            }
        }
        return 0;
    }

    public static boolean isKeyPressed(final int keyCode) {
        return InputUtil.isKeyPressed(mc.getWindow().getHandle(), keyCode);
    }

    public static boolean isKeyPressed(final KeyBinding keyBinding) {
        return isKeyPressed(keyBinding.getDefaultKey().getCode());
    }

    public static boolean isMouseButtonPressed(final int button) {
        return GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), button) == GLFW.GLFW_PRESS;
    }

    public enum BedwarsColor {
        RED(16711680, 16733525),
        GREEN(12582656, 5635925),
        BLUE(255, 5592575),
        YELLOW(16776960, 16777045),
        AQUA(65535, 5636095),
        WHITE(16777215, 16777215),
        PINK(16738740, 16733695),
        GRAY(8421504, 5592405);

        private final int dyeColor, teamColor;

        BedwarsColor(final int dyeColor, final int teamColor) {
            this.dyeColor = dyeColor;
            this.teamColor = teamColor;
        }

        public int getTeamColor() {
            return teamColor;
        }

        public int getDyeColor() {
            return dyeColor;
        }
    }
}
