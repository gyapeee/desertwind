package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Verzio.VerzioErtek.VERZIO_1;

class Negyedik extends Verzio implements Jelenet {

    public Negyedik() {
        super();
    }

    public Negyedik(VerzioErtek verzio) {
        super(verzio);
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
        switch (parancs) {
            case Parancs.DELRE_MEGY:
                DesertWind.setJelenet(new Otodik(VERZIO_1));
                break;
            case Parancs.ESZAKRA_MEGY:
            case Parancs.NYUGATRA_MEGY:
            case Parancs.KELETRE_MEGY:
                System.out.println(TortenetSzoveg.NEGYEDIK_E_NY_K);
                break;
            case Parancs.VARAKOZIK:
                System.out.println(TortenetSzoveg.NEGYEDIK_VAR);
                DesertWind.setJelenet(new Elso());
                break;
            case Parancs.KERES:
                System.out.println(TortenetSzoveg.NEGYEDIK_KER);
                break;
        }

    }
}
