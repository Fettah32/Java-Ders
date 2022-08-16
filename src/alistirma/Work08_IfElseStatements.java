package alistirma;

import java.util.Scanner;

public class Work08_IfElseStatements {
    public static void main(String[] args) {

        /*
         soru-4) Kullanicidan bir ucgenin kenar uzunluklarini alin
         eger uc kenar uzunlugu birbirine esitse ekrana"Eskenar ucgen" yazdirin.
         Diger durumlarda ekrana "Eskenar degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin ilk kenar uzunlugunu giriniz : ");
        int ilkKenar = scan.nextInt();
        System.out.println("Ucgenin ikinci kenar uzunlugunu giriniz : ");
        int ikinciKenar = scan.nextInt();
        System.out.println("Ucgenin ucuncu kenar uzunlugunu giriniz : ");
        int ucuncuKenar = scan.nextInt();

        if ((ilkKenar == ikinciKenar) && (ilkKenar == ucuncuKenar)) {
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }

    }
}
