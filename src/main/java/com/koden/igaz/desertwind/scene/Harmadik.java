package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import com.koden.igaz.desertwind.UserDataService;

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
                UserDataService.setJelenet(new Negyedik());
                break;
            case Parancs.KELETRE_MEGY:
            case Parancs.DELRE_MEGY:
            case Parancs.NYUGATRA_MEGY:
                System.out.println(TortenetSzoveg.HARMADIK_K_D_NY);
                break;
            case Parancs.VARAKOZIK:
                System.out.println(TortenetSzoveg.HARMADIK_VAR);
                UserDataService.setJelenet(new Negyedik());
                break;
            case Parancs.KERES:
                System.out.println(TortenetSzoveg.HARMADIK_KER);
                break;
        }
    }
}
