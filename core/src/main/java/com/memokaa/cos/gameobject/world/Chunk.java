package com.memokaa.cos.gameobject.world;

import java.util.HashMap;
import java.util.Map;

/**
 * Haritanın yükleme parçası
 */
public class Chunk {

    // Chunk kimliği
    public String id;

    // Chunk koordinatı X
    public int chunkX;

    // Chunk koordinatı Y
    public int chunkY;

    // Tilelar
    public Map<String, Tile> tiles = new HashMap<>();
}
