package com.memokaa.cos.gameobject.effect;

import com.memokaa.cos.gameobject.template.ObjectTemplate;
import com.memokaa.cos.enumtype.combat.StatusEffectType;
public class StatusEffectTemplate
    extends ObjectTemplate {

    public StatusEffectType effectType;

    public double duration;

    public double tickInterval;

    public double tickValue;

    public boolean stackable;

    public int maxStacks;

    public double movementModifier;

    public double castModifier;

    public double damageModifier;
}
