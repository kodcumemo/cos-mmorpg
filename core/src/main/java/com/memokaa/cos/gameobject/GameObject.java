package com.memokaa.cos.gameobject;

public abstract class GameObject {

    // Kimlik
    public String id;
    public String name;
    public String description;

    // Görsel
    public String texturePath;
    public String iconPath;

    // Konum
    public float x;
    public float y;

    // Boyut
    public float width;
    public float height;

    // Genel
    public String color;
    public int weight;
    public String status;
}
