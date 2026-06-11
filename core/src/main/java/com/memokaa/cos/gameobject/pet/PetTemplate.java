package com.memokaa.cos.gameobject.pet;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class PetTemplate extends ObjectTemplate {

    // Savaşabilir mi
    public boolean combatPet;

    // Kaynak toplayabilir mi
    public boolean gatheringPet;

    // Depolama kapasitesi
    public int storageCapacity;

    // Özel yetenek kimliği
    public String specialAbilityId;
}
