package chris.mod.beskarmod.entities;

import chris.mod.beskarmod.Beskarmod;
import chris.mod.beskarmod.items.tools.BeskarTier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Beskarmod.MODID);

    public static final RegistryObject<EntityType<PinmissleEntity>> PIN_MISSILE = ENTITY_TYPES.register("pin_missile", () -> EntityType.Builder.<PinmissleEntity> of(PinmissleEntity:: new, MobCategory.MISC).fireImmune().build("pin_missile"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);

    }

}