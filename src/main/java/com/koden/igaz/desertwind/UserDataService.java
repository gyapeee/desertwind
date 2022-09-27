package com.koden.igaz.desertwind;

import com.koden.igaz.desertwind.dto.UserDTO;
import com.koden.igaz.desertwind.scene.Elso;
import com.koden.igaz.desertwind.scene.Jelenet;
import com.koden.igaz.desertwind.story.Parancs;
import com.koden.igaz.desertwind.story.TortenetSzoveg;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class UserDataService {
    static UserDTO user = new UserDTO();
    static String beolvasottParancs;
    static Jelenet aktualisJelenet = null;
    //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
    static String parancs = "";
    // TODO is it possible that User should have targyak?
    private static List<String> targyak = new ArrayList<>();

    public static void setJelenet(Jelenet aktualisJelenet) {
        UserDataService.aktualisJelenet = aktualisJelenet;
        UserDataService.user.aktualisJelenetName = aktualisJelenet.getClass().getName();
    }

    public static List<String> getTargyak() {
        return targyak;
    }

    public static void newAktualisJelenet() {
        try {
            Class c = Class.forName(UserDataService.user.aktualisJelenetName);
            try {
                Jelenet masodik = (Jelenet) c.newInstance();
                System.out.println("-------MASODIK SZOVEG--------");
                System.out.println(masodik.szoveg());
                System.out.println("-------MASODIK SZOVEG VEGE--------");
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setTargyak(List<String> targyak) {
        targyak.addAll(targyak);
    }

    public static void removeTargy(String targy) {
        targyak.remove(targy);
    }

    static boolean isAktualisJelenetHalal() {
        return aktualisJelenet.getClass().equals(new Elso().getClass());
    }

    public String szoveg() {
        return aktualisJelenet.szoveg();
    }

    public void parancsertelmezo(String parancs) {
        // get data from DB dbData
        // aktualisJelenet = dbData.aktualis

        aktualisJelenet.parancs_Ertelmezo(parancs);
    }

    String bekero() {
        Scanner bekero = new Scanner(System.in);
        System.out.println(TortenetSzoveg.MIT_TESZEL + System.lineSeparator());
        beolvasottParancs = bekero.nextLine();
        if (beolvasottParancs.contains(Parancs.ONGYILKOS)) {
            setJelenet(new Elso());
        }
        return beolvasottParancs;
    }
}
