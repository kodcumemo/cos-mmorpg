package com.memokaa.cos.gameobject.monster;

import com.memokaa.cos.gameobject.base.GameObject;

public class Monster extends GameObject {

    // Şablon
    public String monsterTemplateId;

    // Mevcut can
    public int health;

    // Maksimum can
    public int maxHealth;

    // Mevcut mana
    public int mana;

    // Maksimum mana
    public int maxMana;

    // Mevcut stamina
    public int stamina;

    // Maksimum stamina
    public int maxStamina;

    // Hedef
    public String targetId;

    // Doğduğu yer X
    public float spawnX;

    // Doğduğu yer Y
    public float spawnY;

    // Doğduğu yer Z
    public float spawnZ;

    // Ölü mü
    public boolean dead;

    // Son vurulan zaman
    public long lastCombatTime;
}
