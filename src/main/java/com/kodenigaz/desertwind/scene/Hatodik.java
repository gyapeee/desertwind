package com.kodenigaz.desertwind.scene;

import com.kodenigaz.desertwind.UI;
import com.kodenigaz.desertwind.story.Parancs;
import com.kodenigaz.desertwind.story.TortenetSzoveg;

public class Hatodik extends Verzio implements Jelenet {
    public Hatodik() {
        super();
    }

    public Hatodik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        return TortenetSzoveg.HATODIK_SZOVEG;
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                UI.setJelenet(new Otodik());
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
//
//                Verzio jelenet = new Hetedik();
//                jelenet.setVerzio(VERZIO_0);
//                DesertWind.setJelenet((Jelenet) jelenet);
                break;
            }
            case Parancs.NYUGATRA_MEGY:
            case Parancs.KELETRE_MEGY:
                System.out.println(TortenetSzoveg.HATODIK_K_NY);
                break;
        }
    }
}
