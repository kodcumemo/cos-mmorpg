package com.memokaa.cos.gameobject.ship;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.gameobject.base.GameObject;

public class Ship extends GameObject {

    // Şablon
    public String shipTemplateId;

    // Gemi adı
    public String shipName;

    // Sahibi
    public String ownerPlayerId;

    // Mevcut dayanıklılık
    public int durability;

    // Maksimum dayanıklılık
    public int maxDurability;

    // Kargo kapasitesi
    public int cargoCapacity;

    // Kargo envanteri
    public List<String> cargoItemIds = new ArrayList<>();

    // Mürettebat
    public List<String> crewPlayerIds = new ArrayList<>();

    // Yolcular
    public List<String> passengerPlayerIds = new ArrayList<>();

    // Demirli mi
    public boolean anchored;

    // Hareket halinde mi
    public boolean moving;
}
