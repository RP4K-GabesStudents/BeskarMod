package chris.mod.beskarmod.items.tools;

import chris.mod.beskarmod.items.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.ForgeRegistries;

public class BeskarTier{

        public static final ForgeTier BESKAR_TIER = new ForgeTier(6,5000, 12, 6, 22, TagKey.create(ForgeRegistries.Keys.BLOCKS,new ResourceLocation("beskar")), () -> {
            return Ingredient.of(new ItemLike[]{ModItems.BESKAR_INGOT.get() });
        });

}