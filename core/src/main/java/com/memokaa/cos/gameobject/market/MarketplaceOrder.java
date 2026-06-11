package com.memokaa.cos.gameobject.market;

public class MarketplaceOrder {

    // Emir kimliği
    public String id;

    // Alıcı
    public String buyerPlayerId;

    // Item şablonu
    public String itemTemplateId;

    // Miktar
    public int quantity;

    // Birim fiyat
    public long pricePerUnit;

    // Açık mı
    public boolean active;
}
