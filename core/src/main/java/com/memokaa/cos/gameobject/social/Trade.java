package com.memokaa.cos.gameobject.social;

import com.memokaa.cos.enumtype.system.TradeStatus;

public class Trade {

    // Takas Kimliği
    public String id;

    // Oyuncu 1
    public String player1Id;

    // Oyuncu 2
    public String player2Id;

    // Durum
    public TradeStatus status;

    // Tarih
    public long createDate;
}
