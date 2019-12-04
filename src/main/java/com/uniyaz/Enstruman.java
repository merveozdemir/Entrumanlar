package com.uniyaz;

public class Enstruman {
    private String malzeme;
    private int uretimYili;
    private String marka;
    private EnumKoken koken;
    private float agirlik;
    private final double KDV = 1.8;
    private double fiyat;

    void fiyatHesapla(double fiyat){
       this.fiyat= fiyat*KDV;
        System.out.println(this.fiyat);
    }
    void akordAyarla(){
        System.out.println("akort ayarlandı");

    }
    void muzikCal(){
        System.out.println("müzik çalındı");

    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public EnumKoken getKoken() {
        return koken;
    }

    public void setKoken(EnumKoken koken) {
        this.koken = koken;
    }

    public float getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(float agirlik) {
        this.agirlik = agirlik;
    }
}
