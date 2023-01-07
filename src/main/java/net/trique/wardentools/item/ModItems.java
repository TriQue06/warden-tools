package net.trique.wardentools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.trique.wardentools.WardenTools;
import net.trique.wardentools.item.custom.*;
import net.trique.wardentools.sound.ModSounds;

public class ModItems {

    public static final Item SCULKIFIED_NETHERITE_SWORD = registerItem("sculkified_netherite_sword",
            new SwordItem(ModToolMaterials.SCULKIFIED_NETHERITE, 3, -2.4f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item SCULKIFIED_NETHERITE_AXE = registerItem("sculkified_netherite_axe",
            new ModAxeItem(ModToolMaterials.SCULKIFIED_NETHERITE, 5f, -3f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item SCULKIFIED_NETHERITE_PICKAXE = registerItem("sculkified_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.SCULKIFIED_NETHERITE, 1, -2.8f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item SCULKIFIED_NETHERITE_HOE = registerItem("sculkified_netherite_hoe",
            new ModHoeItem(ModToolMaterials.SCULKIFIED_NETHERITE, -3, 0f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item SCULKIFIED_NETHERITE_SHOVEL = registerItem("sculkified_netherite_shovel",
            new ShovelItem(ModToolMaterials.SCULKIFIED_NETHERITE, 1.5f, -3.0f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));

    public static final Item SCULKIFIED_NETHERITE_HELMET = registerItem("sculkified_netherite_helmet",
            new ArmorItem(ModArmorMaterials.SCULKIFIED_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item SCULKIFIED_NETHERITE_CHESTPLATE = registerItem("sculkified_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.SCULKIFIED_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item SCULKIFIED_NETHERITE_LEGGINGS = registerItem("sculkified_netherite_leggings",
            new ArmorItem(ModArmorMaterials.SCULKIFIED_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item SCULKIFIED_NETHERITE_BOOTS = registerItem("sculkified_netherite_boots",
            new ArmorItem(ModArmorMaterials.SCULKIFIED_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));

    public static final Item WARDEN_SWORD = registerItem("warden_sword",
            new SwordItem(ModToolMaterials.WARDEN, 3, -2.4f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item WARDEN_AXE = registerItem("warden_axe",
            new ModAxeItem(ModToolMaterials.WARDEN, 5f, -3f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item WARDEN_PICKAXE = registerItem("warden_pickaxe",
            new ModPickaxeItem(ModToolMaterials.WARDEN, 1, -2.8f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item WARDEN_HOE = registerItem("warden_hoe",
            new ModHoeItem(ModToolMaterials.WARDEN, -3, 0f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));
    public static final Item WARDEN_SHOVEL = registerItem("warden_shovel",
            new ShovelItem(ModToolMaterials.WARDEN, 1.5f, -3.0f,(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS))));


    public static final Item WARDEN_HELMET = registerItem("warden_helmet",
            new WardenHelmetItem(ModArmorMaterials.WARDEN, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item WARDEN_CHESTPLATE = registerItem("warden_chestplate",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item WARDEN_LEGGINGS = registerItem("warden_leggings",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item WARDEN_BOOTS = registerItem("warden_boots",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));

    public static final Item SCULK_APPLE = registerItem("sculk_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS).food(ModFoodComponents.SCULK_APPLE)));

    public static final Item DISC_FRAGMENT_ASTRAY_ARCHIPELAGO = registerItem("disc_fragment_astray_archipelago",
            new DiscFragmentItem(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item MUSIC_DISC_ASTRAY_ARCHIPELAGO = registerItem("music_disc_astray_archipelago",
            new ModMusicDiscItem(7, ModSounds.ASTRAY_ARCHIPELAGO, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS).maxCount(1), 203));

    public static final Item DISC_FRAGMENT_FIZZ = registerItem("disc_fragment_fizz",
            new DiscFragmentItem(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));
    public static final Item MUSIC_DISC_FIZZ = registerItem("music_disc_fizz",
            new ModMusicDiscItem(7, ModSounds.FIZZ, new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS).maxCount(1), 253));

    public static final Item WARDEN_HEART = registerItem("heart_of_the_warden",
            new Item(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS).maxCount(16)));
    public static final Item WARDEN_SOUL = registerItem("soul_of_the_warden",
            new Item(new FabricItemSettings().group(ModItemGroup.WARDEN_TOOLS)));

    public static final Item ECHO_STAFF = registerItem("echo_staff",
            new EchoStaffClass(new Item.Settings().maxDamage(131).group(ModItemGroup.WARDEN_TOOLS)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WardenTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WardenTools.LOGGER.info("Registering Mod Items for " + WardenTools.MOD_ID);
    }
}
