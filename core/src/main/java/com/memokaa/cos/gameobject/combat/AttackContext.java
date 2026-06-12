package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.combat.DamageType;

/**
 * Bir saldırı işlemi sırasında
 * gerekli olan verileri taşır.
 */
public class AttackContext {

    // Saldıran obje id
    public String attackerId;

    // Hedef obje id
    public String targetId;

    // Kullanılan silah
    public String weaponItemId;

    // Kullanılan büyü
    public String spellId;

    // Kullanılan özel saldırı
    public String specialAttackId;

    // Hasar tipi
    public DamageType damageType;

    // Kritik vurabilir mi
    public boolean canCritical;

    // Status effect uygulayabilir mi
    public boolean canApplyEffects;

    // PvP saldırısı mı
    public boolean pvp;

    // PvE saldırısı mı
    public boolean pve;
}
