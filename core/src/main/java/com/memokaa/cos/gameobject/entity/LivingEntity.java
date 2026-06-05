package com.memokaa.cos.gameobject.entity;

import com.memokaa.cos.gameobject.GameObject;

public abstract class LivingEntity extends GameObject {

    // Can
    public int health;
    public int maxHealth;
    public float healthRegen;

    // Mana
    public int mana;
    public int maxMana;
    public float manaRegen;

    // Savaş
    public int damage;
    public int armor;
    public float attackSpeed;
    public float moveSpeed;

    // Durum
    public boolean attackable;
    public boolean immortal;
    public boolean dead;

    // Envanter
    public String inventoryId;
}
