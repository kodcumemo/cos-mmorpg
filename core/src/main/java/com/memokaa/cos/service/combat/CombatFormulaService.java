package com.memokaa.cos.service.combat;

import com.memokaa.cos.gameobject.combat.AttackContext;
import com.memokaa.cos.gameobject.combat.AttackResult;
import com.memokaa.cos.gameobject.combat.DamageInstance;
import com.memokaa.cos.gameobject.base.LivingEntity;
/**
 * Combat sisteminin ana giriş noktası.
 *
 * Hasar hesaplama,
 * kritik vurma,
 * armor azaltma,
 * effect uygulama
 * işlemlerini yönetir.
 */
public class CombatFormulaService {
    private final CombatStatsBuilder statsBuilder;
    private final DamageCalculationService damageService;
    private final CriticalCalculationService criticalService;
    private final ArmorCalculationService armorService;
    private final StatusEffectService effectService;
    private final SkillGainService skillGainService;

    public CombatFormulaService(
        CombatStatsBuilder statsBuilder,
        DamageCalculationService damageService,
        CriticalCalculationService criticalService,
        ArmorCalculationService armorService,
        StatusEffectService effectService,
        SkillGainService skillGainService) {

        this.statsBuilder = statsBuilder;
        this.damageService = damageService;
        this.criticalService = criticalService;
        this.armorService = armorService;
        this.effectService = effectService;
        this.skillGainService = skillGainService;
    }

    /**
     * Bir saldırıyı gerçekleştirir.
     */
    public AttackResult attack(
        LivingEntity attacker,
        LivingEntity defender,
        AttackContext context)
    {
        attacker.combatStats =
            statsBuilder.build(attacker);

        defender.combatStats =
            statsBuilder.build(defender);

        DamageInstance damage =
            damageService.calculateDamage(
                attacker,
                context);

        boolean critical =
            criticalService.rollCritical(
                attacker);

        if(critical) {

            damage.critical = true;

            damage.rawDamage *=
                attacker.combatStats.criticalMultiplier;
        }

        double finalDamage =
            armorService.applyArmor(
                damage.rawDamage,
                defender,
                damage.damageType);

        defender.health -=
            damage.finalDamage;

        effectService.tryApplyEffects(
            attacker,
            defender,
            damage);

        attacker.lastCombatTime =
            System.currentTimeMillis();

        defender.lastCombatTime =
            System.currentTimeMillis();

        defender.lastAttackerId =
            attacker.id;

        defender.targetId =
            attacker.id;

        defender.warMode = true;

        if(defender.health <= 0) {

            defender.health = 0;

            defender.dead = true;
        }

        checkFleeBehavior(defender);


        // Adım 11
        /*
         * Kullanılan skill için gain kontrolü.
         *
         * Örnek:
         * Swordsmanship
         * Magery
         * Archery
         * skillGainService.tryGainSkill(
        player,
        "SWORDSMANSHIP");
         */
/*
Adım 12

AttackResult

AttackResult result =
        new AttackResult();
result.damage =
        damage;
 */
        AttackResult result =
            new AttackResult();

        result.damage = damage;

        result.critical =
            damage.critical;

        return result;
    }

    private void checkFleeBehavior(
        LivingEntity entity) {

    }
}
