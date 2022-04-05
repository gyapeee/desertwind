package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.JelenetSzam.JELENET_5;
import static com.kodenigaz.desertwind.Verzio.VerzioErtek.VERZIO_0;

class Hatodik extends Verzio implements Jelenet {
    @Override
    public void szoveg() {
        System.out.println(TortenetSzoveg.HATODIK_SZOVEG);
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = JELENET_5;
                verzio = VERZIO_0;
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 7;
                verzio = VERZIO_0;
                break;
            }
        }
        if (parancs.equals(Parancs.NYUGATRA_MEGY) || parancs.equals(Parancs.KELETRE_MEGY)) {
            System.out.println(TortenetSzoveg.HATODIK_K_NY);
        }
    }
}
