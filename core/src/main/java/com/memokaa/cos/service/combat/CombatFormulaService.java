package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.combat.AttackContext;
import com.memokaa.cos.gameobject.combat.AttackResult;
import com.memokaa.cos.gameobject.combat.DamageInstance;

public class CombatFormulaService {

    private final DamageCalculationService damageService;

    private final CriticalCalculationService criticalService;

    private final ArmorCalculationService armorService;

    private final DodgeCalculationService dodgeService;

    private final ParryCalculationService parryService;

    private final BlockCalculationService blockService;

    private final WeaponEffectService weaponEffectService;

    public CombatFormulaService(
        DamageCalculationService damageService,
        CriticalCalculationService criticalService,
        ArmorCalculationService armorService,
        DodgeCalculationService dodgeService,
        ParryCalculationService parryService,
        BlockCalculationService blockService,
        WeaponEffectService weaponEffectService) {

        this.damageService =
            damageService;

        this.criticalService =
            criticalService;

        this.armorService =
            armorService;

        this.dodgeService =
            dodgeService;

        this.parryService =
            parryService;

        this.blockService =
            blockService;

        this.weaponEffectService =
            weaponEffectService;
    }

    /**
     * Combat sisteminin ana giriş noktası.
     */
    public AttackResult attack(
        LivingEntity attacker,
        LivingEntity defender) {

        AttackResult result =
            new AttackResult();

        if(attacker.dead) {

            result.invalidAttack = true;

            return result;
        }

        if(defender.dead) {

            result.invalidAttack = true;

            return result;
        }

        AttackContext context =
            new AttackContext();

        DamageInstance damage =
            damageService.calculateDamage(
                attacker,
                context);

        // Dodge
        if(dodgeService.isDodged(defender)) {

            result.dodged = true;

            result.hit = false;

            return result;
        }

        // Parry
        if(parryService.isParried(defender)) {

            result.parried = true;

            result.hit = false;

            return result;
        }

        // Block
        if(blockService.isBlocked(defender)) {

            damage.rawDamage *=
                (1 -
                    defender.combatStats.blockReduction);

            result.blocked = true;
        }

        // Critical
        boolean critical =
            criticalService.isCritical(
                attacker);

        if(critical) {

            damage.rawDamage *=
                attacker.combatStats
                    .criticalMultiplier;
        }

        result.critical =
            critical;

        // Armor
        double finalDamage =
            armorService.calculateDamageAfterArmor(
                damage.rawDamage,
                defender.combatStats,
                damage.damageType,
                damage.armorPenetration);

        result.blockedDamage =
            damage.rawDamage - finalDamage;

        result.damage =
            finalDamage;

        // HP düş
        defender.health -=
            finalDamage;

        if(defender.health < 0) {

            defender.health = 0;
        }

        // Weapon proc (Poison, Bleed, Burn...)
        weaponEffectService.applyWeaponEffects(
            attacker,
            defender);

        // Death
        if(defender.health <= 0) {

            defender.health = 0;

            defender.dead = true;

            result.targetDied = true;
        }

        result.hit = true;

        return result;
    }
}




//  - - - - - - ESKİ SÜRÜM - - - - - -
//package com.memokaa.cos.service.combat;
//
//import com.memokaa.cos.gameobject.base.LivingEntity;
//import com.memokaa.cos.gameobject.combat.AttackContext;
//import com.memokaa.cos.gameobject.combat.AttackResult;
//import com.memokaa.cos.gameobject.combat.DamageInstance;
//import com.memokaa.cos.manager.item.ItemManager;
//import com.memokaa.cos.manager.template.TemplateManager;
//
//public class CombatFormulaService {
//
//    private final CriticalCalculationService criticalService;
//
//    private final ArmorCalculationService armorService;
//
//    private final DodgeCalculationService
//        dodgeService;
//
//    private final ParryCalculationService
//        parryService;
//
//    private final BlockCalculationService
//        blockService;
//
//    private final TemplateManager templateManager;
//
//    private final ItemManager itemManager;
//
//    private final StatusEffectService effectService;
//    private final WeaponEffectService weaponEffectService;
//    private final DamageCalculationService damageService;
//    public CombatFormulaService(
//        CriticalCalculationService criticalService,
//        ArmorCalculationService armorService,
//        DodgeCalculationService dodgeService,
//        ParryCalculationService parryService,
//        BlockCalculationService blockService,
//        TemplateManager templateManager,
//        ItemManager itemManager,
//        StatusEffectService effectService,
//        WeaponEffectService weaponEffectService,
//        DamageCalculationService damageService
//    ){
//
//        this.criticalService =
//            criticalService;
//
//        this.armorService =
//            armorService;
//
//
//        this.dodgeService = dodgeService;
//        this.parryService = parryService;
//        this.blockService = blockService;
//        this.templateManager = templateManager;
//        this.itemManager = itemManager;
//        this.effectService = effectService;
//        this.weaponEffectService = weaponEffectService;
//        this.damageService = damageService;
//    }
//
//    public AttackResult attack(
//        LivingEntity attacker,
//        LivingEntity defender) {
//
//        AttackResult result =
//            new AttackResult();
//
//        AttackContext context =
//            new AttackContext();
//
//        context.damageType = null;
//
//        if(attacker.dead) {
//
//            result =
//                new AttackResult();
//
//            result.invalidAttack = true;
//
//            return result;
//        }
//
//        if(defender.dead) {
//
//            result =
//                new AttackResult();
//
//            result.invalidAttack = true;
//
//            return result;
//        }
//
//        DamageInstance damage =
//            damageService.calculateDamage(
//                attacker,
//                context);
//
//        // Dodge
//        if(dodgeService.isDodged(defender)) {
//
//            result.dodged = true;
//
//            result.hit = false;
//
//            return result;
//        }
//        // parryleme
//        if(parryService.isParried(defender)) {
//
//            result.parried = true;
//
//            result.hit = false;
//
//            return result;
//        }
//
//
//
//        if(blockService.isBlocked(defender)) {
//
//            damage.rawDamage *= (1 - defender.combatStats.blockReduction);
//            result.blocked = true;
//        }
//
//        boolean critical =
//            criticalService.isCritical(
//                attacker);
//
//        if(critical) {
//
//            damage.rawDamage *=
//                attacker.combatStats
//                    .criticalMultiplier;
//        }
//
//        result.critical =
//            critical;
//
//        weaponEffectService
//            .applyWeaponEffects(
//                attacker,
//                defender);
//
//        double finalDamage =
//            armorService
//                .calculateDamageAfterArmor(
//                    damage.rawDamage,
//                    defender.combatStats.slashArmor,
//                    damage.armorPenetration);
//
//        result.blockedDamage =damage.rawDamage - finalDamage;
//
//        result.damage =
//            finalDamage;
//
//        defender.health -=
//            finalDamage;
//
//        if(defender.health < 0) {
//
//            defender.health = 0;
//        }
//
//        if(defender.health <= 0) {
//
//            defender.dead = true;
//
//            result.targetDied = true;
//        }
//        weaponEffectService
//            .applyWeaponEffects(
//                attacker,
//                defender);
//
//        System.out.println(
//            "Active Effects: "
//                + defender.activeEffects.size());
//
//        return result;
//    }
//}



