package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.Targyak;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import com.koden.igaz.desertwind.UI;

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
                if (!(UI.getTargyak().contains(Targyak.GYURU))) {
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
            case Parancs.VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                UI.setJelenet(new Otodik());
                break;
            }
            case Parancs.KERES: {
                if (UI.getTargyak().contains(Targyak.GYURU)) {
                    System.out.println(TortenetSzoveg.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    UI.getTargyak().add(Targyak.GYURU);
                    break;
                }
            }
            default: {
                if (parancs.contains(Parancs.HASZNAL)) {
                    if (parancs.contains(Targyak.BOGRE)) {
                        if (UI.getTargyak().contains(Targyak.BOGRE)) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            UI.getTargyak().remove(Targyak.BOGRE);
                            UI.getTargyak().add(Targyak.TOROTT_BOGRE);
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
