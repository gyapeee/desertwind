package com.kodenigaz.desertwind;

// 3
class Harmadik extends Jelenet {
    void szoveg() {
        System.out.println(StringValues.HARMADIK_SZOVEG);
    }

    void parancs_Ertelmezo(String parancs) {
        // az or parancs || jelnek felel meg javaban
        if (parancs.equals("é")) {
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals("k") || parancs.equals("d") || parancs.equals("ny")) {
            System.out.println(StringValues.HARMADIK_K_D_NY);
        }
        if (parancs.equals("vár")) {
            System.out.println(StringValues.HARMADIK_VAR);
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals("ker")) {
            System.out.println(StringValues.HARMADIK_KER);
        }
    }
}
