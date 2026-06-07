package com.memokaa.cos.gameobject.social;

import com.memokaa.cos.enumtype.social.MailStatus;

public class Mail {

    // Posta Kimliği
    public String id;

    // Gönderen
    public String senderPlayerId;

    // Alıcı
    public String receiverPlayerId;

    // Konu
    public String subject;

    // İçerik
    public String content;

    // Durum
    public MailStatus status;

    // Tarih
    public long createDate;
}
