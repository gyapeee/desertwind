package com.kodenigaz.desertwind;

// 2
class Masodik extends Jelenet {
    int verzio = 0; // Minden helyszíni classnak több verzioja lehet, ezt a verziot az adott parancs értelmező modosíthatja!

    void szoveg() {
        switch (verzio) {
            case (0):
                System.out.println("Álmosan kelsz fel. A Nap még fel se jőtt az égre, de neked");
                System.out.println("már dolgoznpd kell. Zörgetnek az ajtódon. Sietned kell, vagy újra");
                System.out.println("fogolytáborba jutsz, és  azt biztosan nem éled túl. 30 évet robotoltál");
                System.out.println("már az uralkodó szolgálatában, de érzed, erőd elhagyott. Ez pedig azt");
                System.out.println("jelenti, nemsokára megválnak tőled.");
                System.out.println("De most nincs időd erre. Menned kell a munkára.");
                System.out.println("Az ajtó észak felé van.");
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
                DesertWind.jelenetszam = 3;
                verzio = 1;
                break;
            }
            case "k": {
                System.out.println("Elindulsz keletnek! Falnak ütközöl!");
                break;
            }
            case "d": {
                System.out.println("Elindulsz délnek! Falnak ütközöl!");
                break;
            }
            case "n": {
                System.out.println("Elindulsz nyugatnak! Falnak ütközöl!");
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
                if (DesertWind.targyak.contains("bögre")) {
                    System.out.println("Nem találsz semmi érdekeset!");
                    break;
                } else {
                    System.out.println("Nagy keresésed közben találtál egy bögrét");
                    DesertWind.targyak.add("bögre");
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
