package net.insberr.blood_orange.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.insberr.blood_orange.blocks.BoBlocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.insberr.blood_orange.BloodOrangeMod;
import net.minecraft.util.registry.Registry;
import net.insberr.blood_orange.items.Orange;

public class BoItems {
    // Blocks
    public static final Item BLOOD_ORANGE_PORTAL = new BlockItem(BoBlocks.BLOOD_ORANGE_PORTAL, new Item.Settings().group(BloodOrangeMod.BLOODORANGE_CREATIVE_TAB));

    // Items
    public static final Item ORANGE = new Item(new Item.Settings().group(BloodOrangeMod.BLOODORANGE_CREATIVE_TAB).food((new FoodComponent.Builder()).hunger(2).saturationModifier(0.15F).build()));
    public static final Item ORANGE_SWORD = new Item(new Item.Settings().group((BloodOrangeMod.BLOODORANGE_CREATIVE_TAB)));

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(BloodOrangeMod.MODID, "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier(BloodOrangeMod.MODID, "orange_sword"), ORANGE_SWORD);

        // Blocks
        Registry.register(Registry.ITEM, new Identifier(BloodOrangeMod.MODID, "blood_orange_portal"), BLOOD_ORANGE_PORTAL);
    }

}
