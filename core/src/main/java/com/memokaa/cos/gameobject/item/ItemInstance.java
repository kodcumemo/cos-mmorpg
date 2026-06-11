package com.memokaa.cos.gameobject.item;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.enumtype.item.ItemQuality;
import com.memokaa.cos.enumtype.item.MaterialType;

public class ItemInstance {

    public String itemInstanceId;

    public String itemTemplateId;

    public String ownerId;

    public MaterialType materialType;

    public ItemQuality itemQuality;

    public int durability;

    public int maxDurability;

    public boolean specialItem;

    public String craftedByPlayerId;

    public String craftedByPlayerName;

    public long createDate;

    public List<ItemProperty> properties = new ArrayList<>();
    // Bulunduğu konteyner
    public String containerId;

    // Kilitli mi
    public boolean locked;

    // Pazarda mı
    public boolean listedOnMarket;
}
