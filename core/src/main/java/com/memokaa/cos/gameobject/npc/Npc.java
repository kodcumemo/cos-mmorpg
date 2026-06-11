package com.memokaa.cos.gameobject.npc;

import com.memokaa.cos.gameobject.base.GameObject;

public class Npc extends GameObject {

    // Şablon
    public String npcTemplateId;

    // İsim
    public String displayName;

    // Diyalog
    public String dialogueId;

    // Satıcı mı
    public boolean vendor;

    // Bankacı mı
    public boolean banker;

    // Görev veriyor mu
    public boolean questGiver;

    // Tamirci mi
    public boolean repairNpc;
}
