package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.Targyak;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import com.koden.igaz.desertwind.UserDataService;

public class Otodik extends Verzio implements Jelenet {

    public Otodik() {
        super();
    }

    public Otodik(VerzioErtek verzio) {
        super(verzio);
    }

    private static String appendExtraInfoWhenItemIsMissing(String tortenetSzovegVerzio){
        // Append the extra info when the ring is not found yet
        if (!(UserDataService.getTargyak().contains(Targyak.GYURU))) {
            return tortenetSzovegVerzio + System.lineSeparator() + TortenetSzoveg.OTODIK_GYURU;
        }
        return tortenetSzovegVerzio;
    }

    @Override
    public String szoveg() {
        switch (verzio) {
            case VERZIO_0:
                return Otodik.appendExtraInfoWhenItemIsMissing(TortenetSzoveg.OTODIK_SZOVEG_0);
            case VERZIO_1:
                return Otodik.appendExtraInfoWhenItemIsMissing(TortenetSzoveg.OTODIK_SZOVEG_1);
            default:
                return TortenetSzoveg.ERROR;
        }
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Parancs.ESZAKRA_MEGY: {
                System.out.println(TortenetSzoveg.ESZAK);
                UserDataService.setJelenet(new Negyedik());
                break;
            }
            case Parancs.KELETRE_MEGY: {
                System.out.println(TortenetSzoveg.KELET);
                //DesertWind.setJelenet(new Nyolcadik());
                break;
            }
            case Parancs.DELRE_MEGY: {
                System.out.println(TortenetSzoveg.DEL);
                UserDataService.setJelenet(new Hatodik());
                break;
            }
            case Parancs.NYUGATRA_MEGY: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case Parancs.VARAKOZIK: {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                UserDataService.setJelenet(new Otodik());
                break;
            }
            case Parancs.KERES: {
                if (UserDataService.getTargyak().contains(Targyak.GYURU)) {
                    System.out.println(TortenetSzoveg.NEM_TALALSZ_SEMMI_ERDEKESET);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    UserDataService.getTargyak().add(Targyak.GYURU);
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
