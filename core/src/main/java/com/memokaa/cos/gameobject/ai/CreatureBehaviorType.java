package com.memokaa.cos.gameobject.ai;

public enum CreatureBehaviorType {

    // Zararsız
    PASSIVE,

    // Saldırılınca karşılık verir
    DEFENSIVE,

    // Görünce saldırır
    AGGRESSIVE,

    // Canı azalınca kaçar
    COWARD,

    // Canı azalınca daha güçlü olur
    BERSERKER,

    // Özel boss davranışları
    BOSS
}
