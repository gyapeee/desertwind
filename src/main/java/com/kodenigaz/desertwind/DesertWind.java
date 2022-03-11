package com.kodenigaz.desertwind;

import com.kodenigaz.desertwind.Jelenet.JelenetSzam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_1;
import static com.kodenigaz.desertwind.Jelenet.JelenetSzam.JELENET_2;


@SpringBootApplication
public class DesertWind {
    static JelenetSzam jelenetszam = JELENET_2;
    //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
    static String parancs = "";
    //Parancs egy globális STRING változo, adni kell neki valami alap értéket különben NullPoint hibát tudunk generálni
    static ArrayList<String> targyak = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(DesertWind.class, args);
        UI Felulet = new UI(); //Felulet object fogja megjeleniteni a megfelelő függvényeivel a helyszínt, bekérni a parancsot és értelmezni a parancsot
        System.out.println(TortenetSzoveg.KEZDODIK); //Egyszer majd lesz rendes intro ... :)
        do {
            Felulet.megjelenito(jelenetszam);  // Megjeleníti az adott helyszín alap szövegét, itt bele kell még kódolni, hogy létezhet olyan hogy változik a helyszín leírása amikor visszamegyünk
            if (jelenetszam != JELENET_1) {
                parancs = Felulet.bekero();
            } // Ha nem haltunk meg, kér új parancsot
            Felulet.parancsertelmezo(jelenetszam, parancs); // A kapott parancsot értelmezi az adott helyszínen és változatja, jelen esetben csak a jelenetszamot mint globalis változót, egy nap lesz set get, de most egyelőre jo igy is
        } while (jelenetszam != JELENET_1);
    }
}
