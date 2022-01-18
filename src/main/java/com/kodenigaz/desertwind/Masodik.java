package com.kodenigaz.desertwind;

// 2
class Masodik extends Jelenet {
    int verzio = 0; // Minden helyszíni classnak több verzioja lehet, ezt a verziot az adott parancs értelmező modosíthatja!

    private static final String IRANY_ESZAK = "é";
    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(StringValues.MASODIK_SZOVEG_0);
                break;
            case (1):
                System.out.println(StringValues.MASODIK_SZOVEG_1);
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case IRANY_ESZAK: {
                System.out.println(StringValues.ESZAK);
                DesertWind.jelenetszam = 3;
                verzio = 1;
                break;
            }
            case "k": {
                System.out.println(StringValues.MASODIK_K);
                break;
            }
            case "d": {
                System.out.println(StringValues.MASODIK_D);
                break;
            }
            case "n": {
                System.out.println(StringValues.MASODIK_N);
                break;
            }
            case "vár": {
                System.out.println(StringValues.MASODIK_VAR);
                DesertWind.jelenetszam = 1;
                break;
            }
            case "ker": {
                if (DesertWind.targyak.contains("bögre")) {
                    System.out.println(StringValues.MASODIK_KER_BOGRE_0);
                    break;
                } else {
                    System.out.println(StringValues.MASODIK_KER_BOGRE_1);
                    DesertWind.targyak.add("bögre");
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
