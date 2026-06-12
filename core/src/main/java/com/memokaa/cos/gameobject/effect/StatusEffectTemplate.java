package com.memokaa.cos.gameobject.effect;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class StatusEffectTemplate extends ObjectTemplate {

    // Süre
    public double duration;

    // Tick süresi
    public double tickInterval;

    // Tick değeri
    public double tickValue;

    // Stacklenebilir mi
    public boolean stackable;

    // Maksimum stack
    public int maxStacks;

    // Hareket çarpanı
    public double movementModifier;

    // Cast çarpanı
    public double castModifier;

    // Hasar çarpanı
    public double damageModifier;
}
