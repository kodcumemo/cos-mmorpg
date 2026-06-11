package com.memokaa.cos.gameobject.world;

import com.memokaa.cos.enumtype.world.TileType;

/**
 * Tile şablonu
 */
public class TileTemplate {

    // Kimlik
    public String id;

    // İsim
    public String name;

    // Tile tipi
    public TileType tileType;

    // Üzerinde yürünebilir mi
    public boolean walkable;

    // Su mu
    public boolean water;

    // Güvenli bölge mi
    public boolean safeZone;

    // Hareket maliyeti
    public float movementCost;

    // Görsel model
    public String modelAsset;
}
