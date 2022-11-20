package play.strictmc.ru.antidespancerplugin.antidespancerplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiDespancerPlugin extends JavaPlugin {

    private static AntiDespancerPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new EventListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AntiDespancerPlugin getInstance() { return instance; }
}
