package com.memokaa.cos.enumtype.item;

/**
 * Eşyalara eklenebilen özel özellikler.
 *
 * Normal Item      = 3 Property
 * Special Item     = +1 Property
 * Crafted Special  = +1 Property
 *
 * Maksimum = 5 Property
 */
public enum PropertyType {

    // =========================
    // DAMAGE
    // =========================

    BONUS_DAMAGE,              // Ek hasar

    BONUS_ATTACK_SPEED,        // Saldırı hızı

    BONUS_CRITICAL_CHANCE,     // Kritik vurma şansı

    BONUS_CRITICAL_DAMAGE,     // Kritik hasarı

    BONUS_HIT_CHANCE,          // İsabet oranı

    // =========================
    // DEFENSE
    // =========================

    BONUS_ARMOR,               // Zırh

    BONUS_MAGIC_RESIST,        // Büyü direnci

    BONUS_BLOCK_CHANCE,        // Blok oranı

    BONUS_DODGE_CHANCE,        // Kaçınma oranı

    // =========================
    // HEALTH
    // =========================

    BONUS_HEALTH,              // Can

    BONUS_HEALTH_REGEN,        // Can yenileme

    // =========================
    // MANA
    // =========================

    BONUS_MANA,                // Mana

    BONUS_MANA_REGEN,          // Mana yenileme

    // =========================
    // MOVEMENT
    // =========================

    BONUS_MOVE_SPEED,          // Hareket hızı

    BONUS_MOUNT_SPEED,         // Binek hızı

    // =========================
    // GATHERING
    // =========================

    BONUS_MINING,              // Madencilik

    BONUS_LOGGING,             // Odunculuk

    BONUS_FISHING,             // Balıkçılık

    BONUS_HERBALISM,           // Bitki toplama

    BONUS_HUNTING,             // Avcılık

    BONUS_FARMING,             // Tarım

    // =========================
    // CRAFTING
    // =========================

    BONUS_BLACKSMITHING,       // Demircilik

    BONUS_TAILORING,           // Terzilik

    BONUS_CARPENTRY,           // Marangozluk

    BONUS_ALCHEMY,             // Simya

    BONUS_COOKING,             // Aşçılık

    BONUS_JEWELCRAFTING,       // Kuyumculuk

    BONUS_SHIPBUILDING,        // Gemi yapımı

    // =========================
    // ECONOMY
    // =========================

    BONUS_TRADING,             // Ticaret

    BONUS_VENDOR_PRICE,        // Daha iyi satış fiyatı

    BONUS_MARKET_TAX_REDUCTION,// Pazar vergisi indirimi

    // =========================
    // LUCK
    // =========================

    BONUS_LUCK,                // Genel şans

    BONUS_LOOT_CHANCE,         // Daha iyi ganimet

    BONUS_RESOURCE_YIELD,      // Fazla kaynak

    // =========================
    // SHIP
    // =========================

    BONUS_SHIP_SPEED,          // Gemi hızı

    BONUS_SHIP_DURABILITY,     // Gemi dayanıklılığı

    BONUS_SHIP_CARGO,          // Kargo kapasitesi

    BONUS_SHIP_TURN_RATE,      // Manevra

    // =========================
    // HOUSE
    // =========================

    BONUS_STORAGE_CAPACITY,    // Depolama kapasitesi

    BONUS_PRODUCTION_SPEED,    // Üretim hızı

    BONUS_FARM_OUTPUT,         // Tarla verimi

    // =========================
    // PET
    // =========================

    BONUS_PET_EFFECTIVENESS,   // Pet gücü

    BONUS_PET_CAPACITY         // Pet taşıma kapasitesi
}
