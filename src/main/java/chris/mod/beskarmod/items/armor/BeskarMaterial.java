package chris.mod.beskarmod.items.armor;

import chris.mod.beskarmod.items.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BeskarMaterial implements ArmorMaterial {

    BESKAR("beskarmod:beskar", 45, new int[]{5, 7, 9, 4}, 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.5F, 1.0F, () -> {
        return Ingredient.of(ModItems.BESKAR_INGOT.get());
    });
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private BeskarMaterial(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);

    }
        public int getDefenseForType (ArmorItem.Type pSlot){
            return this.slotProtections[pSlot.getSlot().getIndex()];
        }

        public int getEnchantmentValue() {
            return this.enchantmentValue;
        }

        public SoundEvent getEquipSound() {
            return this.sound;
        }

        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }

        public String getName() {
            return this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

/**
 * Gets the percentage of knockback resistance provided by armor of the material.
 */
        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }


    public int getDurabilityForType(ArmorItem.Type pSlot) {
        return HEALTH_PER_SLOT[pSlot.getSlot().getIndex()] * this.durabilityMultiplier;
    }
    }


