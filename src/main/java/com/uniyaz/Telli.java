package com.uniyaz;

public class Telli extends Enstruman {
    int telSayisi;

    public int getTelSayisi() {
        return telSayisi;
    }

    public void setTelSayisi(int telSayisi) {
        this.telSayisi = telSayisi;
    }

    @Override
    void akordAyarla() {
        System.out.println("Telli Çalgıların Akortu Ayarlandı");
    }

    @Override
    void muzikCal() {
        System.out.println("Telli ses çıkardı");
    }
}
