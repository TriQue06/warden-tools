package net.trique.wardentools;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.trique.wardentools.block.ModBlocks;
import net.trique.wardentools.entity.client.armor.WardenHelmetRenderer;
import net.trique.wardentools.item.ModItems;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WardenToolsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECHO_BUD, RenderLayer.getCutout());

        GeoArmorRenderer.registerArmorRenderer(new WardenHelmetRenderer(), ModItems.WARDEN_HELMET);

    }


}
