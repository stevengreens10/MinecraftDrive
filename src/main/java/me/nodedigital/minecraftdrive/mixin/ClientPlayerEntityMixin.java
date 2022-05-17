package me.nodedigital.minecraftdrive.mixin;

import com.mojang.authlib.GameProfile;
import me.nodedigital.minecraftdrive.DataHandler;
import me.nodedigital.minecraftdrive.DriverCommand;
import me.nodedigital.minecraftdrive.IPlayerEntityMixin;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin extends PlayerEntity implements IPlayerEntityMixin {

    @Shadow public Input input;

    @Shadow public abstract void setSprinting(boolean sprinting);

    public Vec3d destination;
    public Vec3d lookAt;

    public ClientPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile profile) {
        super(world, pos, yaw, profile);
    }

    @Inject(at = @At("RETURN"), method="tickMovement")
    public void tickMovement(CallbackInfo ci) {
        if(lookAt != null) {
            lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, lookAt);
        }
    }

    @Override
    public boolean isSprinting() {
        if(destination != null) {
            return true;
        }
        return super.isSprinting();
    }

    @Inject(at = @At("HEAD"), method="sendChatMessage")
    public void sendMsg(String msg, CallbackInfo ci) {
        DriverCommand cmd = new DriverCommand();
        if(msg.startsWith("read")) {
            int length = Integer.parseInt(msg.split(" ")[1]);
            cmd.offset = 0;
            cmd.len = length;

            new Thread(() -> {
                byte[] read = DataHandler.read(cmd);
                sendMessage(new LiteralText(new String(read)), false);
            }).start();
        } else {
            cmd.data = msg.getBytes();
            cmd.offset = 0;
            new Thread(() -> DataHandler.write(cmd)).start();
        }
    }

    @Override
    public Vec3d getDestination() {
        return destination;
    }

    @Override
    public void setDestination(Vec3d pos) {
        this.destination = pos;
    }

    @Override
    public Vec3d getLookAt() {
        return lookAt;
    }

    @Override
    public void setLookAt(Vec3d pos) {
        this.lookAt = pos;
    }
}
