package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_1;
import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_3;
import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.Targyak.BOGRE;
import static com.kodenigaz.desertwind.Targyak.TOROTT_BOGRE;

// 2
class Masodik extends Jelenet {
    int verzio = 0; // Minden helyszíni classnak több verzioja lehet, ezt a verziot az adott parancs értelmező modosíthatja!

    @Override
    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_0);
                break;
            case (1):
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_1);
                break;
        }
    }

    @Override
    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = JELENET_3;
                verzio = 1;
                break;
            }
            case KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_K);
                break;
            }
            case DELRE_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_D);
                break;
            }
            case NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_N);
                break;
            }
            case VARAKOZIK: {
                System.out.println(TortenetSzoveg.MASODIK_VAR);
                DesertWind.jelenetszam = JELENET_1;
                break;
            }
            case KERES: {
                if (DesertWind.targyak.contains(BOGRE)) {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_0);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_1);
                    DesertWind.targyak.add(BOGRE);
                    break;
                }
            }
            default: {
                if (parancs.contains(HASZNAL)) {
                    if (parancs.contains(BOGRE)) {
                        if (DesertWind.targyak.contains(BOGRE)) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            DesertWind.targyak.remove(BOGRE);
                            DesertWind.targyak.add(TOROTT_BOGRE);
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
