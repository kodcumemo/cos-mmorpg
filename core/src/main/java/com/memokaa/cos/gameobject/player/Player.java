package com.memokaa.cos.gameobject.player;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.gameobject.inventory.Inventory;
import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.skill.SkillInstance;

public class Player extends LivingEntity {

    // Oyuncu hesabı
    public String accountId;

    // Oyuncu adı
    public String playerName;

    // Aktif skilller LivingEntity den miras alıyor

    // Tecrübe
    public long experience;

    // Altın
    public long gold;

    // Envanter
    public Inventory inventory;
    // Toplam skill limiti
    /**
     * Toplam skill limiti.
     *
     * Başlangıç:
     * 700
     *
     * Skill scroll ile:
     * 720
     * 740
     * 760
     */
    public double skillCap = 700.0;
}
