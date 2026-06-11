package com.memokaa.cos.gameobject.world;

import java.util.HashMap;
import java.util.Map;

/**
 * Oyundaki en üst dünya objesi
 */
public class World {

    // Dünya kimliği
    public String id;

    // Dünya adı
    public String name;

    // Bölgeler
    public Map<String, Region> regions = new HashMap<>();
}
