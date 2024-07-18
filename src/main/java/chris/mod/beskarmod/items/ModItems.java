package chris.mod.beskarmod.items;

import chris.mod.beskarmod.Beskarmod;
import chris.mod.beskarmod.items.armor.BeskarChestplate;
import chris.mod.beskarmod.items.armor.BeskarHelmet;
import chris.mod.beskarmod.items.armor.BeskarMaterial;
import chris.mod.beskarmod.items.tools.BeskarTier;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beskarmod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //----------------------------//


    //-----------------TOOLS---------------------//
    public static final RegistryObject<Item> BESKAR_SWORD = ITEMS.register("beskar_sword", () -> new SwordItem(BeskarTier.BESKAR_TIER, 3,-2.4F,new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BESKAR_SHOVEL = ITEMS.register("beskar_shovel", () -> new ShovelItem(BeskarTier.BESKAR_TIER, 1F,-3.0F,new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BESKAR_HOE = ITEMS.register("beskar_hoe", () -> new HoeItem(BeskarTier.BESKAR_TIER, -4,-0F,new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BESKAR_AXE = ITEMS.register("beskar_axe.json", () -> new AxeItem(BeskarTier.BESKAR_TIER, 5.0F,-3.0F,new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BESKAR_PICKAXE = ITEMS.register("beskar_pickaxe", () -> new PickaxeItem(BeskarTier.BESKAR_TIER, 1,-3.0F,new Item.Properties().fireResistant()));
    //--------------------------------------//
    //-------------------------ARMOR---------------------//
public static final RegistryObject <Item> BESKAR_LEGGINGS = ITEMS.register("beskar_leggings",()-> new ArmorItem(BeskarMaterial.BESKAR, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
public static final RegistryObject <Item> BESKAR_HELMET = ITEMS.register("beskar_helmet",()-> new BeskarHelmet(BeskarMaterial.BESKAR, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
public static final RegistryObject <Item> BESKAR_BOOTS = ITEMS.register("beskar_boots",()-> new ArmorItem(BeskarMaterial.BESKAR, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
public static final RegistryObject <Item> BESKAR_CHESTPLATE = ITEMS.register("beskar_chestplate",()-> new BeskarChestplate(BeskarMaterial.BESKAR, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    //-----------------------------------------//
//------------------OTHER-------------------------//
    public static final RegistryObject<Item> BESKAR_INGOT = ITEMS.register("beskar_ingot", () -> new Item(new Item.Properties()));
}