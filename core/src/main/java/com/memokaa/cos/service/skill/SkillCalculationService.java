package com.memokaa.cos.service.skill;

import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.skill.SkillInstance;

/**
 * Skill hesaplamaları.
 */
public class SkillCalculationService {

    /**
     * Gerçek skill değeri.
     */
    public double getSkillValue(
        LivingEntity entity,
        String skillId) {

        if(entity == null) {
            return 0;
        }

        if(entity.skills == null) {
            return 0;
        }

        SkillInstance skill =
            entity.skills.get(skillId);

        if(skill == null) {
            return 0;
        }

        return skill.value;
    }

    /**
     * Buff ve bonuslar dahil gerçek değer.
     */
    public double getEffectiveSkillValue(
        LivingEntity entity,
        String skillId) {

        double value =
            getSkillValue(
                entity,
                skillId);

        /*
         * Gelecekte:
         *
         * Equipment Bonus
         * Potion Bonus
         * Food Bonus
         * Guild Bonus
         * Island Bonus
         * Event Bonus
         */

        return value;
    }

    /**
     * Skill yüzdesi.
     */
    public double getSkillPercent(
        LivingEntity entity,
        String skillId) {

        SkillInstance skill =
            entity.skills.get(skillId);

        if(skill == null) {
            return 0;
        }

        if(skill.maxValue <= 0) {
            return 0;
        }

        return skill.value / skill.maxValue;
    }

    /**
     * Skill maksimumda mı?
     */
    public boolean isMaxSkill(
        LivingEntity entity,
        String skillId) {

        SkillInstance skill =
            entity.skills.get(skillId);

        if(skill == null) {
            return false;
        }

        return skill.value >= skill.maxValue;
    }
}
