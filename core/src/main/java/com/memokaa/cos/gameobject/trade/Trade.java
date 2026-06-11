package com.memokaa.cos.gameobject.trade;

import java.util.ArrayList;
import java.util.List;

public class Trade {

    // Takas kimliği
    public String id;

    // Oyuncu A
    public String playerAId;

    // Oyuncu B
    public String playerBId;

    // Oyuncu A teklifleri
    public List<String> playerAItemIds = new ArrayList<>();

    // Oyuncu B teklifleri
    public List<String> playerBItemIds = new ArrayList<>();

    // Altın teklifleri
    public long playerAGold;

    public long playerBGold;

    // Onaylar
    public boolean playerAAccepted;

    public boolean playerBAccepted;
}
