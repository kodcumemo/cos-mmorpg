package com.memokaa.cos.gameobject.monster;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class MonsterTemplate extends ObjectTemplate {

    // Maksimum can
    public int maxHealth;

    // Maksimum mana
    public int maxMana;

    // Maksimum stamina
    public int maxStamina;

    // Hareket hızı
    public float moveSpeed;

    // Görüş mesafesi
    public float visionRange;

    // Saldırı menzili
    public float attackRange;

    // Loot tabloları
    public List<String> lootTableIds = new ArrayList<>();

    // Kullanabileceği saldırılar
    public List<String> specialAttackIds = new ArrayList<>();
}
