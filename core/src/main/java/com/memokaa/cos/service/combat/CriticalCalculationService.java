package com.memokaa.cos.service.combat;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.memokaa.cos.gameobject.base.LivingEntity;

/**
 * Kritik vurma hesaplamalarını yönetir.
 */
public class CriticalCalculationService {

    /**
     * Kritik vurma olup olmadığını hesaplar.
     *
     * Örnek:
     * Crit Chance = 15
     *
     * %15 ihtimalle true döner.
     */
    public boolean rollCritical(
        LivingEntity attacker) {

        if (attacker == null) {
            return false;
        }

        if (attacker.combatStats == null) {
            return false;
        }

        double criticalChance =
            attacker.combatStats.criticalChance;

        double roll =
            ThreadLocalRandom.current()
                .nextDouble(0.0, 100.0);

        return roll < criticalChance;
    }
    private final Random random = new Random();

    /**
     * Kritik vurup vurmadığını hesaplar
     */
    public boolean isCritical(LivingEntity attacker) {

        double critChance =
            attacker.combatStats.criticalChance;

        double roll =
            random.nextDouble() * 100.0;

        return roll < critChance;
    }

    /**
     * Kritik hasarı hesaplar.
     *
     * Örnek:
     *
     * Damage = 100
     * Crit Multiplier = 1.5
     *
     * Sonuç:
     * 150
     */
    public double applyCriticalDamage(
        double damage,
        LivingEntity attacker) {

        if (attacker == null) {
            return damage;
        }

        if (attacker.combatStats == null) {
            return damage;
        }

        return damage *
            attacker.combatStats.criticalMultiplier;
    }
}
