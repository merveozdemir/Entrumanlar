package com.uniyaz;

public class Timpani extends Vurmali {

    @Override
    void muzikCal() {

        System.out.println("Tokmakla Çalınır");
    }

    @Override
    void akordAyarla() {
        super.akordAyarla();

        System.out.println("Akort edilir");
    }

    @Override
    void fiyatHesapla(double fiyat) {
        super.fiyatHesapla(fiyat);
    }
}
