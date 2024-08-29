package kr.dhmo.skyChunk;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;


public class SkyChunk extends JavaPlugin{

    @Override
    public void onEnable() {
        getLogger().info("Enabled");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        getLogger().log(Level.WARNING, "CustomChunkGenerator is used!");
        return new CustomChunkGenerator();
    }

    @Override
    public void onDisable(){
        getLogger().info("Disabled");
    }
}