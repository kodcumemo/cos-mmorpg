package com.memokaa.cos.gameobject.base;

import com.memokaa.cos.enumtype.character.CharacterStatus;
import com.memokaa.cos.enumtype.character.CombatMode;

public abstract class LivingEntity extends GameObject {

    // Sağlık

    public int health;

    public int maxHealth;

    // Mana

    public int mana;

    public int maxMana;

    // Stamina

    public int stamina;

    public int maxStamina;

    // Yenilenme

    public int healthRegen;

    public int manaRegen;

    public int staminaRegen;

    // Savaş

    public int damage;

    public int armor;

    public int attackSpeed;

    public int moveSpeed;

    // Durum

    public CharacterStatus characterStatus;

    public CombatMode combatMode;
}
