package net.trique.wardentools.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.trique.wardentools.WardenTools;

public class ModItemGroup {
    public static final ItemGroup WARDEN_TOOLS = FabricItemGroupBuilder.build(new Identifier(WardenTools.MOD_ID, "warden_tools"),
            () -> new ItemStack(ModItems.ECHO_STAFF));
}