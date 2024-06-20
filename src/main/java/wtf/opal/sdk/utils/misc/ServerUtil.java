package wtf.opal.sdk.utils.misc;

import net.minecraft.client.network.ServerInfo;

import static wtf.opal.sdk.OpalSDK.mc;

public class ServerUtil {

    public static boolean isOnServer(String address) {
        if (mc.isInSingleplayer()) return false;

        final ServerInfo serverInfo = mc.getCurrentServerEntry();
        if (serverInfo == null) return false;

        address = address.toLowerCase();
        return serverInfo.address.equals(address) || serverInfo.address.endsWith("." + address);
    }

    public static boolean isOnHypixel() {
        if (mc.player == null || mc.isInSingleplayer()) return false;

        final ServerInfo serverInfo = mc.getCurrentServerEntry();
        if (serverInfo == null) return false;

        final String brand = mc.player.networkHandler.getBrand();
        return brand != null && brand.startsWith("Hypixel BungeeCord");
    }

    /**
     * Implementation of this method is within Opal
     * NOTE: This is a placeholder (not the actual implementation)
     * @return
     */
    public static boolean isInLobby() {
       return false;
    }
}
