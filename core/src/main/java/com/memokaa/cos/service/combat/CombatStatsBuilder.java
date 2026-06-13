package com.memokaa.cos.service.combat;

import com.memokaa.cos.enumtype.item.EquipmentSlot;
import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.combat.ArmorProfileTemplate;
import com.memokaa.cos.gameobject.combat.CombatStats;
import com.memokaa.cos.gameobject.item.ArmorTemplate;
import com.memokaa.cos.gameobject.item.ItemInstance;
import com.memokaa.cos.gameobject.item.WeaponTemplate;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;

/**
 * Entity'nin combat değerlerini hesaplar.
 */
public class CombatStatsBuilder {

    private final TemplateManager templateManager;
    private final ItemManager itemManager;

    public CombatStatsBuilder(
        TemplateManager templateManager,
        ItemManager itemManager) {

        this.templateManager =
            templateManager;

        this.itemManager =
            itemManager;
    }
    // Ana method
    public CombatStats build(
        LivingEntity entity) {


        CombatStats stats =
            new CombatStats();

        applyBaseStats(entity, stats);

        applySkills(entity, stats);

        applyEquipment(entity, stats);

        applyProperties(entity, stats);

        normalize(stats);

        return stats;
    }
    private void normalize(
        CombatStats stats) {

        stats.minDamage =
            Math.max(1,
                stats.minDamage);

        stats.maxDamage =
            Math.max(
                stats.minDamage,
                stats.maxDamage);

        stats.attackSpeed =
            Math.max(
                0.2,
                stats.attackSpeed);

        stats.moveSpeed =
            Math.max(
                0.1,
                stats.moveSpeed);

        stats.hitChance =
            Math.min(
                100,
                stats.hitChance);

        stats.criticalChance =
            Math.min(
                100,
                stats.criticalChance);

        stats.criticalMultiplier =
            Math.max(
                1.5,
                stats.criticalMultiplier);
    }
    // Base stats hesabı
    private void applyBaseStats(
        LivingEntity entity,
        CombatStats stats) {

        stats.minDamage +=
            entity.strength * 0.10;

        stats.maxDamage +=
            entity.strength * 0.15;

        stats.attackSpeed +=
            entity.dexterity * 0.01;

        stats.criticalChance +=
            entity.dexterity * 0.05;

        stats.dodgeChance +=
            entity.dexterity * 0.03;

        stats.castSpeed +=
            entity.intelligence * 0.02;

        stats.magicArmor +=
            entity.intelligence * 0.10;

        stats.hitChance = 75;

        stats.criticalMultiplier = 1.5;

        stats.moveSpeed = 1.0;
    }
    // Skill hesabı
    private void applySkills(
        LivingEntity entity,
        CombatStats stats) {

        double sword =
            entity.getSkillValue(
                "SWORDSMANSHIP");

        double tactics =
            entity.getSkillValue(
                "TACTICS");

        double parry =
            entity.getSkillValue(
                "PARRY");

        double magery =
            entity.getSkillValue(
                "MAGERY");

        stats.minDamage +=
            sword * 0.10;

        stats.maxDamage +=
            sword * 0.15;

        stats.criticalChance +=
            sword * 0.03;

        stats.minDamage +=
            tactics * 0.05;

        stats.maxDamage +=
            tactics * 0.08;

        stats.slashArmor +=
            parry * 0.10;

        stats.pierceArmor +=
            parry * 0.10;

        stats.bluntArmor +=
            parry * 0.10;

        stats.castSpeed +=
            magery * 0.03;
    }
    // Equipment hesabı
    private void applyEquipment(
        LivingEntity entity,
        CombatStats stats) {

        if(entity.equipment == null) {
            return;
        }

        // =========================
        // MAIN HAND
        // =========================

        String weaponItemId =
            entity.equipment
                .equippedItems
                .get(
                    EquipmentSlot.MAIN_HAND);

        if(weaponItemId != null) {

            ItemInstance item =
                itemManager.getItem(
                    weaponItemId);

            if(item != null) {

                WeaponTemplate weapon =
                    templateManager.getTemplate(
                        item.itemTemplateId,
                        WeaponTemplate.class);

                if(weapon != null) {

                    stats.minDamage +=
                        weapon.minDamage;

                    stats.maxDamage +=
                        weapon.maxDamage;

                    stats.attackSpeed =
                        weapon.attackSpeed;

                    stats.armorPenetration +=
                        weapon.armorPenetration;
                }
            }
        }

        // =========================
        // CHEST ARMOR
        // =========================

        String chestItemId =
            entity.equipment
                .equippedItems
                .get(
                    EquipmentSlot.CHEST);

        if(chestItemId != null) {

            ItemInstance item =
                itemManager.getItem(
                    chestItemId);

            if(item != null) {

                ArmorTemplate armor =
                    templateManager.getTemplate(
                        item.itemTemplateId,
                        ArmorTemplate.class);

                if(armor != null) {

                    ArmorProfileTemplate profile =
                        templateManager.getTemplate(
                            armor.armorProfileTemplateId,
                            ArmorProfileTemplate.class);

                    if(profile != null) {

                        stats.slashArmor +=
                            profile.slashResist;

                        stats.pierceArmor +=
                            profile.pierceResist;

                        stats.bluntArmor +=
                            profile.bluntResist;

                        stats.fireResist +=
                            profile.fireResist;

                        stats.iceResist +=
                            profile.iceResist;

                        stats.poisonResist +=
                            profile.poisonResist;

                        stats.holyResist +=
                            profile.holyResist;

                        stats.shadowResist +=
                            profile.shadowResist;
                    }
                }
            }
        }
    }

    // Property hesabı
    private void applyProperties(
        LivingEntity entity,
        CombatStats stats) {

        /*
         * TODO
         *
         * Damage Bonus
         * Critical Bonus
         * Attack Speed Bonus
         * Armor Bonus
         * Bleed Chance
         * Poison Chance
         * Fire Damage
         */
    }
}
