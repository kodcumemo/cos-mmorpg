package com.memokaa.cos.gameobject.combat;

public class CombatStats {

    // Kimlik
    public String id;

    // Sahip oyuncu / npc / monster
    public String ownerId;

    // Maksimum Can
    public int maxHealth;

    // Mevcut Can
    public int currentHealth;

    // Maksimum Mana
    public int maxMana;

    // Mevcut Mana
    public int currentMana;

    // Maksimum Stamina
    public int maxStamina;

    // Mevcut Stamina
    public int currentStamina;

    // Yakın Dövüş Hasarı
    public int meleeDamage;

    // Menzilli Hasar
    public int rangedDamage;

    // Büyü Hasarı
    public int magicDamage;

    // Zırh
    public int armor;

    // Büyü Direnci
    public int magicResistance;

    // Kritik Şansı
    public float criticalChance;

    // Kritik Çarpanı
    public float criticalMultiplier;

    // Saldırı Hızı
    public float attackSpeed;

    // Hareket Hızı
    public float movementSpeed;

    // Görüş Mesafesi
    public int visionRange;
}
