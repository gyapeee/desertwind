package com.kodenigaz.desertwind.scene;

import com.kodenigaz.desertwind.UI;
import com.kodenigaz.desertwind.story.TortenetSzoveg;

import static com.kodenigaz.desertwind.scene.Verzio.VerzioErtek.VERZIO_1;
import static com.kodenigaz.desertwind.story.Parancs.*;
import static com.kodenigaz.desertwind.story.Targyak.BOGRE;
import static com.kodenigaz.desertwind.story.Targyak.TOROTT_BOGRE;
import static com.kodenigaz.desertwind.story.TortenetSzoveg.ERROR;

// 2
public class Masodik extends Verzio implements Jelenet {
    public Masodik() {
        super();
    }

    public Masodik(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        switch (verzio) {
            case VERZIO_0:
                return TortenetSzoveg.MASODIK_SZOVEG_0;
            case VERZIO_1:
                return TortenetSzoveg.MASODIK_SZOVEG_1;
            default:
                return TortenetSzoveg.ERROR;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                UI.setJelenet(new Harmadik(VERZIO_1));
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
                UI.setJelenet(new Elso());
                break;
            }
            case KERES: {
                if (UI.getTargyak().contains(BOGRE)) {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_0);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_1);
                    UI.getTargyak().add(BOGRE);
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
