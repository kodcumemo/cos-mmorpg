package com.memokaa.cos.gameobject.item;

import com.memokaa.cos.gameobject.GameObject;

public abstract class Item extends GameObject {

    public boolean stackable;
    public int stackCount;
    public int maxStack;

    public boolean reusable;

    public int durability;
    public int maxDurability;

    public String ownerId;
}
