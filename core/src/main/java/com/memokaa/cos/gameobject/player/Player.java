package com.memokaa.cos.gameobject.player;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.enumtype.movement.MovementType;
import com.memokaa.cos.gameobject.base.GameObject;
import com.memokaa.cos.gameobject.inventory.Equipment;
import com.memokaa.cos.gameobject.inventory.Inventory;


public class Player extends GameObject {

    // Hesap kimliği
    public String accountId;

    // Karakter adı
    public String characterName;

    // Ülke
    public String factionId;

    // Lonca
    public String guildId;

    // Ada
    public String islandId;

    // Can
    public int health;

    // Maksimum can
    public int maxHealth;

    // Mana
    public int mana;

    // Maksimum mana
    public int maxMana;

    // Stamina
    public int stamina;

    // Maksimum stamina
    public int maxStamina;

    // Altın
    public long gold;

    // Aktif savaş modu
    public boolean warMode;

    // Ölü mü
    public boolean dead;

    // Son saldıran
    public String lastAttackerId;

    // Aktif pet
    public String activePetId;

    // Aktif binek
    public String activeMountId;

    // Aktif gemi
    public String activeShipId;

    // Sahip olduğu evler
    public List<String> houseIds = new ArrayList<>();

    // Sahip olduğu petler
    public List<String> petIds = new ArrayList<>();

    // Sahip olduğu binekler
    public List<String> mountIds = new ArrayList<>();

    // Sahip olduğu gemiler
    public List<String> shipIds = new ArrayList<>();
    public Inventory inventory;

    public Equipment equipment;

    public String bankId;

    // Hareket durumu
    public MovementType movementType;

    // Hareket ediyor mu
    public boolean moving;

    // Hedef koordinat
    public float targetX;

    public float targetY;

    public float targetZ;

    public float visionRange;

}
