package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.combat.CombatStats;
import com.memokaa.cos.gameobject.base.LivingEntity;

public class CombatStatsBuilder {

    /**
     * Combat istatistiklerini oluşturur.
     */
    public CombatStats build(
        LivingEntity entity) {

        CombatStats stats =
            new CombatStats();

        loadBaseStats(entity, stats);

        applySkills(entity, stats);

        applyEquipment(entity, stats);

        applyProperties(entity, stats);

        applyBuffs(entity, stats);

        applyDebuffs(entity, stats);

        return stats;
    }

    /**
     * Ana statları combat değerlerine dönüştürür.
     */
    private void loadBaseStats(
        LivingEntity entity,
        CombatStats stats) {

        stats.minDamage =
            entity.strength * 0.20;

        stats.maxDamage =
            entity.strength * 0.40;

        stats.attackSpeed =
            1.0 +
                (entity.dexterity * 0.01);

        stats.castSpeed =
            1.0 +
                (entity.intelligence * 0.01);

        stats.movementSpeed =
            1.0 +
                (entity.dexterity * 0.005);

        stats.visionRange =
            18;

        stats.criticalChance =
            entity.dexterity * 0.05;

        stats.criticalMultiplier =
            1.5;
    }

    /**
     * Skill bonuslarını uygular.
     */
    private void applySkills(
        LivingEntity entity,
        CombatStats stats) {

    }

    /**
     * Ekipman bonuslarını uygular.
     */
    private void applyEquipment(
        LivingEntity entity,
        CombatStats stats) {

    }

    /**
     * Property bonuslarını uygular.
     */
    private void applyProperties(
        LivingEntity entity,
        CombatStats stats) {

    }

    /**
     * Buffları uygular.
     */
    private void applyBuffs(
        LivingEntity entity,
        CombatStats stats) {

    }

    /**
     * Debuffları uygular.
     */
    private void applyDebuffs(
        LivingEntity entity,
        CombatStats stats) {

    }
}
