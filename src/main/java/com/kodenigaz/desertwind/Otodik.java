package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.Targyak.*;

class Otodik extends Verzio implements Jelenet {
    int verzio = 0;

    @Override
    public void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_0);
                if (!(DesertWind.targyak.contains(GYURU))) {
                    System.out.println(TortenetSzoveg.OTODIK_GYURU);
                }
                break;
            case (1):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_1);
                break;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = com.kodenigaz.desertwind.JelenetSzam.JELENET_4;
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.KELET);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 8;
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                DesertWind.jelenetszam = com.kodenigaz.desertwind.JelenetSzam.JELENET_6;
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                DesertWind.jelenetszam = com.kodenigaz.desertwind.JelenetSzam.JELENET_5;
                break;
            }
            case KERES: {
                if (DesertWind.targyak.contains(GYURU)) {
                    System.out.println(TortenetSzoveg.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    DesertWind.targyak.add(GYURU);
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
