package com.memokaa.cos.gameobject.item;

import com.memokaa.cos.gameobject.base.GameObject;

public abstract class Item extends GameObject {

    // Stack

    public boolean stackable;
    public int stackCount;
    public int maxStack;

    // Kullanım

    public boolean reusable;

    // Dayanıklılık

    public boolean durabilityEnabled;
    public int durability;
    public int maxDurability;

    // Sahip

    public String ownerId;

    // Üretici

    public String craftedByPlayerId;
    public String craftedByPlayerName;

    // Tarih

    public long createDate;
}
