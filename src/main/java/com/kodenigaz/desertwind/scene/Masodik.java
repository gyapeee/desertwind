package com.kodenigaz.desertwind.scene;

import com.kodenigaz.desertwind.DesertWind;
import com.kodenigaz.desertwind.story.TortenetSzoveg;

import static com.kodenigaz.desertwind.scene.Verzio.VerzioErtek.VERZIO_1;
import static com.kodenigaz.desertwind.story.Parancs.*;
import static com.kodenigaz.desertwind.story.Targyak.BOGRE;
import static com.kodenigaz.desertwind.story.Targyak.TOROTT_BOGRE;

// 2
public class Masodik extends Verzio implements Jelenet {
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
                if (DesertWind.getTargyak().contains(BOGRE)) {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_0);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_1);
                    DesertWind.getTargyak().add(BOGRE);
                    break;
                }
            }
            default: {
                if (parancs.contains(HASZNAL)) {
                    if (parancs.contains(BOGRE)) {
                        if (DesertWind.getTargyak().contains(BOGRE)) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            DesertWind.getTargyak().remove(BOGRE);
                            DesertWind.getTargyak().add(TOROTT_BOGRE);
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
