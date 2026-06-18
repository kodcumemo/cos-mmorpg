package com.memokaa.cos.gameobject.skill;

/**
 * Oyuncunun sahip olduğu gerçek skill.
 */
public class SkillInstance {

    /**
     * Skill Template ID.
     */
    public String skillTemplateId;

    /**
     * Mevcut skill değeri.
     */
    public double value;

    /**
     * Skill için kazanılan deneyim.
     */
    public double experience;

    /**
     * Maksimum ulaşabileceği değer.
     * (Power Scroll vb. sistemler için ayrı tutuluyor.)
     */
    public double maxValue;

    /**
     * Skill gain açık mı?
     */
    public boolean gainEnabled = true;

    /**
     * Skill kilitli mi?
     */
    public boolean locked;

    /**
     * Son gain zamanı.
     * Anti macro sistemi için kullanılacak.
     */
    public long lastGainTime;
}
