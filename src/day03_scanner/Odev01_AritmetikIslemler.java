package day03_scanner;

import java.util.Scanner;

public class Odev01_AritmetikIslemler {
    public static void main(String[] args) {
        //Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int x = scan.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int y = scan.nextInt();

        System.out.println("Girilen iki tam sayinin toplami=" + x + y);
        System.out.println("Girilen iki tam sayinin farki=" + (x - y));
        System.out.println("Girilen iki tam sayinin carpimi=" + x * y);
    }
}
