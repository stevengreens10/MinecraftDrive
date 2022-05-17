package me.nodedigital.minecraftdrive.mixin;

import me.nodedigital.minecraftdrive.IPlayerEntityMixin;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardInput.class)
public abstract class KeyboardInputMixin {

    @Inject(at = @At("RETURN"), method = "tick")
    public void tick(boolean slowDown, CallbackInfo ci) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        IPlayerEntityMixin playerMixin = (IPlayerEntityMixin) player;
        Vec3d dest = playerMixin.getDestination();

        if(dest != null) {
            KeyboardInput keyThis = ((KeyboardInput)((Object) this));
            keyThis.pressingForward = true;
            keyThis.movementForward = 1.0f;
            MinecraftClient.getInstance().options.sprintKey.setPressed(true);
            player.setSprinting(true);
        }

    }

}
