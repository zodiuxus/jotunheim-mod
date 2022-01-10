package net.zodiuxus.jotunheim.tags;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.zodiuxus.jotunheim.Utils;

public class Tags {
    public static final Tag<Block> DARK_IRON_ORE_TAG = TagFactory.BLOCK.create(Utils.getID("dark_iron_ores"));
    public static final Tag<Block> DARK_IRON_BLOCK_TAG = TagFactory.BLOCK.create(Utils.getID("dark_iron_blocks"));
}
