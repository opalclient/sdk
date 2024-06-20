package wtf.opal.sdk.utils.player;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.*;

/**
 * These do not represent the actual function implementations, but the structure is correct
 */
public class InventoryUtil {

    public static boolean isHoldingSword() {
        return false;
    }

    public static boolean isHoldingWeapon() { return false; }

    public static boolean isMainInventoryFull() {
        return false;
    }

    public static int getBlockSlot() {
        return 0;
    }

    public static int getBlockCount() {
        return 0;
    }

    public static boolean isGoodBlock(final Block block) {
        return false;
    }

    public static boolean isGoodPotion(final ItemStack itemStack) {
        return false;
    }

    public static int getToolSlot(final BlockState blockState) {
        return 0;
    }

    public static int getFirstEmptySlot() {
        return 0;
    }

    public static boolean shouldKeepItem(final ItemStack itemStack) {
        return false;
    }

    public static void drop(final int slot) {
    }

    public static void click(final int slot, final int mouseButton) {
    }

    public static void swap(final int originalSlot, final int newSlot) {
    }
}
