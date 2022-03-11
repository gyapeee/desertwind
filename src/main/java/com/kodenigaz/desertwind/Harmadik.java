package com.kodenigaz.desertwind;

// 3
class Harmadik extends Jelenet {
    void szoveg() {
        System.out.println(TortenetSzoveg.HARMADIK_SZOVEG);
    }

    void parancs_Ertelmezo(String parancs) {
        // az or parancs || jelnek felel meg javaban
        if (parancs.equals(Irany.ESZAK)) {
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals(Irany.KELET) || parancs.equals(Irany.DEL) || parancs.equals(Irany.NYUGAT)) {
            System.out.println(TortenetSzoveg.HARMADIK_K_D_NY);
        }
        if (parancs.equals("vár")) {
            System.out.println(TortenetSzoveg.HARMADIK_VAR);
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals("ker")) {
            System.out.println(TortenetSzoveg.HARMADIK_KER);
        }
    }
}
