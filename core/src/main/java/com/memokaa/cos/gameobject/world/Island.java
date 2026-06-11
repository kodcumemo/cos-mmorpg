package com.memokaa.cos.gameobject.world;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.enumtype.world.IslandType;

/**
 * Oyuncuların yaşadığı ada
 */
public class Island {

    // Ada kimliği
    public String id;

    // Ada adı
    public String name;

    // Ada tipi
    public IslandType islandType;

    // Ada genişliği
    public int width;

    // Ada yüksekliği
    public int height;

    // Ada sahibi oyuncu
    public String ownerPlayerId;

    // Chunklar
    public Map<String, Chunk> chunks = new HashMap<>();
}
