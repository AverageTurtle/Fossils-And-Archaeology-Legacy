package willatendo.fossilslegacy.client;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import willatendo.fossilslegacy.network.ServerboundSinkPacket;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;


@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME, modid = FossilsLegacyUtils.ID, value = Dist.CLIENT)
public class ClientForgeEvents {
    @SubscribeEvent
    public static void keyEvents(InputEvent.Key event) {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.player != null) {
            if (FossilsLegacyKeys.SINK.isDown()) {
                PacketDistributor.sendToServer(new ServerboundSinkPacket(true));
            }
            if (FossilsLegacyKeys.SINK.consumeClick() == false) {
                PacketDistributor.sendToServer(new ServerboundSinkPacket(false));
            }
        }
    }
}
