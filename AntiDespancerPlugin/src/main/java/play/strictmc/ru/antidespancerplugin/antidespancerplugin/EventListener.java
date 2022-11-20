package play.strictmc.ru.antidespancerplugin.antidespancerplugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class EventListener implements Listener {


    @EventHandler
    public void PlaceDISPENSER(BlockPlaceEvent e) {
        Location l = e.getBlock().getLocation();
        Block b = e.getBlockPlaced();
        Player p = e.getPlayer();
        if(l.getBlockY() >= AntiDespancerPlugin.getInstance().getConfig().getInt("coords") && b.getType().equals(Material.DISPENSER)) { //200//
            p.sendMessage(AntiDespancerPlugin.getInstance().getConfig().getString("message.blocked").replace("&", "§"));
            e.setCancelled(true);
        }
    }
}
