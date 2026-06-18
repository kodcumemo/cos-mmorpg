package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.combat.DamageType;

/**
 * Bir saldırı sonucu oluşan
 * hasar bilgisi.
 */
public class DamageInstance {

    // Ham hasar
    public double rawDamage;

    // Armor sonrası hasar
    public double finalDamage;

    // Engellenen hasar
    public double blockedDamage;

    // Armor tarafından azaltılan
    public double armorReduced;

    // Damage tipi
    public DamageType damageType;

    // Kritik mi
    public boolean critical;

    // Blocklandı mı
    public boolean blocked;

    // Dodge edildi mi
    public boolean dodged;

    // Parry edildi mi
    public boolean parried;

    // Armor penetration
    public double armorPenetration;

    // Kaynak silah
    public String weaponTemplateId;

    // Kaynak skill
    public String skillTemplateId;
}
