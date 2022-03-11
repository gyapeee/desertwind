package com.kodenigaz.desertwind;

class Hatodik extends Jelenet {
    void szoveg() {
        System.out.println(TortenetSzoveg.HATODIK_SZOVEG);
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case Irany.ESZAK: {
                System.out.println(TortenetSzoveg.ESZAK);
                DesertWind.jelenetszam = 5;
                verzio = 0;
                break;
            }
            case Irany.DEL: {
                System.out.println(TortenetSzoveg.DEL);
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 7;
                verzio = 0;
                break;
            }
        }
        if (parancs.equals(Irany.NYUGAT) || parancs.equals(Irany.KELET)) {
            System.out.println(TortenetSzoveg.HATODIK_K_NY);
        }
    }
}
