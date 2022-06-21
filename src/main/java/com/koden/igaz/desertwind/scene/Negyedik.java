package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import com.koden.igaz.desertwind.UI;

public class Negyedik extends Verzio implements Jelenet {

    public Negyedik() {
        super();
    }

    public Negyedik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        switch (verzio) {
            case VERZIO_0:
                return TortenetSzoveg.NEGYEDIK_SZOVEG_0;
            case VERZIO_1:
                return TortenetSzoveg.NEGYEDIK_SZOVEG_1;
            default:
                return TortenetSzoveg.ERROR;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.DELRE_MEGY:
                UI.setJelenet(new Otodik(VerzioErtek.VERZIO_1));
                break;
            case Parancs.ESZAKRA_MEGY:
            case Parancs.NYUGATRA_MEGY:
            case Parancs.KELETRE_MEGY:
                System.out.println(TortenetSzoveg.NEGYEDIK_E_NY_K);
                break;
            case Parancs.VARAKOZIK:
                System.out.println(TortenetSzoveg.NEGYEDIK_VAR);
                UI.setJelenet(new Elso());
                break;
            case Parancs.KERES:
                System.out.println(TortenetSzoveg.NEGYEDIK_KER);
                break;
        }

    }
}
