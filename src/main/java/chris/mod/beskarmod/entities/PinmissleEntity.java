package chris.mod.beskarmod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.level.Level;

public class PinmissleEntity extends ShulkerBullet {
    public PinmissleEntity(EntityType<? extends ShulkerBullet> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
}
