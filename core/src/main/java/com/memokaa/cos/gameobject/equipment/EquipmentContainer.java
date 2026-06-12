package com.memokaa.cos.gameobject.equipment;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.enumtype.item.EquipmentSlot;

public class EquipmentContainer {

    // Slot -> Item
    public Map<EquipmentSlot, String> equippedItems =
        new HashMap<>();
}
