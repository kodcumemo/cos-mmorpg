package com.memokaa.cos.gameobject.combat;

/**
 * Savaş sırasında kullanılan
 * son hesaplanmış combat değerleri.
 */
public class CombatStats {

    // =========================
    // DAMAGE
    // =========================

    // Minimum vurabileceği hasar
    public double minDamage;

    // Maksimum vurabileceği hasar
    public double maxDamage;

    // =========================
    // SPEED
    // =========================

    // Saniyedeki saldırı sayısı
    public double attackSpeed;

    // Büyü kullanım hızı
    public double castSpeed;

    // Hareket hızı
    public double moveSpeed;

    // =========================
    // CRITICAL
    // =========================

    // Kritik vurma şansı (%)
    public double criticalChance;

    // Kritik çarpanı
    public double criticalMultiplier;

    // =========================
    // HIT
    // =========================

    // Tamamen kaçınma
    public double dodgeChance;

    // Silah veya kalkan ile karşılama
    public double parryChance;

    // Blok yapma ihtimali
    public double blockChance;

    // Blok gerçekleşirse azaltılacak oran
    public double blockReduction;

    // =========================
    // ARMOR
    // =========================

    public double slashArmor;

    public double pierceArmor;

    public double bluntArmor;

    public double magicArmor;

    // =========================
    // PENETRATION
    // =========================

    public double armorPenetration;

    // =========================
    // RESISTS
    // =========================

    public double fireResist;

    public double iceResist;

    public double poisonResist;

    public double holyResist;

    public double shadowResist;
}
