package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.base.LivingEntity;

public class HitCalculationService {

    /**
     * İsabet etti mi?
     */
    public boolean isHit(
        LivingEntity attacker,
        LivingEntity defender) {

        double chance =
            attacker.combatStats.hitChance
                - defender.combatStats.dodgeChance;

        chance =
            Math.max(5,
                Math.min(95, chance));

        return Math.random() * 100
            < chance;
    }
}
