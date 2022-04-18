package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.Targyak.*;

class Otodik extends Verzio implements Jelenet {

    public Otodik() {
        super();
    }

    public Otodik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public void szoveg() {
        switch (verzio) {
            case VERZIO_0:
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_0);
                if (!(DesertWind.targyak.contains(GYURU))) {
                    System.out.println(TortenetSzoveg.OTODIK_GYURU);
                }
                break;
            case VERZIO_1:
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_1);
                break;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.setJelenet(new Negyedik());
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.KELET);
                //DesertWind.setJelenet(new Nyolcadik());
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                DesertWind.setJelenet(new Hatodik());
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                DesertWind.setJelenet(new Otodik());
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
