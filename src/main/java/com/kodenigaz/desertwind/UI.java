package com.kodenigaz.desertwind;

import java.util.Scanner;

import static com.kodenigaz.desertwind.TortenetSzoveg.HALAL;

class UI {
    static String parancs;
    Masodik masodik = new Masodik();// AZ com.kodenigaz.desertwind.UI létrehozza a objecteket az összes helyszíni classból a nevezéktan Nagy kezdő betü a Class, belőle az Object kis kezdőbetü
    Harmadik harmadik = new Harmadik();
    Negyedik negyedik = new Negyedik();
    Otodik otodik = new Otodik();
    Hatodik hatodik = new Hatodik();

    void megjelenito(int jelenetszam) {
        switch (jelenetszam) {
            case 1:
                System.out.println(HALAL);
                break;
            case 2:
                this.masodik.szoveg();
                break;
            case 3:
                this.harmadik.szoveg();
                break;
            case 4:
                this.negyedik.szoveg();
                break;
            case 5:
                this.otodik.szoveg();
                break;
            case 6:
                this.hatodik.szoveg();
                break;
        }
    }

    void parancsertelmezo(int jelenetszam, String parancs) {
        switch (jelenetszam) {
            case 1:
                System.out.println(HALAL);
                break;
            case 2:
                this.masodik.parancs_Ertelmezo(parancs);
                break;
            case 3:
                this.harmadik.parancs_Ertelmezo(parancs);
                break;
            case 4:
                this.negyedik.parancs_Ertelmezo(parancs);
                break;
            case 5:
                this.otodik.parancs_Ertelmezo(parancs);
                break;
            case 6:
                this.hatodik.parancs_Ertelmezo(parancs);
                break;
        }
    }

    String bekero() {
        Scanner bekero = new Scanner(System.in);
        System.out.println("Mit teszel? \n");
        parancs = bekero.nextLine();
        if (parancs.contains("help")) {
            System.out.println("Te most segítséget kértél a játék irányításában. Egyelőre sajnos nem lehet irányitani....");
        }
        if (parancs.contains("öngyilkos")) {
            System.out.println("Ahogy kéred");
            DesertWind.jelenetszam = 1;
        }
        if (parancs.contains("tárgyak")) {
            System.out.print("Nálad lévő tárgyak: ");
            for (String targy : DesertWind.targyak) {
                System.out.print(targy + ", ");
            }
            System.out.println();
        }
        return parancs;
    }
}
