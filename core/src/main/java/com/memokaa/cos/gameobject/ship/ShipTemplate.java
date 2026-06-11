package com.memokaa.cos.gameobject.ship;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class ShipTemplate extends ObjectTemplate {

    // Mürettebat kapasitesi
    public int crewCapacity;

    // Kargo kapasitesi
    public int cargoCapacity;

    // Maksimum dayanıklılık
    public int maxDurability;

    // Hareket hızı
    public float moveSpeed;

    // Dönüş hızı
    public float turnSpeed;

    // Top yuvası sayısı
    public int cannonSlots;

    // Maksimum yolcu
    public int passengerCapacity;
}
