package com.memokaa.cos.gameobject.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // Sahibi
    public String ownerId;

    // Maksimum ağırlık
    public double maxWeight;

    // Mevcut ağırlık
    public double currentWeight;

    // İçindeki itemler
    public List<String> itemInstanceIds = new ArrayList<>();
}
