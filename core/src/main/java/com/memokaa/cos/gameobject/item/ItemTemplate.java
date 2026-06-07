package com.memokaa.cos.gameobject.item;

import com.memokaa.cos.enumtype.item.ItemCategory;
import com.memokaa.cos.enumtype.item.ItemRarity;
import com.memokaa.cos.enumtype.item.ItemType;

public class ItemTemplate {

    public String itemTemplateId;

    public String name;

    public String description;

    public ItemType itemType;

    public ItemCategory itemCategory;

    public ItemRarity rarity;

    public float weight;

    public boolean stackable;

    public int maxStack;

    public boolean tradable;

    public boolean droppable;

    public boolean destroyable;

    public boolean repairable;

    public boolean durabilityEnabled;

    public int maxDurability;

    public String iconId;

    public String spriteId;
}
