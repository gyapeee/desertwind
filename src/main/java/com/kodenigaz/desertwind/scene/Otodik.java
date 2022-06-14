package com.kodenigaz.desertwind.scene;

import com.kodenigaz.desertwind.UI;
import com.kodenigaz.desertwind.story.Parancs;
import com.kodenigaz.desertwind.story.TortenetSzoveg;

import static com.kodenigaz.desertwind.story.Parancs.*;
import static com.kodenigaz.desertwind.story.Targyak.*;

public class Otodik extends Verzio implements Jelenet {

    public Otodik() {
        super();
    }

    public Otodik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        switch (verzio) {
            case VERZIO_0:
                if (!(UI.getTargyak().contains(GYURU))) {
                    return TortenetSzoveg.OTODIK_GYURU;
                }
                return TortenetSzoveg.OTODIK_SZOVEG_0;
            case VERZIO_1:
                return TortenetSzoveg.OTODIK_SZOVEG_1;
            default:
                return TortenetSzoveg.ERROR;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                UI.setJelenet(new Negyedik());
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.KELET);
                //DesertWind.setJelenet(new Nyolcadik());
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                UI.setJelenet(new Hatodik());
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                UI.setJelenet(new Otodik());
                break;
            }
            case KERES: {
                if (UI.getTargyak().contains(GYURU)) {
                    System.out.println(TortenetSzoveg.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    UI.getTargyak().add(GYURU);
                    break;
                }
            }
            default: {
                if (parancs.contains(HASZNAL)) {
                    if (parancs.contains(BOGRE)) {
                        if (UI.getTargyak().contains(BOGRE)) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            UI.getTargyak().remove(BOGRE);
                            UI.getTargyak().add(TOROTT_BOGRE);
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
