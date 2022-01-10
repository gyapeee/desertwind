import java.util.Scanner; // Az alap consol szöveges bekérő class a javaban
import java.util.ArrayList;

// Jelenet az absztraktja az osszes helyszinnek
abstract class Jelenet{
  int verzio;
  abstract void szoveg();
  abstract void parancs_Ertelmezo(String parancs);
}

class Hatodik extends Jelenet{
  void szoveg() {
    System.out.println("Megint itt  állsz, pedig nincs is még éjjel. Furcsa érzés nappal is látni ezt");
    System.out.println("a helyet. Az emberek bezárkóztak házaikba. Nem értik, mi történt. Mondjuk te se.");
    System.out.println("Déli irányban meglátod a házadat.");
  }
  void parancs_Ertelmezo(String parancs) {
    String p = parancs;
    switch (p) {
      case "é": {
        System.out.println("Elindulsz északnak!");
        DesertWind.jelenetszam = 5;
        verzio = 0;
        break;
      }
      case "d": {
        System.out.println("Elindulsz délnek!");
        //DesertWind.jelenetszam = 7;
        verzio = 0;
        break;
      }
    }
    if (p.equals("ny") || p.equals("k")){
      System.out.println("Utadat  állják a házak");
    }
  }
}

class Otodik extends Jelenet{
  int verzio = 0;
  void szoveg(){
    switch (verzio) {
      case (0):
        System.out.println("Az országút közepén  állsz. Észak felé vannak a szántóföldek, délre a falu. Nyugatra és keletre folytatódik a végtelen aszfalt.");
        if (!(DesertWind.targyak.contains("gyűrű"))){
          System.out.println("Valami fénylő tárgyat látsz tőled 10 méterre.");
        }
        break;
      case (1):
        System.out.println("Már jártál itt. Nincs sok időd tovább ténferegni otthon!!!");
        break;
    }
  }
  void parancs_Ertelmezo(String parancs){
    String p = parancs;
    switch (p){
      case "é":{
        System.out.println("Elindulsz északnak!");
        DesertWind.jelenetszam = 4;
        break;
      }
      case "k":{
        System.out.println("Elindulsz keletnek!");
        //DesertWind.jelenetszam = 8;
        break;
      }
      case "d":{
        System.out.println("Elindulsz délnek!");
        DesertWind.jelenetszam = 6;
        break;
      }
      case "n":{
        System.out.println("Elindulsz nyugatnak! Pár óra gyaloglás után inkább visszafordulsz!");
        break;
      }
      case "vár":{
        System.out.println("Hát ezt nem kellett volna. A katonák betőrik az ajtódat, hogy megnézzék, mért");
        System.out.println("nem jőssz már. Mikor meglátnak ott lustálkodni, talpra  állítanak és  ");
        System.out.println("kivonszolnak. A helyszínen agyonlőnek.");
        DesertWind.jelenetszam = 1;
        break;
      }
      case "ker":{
        if (DesertWind.targyak.contains("gyűrű")){
          System.out.println("Nem találsz semmi érdekeset!");
          break;
        }
        else{
          System.out.println("Egy gyűrűt találtál. Jobban megnézve észreveszed, hogy rá van vésve: For the glory of the FoD!! Fogalmad sincs hogy ez mit jelenthet, de azért elteszed.");
          DesertWind.targyak.add("gyűrű");
          break;
        }
      }
      default:{
        if (parancs.contains("használ")){
          if (parancs.contains("bögre")){
            if (DesertWind.targyak.contains("bögre")){
              System.out.println("Jobb hijján fejbe vered magad a bögréddel, ami így eltörik és lesz egy törött bögréd.");
              DesertWind.targyak.remove("bögre");
              DesertWind.targyak.add("törött bögre");
            }
            else{
              System.out.println("Nincs nálad ép bögre!");
            }
          }
        }
      }
    }
  }
}

