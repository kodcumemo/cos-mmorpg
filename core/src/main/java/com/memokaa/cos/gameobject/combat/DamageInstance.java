package com.memokaa.cos.gameobject.combat;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.enumtype.combat.DamageType;

/**
 * Oluşan hasarı temsil eder.
 */
public class DamageInstance {

    // Ham hasar
    public double rawDamage;

    // Son hasar
    public double finalDamage;

    // Kritik mi
    public boolean critical;

    // Hasar tipi
    public DamageType damageType;

    // Uygulanan effectler
    public List<String> appliedEffects =
        new ArrayList<>();
}
