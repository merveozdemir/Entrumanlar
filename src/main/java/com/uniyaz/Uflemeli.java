package com.uniyaz;

public class Uflemeli extends Enstruman {
    int delikSayisi;

    public void  Ufle(){
        System.out.println("Üfleyerek Çal");

    }

    @Override
    void akordAyarla() {
        System.out.println("Üfleyerek çalınan enstrumanların akordu ayarlandı.");
    }

    @Override
    void muzikCal() {
        System.out.println("Üfleyerek Çalınan enstrumanların müzik çalması sağlandı.");
    }
}
