package com.memokaa.cos.gameobject.magic;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class SpellTemplate extends ObjectTemplate {

    // Gerekli skill
    public String requiredSkillId;

    // Minimum skill
    public double requiredSkillValue;

    // Mana maliyeti
    public int manaCost;

    // Cast süresi
    public double castTime;

    // Menzil
    public double range;

    // Cooldown
    public double cooldown;
}
