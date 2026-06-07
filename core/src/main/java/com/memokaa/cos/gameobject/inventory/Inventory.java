package com.memokaa.cos.gameobject.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // Envanter Kimliği
    public String id;

    // Sahip Oyuncu
    public String ownerPlayerId;

    // Maksimum Slot
    public int maxSlotCount;

    // Maksimum Ağırlık
    public int maxWeight;

    // Mevcut Ağırlık
    public int currentWeight;

    // Slotlar
    public List<String> inventorySlotIds = new ArrayList<>();
}
