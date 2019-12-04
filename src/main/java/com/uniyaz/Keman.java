package com.uniyaz;

/**
 * Created by FiratUlgay on 4.12.2019.
 */
public class Keman  extends Yaylilar{

    @Override
    void muzikCal() {
        super.muzikCal();
        System.out.println("keman sesi çalındı");
    }
    @Override
    void akordAyarla() {
        System.out.println("keman akordu yapıldı");
    }
}
