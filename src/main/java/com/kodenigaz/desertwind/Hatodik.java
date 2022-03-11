package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_5;

class Hatodik extends Jelenet {
    @Override
    void szoveg() {
        System.out.println(TortenetSzoveg.HATODIK_SZOVEG);
    }

    @Override
    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = JELENET_5;
                verzio = 0;
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 7;
                verzio = 0;
                break;
            }
        }
        if (parancs.equals(Parancs.NYUGATRA_MEGY) || parancs.equals(Parancs.KELETRE_MEGY)) {
            System.out.println(TortenetSzoveg.HATODIK_K_NY);
        }
    }
}
