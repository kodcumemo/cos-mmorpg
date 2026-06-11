package com.memokaa.cos.gameobject.base;

public abstract class GameObject {

    // Benzersiz Kimlik

    public String id;

    // Görünen isim

    public String name;

    // Açıklama

    public String description;


    // Dünya koordinatları
    public float x;      // X koordinatı
    public float y;      // Y koordinatı
    public float z;      // Z koordinatı
    // Objenin baktığı yön
    public float rotation;
    // Boyut

    public float width;

    public float height;

    // Görsel

    public String spriteId;

    public String iconId;

    // Dünya

    public String worldId;

    public String regionId;

    // Durum

    public boolean active;

    public long createDate;
}
