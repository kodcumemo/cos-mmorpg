package com.memokaa.cos.enumtype.entity;

/**
 * Oyundaki tüm nesnelerin ana kategorisini belirtir.
 *
 * ENTITY      = Canlı varlıklar (Player, NPC, Monster, Animal)
 * ITEM        = Envantere girebilen eşyalar
 * WORLD_OBJECT= Dünyadaki sabit nesneler (Ağaç, Kapı, Ev, Sandık)
 */
public enum ObjectCategory {

    /** Canlı varlıklar */
    ENTITY,

    /** Eşyalar */
    ITEM,

    /** Dünya nesneleri */
    WORLD_OBJECT
}
