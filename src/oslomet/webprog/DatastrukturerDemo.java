package oslomet.webprog;


//Oppgave 2 - sammenkjedet liste
//Lag et Java-prosjekt i IntelliJ og implementer din egen sammenkjedede liste. Detaljer for hvordan et Java-prosjekt kan lages og kjøres i IntelliJ kan du finne i denne videoen: https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.htmlLinks to an external site.
//
//Tips: Først trenger du en klasse som representerer en node (et element) i listen. Denne klassen inneholder dataverdien (f.eks. et heltall) og en peker til neste node dersom det er en enveis sammenkjedet liste. I tillegg trenger du en klasse som inneholder en peker til første node i listen og funksjoner for å jobbe mot listen. Typisk vil følgende metoder være nyttige å implementere: leggTilNode(int verdi), inneholderNode(int sokeVerdi), slettNode(int slettVerdi) og skrivUtListe().
//
//Ekstraoppgave 1
//Utvid den sammenkjedede listen fra oppgave 2 til å bli en sirkulær (en- eller to-veis) sammenkjedet liste.
//
//Ekstraoppgave 2
//Implementer en stack (Last In First Out - LIFO).
public class DatastrukturerDemo {
    public static void main(String[] args) {
        System.out.println("Ukeoppgaver - datastrukturer");

        // Sirkulær enveis liste
        System.out.println("Sirkulær enveis liste");

        MinSirkelListe minSirkelListe = new MinSirkelListe();

        minSirkelListe.leggTilNode(13);
        minSirkelListe.leggTilNode(7);
        minSirkelListe.leggTilNode(24);
        minSirkelListe.leggTilNode(1);
        minSirkelListe.leggTilNode(8);
        minSirkelListe.leggTilNode(37);
        minSirkelListe.leggTilNode(46);

        int tall = 8;

        if(minSirkelListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minSirkelListe.slettNode(tall);

        if(minSirkelListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minSirkelListe.skrivUt();

        // Stack
        System.out.println("Stakk!");

        MinStakk minStakk = new MinStakk();

        minStakk.push(11);
        minStakk.push(22);
        minStakk.push(33);
        minStakk.push(44);

        minStakk.skrivUt();

        System.out.println("Første tall i stakken er " + minStakk.se());

        minStakk.pop();
        minStakk.pop();

        minStakk.skrivUt();

        System.out.println("Første tall i stakken er " + minStakk.se());
    }
}
