package com.memokaa.cos.service.combat;

import java.util.Random;

import com.memokaa.cos.gameobject.base.LivingEntity;

public class BlockCalculationService {

    private final Random random =
        new Random();

    public boolean isBlocked(
        LivingEntity defender) {

        double roll =
            random.nextDouble() * 100.0;

        return roll <
            defender.combatStats
                .blockChance;
    }
}
