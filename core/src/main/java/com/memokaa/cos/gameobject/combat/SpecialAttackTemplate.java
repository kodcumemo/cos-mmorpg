package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.combat.SpecialAttackType;

public class SpecialAttackTemplate {

    // Kimlik
    public String id;

    // Görünen isim
    public String name;

    // Açıklama
    public String description;

    // Özel saldırı tipi
    public SpecialAttackType attackType;

    // Gerekli skill
    public String requiredSkillId;

    // Gerekli skill seviyesi
    public int requiredSkillValue;

    // Cooldown saniye
    public int cooldownSeconds;

    // Mana maliyeti
    public int manaCost;

    // Stamina maliyeti
    public int staminaCost;

    // Hasar çarpanı
    public float damageMultiplier;

    // Etki süresi
    public int effectDurationSeconds;

    // Menzil
    public float range;
}
