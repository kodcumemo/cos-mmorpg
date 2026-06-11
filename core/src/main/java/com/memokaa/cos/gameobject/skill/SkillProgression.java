package com.memokaa.cos.gameobject.skill;

/**
 * Skill gelişim ayarları
 */
public class SkillProgression {

    // Skill
    public String skillId;

    // Mevcut değer
    public double currentValue;

    // Normal üst sınır
    public double normalCap;

    // Scroll ile açılan üst sınır
    public double overCap;

    // Son gelişim zamanı
    public long lastGainTime;

    // Son başarılı kullanım
    public long lastSuccessfulUseTime;
}
