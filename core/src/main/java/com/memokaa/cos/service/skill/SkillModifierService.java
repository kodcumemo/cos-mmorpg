package com.memokaa.cos.service.skill;

import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.skill.SkillInstance;

public class SkillModifierService {

    /**
     * Skill değerini getirir.
     */
    public double getSkillValue(
        LivingEntity entity,
        String skillId) {

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
     * Skill bonusu.
     */
    public double getModifier(
        LivingEntity entity,
        String skillId,
        double multiplier) {

        return getSkillValue(
            entity,
            skillId)
            * multiplier;
    }

    /**
     * Skill belli değerin üzerinde mi?
     */
    public boolean hasRequiredSkill(
        LivingEntity entity,
        String skillId,
        double requiredValue) {

        return getSkillValue(
            entity,
            skillId)
            >= requiredValue;
    }

    /**
     * Skill yüzde bonusu.
     */
    public double getPercentModifier(
        LivingEntity entity,
        String skillId) {

        return getSkillValue(
            entity,
            skillId)
            / 100.0;
    }

    /**
     * Skill oranı.
     */
    public double getNormalizedValue(
        LivingEntity entity,
        String skillId,
        double maxValue) {

        if(maxValue <= 0) {

            return 0;
        }

        return getSkillValue(
            entity,
            skillId)
            / maxValue;
    }
}
