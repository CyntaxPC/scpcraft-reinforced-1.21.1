package net.cyntax.scpcraftreinforced;

import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.entity.ModEntities;
import net.cyntax.scpcraftreinforced.entity.client.ChairRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;

public class SCPcraftReinforcedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLADEWOOD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLADEWOOD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLADEWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());

        EntityRendererRegistry.register(ModEntities.CHAIR, ChairRenderer::new);

    }
}
