package com.memokaa.cos.gameobject.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    // Banka sahibi
    public String ownerPlayerId;

    // Bankadaki itemler
    public List<String> itemIds = new ArrayList<>();

    // Bankadaki altın
    public long gold;
}
