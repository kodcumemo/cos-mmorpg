package com.memokaa.cos.gameobject.mount;

import com.memokaa.cos.gameobject.base.GameObject;

public class Mount extends GameObject {

    // Şablon
    public String mountTemplateId;

    // Sahibi
    public String ownerPlayerId;

    // İsim
    public String name;

    // Mevcut can
    public int health;

    // Maksimum can
    public int maxHealth;

    // Mevcut stamina
    public int stamina;

    // Maksimum stamina
    public int maxStamina;

    // Binili mi
    public boolean mounted;

    // Binen oyuncu
    public String riderPlayerId;
}
