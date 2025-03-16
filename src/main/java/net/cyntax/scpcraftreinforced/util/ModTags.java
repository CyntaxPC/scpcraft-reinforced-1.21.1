package net.cyntax.scpcraftreinforced.util;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = createTag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_IRIDIUM_TOOL = createTag("needs_iridium_tool");
        public static final TagKey<Block> NEEDS_BLADEWOOD_TOOL = createTag("needs_bladewood_tool");
        public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = createTag("incorrect_for_platinum_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRIDIUM_TOOL = createTag("incorrect_for_iridium_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLADEWOOD_TOOL = createTag("incorrect_for_bladewood_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftReinforced.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PLATINUM_REPAIR = createTag("platinum_repair");
        public static final TagKey<Item> IRIDIUM_REPAIR = createTag("iridium_repair");
        public static final TagKey<Item> BLADEWOOD_REPAIR = createTag("bladewood_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftReinforced.MOD_ID, name));
        }
    }
}
