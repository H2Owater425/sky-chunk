package kr.dhmo.skyChunk;

import org.bukkit.Material;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import java.util.Random;

public class CustomChunkGenerator extends ChunkGenerator {
    final private Random random;

    public CustomChunkGenerator() {
        this.random = new Random();

        this.random.setSeed(System.currentTimeMillis());
    }

    @Override
    public void generateNoise(WorldInfo worldInfo, Random random, int chunkX, int chunkZ, ChunkData chunkData) {
        if(this.random.nextInt(100) /* 0~99 */ < 99) {
            for (int y = chunkData.getMinHeight(); y < chunkData.getMaxHeight(); y++) {
                for (int x = 0; x < 16; x++) {
                    for (int z = 0; z < 16; z++) {
                        chunkData.setBlock(x, y, z, Material.AIR);
                    }
                }
            }
        }
    }

    @Override
    public boolean shouldGenerateNoise() {
        return true;
    }

    @Override
    public boolean shouldGenerateSurface() {
        return true;
    }

    @Override
    public boolean shouldGenerateCaves() {
        return true;
    }

    @Override
    public boolean shouldGenerateMobs() {
        return true;
    }

    @Override
    public boolean shouldGenerateDecorations() {
        return true;
    }

    @Override
    public boolean shouldGenerateStructures() {
        return false;
    }
}