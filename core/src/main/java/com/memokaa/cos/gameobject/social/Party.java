package com.memokaa.cos.gameobject.social;

import java.util.List;

public class Party {

    // Grup Kimliği
    public String id;

    // Lider
    public String leaderPlayerId;

    // Üyeler
    public List<String> memberPlayerIds;

    // Oluşturulma Tarihi
    public long createDate;
}
