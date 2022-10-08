package com.koden.igaz.desertwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesertWind {
//    private static final UI felulet = new UI(); //Felulet object fogja megjeleniteni a megfelelő függvényeivel a helyszínt, bekérni a parancsot és értelmezni a parancsot


    public static void main(String[] args) {
        SpringApplication.run(DesertWind.class, args);

//        System.out.println(TortenetSzoveg.KEZDODIK); //Egyszer majd lesz rendes intro ... :)
//        do {
//            felulet.megjelenito(UI.aktualisJelenet);  // Megjeleníti az adott helyszín alap szövegét, itt bele kell még kódolni, hogy létezhet olyan hogy változik a helyszín leírása amikor visszamegyünk
//            if (!UI.isAktualisJelenetHalal(UI.aktualisJelenet)) {
//                UI.parancs = felulet.bekero();
//            } // Ha nem haltunk meg, kér új parancsot
//            felulet.parancsertelmezo(UI.aktualisJelenet, UI.parancs); // A kapott parancsot értelmezi az adott helyszínen és változatja, jelen esetben csak a jelenetszamot mint globalis változót, egy nap lesz set get, de most egyelőre jo igy is
//        } while (!UI.isAktualisJelenetHalal(UI.aktualisJelenet));
    }


}
