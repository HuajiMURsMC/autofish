package troy.autofish.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import troy.autofish.FabricModAutofish;

@Mixin(FishingBobberEntity.class)
public abstract class MixinFishHookEntity {

    //field_7173;
    @Shadow private int hookCountdown;

    @Shadow public abstract PlayerEntity getOwner();

    //method_6949
    @Inject(method = "tickFishingLogic", at = @At("TAIL"))
    private void tickFishingLogic(BlockPos blockPos_1, CallbackInfo ci) {
        FabricModAutofish.getInstance().tickFishingLogic(getOwner(), hookCountdown);
    }
}