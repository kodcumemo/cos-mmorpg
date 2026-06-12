package com.memokaa.cos.gameobject.base;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.gameobject.combat.CombatStats;
import com.memokaa.cos.gameobject.effect.ActiveStatusEffect;
import com.memokaa.cos.gameobject.equipment.EquipmentContainer;

public abstract class LivingEntity extends GameObject {

    // ===== PRIMARY STATS =====

    // Fiziksel güç
    public int strength;

    // Hız ve çeviklik
    public int dexterity;

    // Büyü gücü
    public int intelligence;

    // ===== RESOURCES =====

    // Can
    public double health;

    // Maksimum can
    public double maxHealth;

    // Mana
    public double mana;

    // Maksimum mana
    public double maxMana;

    // Stamina
    public double stamina;

    // Maksimum stamina
    public double maxStamina;

    // ===== COMBAT =====

    // Son hesaplanan combat değerleri
    public CombatStats combatStats;

    // Aktif effectler
    public List<ActiveStatusEffect> activeEffects =
        new ArrayList<>();

    // Takılı ekipmanlar
    public EquipmentContainer equipment;

    // ===== TARGET =====

    // Şu anki hedef
    public String targetId;

    // Son saldıran
    public String lastAttackerId;

    // En çok hasar veren
    public String highestDamageDealerId;

    // ===== STATE =====

    // Ölü mü
    public boolean dead;

    // War modu
    public boolean warMode;

    // Gizlenmiş mi
    public boolean hidden;

    // ===== TIMERS =====

    // Son combat zamanı
    public long lastCombatTime;

    // Son saldırı zamanı
    public long lastAttackTime;

    // Son büyü zamanı
    public long lastSpellUseTime;

    // Son skill zamanı
    public long lastSkillUseTime;
}
