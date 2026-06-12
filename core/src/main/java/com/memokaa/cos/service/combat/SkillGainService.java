package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.player.Player;
import com.memokaa.cos.gameobject.skill.SkillInstance;

/**
 * Skill gain işlemlerini yönetir.
 */
public class SkillGainService {
    /**
     * Skill artışını denemeye çalışır.
     */
    public void tryGainSkill(
        Player player,
        String skillId) {

    }/**
     * Oyuncunun toplam skill puanını hesaplar.
     */
    public double calculateTotalSkill(
        Player player) {

        return 0;
    }

    /**
     * Azaltılabilecek bir skill bulur.
     */
    public SkillInstance findDownSkill(
        Player player) {

        return null;
    }
    /**
     * Skill değerini azaltır.
     */
    public void decreaseSkill(
        SkillInstance skill,
        double amount) {

    }

    /**
     * Skill değerini artırır.
     */
    public void increaseSkill(
        SkillInstance skill,
        double amount) {

    }


}
