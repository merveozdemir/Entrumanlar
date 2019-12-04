package com.uniyaz;

public class Gitar extends Telli {
    EnumGitarCesit gitarCesit;
    int perdeSayisi;
    @Override
    void akordAyarla() {
        System.out.println("Gitar Akardo Yapıldı");
    }

    @Override
    void muzikCal() {
        System.out.println("Gitar Notalarıyla Müzik Çalındı");
    }

    @Override
    void fiyatHesapla(double fiyat) {
        super.fiyatHesapla(fiyat);
    }
}

