package com.kodenigaz.desertwind;

import java.util.Scanner;

import static com.kodenigaz.desertwind.Parancs.*;
import static com.kodenigaz.desertwind.TortenetSzoveg.*;

class UI {
    static String beolvasottParancs;

    void megjelenito(Jelenet aktualisJelenet) {
        aktualisJelenet.szoveg();
    }

    void parancsertelmezo(Jelenet aktualisJelenet, String parancs) {
        aktualisJelenet.parancs_Ertelmezo(parancs);
    }

    String bekero() {
        Scanner bekero = new Scanner(System.in);
        System.out.println(MIT_TESZEL + System.lineSeparator());
        beolvasottParancs = bekero.nextLine();
        if (beolvasottParancs.contains(HELP)) {
            System.out.println(HELP_NINCS_IRANYITAS);
        }
        if (beolvasottParancs.contains(ONGYILKOS)) {
            DesertWind.setJelenet(new Elso());
        }
        if (beolvasottParancs.contains(TARGYAK)) {
            System.out.print(NALAD_LEVO_TARGYAK);
            for (String targy : DesertWind.targyak) {
                System.out.print(targy + ", ");
            }
            System.out.println();
        }
        return beolvasottParancs;
    }
}
