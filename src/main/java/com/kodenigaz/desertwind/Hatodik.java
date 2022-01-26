package com.kodenigaz.desertwind;

class Hatodik extends Jelenet {
    void szoveg() {
        System.out.println("Megint itt  állsz, pedig nincs is még éjjel. Furcsa érzés nappal is látni ezt");
        System.out.println("a helyet. Az emberek bezárkóztak házaikba. Nem értik, mi történt. Mondjuk te se.");
        System.out.println("Déli irányban meglátod a házadat.");
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case "é": {
                System.out.println("Elindulsz északnak!");
                DesertWind.jelenetszam = 5;
                verzio = 0;
                break;
            }
            case "d": {
                System.out.println("Elindulsz délnek!");
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 7;
                verzio = 0;
                break;
            }
        }
        if (parancs.equals("ny") || parancs.equals("k")) {
            System.out.println("Utadat  állják a házak");
        }
    }
}
