package com.memokaa.cos.gameobject.market;

public class MarketListing {

    // İlan ID
    public String id; // Benzersiz ilan kimliği

    // Satıcı
    public String sellerPlayerId; // İlanı açan oyuncu

    // Ada
    public String islandId; // İlanın bulunduğu ada

    // Item
    public String itemInstanceId; // Satılan item

    // Fiyat
    public long price; // Tekil satış fiyatı

    // Para birimi
    public String currencyType; // GOLD / PREMIUM / TRADE_TOKEN

    // Adet (stack varsa)
    public int quantity;

    // Oluşturulma tarihi
    public long createDate;

    // Bitiş tarihi
    public long expireDate;

    // Aktif mi
    public boolean active;
}
