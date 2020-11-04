package net.insberr.blood_orange.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BloodOrangePortal extends Block {
    public BloodOrangePortal() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

    // add teleport to new dimension
}
