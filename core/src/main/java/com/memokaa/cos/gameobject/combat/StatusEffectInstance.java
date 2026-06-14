package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.combat.StatusEffectType;

public class StatusEffectInstance {

    // Efekti atan kişi
    public String effectTemplateId;

    public StatusEffectType effectType;

    public double power;

    public boolean active;

    public long startTime;

    public long endTime;

    public long tickInterval;

    public long lastTickTime;
}
