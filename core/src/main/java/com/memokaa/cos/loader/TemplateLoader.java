package com.memokaa.cos.loader;

import com.memokaa.cos.enumtype.combat.DamageType;
import com.memokaa.cos.enumtype.item.ItemType;
import com.memokaa.cos.manager.template.TemplateManager;
import com.memokaa.cos.gameobject.combat.ArmorProfileTemplate;
import com.memokaa.cos.gameobject.item.ArmorTemplate;
import com.memokaa.cos.gameobject.item.WeaponTemplate;

public class TemplateLoader {

    private final TemplateManager templateManager;

    public TemplateLoader(
        TemplateManager templateManager) {

        this.templateManager =
            templateManager;
    }

    /**
     * Bütün template'leri yükler.
     */
    public void loadAllTemplates() {


        loadArmorProfiles();

        loadWeapons();

        loadArmors();

        loadSkills();

        loadStatusEffects();

        loadMonsters();

        loadNpcs();
    }

    private void loadArmorProfiles() {

        registerLeatherArmor();

        registerChainArmor();

        registerPlateArmor();
    }

    private void loadWeapons() {

        registerDagger();

        registerShortSword();

        registerKatana();

        registerBow();
    }

    private void loadArmors() {

        registerLeatherChest();

        registerChainChest();

        registerPlateChest();
    }

    private void loadSkills() {

        // TODO
    }

    private void loadStatusEffects() {

        // TODO
    }

    private void loadMonsters() {

        // TODO
    }

    private void loadNpcs() {

        // TODO
    }

    // Sanırım buradan aşağısı geçici olacak
    private void registerLeatherArmor() {

        ArmorProfileTemplate armor =
            new ArmorProfileTemplate();

        armor.id = "ARMOR_LEATHER";

        armor.name = "Leather Armor";

        armor.slashResist = 8;

        armor.pierceResist = 12;

        armor.bluntResist = 5;

        armor.fireResist = 2;

        armor.iceResist = 2;

        armor.poisonResist = 4;

        templateManager.registerTemplate(
            armor);
    }
    private void registerChainArmor() {

        ArmorProfileTemplate armor =
            new ArmorProfileTemplate();

        armor.id = "ARMOR_CHAIN";

        armor.name = "Chain Armor";

        armor.slashResist = 15;

        armor.pierceResist = 10;

        armor.bluntResist = 8;

        templateManager.registerTemplate(
            armor);
    }

    private void registerPlateArmor() {

        ArmorProfileTemplate armor =
            new ArmorProfileTemplate();

        armor.id = "ARMOR_PLATE";

        armor.name = "Plate Armor";

        armor.slashResist = 25;

        armor.pierceResist = 18;

        armor.bluntResist = 20;

        templateManager.registerTemplate(
            armor);
    }
    private void registerDagger() {

        WeaponTemplate weapon =
            new WeaponTemplate();

        weapon.id = "DAGGER";

        weapon.name = "Dagger";

        weapon.itemType =
            ItemType.WEAPON;

        weapon.minDamage = 4;

        weapon.maxDamage = 8;

        weapon.attackSpeed = 1.8;

        weapon.damageType =
            DamageType.PIERCE;

        weapon.range = 1;

        weapon.armorPenetration = 5;

        templateManager.registerTemplate(
            weapon);
    }
    private void registerShortSword() {

        WeaponTemplate weapon =
            new WeaponTemplate();

        weapon.id = "SHORT_SWORD";

        weapon.name = "Short Sword";

        weapon.itemType =
            ItemType.WEAPON;

        weapon.minDamage = 8;

        weapon.maxDamage = 12;

        weapon.attackSpeed = 1.3;

        weapon.damageType =
            DamageType.SLASH;

        weapon.range = 1;

        weapon.armorPenetration = 3;

        templateManager.registerTemplate(
            weapon);
    }

    private void registerKatana() {

        WeaponTemplate weapon =
            new WeaponTemplate();

        weapon.id = "KATANA";

        weapon.name = "Katana";

        weapon.itemType =
            ItemType.WEAPON;

        weapon.minDamage = 10;

        weapon.maxDamage = 15;

        weapon.attackSpeed = 1.2;

        weapon.damageType =
            DamageType.SLASH;

        weapon.range = 1;

        weapon.armorPenetration = 7;

        templateManager.registerTemplate(
            weapon);
    }
    private void registerBow() {

        WeaponTemplate weapon =
            new WeaponTemplate();

        weapon.id = "BOW";

        weapon.name = "Bow";

        weapon.itemType =
            ItemType.WEAPON;

        weapon.minDamage = 7;

        weapon.maxDamage = 11;

        weapon.attackSpeed = 1.4;

        weapon.damageType =
            DamageType.PIERCE;

        weapon.range = 8;

        weapon.armorPenetration = 2;

        templateManager.registerTemplate(
            weapon);
    }

    private void registerLeatherChest() {

        ArmorTemplate armor =
            new ArmorTemplate();

        armor.id = "LEATHER_CHEST";

        armor.name = "Leather Chest";

        armor.itemType =
            ItemType.ARMOR;

        armor.armorProfileTemplateId =
            "ARMOR_LEATHER";

        templateManager.registerTemplate(
            armor);
    }

    private void registerChainChest() {

        ArmorTemplate armor =
            new ArmorTemplate();

        armor.id = "CHAIN_CHEST";

        armor.name = "Chain Chest";

        armor.itemType =
            ItemType.ARMOR;

        armor.armorProfileTemplateId =
            "ARMOR_CHAIN";

        templateManager.registerTemplate(
            armor);
    }

    private void registerPlateChest() {

        ArmorTemplate armor =
            new ArmorTemplate();

        armor.id = "PLATE_CHEST";

        armor.name = "Plate Chest";

        armor.itemType =
            ItemType.ARMOR;

        armor.armorProfileTemplateId =
            "ARMOR_PLATE";

        templateManager.registerTemplate(
            armor);
    }

}
