package chris.mod.beskarmod.items.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public class BeskarPinMissile extends Item {
    public BeskarPinMissile(Properties p_41383_) {
        super(p_41383_);

    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        fire(pLevel,pPlayer);
        return super.use(pLevel, pPlayer, pUsedHand);
    }
    private void fire(Level pLevel, Player pPlayer)
    {
        if(!pLevel.isClientSide)
        {
            return;bow
        }
    }
    }


