package com.memokaa.cos.gameobject.skill;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

/**
 * Skill tanımı.
 * Oyundaki bütün skilller Template olarak tutulur.
 */
public class SkillTemplate extends ObjectTemplate {

    /**
     * Combat
     * Crafting
     * Gathering
     * Magic
     * Utility
     */
    public String category;

    /**
     * Maksimum skill değeri.
     * (100 / 120 / 200 vb.)
     */
    /**
     * Başlangıç skill değeri.
     */
    public double defaultValue = 0;

    /**
     * Maksimum skill değeri.
     */
    public double maxValue = 100;

    /**
     * Her başarılı gain'de kaç puan kazanılır.
     */
    public double gainPerSuccess = 0.1;

    /**
     * Gain hızı çarpanı.
     */
    public double gainMultiplier = 1.0;

    /**
     * Pasif skill mi?
     */
    public boolean passive;

    /**
     * Combat skilli mi?
     */
    public boolean combatSkill;

    /**
     * Magic skilli mi?
     */
    public boolean magicSkill;

    /**
     * Gathering skilli mi?
     */
    public boolean gatheringSkill;

    /**
     * Crafting skilli mi?
     */
    public boolean craftingSkill;
}
