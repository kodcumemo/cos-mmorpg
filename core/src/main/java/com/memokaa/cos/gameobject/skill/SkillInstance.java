package com.memokaa.cos.gameobject.skill;

import com.memokaa.cos.enumtype.skill.SkillLockState;

/**
 * Oyuncunun sahip olduğu bir skillin
 * mevcut durumunu temsil eder.
 */
public class SkillInstance {

    // Skill template id
    public String skillTemplateId;

    // Güncel skill değeri
    public double value;

    // Skill davranış durumu
    public SkillLockState lockState =
        SkillLockState.UP;

    // Son gain zamanı
    public long lastGainTime;

    // Toplam kullanım sayısı
    public long usageCount;
}
