package com.kodenigaz.desertwind;

class Negyedik extends Jelenet {
    Negyedik() {
        int verzio = 0;
    }

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println("A Nap most már kezd feljönni a látóhatáron. Talán a napsugarak");
                System.out.println("elűzik ezt a fogcsikorgató hideget. Megkezded mindennapi");
                System.out.println("munkádat. Pár óra múlva furcsa zajra leszel figyelmes. Hiába");
                System.out.println("kapod fel a fejed, nem látsz semmit. A zaj erősődni kezd. Most");
                System.out.println("már felismered, ez egy motor hangja. Azaz kb. 200-é. Végre meg is");
                System.out.println("látod a motorosokat. Az út felöl jönnek, át a szántón. A katonák");
                System.out.println("fegyvereikhez kapnak, de nemsok ra mind holtan fekszenek. A ");
                System.out.println("motorosoknak furcsa fegyvereik vannak, és nagyon hatékonynak tűnnek.");
                System.out.println("A munkások szétrohannak minden égtáj felé. Egyedül te maradsz a helyeden");
                System.out.println("mozdulatlanul. A gépek leállnak, és egy magas, izmos alak (láthatóan a vezér)");
                System.out.println("lép elédbe. ");
                System.out.println("-Ki vagy te?");
                System.out.println("Ezt a kérdést még sohasem tették fel neked. Tanácstalanul  állsz.");
                System.out.println("-Mi van? Nincs neved?");
                System.out.println("-Név?-nézel furcsán a motorosra.");
                System.out.println("-Szóval nincs neved. Sorszámod?");
                System.out.println("Most valami derengeni kezd. A katonák mindig C-117-esnek szólítottak. Elmondod");
                System.out.println("ezt hát a vezérnek. Ő érdekesen néz rád, majd megszólal:");
                System.out.println("- Eredj a dolgodra.");
                System.out.println("Ezzel felpattannak motorjaikra és elhajtanak dél felé.");
                break;
            case (1):
                System.out.println("A mezőn  állsz. Körülötted halott katonák fekszenek. Az út dél felé van.");
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        if (parancs.equals("d")) {
            DesertWind.jelenetszam = 5;
            verzio = 1;
        }
        if (parancs.equals("é") || parancs.equals("ny") || parancs.equals("k")) {
            System.out.println("Végtelen szántóföld amerre csak látsz. Nem lenne jó erre menni.");
        }
        if (parancs.equals("vár")) {
            System.out.println("Na ezt nem kellett volna. A hullák elkezdenek rothadni. A bűz olyan elviselhetetlen hogy öngyilkos leszel.");
            DesertWind.jelenetszam = 1;
        }
        if (parancs.equals("ker")) {
            System.out.println("A halott katonáknál volt egy csomó fegyver, de te egyiket sem tudod használni.");

        }
    }
}
