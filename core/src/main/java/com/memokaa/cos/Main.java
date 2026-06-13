package com.memokaa.cos;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.memokaa.cos.gameobject.combat.AttackResult;
import com.memokaa.cos.gameobject.player.Player;
import com.memokaa.cos.loader.TemplateLoader;
import com.memokaa.cos.loader.TestDataLoader;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;
import com.memokaa.cos.service.combat.ArmorCalculationService;
import com.memokaa.cos.service.combat.CombatFormulaService;
import com.memokaa.cos.service.combat.CombatStatsBuilder;
import com.memokaa.cos.service.combat.CriticalCalculationService;

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

        CombatFormulaService combatService =
            new CombatFormulaService(
                criticalService,
                armorService);

        AttackResult result =
            combatService.attack(
                attacker,
                defender);

        System.out.println(
            "Damage: "
                + result.damage);

        System.out.println(
            "Critical: "
                + result.critical);

        System.out.println(
            "Blocked: "
                + result.blockedDamage);

        System.out.println(
            "Defender HP: "
                + defender.health);
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
