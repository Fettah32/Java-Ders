package replit;

import java.util.Scanner;

public class Scanner_6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Float bir deger giriniz : ");
        float sayi = scan.nextFloat();
        sayi = (short)sayi;
        System.out.println(sayi);
    }
}
