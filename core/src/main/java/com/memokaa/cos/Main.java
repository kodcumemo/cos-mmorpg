package com.memokaa.cos;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.memokaa.cos.enumtype.combat.StatusEffectType;
import com.memokaa.cos.gameobject.combat.AttackResult;
import com.memokaa.cos.gameobject.combat.StatusEffectInstance;
import com.memokaa.cos.gameobject.player.Player;
import com.memokaa.cos.loader.TemplateLoader;
import com.memokaa.cos.loader.TestDataLoader;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;
import com.memokaa.cos.service.combat.ArmorCalculationService;
import com.memokaa.cos.service.combat.BlockCalculationService;
import com.memokaa.cos.service.combat.CombatFormulaService;
import com.memokaa.cos.service.combat.CombatStatsBuilder;
import com.memokaa.cos.service.combat.CriticalCalculationService;
import com.memokaa.cos.service.combat.DodgeCalculationService;
import com.memokaa.cos.service.combat.ParryCalculationService;
import com.memokaa.cos.service.combat.StatusEffectService;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;

    TemplateManager templateManager =
        new TemplateManager();
    ItemManager itemManager =
        new ItemManager();



    @Override
    public void create() {

        batch = new SpriteBatch();

        image = new Texture("libgdx.png");

        runCombatTest();
        TemplateLoader templateLoader =
            new TemplateLoader(
                templateManager);

        templateLoader.loadAllTemplates();


    }
    private void runCombatTest() {

        System.out.println("=== COMBAT TEST ===");


        TemplateManager templateManager =
            new TemplateManager();

        ItemManager itemManager =
            new ItemManager();

        TemplateLoader templateLoader =
            new TemplateLoader(
                templateManager);

        templateLoader.loadAllTemplates();

        System.out.println(
            "Templates Loaded");

        TestDataLoader testLoader =
            new TestDataLoader(
                itemManager);

        Player attacker =
            testLoader.createWarrior();

        Player defender =
            testLoader.createDefender();

        StatusEffectService effectService =
            new StatusEffectService();

        StatusEffectInstance poison =
            new StatusEffectInstance();

        poison.effectType =
            StatusEffectType.POISON;

        poison.power = 5;

        poison.active = true;

        poison.startTime =
            System.currentTimeMillis();

        poison.endTime =
            System.currentTimeMillis() + 10000;

        poison.tickInterval =
            1000;

        poison.lastTickTime =
            System.currentTimeMillis();

        effectService.addEffect(
            defender,
            poison);

        System.out.println(
            attacker.name);

        System.out.println(
            defender.name);

        CombatStatsBuilder statsBuilder =
            new CombatStatsBuilder(
                templateManager,
                itemManager);

        attacker.combatStats =
            statsBuilder.build(attacker);

        defender.combatStats =
            statsBuilder.build(defender);

        System.out.println(
            "Attacker Min Damage: "
                + attacker.combatStats.minDamage);

        System.out.println(
            "Attacker Max Damage: "
                + attacker.combatStats.maxDamage);

        System.out.println(
            "Attacker Attack Speed: "
                + attacker.combatStats.attackSpeed);

        System.out.println(
            "Defender Slash Armor: "
                + defender.combatStats.slashArmor);

        System.out.println(
            "Defender Pierce Armor: "
                + defender.combatStats.pierceArmor);

        CriticalCalculationService criticalService =
            new CriticalCalculationService();

        ArmorCalculationService armorService =
            new ArmorCalculationService();
        DodgeCalculationService dodgeService = new DodgeCalculationService();
        ParryCalculationService parryService = new ParryCalculationService();
        BlockCalculationService blockService = new BlockCalculationService();


        CombatFormulaService combatService =
            new CombatFormulaService(
                criticalService,
                armorService,
                dodgeService,
                parryService,
                blockService);
        defender.combatStats.dodgeChance = 20;

        defender.combatStats.parryChance = 30;

        defender.combatStats.blockChance = 40;

        defender.combatStats.blockReduction = 0.50;


        System.out.println(
            "===== POISON TEST =====");

        for(int i = 0; i < 15; i++) {

            effectService.updateEffects(
                defender,
                System.currentTimeMillis());

            System.out.println(
                "HP: " + defender.health);

            try {

                Thread.sleep(1000);

            } catch(Exception e) {

                e.printStackTrace();
            }
        }
      /*  System.out.println(
            "===== DODGE TEST =====");

        for(int i = 1; i <= 50; i++) {

            //defender.health = defender.maxHealth;

            AttackResult result =
                combatService.attack(
                    attacker,
                    defender);

            if(defender.dead) {

                System.out.println(
                    "Defender died.");

                break;
            }

            if(result.invalidAttack) {

                System.out.println(
                    "Target already dead.");

                break;
            }

            System.out.println(
                "Attack #" + i);

            System.out.println(
                "Dodged: "
                    + result.dodged);

            System.out.println(
                "Parried: "
                    + result.parried);

            System.out.println(
                "Blocked: "
                    + result.blocked);

            System.out.println(
                "Damage: "
                    + result.damage);

            System.out.println(
                "HP: "
                    + defender.health);


            System.out.println(
                "----------------");
        }*/
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
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
