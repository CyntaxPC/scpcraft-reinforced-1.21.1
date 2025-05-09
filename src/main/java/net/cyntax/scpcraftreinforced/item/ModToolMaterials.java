package net.cyntax.scpcraftreinforced.item;

import com.google.common.base.Suppliers;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PLATINUM(ModTags.Blocks.INCORRECT_FOR_PLATINUM_TOOL,
            750, 7.0F, 2.5F, 22, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),

    IRIDIUM(ModTags.Blocks.INCORRECT_FOR_IRIDIUM_TOOL,
            1750, 8.5F, 3.5F, 22, () -> Ingredient.ofItems(ModItems.IRIDIUM_INGOT)),

    BLADEWOOD(ModTags.Blocks.INCORRECT_FOR_BLADEWOOD_TOOL,
            1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}