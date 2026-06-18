package com.memokaa.cos.service.combat;

import java.util.concurrent.ThreadLocalRandom;

import com.memokaa.cos.enumtype.combat.DamageType;
import com.memokaa.cos.enumtype.item.EquipmentSlot;
import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.combat.AttackContext;
import com.memokaa.cos.gameobject.combat.DamageInstance;
import com.memokaa.cos.gameobject.item.ItemInstance;
import com.memokaa.cos.gameobject.item.WeaponTemplate;
import com.memokaa.cos.gameobject.skill.SkillInstance;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;

public class DamageCalculationService {

    private final TemplateManager templateManager;

    private final ItemManager itemManager;

    public DamageCalculationService(
        TemplateManager templateManager,
        ItemManager itemManager) {

        this.templateManager =
            templateManager;

        this.itemManager =
            itemManager;
    }

    /**
     * Combat sisteminin hasar giriş noktası.
     */
    public DamageInstance calculateDamage(
        LivingEntity attacker,
        AttackContext context) {

        if(hasWeapon(attacker)) {

            return calculateWeaponDamage(
                attacker,
                context);
        }

        return calculateUnarmedDamage(
            attacker,
            context);
    }

    /**
     * Silah ile saldırı.
     */
    private DamageInstance calculateWeaponDamage(
        LivingEntity attacker,
        AttackContext context) {

        String itemId =
            attacker.equipment
                .equippedItems
                .get(EquipmentSlot.MAIN_HAND);

        ItemInstance item =
            itemManager.getItem(itemId);

        if(item == null) {

            return calculateUnarmedDamage(
                attacker,
                context);
        }

        WeaponTemplate weapon =
            templateManager.getTemplate(
                item.itemTemplateId,
                WeaponTemplate.class);

        if(weapon == null) {

            return calculateUnarmedDamage(
                attacker,
                context);
        }

        double damage =
            ThreadLocalRandom.current()
                .nextDouble(
                    weapon.minDamage,
                    weapon.maxDamage);

        damage +=
            applyStrengthBonus(
                attacker);

        DamageInstance instance =
            new DamageInstance();

        instance.rawDamage =
            damage;

        instance.damageType =
            DamageType.BLUNT;

        instance.armorPenetration =
            weapon.armorPenetration;

        instance.weaponTemplateId =
            weapon.id;

        return instance;
    }

    /**
     * Yumruk saldırısı.
     */
    private double getSkillValue(
        LivingEntity entity,
        String skillId) {

        SkillInstance skill =
            entity.skills.get(skillId);

        if(skill == null) {

            return 0;
        }

        return skill.value;
    }
    private DamageInstance calculateUnarmedDamage(
        LivingEntity attacker,
        AttackContext context) {

        double wrestling =
            getSkillValue(
                attacker,
                "WRESTLING");

        double minDamage =
            2.0 + wrestling / 16.6;

        double maxDamage =
            4.0 + wrestling / 16.6;

        double damage =
            ThreadLocalRandom.current()
                .nextDouble(
                    minDamage,
                    maxDamage);

        damage +=
            applyStrengthBonus(
                attacker);

        DamageInstance instance =
            new DamageInstance();

        instance.rawDamage =
            damage;

        instance.damageType =
            context.damageType = null;

        instance.weaponTemplateId =
            null;

        instance.armorPenetration =
            0;

        return instance;
    }

    /**
     * Strength bonusu.
     */
    private double applyStrengthBonus(
        LivingEntity attacker) {

        return attacker.strength * 0.10;
    }

    /**
     * Wrestling skill değeri.
     */


    /**
     * Main hand dolu mu?
     */
    private boolean hasWeapon(
        LivingEntity attacker) {

        if(attacker.equipment == null) {

            return false;
        }

        String itemId =
            attacker.equipment
                .equippedItems
                .get(EquipmentSlot.MAIN_HAND);

        if(itemId == null) {

            return false;
        }

        ItemInstance item =
            itemManager.getItem(itemId);

        if(item == null) {

            return false;
        }

        return templateManager.getTemplate(
            item.itemTemplateId,
            WeaponTemplate.class) != null;
    }
}
