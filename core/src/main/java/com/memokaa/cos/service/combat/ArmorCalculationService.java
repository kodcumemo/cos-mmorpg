package com.memokaa.cos.service.combat;

import com.memokaa.cos.enumtype.combat.DamageType;
import com.memokaa.cos.gameobject.combat.CombatStats;

public class ArmorCalculationService {

    /**
     * DamageType'a göre doğru armor/resist'i seçer.
     */
    public double calculateDamageAfterArmor(
        double rawDamage,
        CombatStats stats,
        DamageType damageType,
        double armorPenetration) {

        double armor =
            getArmorValue(
                stats,
                damageType);

        armor -= armorPenetration;

        if(armor < 0) {

            armor = 0;
        }

        double reduction =
            armor / (armor + 100.0);

        return rawDamage * (1.0 - reduction);
    }

    /**
     * DamageType'a göre ilgili armor/resist döndürür.
     */
    private double getArmorValue(
        CombatStats stats,
        DamageType damageType) {

        if(damageType == null) {

            return 0;
        }

        switch(damageType) {

            case SLASH:
                return stats.slashArmor;

            case PIERCE:
                return stats.pierceArmor;

            case BLUNT:
                return stats.bluntArmor;

            case FIRE:
                return stats.fireResist;

            case ICE:
                return stats.iceResist;

            case LIGHTNING:
                return stats.lightningResist;

            case POISON:
                return stats.poisonResist;

            case ARCANE:
                return stats.arcaneResist;

            default:
                return 0;
        }
    }
}
