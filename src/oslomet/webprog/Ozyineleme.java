package oslomet.webprog;

public class Ozyineleme {
    public static void main(String[] args) {
        System.out.println("Ozyineleme-Rekursjon");

        merhabaYaz(5);
    }

    public static void merhabaYaz(int tamSayi){
        if(tamSayi>0){
            System.out.println("Merhaba");
            merhabaYaz(tamSayi-1);
        }
        System.out.println("Hi");
    }
}
