package com.kodenigaz.desertwind.scene;

import com.kodenigaz.desertwind.UI;
import com.kodenigaz.desertwind.story.Parancs;
import com.kodenigaz.desertwind.story.TortenetSzoveg;

// 3
public class Harmadik extends Verzio implements Jelenet {

    public Harmadik() {
        super();
    }

    public Harmadik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        return TortenetSzoveg.HARMADIK_SZOVEG;
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY:
                UI.setJelenet(new Negyedik());
                break;
            case Parancs.KELETRE_MEGY:
            case Parancs.DELRE_MEGY:
            case Parancs.NYUGATRA_MEGY:
                System.out.println(TortenetSzoveg.HARMADIK_K_D_NY);
                break;
            case Parancs.VARAKOZIK:
                System.out.println(TortenetSzoveg.HARMADIK_VAR);
                UI.setJelenet(new Negyedik());
                break;
            case Parancs.KERES:
                System.out.println(TortenetSzoveg.HARMADIK_KER);
                break;
        }
    }
}
