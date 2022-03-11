package com.kodenigaz.desertwind;

class Otodik extends Jelenet {
    int verzio = 0;

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_0);
                if (!(DesertWind.targyak.contains("gyűrű"))) {
                    System.out.println(TortenetSzoveg.OTODIK_GYURU);
                }
                break;
            case (1):
                System.out.println(TortenetSzoveg.OTODIK_SZOVEG_1);
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Irany.ESZAK: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = 4;
                break;
            }
            case Irany.KELET: {
                System.out.println(TortenetSzoveg.KELET);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 8;
                break;
            }
            case Irany.DEL: {
                System.out.println(TortenetSzoveg.DEL);
                DesertWind.jelenetszam = 6;
                break;
            }
            case Irany.NYUGAT: {
                System.out.println(TortenetSzoveg.OTODIK_N);
                break;
            }
            case "vár": {
                System.out.println(TortenetSzoveg.OTODIK_VAR);
                DesertWind.jelenetszam = 1;
                break;
            }
            case "ker": {
                if (DesertWind.targyak.contains("gyűrű")) {
                    System.out.println(TortenetSzoveg.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.OTODIK_KER);
                    DesertWind.targyak.add("gyűrű");
                    break;
                }
            }
            default: {
                if (parancs.contains("használ")) {
                    if (parancs.contains("bögre")) {
                        if (DesertWind.targyak.contains("bögre")) {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_0);
                            DesertWind.targyak.remove("bögre");
                            DesertWind.targyak.add("törött bögre");
                        } else {
                            System.out.println(TortenetSzoveg.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
