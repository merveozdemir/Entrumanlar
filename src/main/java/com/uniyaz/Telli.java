package com.uniyaz;

public class Telli extends Enstruman {
    String ad;

    @Override
    void akordAyarla() {
        System.out.println("Telli Çalgıların Akortu Ayarlandı");
    }

    @Override
    void muzikCal() {
        System.out.println("Telli ses çıkardı");
    }
}
