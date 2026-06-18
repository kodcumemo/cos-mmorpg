package com.memokaa.cos.service.skill;

import com.memokaa.cos.gameobject.base.LivingEntity;

/**
 * Skill gereksinim kontrolleri.
 */
public class SkillRequirementService {

    private final SkillCalculationService
        calculationService;

    public SkillRequirementService(
        SkillCalculationService calculationService) {

        this.calculationService =
            calculationService;
    }

    /**
     * Skill var mı?
     */
    public boolean hasSkill(
        LivingEntity entity,
        String skillId) {

        if(entity == null) {
            return false;
        }

        if(entity.skills == null) {
            return false;
        }

        return entity.skills.containsKey(
            skillId);
    }

    /**
     * İstenen skill değerine sahip mi?
     */
    public boolean hasRequiredValue(
        LivingEntity entity,
        String skillId,
        double requiredValue) {

        return calculationService
            .getEffectiveSkillValue(
                entity,
                skillId)
            >= requiredValue;
    }

    /**
     * Skill aralıkta mı?
     */
    public boolean isBetween(
        LivingEntity entity,
        String skillId,
        double min,
        double max) {

        double value =
            calculationService
                .getEffectiveSkillValue(
                    entity,
                    skillId);

        return value >= min
            && value <= max;
    }

    /**
     * Skill belirli değerin altında mı?
     */
    public boolean isBelow(
        LivingEntity entity,
        String skillId,
        double value) {

        return calculationService
            .getEffectiveSkillValue(
                entity,
                skillId)
            < value;
    }

    /**
     * Skill belirli değerin üstünde mi?
     */
    public boolean isAbove(
        LivingEntity entity,
        String skillId,
        double value) {

        return calculationService
            .getEffectiveSkillValue(
                entity,
                skillId)
            > value;
    }
}
