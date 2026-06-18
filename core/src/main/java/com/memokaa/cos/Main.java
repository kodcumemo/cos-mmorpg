package com.memokaa.cos;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.memokaa.cos.gameobject.combat.AttackContext;
import com.memokaa.cos.gameobject.combat.AttackResult;
import com.memokaa.cos.gameobject.player.Player;
import com.memokaa.cos.loader.TemplateLoader;
import com.memokaa.cos.loader.TestDataLoader;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;
import com.memokaa.cos.service.combat.*;

public class Main extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture image;

    @Override
    public void create() {

        batch = new SpriteBatch();

        image = new Texture("libgdx.png");

        runCombatTest();
    }

    private void runCombatTest() {

        System.out.println("=================================");
        System.out.println("      COMBAT SYSTEM TEST");
        System.out.println("=================================");

        TemplateManager templateManager =
            new TemplateManager();

        ItemManager itemManager =
            new ItemManager();

        TemplateLoader templateLoader =
            new TemplateLoader(templateManager);

        templateLoader.loadAllTemplates();

        TestDataLoader loader =
            new TestDataLoader(itemManager);

        Player attacker =
            loader.createWarrior();

        Player defender =
            loader.createDefender();

        CombatStatsBuilder statsBuilder =
            new CombatStatsBuilder(
                templateManager,
                itemManager);

        attacker.combatStats =
            statsBuilder.build(attacker);

        defender.combatStats =
            statsBuilder.build(defender);

        defender.combatStats.dodgeChance = 20;
        defender.combatStats.parryChance = 20;
        defender.combatStats.blockChance = 25;
        defender.combatStats.blockReduction = 0.50;

        DamageCalculationService damageService =
            new DamageCalculationService(
                templateManager,
                itemManager);

        CriticalCalculationService criticalService =
            new CriticalCalculationService();

        ArmorCalculationService armorService =
            new ArmorCalculationService();

        DodgeCalculationService dodgeService =
            new DodgeCalculationService();

        ParryCalculationService parryService =
            new ParryCalculationService();

        BlockCalculationService blockService =
            new BlockCalculationService();

        StatusEffectService effectService =
            new StatusEffectService();

        WeaponEffectService weaponEffectService =
            new WeaponEffectService(
                templateManager,
                itemManager,
                effectService);

        CombatFormulaService combatService =
            new CombatFormulaService(
                damageService,
                criticalService,
                armorService,
                dodgeService,
                parryService,
                blockService,
                weaponEffectService);

        int attackCount = 1;

        while (!defender.dead) {

            AttackResult result =
                combatService.attack(
                    attacker,
                    defender);

            System.out.println();
            System.out.println("Attack #" + attackCount);

            if(result.invalidAttack) {

                System.out.println("Invalid Attack");
                break;
            }

            if(result.dodged) {

                System.out.println(">> DODGED");
            }
            else if(result.parried) {

                System.out.println(">> PARRIED");
            }
            else {

                if(result.blocked) {

                    System.out.println(">> BLOCKED");
                }

                if(result.critical) {

                    System.out.println(">> CRITICAL");
                }

                System.out.printf(
                    "Damage : %.2f%n",
                    result.damage);

                System.out.printf(
                    "HP     : %.2f / %.2f%n",
                    defender.health,
                    defender.maxHealth);

                System.out.println(
                    "Effects: " +
                        defender.activeEffects.size());
            }

            attackCount++;

            try {

                Thread.sleep(700);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("DEFENDER DIED!");
        System.out.println("==============================");
    }

    @Override
    public void render() {

        ScreenUtils.clear(
            0.15f,
            0.15f,
            0.2f,
            1);

        batch.begin();
        batch.draw(image, 140, 210);
        batch.end();
    }

    @Override
    public void dispose() {

        batch.dispose();
        image.dispose();
    }
}
