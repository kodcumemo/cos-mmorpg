package com.memokaa.cos.service.skill;

import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.skill.SkillInstance;
import com.memokaa.cos.gameobject.skill.SkillTemplate;
import com.memokaa.cos.manager.template.TemplateManager;

import java.util.concurrent.ThreadLocalRandom;

public class SkillGainService {

    private final TemplateManager templateManager;


    public SkillGainService(
        TemplateManager templateManager) {

        this.templateManager =
            templateManager;
    }

    /**
     * Skill gain denemesi.
     */
    public void tryGainSkill(
        LivingEntity entity,
        String skillId) {

        SkillInstance skill =
            entity.skills.get(skillId);

        if(skill == null) {

            return;
        }

        SkillTemplate template =
            templateManager.getTemplate(
                skill.skillTemplateId,
                SkillTemplate.class);

        if(template == null) {

            return;
        }

        if(skill.value >= template.maxValue) {

            return;
        }

        double chance =
            calculateGainChance(
                skill.value,
                template.maxValue);

        if(ThreadLocalRandom.current().nextDouble() <= chance) {

            skill.value += template.gainPerSuccess;

            if(skill.value >
                template.maxValue) {

                skill.value =
                    template.maxValue;
            }
        }
    }

    /**
     * Skill arttıkça gain zorlaşır.
     */
    private double calculateGainChance(
        double current,
        double max) {

        double progress =
            current / max;

        double chance =
            0.50 * (1.0 - progress);

        if(chance < 0.01) {

            chance = 0.01;
        }

        return chance;
    }
}
