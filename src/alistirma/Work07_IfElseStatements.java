package alistirma;

import java.util.Scanner;

public class Work07_IfElseStatements {
    public static void main(String[] args) {
        /*
         Soru 3-) Kullaniciya yasini sorun, eger yasi 65'den kucukse "emekli olamazsin, calismalisin),
         65'e esit veya buyukse "emekli olabilirsin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        if  (!(0<= yas && yas < 120)) {
            System.out.println("Lutfen gecerli bir yas yazin");
        }else if (yas < 65) {
        System.out.println("Emekli olamazsin, " + (65-yas) + " yil daha calismalisin." );
        } else if (yas >= 65){
        System.out.println("Emekli olabilirsin");
        }
    }
}
