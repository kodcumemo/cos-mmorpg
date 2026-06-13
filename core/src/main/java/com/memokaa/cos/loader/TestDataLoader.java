package com.memokaa.cos.loader;

import com.memokaa.cos.enumtype.item.EquipmentSlot;
import com.memokaa.cos.gameobject.player.Player;
import com.memokaa.cos.gameobject.equipment.EquipmentContainer;
import com.memokaa.cos.gameobject.item.ItemInstance;
import com.memokaa.cos.gameobject.skill.SkillInstance;
import com.memokaa.cos.manager.item.ItemManager;

public class TestDataLoader {

    private final ItemManager itemManager;

    public TestDataLoader(
        ItemManager itemManager) {

        this.itemManager =
            itemManager;



    }

    public Player createWarrior() {

        Player player =
            new Player();

        player.id = "PLAYER_A";

        player.name = "Warrior";

        player.strength = 50;
        player.dexterity = 40;
        player.intelligence = 20;

        player.health = 100;
        player.maxHealth = 100;

        player.equipment =
            new EquipmentContainer();

        SkillInstance sword =
            new SkillInstance();

        sword.skillTemplateId =
            "SWORDSMANSHIP";

        sword.value = 80;

        player.skills.put(
            sword.skillTemplateId,
            sword);

        ItemInstance katana =
            new ItemInstance();

        katana.itemInstanceId =
            "ITEM_KATANA_1";

        katana.itemTemplateId =
            "KATANA";

        itemManager.addItem(
            katana);

        player.equipment
            .equippedItems
            .put(
                EquipmentSlot.MAIN_HAND,
                katana.itemInstanceId);

        return player;
    }

    public Player createDefender() {

        Player player =
            new Player();

        player.id = "PLAYER_B";

        player.name = "Defender";

        player.strength = 30;
        player.dexterity = 30;
        player.intelligence = 20;

        player.health = 100;
        player.maxHealth = 100;

        player.equipment =
            new EquipmentContainer();

        ItemInstance armor =
            new ItemInstance();

        armor.itemInstanceId =
            "ITEM_LEATHER_1";

        armor.itemTemplateId =
            "LEATHER_CHEST";

        itemManager.addItem(
            armor);

        player.equipment
            .equippedItems
            .put(
                EquipmentSlot.CHEST,
                armor.itemInstanceId);

        return player;
    }
}

