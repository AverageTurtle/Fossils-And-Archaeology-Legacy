package willatendo.fossilslegacy.server.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface DinopediaInformation {
	List<Component> info(Player player);
}
