package net.trique.wardentools.block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.trique.wardentools.WardenTools;
import net.trique.wardentools.item.ModItemGroup;

public class ModBlocks {

    public static final Block BUDDING_SCULK = registerBlock("budding_sculk",
            new BuddingSculk(AbstractBlock.Settings.of(Material.AMETHYST).ticksRandomly().strength(1f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.WARDEN_TOOLS);

    public static final Block ECHO_LANTERN = registerBlock("echo_lantern",
            new Block(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.GLASS)
                    .strength(0.5f).luminance((state) -> 15)), ModItemGroup.WARDEN_TOOLS);

    public static final Block ECHO_CLUSTER = registerBlock("echo_cluster",
            new AmethystClusterBlock(7, 3,AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.SCULK)
                    .strength(0.5F).luminance((state) -> 7)), ModItemGroup.WARDEN_TOOLS);

    public static final Block ECHO_BUD = registerBlock("echo_bud",
            new AmethystClusterBlock(4, 3,AbstractBlock.Settings.copy(ECHO_CLUSTER).sounds(BlockSoundGroup.SCULK)
                    .strength(0.5F).luminance((state) -> 3)), ModItemGroup.WARDEN_TOOLS);

    public static final Block SCULK_CRYSTAL_BLOCK = registerBlock("sculk_crystal_block",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(0.5f)
                    .sounds(BlockSoundGroup.SCULK), UniformIntProvider.create(24, 48)), ModItemGroup.WARDEN_TOOLS);

    public static final Block LOOT_VASE = registerBlock("loot_vase",
            new LootVase(FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(0.5f)), ModItemGroup.WARDEN_TOOLS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(WardenTools.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(WardenTools.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        WardenTools.LOGGER.info("Registering ModBlocks for" + WardenTools.MOD_ID);
    }
}

