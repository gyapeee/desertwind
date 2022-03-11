package com.kodenigaz.desertwind;

import static com.kodenigaz.desertwind.Irany.DEL;

// 2
class Masodik extends Jelenet {
    int verzio = 0; // Minden helyszíni classnak több verzioja lehet, ezt a verziot az adott parancs értelmező modosíthatja!

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_0);
                break;
            case (1):
                System.out.println(TortenetSzoveg.MASODIK_SZOVEG_1);
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Irany.ESZAK: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = 3;
                verzio = 1;
                break;
            }
            case Irany.KELET: {
                System.out.println(TortenetSzoveg.MASODIK_K);
                break;
            }
            case DEL: {
                System.out.println(TortenetSzoveg.MASODIK_D);
                break;
            }
            case Irany.NYUGAT: {
                System.out.println(TortenetSzoveg.MASODIK_N);
                break;
            }
            case "vár": {
                System.out.println(TortenetSzoveg.MASODIK_VAR);
                DesertWind.jelenetszam = 1;
                break;
            }
            case "ker": {
                if (DesertWind.targyak.contains("bögre")) {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_0);
                    break;
                } else {
                    System.out.println(TortenetSzoveg.MASODIK_KER_BOGRE_1);
                    DesertWind.targyak.add("bögre");
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
