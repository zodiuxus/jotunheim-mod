package net.zodiuxus.jotunheim.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.zodiuxus.jotunheim.Jotunheim;
import net.zodiuxus.jotunheim.Utils;

public class ModBlocks {
    public static final Block DARK_IRON_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(4f, 50f)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));

    public static final Block DARK_IRON_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(4f, 50f)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, Utils.getID("dark_iron_ore"), DARK_IRON_ORE);
        Registry.register(Registry.BLOCK, Utils.getID("dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.ITEM, Utils.getID("dark_iron_ore"), new BlockItem(DARK_IRON_ORE, new FabricItemSettings().group(Jotunheim.GROUP)));
        Registry.register(Registry.ITEM, Utils.getID("dark_iron_block"), new BlockItem(DARK_IRON_BLOCK, new FabricItemSettings().group(Jotunheim.GROUP)));

    }
}
