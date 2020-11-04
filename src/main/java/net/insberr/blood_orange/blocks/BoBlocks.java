package net.insberr.blood_orange.blocks;

import net.insberr.blood_orange.BloodOrangeMod;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BoBlocks {
    public static final Block BLOOD_ORANGE_PORTAL = new BloodOrangePortal();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(BloodOrangeMod.MODID, "blood_orange_portal"), BLOOD_ORANGE_PORTAL);
    }
}
