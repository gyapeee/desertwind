package com.kodenigaz.desertwind;

class Otodik extends Jelenet {
    int verzio = 0;

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(StringValues.OTODIK_SZOVEG_0);
                if (!(DesertWind.targyak.contains("gyűrű"))) {
                    System.out.println(StringValues.OTODIK_GYURU);
                }
                break;
            case (1):
                System.out.println(StringValues.OTODIK_SZOVEG_1);
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case "é": {
                System.out.println(StringValues.ESZAK);
                DesertWind.jelenetszam = 4;
                break;
            }
            case "k": {
                System.out.println(StringValues.KELET);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 8;
                break;
            }
            case "d": {
                System.out.println(StringValues.DEL);
                DesertWind.jelenetszam = 6;
                break;
            }
            case "n": {
                System.out.println(StringValues.OTODIK_N);
                break;
            }
            case "vár": {
                System.out.println(StringValues.OTODIK_VAR);
                DesertWind.jelenetszam = 1;
                break;
            }
            case "ker": {
                if (DesertWind.targyak.contains("gyűrű")) {
                    System.out.println(StringValues.OTODIK_KER_GYURU);
                    break;
                } else {
                    System.out.println(StringValues.OTODIK_KER);
                    DesertWind.targyak.add("gyűrű");
                    break;
                }
            }
            default: {
                if (parancs.contains("használ")) {
                    if (parancs.contains("bögre")) {
                        if (DesertWind.targyak.contains("bögre")) {
                            System.out.println(StringValues.OTODIK_BOGRE_0);
                            DesertWind.targyak.remove("bögre");
                            DesertWind.targyak.add("törött bögre");
                        } else {
                            System.out.println(StringValues.OTODIK_BOGRE_1);
                        }
                    }
                }
            }
        }
    }
}