// - - - - -ESKİ SÜRÜM - - - - -
//package com.memokaa.cos.service.combat;
//
//import com.memokaa.cos.gameobject.combat.AttackContext;
//import com.memokaa.cos.gameobject.combat.AttackResult;
//import com.memokaa.cos.gameobject.combat.DamageInstance;
//import com.memokaa.cos.gameobject.base.LivingEntity;
///**
// * Combat sisteminin ana giriş noktası.
// *
// * Hasar hesaplama,
// * kritik vurma,
// * armor azaltma,
// * effect uygulama
// * işlemlerini yönetir.
// */
//public class CombatFormulaService {
//    private final CombatStatsBuilder statsBuilder;
//    private final DamageCalculationService damageService;
//    private final CriticalCalculationService criticalService;
//    private final ArmorCalculationService armorService;
//    private final StatusEffectService effectService;
//    private final SkillGainService skillGainService;
//
//    public CombatFormulaService(
//        CombatStatsBuilder statsBuilder,
//        DamageCalculationService damageService,
//        CriticalCalculationService criticalService,
//        ArmorCalculationService armorService,
//        StatusEffectService effectService,
//        SkillGainService skillGainService) {
//
//        this.statsBuilder = statsBuilder;
//        this.damageService = damageService;
//        this.criticalService = criticalService;
//        this.armorService = armorService;
//        this.effectService = effectService;
//        this.skillGainService = skillGainService;
//    }
//
//    /**
//     * Bir saldırıyı gerçekleştirir.
//     */
//    public AttackResult attack(
//        LivingEntity attacker,
//        LivingEntity defender,
//        AttackContext context)
//    {
//        attacker.combatStats =
//            statsBuilder.build(attacker);
//
//        defender.combatStats =
//            statsBuilder.build(defender);
//
//        DamageInstance damage =
//            damageService.calculateDamage(
//                attacker,
//                context);
//
//        boolean critical =
//            criticalService.rollCritical(attacker);
//
//        if (critical) {
//
//            damage.critical = true;
//
//            damage.rawDamage =
//                criticalService.applyCriticalDamage(
//                    damage.rawDamage,
//                    attacker);
//        }
//
//
//        defender.health -=
//            damage.finalDamage;
//
//        effectService.tryApplyEffects(
//            attacker,
//            defender,
//            damage);
//
//        attacker.lastCombatTime =
//            System.currentTimeMillis();
//
//        defender.lastCombatTime =
//            System.currentTimeMillis();
//
//        defender.lastAttackerId =
//            attacker.id;
//
//        defender.targetId =
//            attacker.id;
//
//        defender.warMode = true;
//
//        if(defender.health <= 0) {
//
//            defender.health = 0;
//
//            defender.dead = true;
//        }
//
//        checkFleeBehavior(defender);
//
//
//        // Adım 11
//        /*
//         * Kullanılan skill için gain kontrolü.
//         *
//         * Örnek:
//         * Swordsmanship
//         * Magery
//         * Archery
//         * skillGainService.tryGainSkill(
//        player,
//        "SWORDSMANSHIP");
//         */
///*
//Adım 12
//
//AttackResult
//
//AttackResult result =
//        new AttackResult();
//result.damage =
//        damage;
// */
//        AttackResult result =
//            new AttackResult();
//
//        result.damage = damage;
//
//        result.critical =
//            damage.critical;
//
//        return result;
//    }
//
//    private void checkFleeBehavior(
//        LivingEntity entity) {
//
//    }
//}
