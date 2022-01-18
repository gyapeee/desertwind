package com.kodenigaz.desertwind;

class Hatodik extends Jelenet {
    void szoveg() {
        System.out.println(StringValues.HATODIK_SZOVEG);
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case "é": {
                System.out.println(StringValues.ESZAK);
                DesertWind.jelenetszam = 5;
                verzio = 0;
                break;
            }
            case "d": {
                System.out.println(StringValues.DEL);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 7;
                verzio = 0;
                break;
            }
        }
        if (parancs.equals("ny") || parancs.equals("k")) {
            System.out.println(StringValues.HATODIK_K_NY);
        }
    }
}