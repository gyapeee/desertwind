package com.kodenigaz.desertwind;

import com.kodenigaz.desertwind.scene.Elso;
import com.kodenigaz.desertwind.scene.Jelenet;
import com.kodenigaz.desertwind.scene.Masodik;
import com.kodenigaz.desertwind.story.TortenetSzoveg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DesertWind {
    private static Jelenet aktualisJelenet = new Masodik();
    //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
    private static String parancs = "";
    // TODO is it possible that User should have targyak?
    private static List<String> targyak = new ArrayList<>();
    private static final UI felulet = new UI(); //Felulet object fogja megjeleniteni a megfelelő függvényeivel a helyszínt, bekérni a parancsot és értelmezni a parancsot


    public static void main(String[] args) {
        SpringApplication.run(DesertWind.class, args);
        System.out.println(TortenetSzoveg.KEZDODIK); //Egyszer majd lesz rendes intro ... :)
        do {
            felulet.megjelenito(aktualisJelenet);  // Megjeleníti az adott helyszín alap szövegét, itt bele kell még kódolni, hogy létezhet olyan hogy változik a helyszín leírása amikor visszamegyünk
            if (!isAktualisJelenetHalal(aktualisJelenet)) {
                parancs = felulet.bekero();
            } // Ha nem haltunk meg, kér új parancsot
            felulet.parancsertelmezo(aktualisJelenet, parancs); // A kapott parancsot értelmezi az adott helyszínen és változatja, jelen esetben csak a jelenetszamot mint globalis változót, egy nap lesz set get, de most egyelőre jo igy is
        } while (!isAktualisJelenetHalal(aktualisJelenet));
    }

    public static void setJelenet(Jelenet aktualisJelenet) {
        DesertWind.aktualisJelenet = aktualisJelenet;
    }

    public static List<String> getTargyak() {
        return targyak;
    }


    private static boolean isAktualisJelenetHalal(Jelenet aktualisJelenet) {
        return aktualisJelenet.getClass().equals(new Elso().getClass());
    }
}
