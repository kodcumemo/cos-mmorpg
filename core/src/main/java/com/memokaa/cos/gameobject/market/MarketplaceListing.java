package com.memokaa.cos.gameobject.market;

public class MarketplaceListing {

    // İlan kimliği
    public String id;

    // Satıcı
    public String sellerPlayerId;

    // Satılan item
    public String itemInstanceId;

    // Fiyat
    public long price;

    // Oluşturulma tarihi
    public long createdAt;

    // Satıldı mı
    public boolean sold;
}
