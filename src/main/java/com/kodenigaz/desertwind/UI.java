package com.kodenigaz.desertwind;

import java.util.Scanner;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_1;
import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.TortenetSzoveg.*;

class UI {
    static String parancs;
    Masodik masodik = new Masodik();// AZ com.kodenigaz.desertwind.UI létrehozza a objecteket az összes helyszíni classból a nevezéktan Nagy kezdő betü a Class, belőle az Object kis kezdőbetü
    Harmadik harmadik = new Harmadik();
    Negyedik negyedik = new Negyedik();
    Otodik otodik = new Otodik();
    Hatodik hatodik = new Hatodik();

    void megjelenito(Jelenet.JelenetSzam jelenetszam) {
        switch (jelenetszam) {
            case JELENET_1:
                System.out.println(HALAL);
                break;
            case JELENET_2:
                this.masodik.szoveg();
                break;
            case JELENET_3:
                this.harmadik.szoveg();
                break;
            case JELENET_4:
                this.negyedik.szoveg();
                break;
            case JELENET_5:
                this.otodik.szoveg();
                break;
            case JELENET_6:
                this.hatodik.szoveg();
                break;
        }
    }

    void parancsertelmezo(Jelenet.JelenetSzam jelenetszam, String parancs) {
        switch (jelenetszam) {
            case JELENET_1:
                System.out.println(HALAL);
                break;
            case JELENET_2:
                this.masodik.parancs_Ertelmezo(parancs);
                break;
            case JELENET_3:
                this.harmadik.parancs_Ertelmezo(parancs);
                break;
            case JELENET_4:
                this.negyedik.parancs_Ertelmezo(parancs);
                break;
            case JELENET_5:
                this.otodik.parancs_Ertelmezo(parancs);
                break;
            case JELENET_6:
                this.hatodik.parancs_Ertelmezo(parancs);
                break;
        }
    }

    String bekero() {
        Scanner bekero = new Scanner(System.in);
        System.out.println(MIT_TESZEL + System.lineSeparator());
        parancs = bekero.nextLine();
        if (parancs.contains(HELP)) {
            System.out.println(HELP_NINCS_IRANYITAS);
        }
        if (parancs.contains(ONGYILKOS)) {
            DesertWind.jelenetszam = JELENET_1;
        }
        if (parancs.contains(TARGYAK)) {
            System.out.print(NALAD_LEVO_TARGYAK);
            for (String targy : DesertWind.targyak) {
                System.out.print(targy + ", ");
            }
            System.out.println();
        }
        return parancs;
    }
}
