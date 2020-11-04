package net.insberr.blood_orange;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.insberr.blood_orange.blocks.BoBlocks;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.insberr.blood_orange.items.BoItems;

public class BloodOrangeMod implements ModInitializer {

	public static final String MODID = "blood_orange";
	// public static final OrangeItem ORANGE_ITEM = new OrangeItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64).food((new FoodComponent.Builder()).hunger(1).saturationModifier(0.05F)));

	public static final ItemGroup BLOODORANGE_CREATIVE_TAB = FabricItemGroupBuilder.build(new Identifier(BloodOrangeMod.MODID, "main_tab"), () -> new ItemStack(BoItems.ORANGE));

	@Override
	public void onInitialize() {
		BoItems.registerItems();
		BoBlocks.registerBlocks();
		// Registry.register(Registry.ITEM, new Identifier("blood_orange", "orange"), ORANGE_ITEM);
	}
}