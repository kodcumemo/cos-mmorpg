package com.memokaa.cos.gameobject.npc;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class NpcTemplate extends ObjectTemplate {

    // Diyalog kimliği
    public String dialogueId;

    // Görev verebilir mi
    public boolean questGiver;

    // Satıcı mı
    public boolean vendor;

    // Banker mı
    public boolean banker;

    // Tamirci mi
    public boolean repairNpc;

    // Eğitmen mi
    public boolean trainerNpc;
}
