package com.kodenigaz.desertwind;

import java.util.Scanner; // Az alap consol szöveges bekérő class a javaban
import java.util.ArrayList;


public class DesertWind {
  static int jelenetszam = 2 ; //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
  static String parancs = "";  //Parancs egy globális STRING változo, adni kell neki valami alap értéket különben NullPoint hibát tudunk generálni
  static ArrayList<String> targyak = new ArrayList<>();

  public static void main(String[] args) {
    UI Felulet = new UI(); //Felulet object fogja megjeleniteni a megfelelő függvényeivel a helyszínt, bekérni a parancsot és értelmezni a parancsot
    System.out.println("Elkezdődik a kaland, ez az első helyszín..."); //Egyszer majd lesz rendes intro ... :)
    do{
      Felulet.megjelenito(jelenetszam);  // Megjeleníti az adott helyszín alap szövegét, itt bele kell még kódolni, hogy létezhet olyan hogy változik a helyszín leírása amikor visszamegyünk
      if (jelenetszam!=1) {parancs = Felulet.bekero();} // Ha nem haltunk meg, kér új parancsot
      Felulet.parancsertelmezo(jelenetszam, parancs); // A kapott parancsot értelmezi az adott helyszínen és változatja, jelen esetben csak a jelenetszamot mint globalis változót, egy nap lesz set get, de most egyelőre jo igy is
    }while (jelenetszam!=1);
  }
}