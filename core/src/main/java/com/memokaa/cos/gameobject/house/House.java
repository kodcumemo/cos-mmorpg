package com.memokaa.cos.gameobject.house;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.gameobject.base.GameObject;

public class House extends GameObject {

    // Şablon
    public String houseTemplateId;

    // Ev sahibi
    public String ownerPlayerId;

    // Ev adı
    public String houseName;

    // Kilitli mi
    public boolean locked;

    // Depodaki itemler
    public List<String> storageItemIds = new ArrayList<>();

    // Yetkili oyuncular
    public List<String> authorizedPlayerIds = new ArrayList<>();
}
