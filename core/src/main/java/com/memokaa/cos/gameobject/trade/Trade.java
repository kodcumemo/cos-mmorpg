package com.memokaa.cos.gameobject.trade;

public class Trade {

    // Takas ID
    public String id;

    // Oyuncu 1
    public String player1Id;

    // Oyuncu 2
    public String player2Id;

    // Durum
    public String status;
    // PENDING / ACCEPTED / CANCELLED / COMPLETED

    // Altın değişimi
    public long player1GoldOffer;
    public long player2GoldOffer;

    // Oluşturulma
    public long createDate;

    // Onay zamanı
    public long confirmDate;
}
