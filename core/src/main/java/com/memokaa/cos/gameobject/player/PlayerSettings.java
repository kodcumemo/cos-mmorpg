package com.memokaa.cos.gameobject.player;

import com.memokaa.cos.enumtype.client.ScreenMode;

public class PlayerSettings {

    // Sahip oyuncu
    public String playerId;

    // Tercih edilen ekran modu
    public ScreenMode preferredScreenMode;

    // Kamera yakınlaştırma
    public float zoomLevel;

    // Ses seviyesi
    public float masterVolume;

    // Müzik seviyesi
    public float musicVolume;

    // Efekt seviyesi
    public float soundEffectVolume;

    // Oyuncu isimlerini göster
    public boolean showPlayerNames;

    // Hasar sayılarını göster
    public boolean showDamageNumbers;
}
