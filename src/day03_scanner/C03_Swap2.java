package day03_scanner;

import java.util.Scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swapdan önce sayi1 : " + sayi1 + ", " + "sayi2 : " + sayi2);

        sayi1 = sayi1 + sayi2;//30
        sayi2 = sayi1 - sayi2;//10
        sayi1 = sayi1 - sayi2;//20
        System.out.println("Swapdan sonra sayi1 :" + sayi1 + ", " + "sayi2 :" + sayi2);


    }
}
