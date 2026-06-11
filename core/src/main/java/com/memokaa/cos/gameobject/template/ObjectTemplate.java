package com.memokaa.cos.gameobject.template;

/**
 * Tüm template sınıflarının temel yapısı
 */
public abstract class ObjectTemplate {

    // Template kimliği
    public String id;

    // Görünen isim
    public String name;

    // Açıklama
    public String description;

    // 3D model dosyası
    public String modelAsset;

    // Envanter ikonu
    public String iconAsset;

    // Aktif mi
    public boolean active;

    // Oluşturulma zamanı
    public long createdAt;

    // Güncellenme zamanı
    public long updatedAt;
}
