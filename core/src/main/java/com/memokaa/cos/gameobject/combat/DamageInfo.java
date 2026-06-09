package com.memokaa.cos.gameobject.combat;

import com.memokaa.cos.enumtype.character.DamageType;

public class DamageInfo {

    // Vuran
    public String sourceId;

    // Hedef
    public String targetId;

    // Hasar Türü
    public DamageType damageType;

    // Ham Hasar
    public int baseDamage;

    // Son Hasar
    public int finalDamage;

    // Kritik mi
    public boolean critical;

    // Zırh Delme
    public int armorPenetration;
}
