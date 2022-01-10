package net.zodiuxus.jotunheim;

import net.minecraft.util.Identifier;

public class Utils {

    public static Identifier getID(String path) {
        return new Identifier(Jotunheim.MOD_ID, path);
    }
}
