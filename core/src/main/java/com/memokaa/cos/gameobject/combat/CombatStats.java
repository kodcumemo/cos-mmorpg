package com.memokaa.cos.gameobject.combat;

/**
 * Combat sırasında kullanılan
 * son hesaplanmış değerler.
 */
public class CombatStats {

    // Minimum hasar
    public double minDamage;

    // Maksimum hasar
    public double maxDamage;

    // Kritik vurma şansı
    public double criticalChance;

    // Kritik hasar çarpanı
    public double criticalMultiplier;

    // Zırh delme
    public double armorPenetration;

    // Saldırı hızı
    public double attackSpeed;

    // Büyü yapma hızı
    public double castSpeed;

    // Hareket hızı
    public double movementSpeed;

    // Görüş mesafesi
    public double visionRange;

    // Fiziksel zırhlar
    public double slashArmor;
    public double pierceArmor;
    public double bluntArmor;

    // Element dirençleri
    public double fireResist;
    public double iceResist;
    public double lightningResist;

    public double holyResist;
    public double shadowResist;
    public double poisonResist;
}
