package day03_scanner;

import java.util.Scanner;

public class C005_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip
        bu sayilarin carpimini yazdirin
         */

        //1. Adim
        Scanner scan = new Scanner(System.in);

        //2. Adim
        System.out.println("Lutfen ilk sayiyi giriniz");

        //3.Adim
        double sayi1 = scan.nextDouble();

        //2. sayi için 2. ve 3. adimlari tekrarlariz

        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayilarin carpimi"+sayi1*sayi2);


    }
}
