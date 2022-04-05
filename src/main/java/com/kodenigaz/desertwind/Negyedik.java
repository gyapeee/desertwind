package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.JelenetSzam.JELENET_1;
import static com.kodenigaz.desertwind.JelenetSzam.JELENET_5;
import static com.kodenigaz.desertwind.Parancs.KERES;
import static com.kodenigaz.desertwind.Parancs.VARAKOZIK;
import static com.kodenigaz.desertwind.Verzio.VerzioErtek.VERZIO_0;
import static com.kodenigaz.desertwind.Verzio.VerzioErtek.VERZIO_1;

class Negyedik extends Verzio implements Jelenet {
    Negyedik() {
        verzio = VERZIO_0;
    }

    @Override
    public void szoveg() {
        switch (verzio) {
            case VERZIO_0:
                System.out.println(TortenetSzoveg.NEGYEDIK_SZOVEG_0);
                break;
            case VERZIO_1:
                System.out.println(TortenetSzoveg.NEGYEDIK_SZOVEG_1);
                break;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        if (parancs.equals(Parancs.DELRE_MEGY)) {
            DesertWind.jelenetszam = JELENET_5;
            verzio = VERZIO_1;
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
