package alistirma;

import java.util.Scanner;

public class Work04_IfStatements {
    public static void main(String[] args) {

        /*
         Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve kare olup olmadigini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenar uzunlugu : ");
        int birinciKenar = scan.nextInt();
        System.out.print("2. kenar uzunlugu : ");
        int ikinciKenar = scan.nextInt();

        if (birinciKenar == ikinciKenar) {
            System.out.println("Dikdortgen KAREdir");
        }else {
            System.out.println("Dikdortgen kare degildir");
        }

    }
}
