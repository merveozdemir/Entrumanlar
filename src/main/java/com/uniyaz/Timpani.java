package com.uniyaz;

public class Timpani extends VurmaliCalgilar{




    @Override
    void muzikCal() {

        System.out.println("Tokmakla Çalınır");
    }

    @Override
    void akordAyarla() {
        super.akordAyarla();

        System.out.println("Akort edilir");
    }
}
