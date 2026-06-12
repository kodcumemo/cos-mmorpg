package com.memokaa.cos.gameobject.skill;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.enumtype.skill.SkillCategory;
import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class SkillTemplate extends ObjectTemplate {

    // Skill kategorisi
    public SkillCategory category;

    // Combat hesaplarında kullanılır mı
    public boolean affectsCombat;

    // Varsayılan skill cap
    public double defaultCap = 100;

    // Skillin verdiği bonuslar
    public List<String> skillPropertyIds =
        new ArrayList<>();
}
