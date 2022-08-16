package replit;

import java.util.Scanner;

public class Scanner_2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

        Ornek Cikti :

        Alan: 9

        Cevre: 12
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz : ");
        int kareKenarUzunlugu = scan.nextInt();
        int kareAlan = kareKenarUzunlugu * kareKenarUzunlugu;
        int kareCevre = 4*kareKenarUzunlugu;
        System.out.println("Alan: " + kareAlan);
        System.out.println("Cevre: " + kareCevre);
    }
}
