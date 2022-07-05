package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.Targyak;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import com.koden.igaz.desertwind.UserDataService;

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
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                UserDataService.setJelenet(new Harmadik(VerzioErtek.VERZIO_1));
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_K);
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_D);
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.MASODIK_N);
                break;
            }
            case Parancs.VARAKOZIK: {
                System.out.println(TortenetSzoveg.MASODIK_VAR);
                UserDataService.setJelenet(new Elso());
                break;
            }
            case Parancs.KERES: {
                if (UserDataService.getTargyak().contains(Targyak.BOGRE)) {
                    System.out.println(TortenetSzoveg.NEM_TALALSZ_SEMMI_ERDEKESET);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_1);
                    UserDataService.getTargyak().add(Targyak.BOGRE);
                    break;
                }
            }
            default: {
                if (parancs.contains(Parancs.HASZNAL)) {
                    if (parancs.contains(Targyak.BOGRE)) {
                        if (UserDataService.getTargyak().contains(Targyak.BOGRE)) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            UserDataService.getTargyak().remove(Targyak.BOGRE);
                            UserDataService.getTargyak().add(Targyak.TOROTT_BOGRE);
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
