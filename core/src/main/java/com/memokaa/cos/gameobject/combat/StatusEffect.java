package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.combat.StatusEffectType;

public class StatusEffect {

    // Kimlik
    public String id;

    // Hedef
    public String targetId;

    // Etki Türü
    public StatusEffectType statusEffectType;

    // Süre
    public int durationSeconds;

    // Güç
    public int power;

    // Başlangıç
    public long startTime;
}
