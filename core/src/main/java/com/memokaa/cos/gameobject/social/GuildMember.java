package com.memokaa.cos.gameobject.social;

import com.memokaa.cos.enumtype.system.GuildRole;

public class GuildMember {

    // Kayıt Kimliği
    public String id;

    // Lonca
    public String guildId;

    // Oyuncu
    public String playerId;

    // Yetki
    public GuildRole guildRole;

    // Katılım Tarihi
    public long joinDate;
}
