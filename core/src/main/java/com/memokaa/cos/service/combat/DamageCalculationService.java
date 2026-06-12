package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.combat.AttackContext;
import com.memokaa.cos.gameobject.combat.DamageInstance;
import com.memokaa.cos.gameobject.base.LivingEntity;

import java.util.concurrent.ThreadLocalRandom;

public class DamageCalculationService {

    /**
     * Ham hasarı hesaplar.
     */
    /**
     * Ham hasarı hesaplar.
     */

    public DamageInstance calculateDamage(
        LivingEntity attacker,
        AttackContext context) {

        var stats =
            attacker.combatStats;

        double damage =
            ThreadLocalRandom.current()
                .nextDouble(
                    stats.minDamage,
                    stats.maxDamage);

        DamageInstance instance =
            new DamageInstance();

        instance.rawDamage =
            damage;

        instance.damageType =
            context.damageType;





        return instance;
    }


}
