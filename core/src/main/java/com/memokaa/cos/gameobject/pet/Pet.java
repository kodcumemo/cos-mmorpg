package com.memokaa.cos.gameobject.pet;

import com.memokaa.cos.gameobject.base.GameObject;

public class Pet extends GameObject {

    // Şablon
    public String petTemplateId;

    // Sahibi
    public String ownerPlayerId;

    // Evcil hayvan adı
    public String name;

    // Mevcut can
    public int health;

    // Maksimum can
    public int maxHealth;

    // Sadakat puanı
    public int loyalty;

    // Çağrılmış mı
    public boolean summoned;

    // Saldırıyor mu
    public boolean attacking;

    // Mevcut hedef
    public String targetId;
}
