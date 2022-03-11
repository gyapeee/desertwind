package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_4;
import static com.kodenigaz.desertwind.Parancs.KERES;
import static com.kodenigaz.desertwind.Parancs.VARAKOZIK;

// 3
class Harmadik extends Jelenet {
    @Override
    void szoveg() {
        System.out.println(TortenetSzoveg.HARMADIK_SZOVEG);
    }

    @Override
    void parancs_Ertelmezo(String parancs) {
        // az or parancs || jelnek felel meg javaban
        if (parancs.equals(Parancs.ESZAKRA_MEGY)) {
            DesertWind.jelenetszam = JELENET_4;
        }
        if (parancs.equals(Parancs.KELETRE_MEGY) || parancs.equals(Parancs.DELRE_MEGY) || parancs.equals(Parancs.NYUGATRA_MEGY)) {
            System.out.println(TortenetSzoveg.HARMADIK_K_D_NY);
        }
        if (parancs.equals(VARAKOZIK)) {
            System.out.println(TortenetSzoveg.HARMADIK_VAR);
            DesertWind.jelenetszam = JELENET_4;
        }
        if (parancs.equals(KERES)) {
            System.out.println(TortenetSzoveg.HARMADIK_KER);
        }
    }
}
