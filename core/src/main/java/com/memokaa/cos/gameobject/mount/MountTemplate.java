package com.memokaa.cos.gameobject.mount;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class MountTemplate extends ObjectTemplate {

    // Hareket çarpanı
    public float movementMultiplier;

    // Taşıma kapasitesi
    public int carryCapacity;

    // Uçabilir mi
    public boolean flying;

    // Yüzebilir mi
    public boolean swimming;
}
