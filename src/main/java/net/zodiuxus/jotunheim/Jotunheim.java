package net.zodiuxus.jotunheim;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.zodiuxus.jotunheim.registry.ModBlocks;
import net.zodiuxus.jotunheim.registry.ModEntities;
import net.zodiuxus.jotunheim.registry.ModItems;

public class Jotunheim implements ModInitializer {

	// Makes new group tab and sets the icon to the Dark Iron Bar
	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(Utils.getID("items"),
			() -> new ItemStack(ModItems.DARK_IRON));

	public static final String MOD_ID = "jotunheim";

	@Override
	public void onInitialize() {

		ModEntities.registerEntities();
		ModItems.registerItems();
		ModBlocks.registerBlocks();

	}
}
