package com.memokaa.cos.gameobject.item;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.enumtype.item.EquipmentSlot;
import com.memokaa.cos.enumtype.item.ItemType;
import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class ItemTemplate extends ObjectTemplate {

    // Item tipi
    public ItemType itemType;

    // Stacklenebilir mi
    public boolean stackable;

    // Maksimum stack miktarı
    public int maxStack;

    // Maksimum dayanıklılık
    public int maxDurability;

    // Ağırlık
    public double weight;

    // Temel özellikler
    public List<ItemProperty> properties = new ArrayList<>();
    // Takılabileceği slot
    public EquipmentSlot equipmentSlot;
}
