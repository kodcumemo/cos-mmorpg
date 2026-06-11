package com.memokaa.cos.gameobject.world;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.enumtype.world.RegionType;

/**
 * Dünya içerisindeki bölge
 */
public class Region {

    // Bölge kimliği
    public String id;

    // Bölge adı
    public String name;

    // Bölge tipi
    public RegionType regionType;

    // Dünya koordinatı X
    public int regionX;

    // Dünya koordinatı Y
    public int regionY;

    // Adalar
    public Map<String, Island> islands = new HashMap<>();
}
