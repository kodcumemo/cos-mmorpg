package com.memokaa.cos.manager.skill;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.gameobject.skill.SkillInstance;

/**
 * Oyuncuların sahip olduğu skillleri yönetir.
 */
public class SkillManager {

    /**
     * SkillId -> SkillInstance
     */
    private final Map<String, SkillInstance> skills =
        new HashMap<>();

    /**
     * Skill ekle.
     */
    public void addSkill(
        SkillInstance skill) {

        if(skill == null) {
            return;
        }

        skills.put(
            skill.skillTemplateId,
            skill);
    }

    /**
     * Skill getir.
     */
    public SkillInstance getSkill(
        String skillId) {

        return skills.get(skillId);
    }

    /**
     * Skill sil.
     */
    public void removeSkill(
        String skillId) {

        skills.remove(skillId);
    }

    /**
     * Skill var mı?
     */
    public boolean contains(
        String skillId) {

        return skills.containsKey(skillId);
    }

    /**
     * Bütün skilller.
     */
    public Map<String, SkillInstance> getSkills() {

        return skills;
    }

    /**
     * Temizle.
     */
    public void clear() {

        skills.clear();
    }
}
