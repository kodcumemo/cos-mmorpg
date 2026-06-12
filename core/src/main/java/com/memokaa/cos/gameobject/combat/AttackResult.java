package com.memokaa.cos.gameobject.combat;

import java.util.ArrayList;
import java.util.List;

/**
 * Bir saldırının sonucunu temsil eder.
 */
public class AttackResult {

    // Oluşan hasar
    public DamageInstance damage;

    // Kritik vuruldu mu
    public boolean critical;

    // Iskalandı mı
    public boolean missed;

    // Kaçınıldı mı
    public boolean dodged;

    // Bloklandı mı
    public boolean blocked;

    // Uygulanan effectler
    public List<String> appliedEffects =
        new ArrayList<>();
}
