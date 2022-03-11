package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.*;
import static com.kodenigaz.desertwind.Parancs.KERES;
import static com.kodenigaz.desertwind.Parancs.VARAKOZIK;

class Otodik extends Jelenet {
    int verzio = 0;

    @Override
    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_0);
                if (!(DesertWind.targyak.contains("gyűrű"))) {
                    System.out.println(TortenetSzoveg.OTODIK_GYURU);
                }
                break;
            case (1):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_1);
                break;
        }
    }

    @Override
    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = JELENET_4;
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.KELET);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 8;
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                DesertWind.jelenetszam = JELENET_6;
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                DesertWind.jelenetszam = JELENET_5;
                break;
            }
            case KERES: {
                if (DesertWind.targyak.contains("gyűrű")) {
                    System.out.println(TortenetSzoveg.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    DesertWind.targyak.add("gyűrű");
                    break;
                }
            }
            default: {
                if (parancs.contains("használ")) {
                    if (parancs.contains("bögre")) {
                        if (DesertWind.targyak.contains("bögre")) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            DesertWind.targyak.remove("bögre");
                            DesertWind.targyak.add("törött bögre");
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
