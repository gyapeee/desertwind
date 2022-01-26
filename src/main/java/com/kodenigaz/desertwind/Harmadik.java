package com.kodenigaz.desertwind;

// 3
class Harmadik extends Jelenet {
    void szoveg() {
        System.out.println("A szerény kis kunyhód elött  állsz. Kétoldalt közrefog két");
        System.out.println("gépfegyveres katona, és finoman megkérnek, hogy húzd a beled");
        System.out.println("a földekre. Jobb lesz ha engedelmeskedsz nekik.");
        System.out.println("A szántóföld északra van.");
    }

    void parancs_Ertelmezo(String parancs) {
        // az or parancs || jelnek felel meg javaban
        if (parancs.equals("é")) {
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals("k") || parancs.equals("d") || parancs.equals("ny")) {
            System.out.println("Jobb lesz ha nem erre mész. A katonák ezt nem szívlelnék.");
        }
        if (parancs.equals("vár")) {
            System.out.println("A katonák továbbtuszkolnak.");
            DesertWind.jelenetszam = 4;
        }
        if (parancs.equals("ker")) {
            System.out.println("Most akarsz nekiállni keresni? Nem ajánlom.");
        }
    }
}
