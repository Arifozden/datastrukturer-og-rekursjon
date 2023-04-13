package oslomet.webprog;


//Rekursjon
//Oppgave 1
//Implementer fakultetsfunksjonen. Tips: Se slides fra forelesningen.
//
//Oppgave 2
//Implementer både iterativ (med en løkke) og rekursiv summasjon.
//
//Oppgave 3
//Flytt funksjonene inn i en Spring-Controller og lag en webapplikasjon hvor du kan bestemme argumentene til de to funksjonene du har implementert.
//
//Ekstraoppgave 1
//Implementer binærsøk i liste. Kjør programmet i debug-modus og step igjennom koden, for å bedre forstå hvordan den rekursive funksjonen fungerer.
//
//Ekstraoppgave 2
//Implementer Fibonacci-tall.
public class Rekursjon {
    public static void main(String[] args) {
        System.out.println("Ukeoppgaver - rekursjon");

        int tall = 5;

        int liste[] = {61, 87, 154, 170, 275, 426, 503, 509, 512, 612, 653, 677, 703 ,765, 897, 908};
        int nokkel = 275; //276;

        System.out.println("Summen (iterativ metode)) av alle tall fra " + tall + " til 1 er " + iterativSum(tall));
        System.out.println("Summen (rekursiv metode) av alle tall fra " + tall + " til 1 er " + sum(tall));
        System.out.println(tall + " fakultet er " + fakultet(tall));

        int pos = binsok(liste, nokkel, 0, liste.length-1);
        if(pos >= 0)
            System.out.println("Nøkkelen " + nokkel + " har posisjon " + pos);
        else
            System.out.println("Nøkkelen " + nokkel + " finnes ikke i arrayet");

        System.out.println("Tall nummer " + tall + " i Fibonacci-rekken er " + fibonacci(tall));
    }

    // oppgave 1
    public static int fakultet(int n)
    {
        if ( n == 0 )
            return 1;
        else
            return n * fakultet( n - 1 );
    }

    // oppgave 2
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int iterativSum(int n) {
        int sum = 0;
        if(n < 0) {
            return -1;
        }
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    // ekstraoppgave 1

    // foretar rekursiv binærsøking etter nøkkel i arrayen liste
    // returnerer indeksposisjon, eller -1 i tilfelle ikke funn
    public static int binsok(int[] liste, int nokkel, int venstre, int hoyre)
    {
        if ( venstre <= hoyre )
        {
            int mid = (venstre + hoyre) / 2;  //skal lete midt i lista
            if ( liste[ mid ] > nokkel ) //leter videre i venstre listehalvdel
                return binsok( liste, nokkel, venstre, mid - 1 );
            else  if ( liste[ mid ] < nokkel ) //leter videre i høyre listehalvdel
                return binsok( liste, nokkel, mid + 1, hoyre );
            else //funn!
                return mid;
        }
        else  //tom liste, nøkkel finnes ikke
            return -1;
    }

    // ekstraoppgave 2
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
