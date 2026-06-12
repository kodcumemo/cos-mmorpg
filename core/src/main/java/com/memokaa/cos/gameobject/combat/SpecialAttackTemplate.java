package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class SpecialAttackTemplate extends ObjectTemplate {

    // Gereken skill
    public String requiredSkillId;

    // Gereken skill seviyesi
    public double requiredSkillValue;

    // Cooldown
    public double cooldown;

    // Stamina maliyeti
    public int staminaCost;

    // Mana maliyeti
    public int manaCost;
}
