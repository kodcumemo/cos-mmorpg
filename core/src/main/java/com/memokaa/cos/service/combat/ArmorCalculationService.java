package com.memokaa.cos.service.combat;

import com.memokaa.cos.enumtype.combat.DamageType;
import com.memokaa.cos.gameobject.base.LivingEntity;

public class ArmorCalculationService {

    /**
     * Armor ve resistleri uygular.
     */
    public double applyArmor(
        double damage,
        LivingEntity defender,
        DamageType damageType) {

        return damage;
    }
}
