package net.zodiuxus.jotunheim.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.zodiuxus.jotunheim.Jotunheim;
import net.zodiuxus.jotunheim.Utils;

public class ModItems {

    public static final Item DARK_IRON = new Item(new FabricItemSettings().group(Jotunheim.GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, Utils.getID("dark_iron"), DARK_IRON);
    }

}
