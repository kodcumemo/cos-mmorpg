package com.memokaa.cos.gameobject.item;

import com.memokaa.cos.enumtype.combat.DamageType;

public class WeaponTemplate extends ItemTemplate {

    /**
     * Minimum hasar
     */
    public double minDamage;

    /**
     * Maksimum hasar
     */
    public double maxDamage;

    /**
     * Saniyedeki saldırı sayısı
     */
    public double attackSpeed;

    /**
     * Hasar tipi
     */
    public DamageType damageType;

    /**
     * Menzil
     */
    public int range;

    /**
     * Armor penetration
     */
    public double armorPenetration;
}
