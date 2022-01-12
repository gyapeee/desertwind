package com.kodenigaz.desertwind;

class Otodik extends Jelenet {
    int verzio = 0;

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println("Az országút közepén  állsz. Észak felé vannak a szántóföldek, délre a falu. Nyugatra és keletre folytatódik a végtelen aszfalt.");
                if (!(DesertWind.targyak.contains("gyűrű"))) {
                    System.out.println("Valami fénylő tárgyat látsz tőled 10 méterre.");
                }
                break;
            case (1):
                System.out.println("Már jártál itt. Nincs sok időd tovább ténferegni otthon!!!");
                break;
        }
    }

    void parancs_Ertelmezo(String parancs) {
        switch (parancs) {
            case "é": {
                System.out.println("Elindulsz északnak!");
                DesertWind.jelenetszam = 4;
                break;
            }
            case "k": {
                System.out.println("Elindulsz keletnek!");
                //com.kodenigaz.desertwind.DesertWind.jelenetszam = 8;
                break;
            }
            case "d": {
                System.out.println("Elindulsz délnek!");
                DesertWind.jelenetszam = 6;
                break;
            }
            case "n": {
                System.out.println("Elindulsz nyugatnak! Pár óra gyaloglás után inkább visszafordulsz!");
                break;
            }
            case "vár": {
                System.out.println("Hát ezt nem kellett volna. A katonák betőrik az ajtódat, hogy megnézzék, mért");
                System.out.println("nem jőssz már. Mikor meglátnak ott lustálkodni, talpra  állítanak és  ");
                System.out.println("kivonszolnak. A helyszínen agyonlőnek.");
                DesertWind.jelenetszam = 1;
                break;
            }
            case "ker": {
                if (DesertWind.targyak.contains("gyűrű")) {
                    System.out.println("Nem találsz semmi érdekeset!");
                    break;
                } else {
                    System.out.println("Egy gyűrűt találtál. Jobban megnézve észreveszed, hogy rá van vésve: For the glory of the FoD!! Fogalmad sincs hogy ez mit jelenthet, de azért elteszed.");
                    DesertWind.targyak.add("gyűrű");
                    break;
                }
            }
            default: {
                if (parancs.contains("használ")) {
                    if (parancs.contains("bögre")) {
                        if (DesertWind.targyak.contains("bögre")) {
                            System.out.println("Jobb hijján fejbe vered magad a bögréddel, ami így eltörik és lesz egy törött bögréd.");
                            DesertWind.targyak.remove("bögre");
                            DesertWind.targyak.add("törött bögre");
                        } else {
                            System.out.println("Nincs nálad ép bögre!");
                        }
                    }
                }
            }
        }
    }
}
