package alistirma;

import java.util.Scanner;

public class Work05_IfStatements {
    public static void main(String[] args) {

        /*
         Soru 5-) Kullanicidan bir gun alin eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin.
         "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin.
         "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz : ");
        String gunIsmi = scan.nextLine().toLowerCase();

        if (gunIsmi.equals("cuma")) {
            System.out.println(gunIsmi + " Muslumanlar icin kutsal gun");
        }else if (gunIsmi.equals("cumartesi")) {
            System.out.println(gunIsmi + " Yahudiler icin kutsal gun");
        }else if (gunIsmi.equals("pazar")){
            System.out.println(gunIsmi + " Hristiyanlar icin kutsal gun");
        }else {
            System.out.println(gunIsmi + " Kutsal bir gun degldir");
        }
    }
}
