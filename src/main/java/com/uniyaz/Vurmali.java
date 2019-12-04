package com.uniyaz;

public class Vurmali extends Enstruman {

    boolean perdesiVarMi;

    public boolean isPerdesiVarMi() {
        return perdesiVarMi;
    }

    public void setPerdesiVarMi(boolean perdesiVarMi) {
        this.perdesiVarMi = perdesiVarMi;
    }



    @Override
    void muzikCal() {
        System.out.println("vurularak çalındı");
    }
}
