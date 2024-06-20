package wtf.opal.sdk.utils.misc;

import net.minecraft.text.Text;

import static wtf.opal.sdk.OpalSDK.mc;

public class ChatUtil {

    public static void print(final Object o) {
        mc.inGameHud.getChatHud().addMessage(Text.literal("§7[§b§lOpal§7] " + o));
    }

    public static void error(final Object o) {
        mc.inGameHud.getChatHud().addMessage(Text.literal("§7[§c§lError§7] " + o));
    }
}
