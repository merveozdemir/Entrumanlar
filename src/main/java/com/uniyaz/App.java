package com.uniyaz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Keman keman = new Keman();
        keman.setAgirlik(2);
        keman.setKoken(EnumKoken.BATI);
        keman.setMalzeme("GÜL");
        keman.setMarka("ASHTON");
        keman.setUretimYili(1996);
        keman.fiyatHesapla(1000);
        keman.akordAyarla();
        keman.muzikCal();

        Marimba marimba = new Marimba();
        marimba.setAgirlik(2);

    }
}
