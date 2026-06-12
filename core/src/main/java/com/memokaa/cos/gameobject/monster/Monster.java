package com.memokaa.cos.gameobject.monster;

import com.memokaa.cos.gameobject.base.GameObject;
import com.memokaa.cos.gameobject.effect.ActiveStatusEffect;
import com.memokaa.cos.gameobject.equipment.EquipmentContainer;

import java.util.List;

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

    // Doğduğu x
    public double spawnX;

    // Doğduğu y
    public double spawnY;

    // Doğduğu z
    public double spawnZ;

    // Ölü mü
    public boolean dead;

    // Son vurulan zaman
    public long lastCombatTime;
    public EquipmentContainer equipment;
    public List<ActiveStatusEffect> activeEffects;

}
