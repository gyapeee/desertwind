package com.kodenigaz.desertwind;

class Negyedik extends Jelenet {
    Negyedik() {
        int verzio = 0;
    }

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println(StringValues.NEGYEDIK_SZOVEG_0);
                break;
            case (1):
                System.out.println(StringValues.NEGYEDIK_SZOVEG_1);
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        if (parancs.equals("d")) {
            DesertWind.jelenetszam = 5;
            verzio = 1;
        }
        if (parancs.equals("é") || parancs.equals("ny") || parancs.equals("k")) {
            System.out.println(StringValues.NEGYEDIK_E_NY_K);
        }
        if (parancs.equals("vár")) {
            System.out.println(StringValues.NEGYEDIK_VAR);
            DesertWind.jelenetszam = 1;
        }
        if (parancs.equals("ker")) {
            System.out.println(StringValues.NEGYEDIK_KER);

        }
    }
}
