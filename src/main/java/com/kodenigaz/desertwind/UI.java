package com.kodenigaz.desertwind;

import com.kodenigaz.desertwind.scene.Elso;
import com.kodenigaz.desertwind.scene.Jelenet;
import com.kodenigaz.desertwind.scene.Masodik;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.kodenigaz.desertwind.story.Parancs.*;
import static com.kodenigaz.desertwind.story.TortenetSzoveg.*;

@Service
public class UI {
    static String beolvasottParancs;
    static Jelenet aktualisJelenet = new Masodik();
    //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
    static String parancs = "";
    // TODO is it possible that User should have targyak?
    private static List<String> targyak = new ArrayList<>();

    public static void setJelenet(Jelenet aktualisJelenet) {
        UI.aktualisJelenet = aktualisJelenet;
    }

    public static List<String> getTargyak() {
        return targyak;
    }

    static boolean isAktualisJelenetHalal() {
        return aktualisJelenet.getClass().equals(new Elso().getClass());
    }

    public String szoveg() {
        return aktualisJelenet.szoveg();
    }

    public void parancsertelmezo( String parancs) {
        aktualisJelenet.parancs_Ertelmezo(parancs);
    }

    String bekero() {
        Scanner bekero = new Scanner(System.in);
        System.out.println(MIT_TESZEL + System.lineSeparator());
        beolvasottParancs = bekero.nextLine();
        if (beolvasottParancs.contains(ONGYILKOS)) {
            setJelenet(new Elso());
        }
        return beolvasottParancs;
    }
}
