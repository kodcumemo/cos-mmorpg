package com.memokaa.cos.loader;

import com.memokaa.cos.gameobject.skill.SkillTemplate;
import com.memokaa.cos.manager.template.TemplateManager;

/**
 * Oyundaki bütün skill template'lerini yükler.
 */
public class SkillLoader {

    private final TemplateManager templateManager;

    public SkillLoader(
        TemplateManager templateManager) {

        this.templateManager =
            templateManager;
    }

    /**
     * Bütün skillleri yükle.
     */
    public void loadSkills() {

        // Combat
        registerSwordsmanship();
        registerWrestling();
        registerArchery();
        registerMaceFighting();
        registerFencing();
        registerTactics();

        // Magic
        registerMagery();
        registerMeditation();

        // Gathering
        registerMining();
        registerFishing();
        registerLumberjacking();
        registerFarming();

        // Crafting
        registerBlacksmithing();
        registerTailoring();
        registerCarpentry();

        // Utility
        registerHealing();
        registerStealth();
        registerLockpicking();
    }

    private void registerSkill(
        String id,
        String name,
        String category,
        boolean combat,
        boolean magic,
        boolean gathering,
        boolean crafting) {

        SkillTemplate skill =
            new SkillTemplate();

        skill.id = id;
        skill.name = name;
        skill.category = category;

        skill.maxValue = 100.0;
        skill.defaultValue = 0.0;
        skill.gainMultiplier = 1.0;

        skill.combatSkill = combat;
        skill.magicSkill = magic;
        skill.gatheringSkill = gathering;
        skill.craftingSkill = crafting;

        templateManager.registerTemplate(skill);
    }

    //---------------- COMBAT ----------------//

    private void registerSwordsmanship() {
        registerSkill("SWORDSMANSHIP", "Swordsmanship",
            "Combat", true,false,false,false);
    }

    private void registerWrestling() {
        registerSkill("WRESTLING", "Wrestling",
            "Combat", true,false,false,false);
    }

    private void registerArchery() {
        registerSkill("ARCHERY", "Archery",
            "Combat", true,false,false,false);
    }

    private void registerMaceFighting() {
        registerSkill("MACE_FIGHTING", "Mace Fighting",
            "Combat", true,false,false,false);
    }

    private void registerFencing() {
        registerSkill("FENCING", "Fencing",
            "Combat", true,false,false,false);
    }

    private void registerTactics() {
        registerSkill("TACTICS", "Tactics",
            "Combat", true,false,false,false);
    }

    //---------------- MAGIC ----------------//

    private void registerMagery() {
        registerSkill("MAGERY", "Magery",
            "Magic", false,true,false,false);
    }

    private void registerMeditation() {
        registerSkill("MEDITATION", "Meditation",
            "Magic", false,true,false,false);
    }

    //---------------- GATHERING ----------------//

    private void registerMining() {
        registerSkill("MINING", "Mining",
            "Gathering", false,false,true,false);
    }

    private void registerFishing() {
        registerSkill("FISHING", "Fishing",
            "Gathering", false,false,true,false);
    }

    private void registerLumberjacking() {
        registerSkill("LUMBERJACKING", "Lumberjacking",
            "Gathering", false,false,true,false);
    }

    private void registerFarming() {
        registerSkill("FARMING", "Farming",
            "Gathering", false,false,true,false);
    }

    //---------------- CRAFTING ----------------//

    private void registerBlacksmithing() {
        registerSkill("BLACKSMITHING", "Blacksmithing",
            "Crafting", false,false,false,true);
    }

    private void registerTailoring() {
        registerSkill("TAILORING", "Tailoring",
            "Crafting", false,false,false,true);
    }

    private void registerCarpentry() {
        registerSkill("CARPENTRY", "Carpentry",
            "Crafting", false,false,false,true);
    }

    //---------------- UTILITY ----------------//

    private void registerHealing() {
        registerSkill("HEALING", "Healing",
            "Utility", false,false,false,false);
    }

    private void registerStealth() {
        registerSkill("STEALTH", "Stealth",
            "Utility", false,false,false,false);
    }

    private void registerLockpicking() {
        registerSkill("LOCKPICKING", "Lockpicking",
            "Utility", false,false,false,false);
    }
}
