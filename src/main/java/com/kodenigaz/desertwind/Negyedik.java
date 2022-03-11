package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_1;
import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_5;
import static com.kodenigaz.desertwind.Parancs.KERES;
import static com.kodenigaz.desertwind.Parancs.VARAKOZIK;

class Negyedik extends Jelenet {
    Negyedik() {
        verzio = 0;
    }

    @Override
    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.NEGYEDIK_SZOVEG_0);
                break;
            case (1):
                System.out.println(TortenetSzoveg.NEGYEDIK_SZOVEG_1);
                break;
        }
    }

    @Override
    void parancs_Ertelmezo(String parancs) {
        if (parancs.equals(Parancs.DELRE_MEGY)) {
            DesertWind.jelenetszam = JELENET_5;
            verzio = 1;
        }
        if (parancs.equals(Parancs.ESZAKRA_MEGY) || parancs.equals(Parancs.NYUGATRA_MEGY) || parancs.equals(Parancs.KELETRE_MEGY)) {
            System.out.println(TortenetSzoveg.NEGYEDIK_E_NY_K);
        }
        if (parancs.equals(VARAKOZIK)) {
            System.out.println(TortenetSzoveg.NEGYEDIK_VAR);
            DesertWind.jelenetszam = JELENET_1;
        }
        if (parancs.equals(KERES)) {
            System.out.println(TortenetSzoveg.NEGYEDIK_KER);

        }
    }
}
