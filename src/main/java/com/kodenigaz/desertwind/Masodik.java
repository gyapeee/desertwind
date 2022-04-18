package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.Targyak.BOGRE;
import static com.kodenigaz.desertwind.Targyak.TOROTT_BOGRE;
import static com.kodenigaz.desertwind.Verzio.VerzioErtek.VERZIO_1;

// 2
class Masodik extends Verzio implements Jelenet {
    public Masodik() {
        super();
    }

    public Masodik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public void szoveg() {
        switch (verzio) {
            case VERZIO_0:
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_0);
                break;
            case VERZIO_1:
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_1);
                break;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.setJelenet(new Harmadik(VERZIO_1));
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
                DesertWind.setJelenet(new Elso());
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
