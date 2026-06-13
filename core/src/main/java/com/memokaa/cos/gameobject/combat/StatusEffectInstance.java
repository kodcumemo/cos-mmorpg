package com.memokaa.cos.gameobject.combat;

/**
 * Aktif durum etkisi.
 */
public class StatusEffectInstance {

    /**
     * Template Id
     */
    public String statusEffectTemplateId;

    /**
     * Effecti uygulayan entity
     */
    public String sourceEntityId;

    /**
     * Başlangıç zamanı
     */
    public long startTime;

    /**
     * Bitiş zamanı
     */
    public long endTime;

    /**
     * Etkin mi
     */
    public boolean active = true;

    /**
     * Güç değeri
     */
    public double power;

    /**
     * Tick aralığı
     *
     * ms
     */
    public long tickInterval;

    /**
     * Son tick zamanı
     */
    public long lastTickTime;


}