class Negyedik extends Jelenet{
  Negyedik(){
    int verzio = 0;
  }
  void szoveg(){
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
  void parancs_Ertelmezo(String parancs){
    String p = parancs;
    if (p.equals("d")){
      DesertWind.jelenetszam = 5;
      verzio = 1;
    }
    if (p.equals("é") || p.equals("ny") || p.equals("k")){
      System.out.println("Végtelen szántóföld amerre csak látsz. Nem lenne jó erre menni.");
    }
    if (p.equals("vár")){
      System.out.println("Na ezt nem kellett volna. A hullák elkezdenek rothadni. A bűz olyan elviselhetetlen hogy öngyilkos leszel.");
      DesertWind.jelenetszam = 1;
    }
    if (p.equals("ker")){
      System.out.println("A halott katonáknál volt egy csomó fegyver, de te egyiket sem tudod használni.");

    }
  }
}

// 3
class Harmadik extends Jelenet{
  void szoveg(){
    System.out.println("A szerény kis kunyhód elött  állsz. Kétoldalt közrefog két");
    System.out.println("gépfegyveres katona, és finoman megkérnek, hogy húzd a beled");
    System.out.println("a földekre. Jobb lesz ha engedelmeskedsz nekik.");
    System.out.println("A szántóföld északra van.");
  }
  void parancs_Ertelmezo(String parancs){
    String p = parancs;
    // az or parancs || jelnek felel meg javaban
    if (p.equals("é")){
      DesertWind.jelenetszam = 4;
    }
    if (p.equals("k") || p.equals("d") || p.equals("ny")){
      System.out.println("Jobb lesz ha nem erre mész. A katonák ezt nem szívlelnék.");
    }
    if (p.equals("vár")){
      System.out.println("A katonák továbbtuszkolnak.");
      DesertWind.jelenetszam = 4;
    }
    if (p.equals("ker")){
      System.out.println("Most akarsz nekiállni keresni? Nem ajánlom.");
    }
  }
}

// 2
class Masodik extends Jelenet{
  int verzio = 0; // Minden helyszíni classnak több verzioja lehet, ezt a verziot az adott parancs értelmező modosíthatja!
  void szoveg(){
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
  void parancs_Ertelmezo(String parancs){
    String p = parancs;
    switch (p){
      case "é":{
        System.out.println("Elindulsz északnak!");
        DesertWind.jelenetszam = 3;
        verzio = 1;
        break;
      }
      case "k":{
        System.out.println("Elindulsz keletnek! Falnak ütközöl!");
        break;
      }
      case "d":{
        System.out.println("Elindulsz délnek! Falnak ütközöl!");
        break;
      }
      case "n":{
        System.out.println("Elindulsz nyugatnak! Falnak ütközöl!");
        break;
      }
      case "vár":{
        System.out.println("Hát ezt nem kellett volna. A katonák betőrik az ajtódat, hogy megnézzék, mért");
        System.out.println("nem jőssz már. Mikor meglátnak ott lustálkodni, talpra  állítanak és  ");
        System.out.println("kivonszolnak. A helyszínen agyonlőnek.");
        DesertWind.jelenetszam = 1;
        break;
      }
      case "ker":{
        if (DesertWind.targyak.contains("bögre")){
          System.out.println("Nem találsz semmi érdekeset!");
          break;
        }
        else{
          System.out.println("Nagy keresésed közben találtál egy bögrét");
          DesertWind.targyak.add("bögre");
          break;
        }
      }
      default:{
        if (parancs.contains("használ")){
          if (parancs.contains("bögre")){
            if (DesertWind.targyak.contains("bögre")){
              System.out.println("Jobb hijján fejbe vered magad a bögréddel, ami így eltörik és lesz egy törött bögréd.");
              DesertWind.targyak.remove("bögre");
              DesertWind.targyak.add("törött bögre");
            }
            else{
              System.out.println("Nincs nálad ép bögre!");
            }
          }
        }
      }
    }
  }
}



class UI{
  static String parancs;
  Masodik masodik = new Masodik();// AZ UI létrehozza a objecteket az összes helyszíni classból a nevezéktan Nagy kezdő betü a Class, belőle az Object kis kezdőbetü
  Harmadik harmadik = new Harmadik();
  Negyedik negyedik = new Negyedik();
  Otodik otodik = new Otodik();
  Hatodik hatodik = new Hatodik();

  void megjelenito(int jelenetszam){
    switch (jelenetszam){
      case 1: System.out.println("Sajnos meghaltál. Játékod itt véget ér."); break;
      case 2: this.masodik.szoveg(); break;
      case 3: this.harmadik.szoveg(); break;
      case 4: this.negyedik.szoveg(); break;
      case 5: this.otodik.szoveg(); break;
      case 6: this.hatodik.szoveg();break;
    }
  }

  void parancsertelmezo(int jelenetszam, String parancs){
    switch (jelenetszam){
      case 1: System.out.println("Sajnos meghaltál. Játékod itt véget ér."); break;
      case 2: this.masodik.parancs_Ertelmezo(parancs); break;
      case 3: this.harmadik.parancs_Ertelmezo(parancs); break;
      case 4: this.negyedik.parancs_Ertelmezo(parancs); break;
      case 5: this.otodik.parancs_Ertelmezo(parancs); break;
      case 6: this.hatodik.parancs_Ertelmezo(parancs);break;
    }
  }

  String bekero () {
    Scanner bekero = new Scanner(System.in);
    System.out.println("Mit teszel? \n");
    parancs = bekero.nextLine();
    if (parancs.contains("help")){
      System.out.println("Te most segítséget kértél a játék irányításában. Egyelőre sajnos nem lehet irányitani....");
    }
    if (parancs.contains("öngyilkos")){
      System.out.println("Ahogy kéred");
      DesertWind.jelenetszam = 1;
    }
    if (parancs.contains("tárgyak")){
      System.out.print("Nálad lévő tárgyak: ");
      for (String targy: DesertWind.targyak){
        System.out.print(targy + ", ");
      }
      System.out.println("");
    }
    return parancs;
  }
}

public class DesertWind {
  static int jelenetszam = 2 ; //Az eredeti programban is volt egy globális változó, Az első helyszín megegyezés szerint a 2-es. az 1-es hely a halál és a játék vége
  static String parancs = "";  //Parancs egy globális STRING változo, adni kell neki valami alap értéket különben NullPoint hibát tudunk generálni
  static ArrayList<String> targyak = new ArrayList<String>();

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
