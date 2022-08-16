package alistirma;

import java.util.Scanner;

public class Work01_IfStatements {
    public static void main(String[] args) {
        // soru-1) Kullanicidan bir tam sayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift tamsayi girdiniz.");
        }else {
            System.out.println("Tek tamsayi girdiniz.");
        }
    }
}
