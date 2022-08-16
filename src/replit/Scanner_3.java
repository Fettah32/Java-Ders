package replit;

import java.util.Scanner;

public class Scanner_3 {
    public static void main(String[] args) {

         /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

    Örnek Çıktı:

    Alan: 32

    Çevre: 24
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortegenin uzun kenar uzunlugunu giriniz : ");
        int dikdortgenUzunKenar = scan.nextInt();
        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz : ");
        int dikdortgenKisaKenar = scan.nextInt();

        int dikdorgenAlan = dikdortgenKisaKenar * dikdortgenUzunKenar;
        int dikdorgenCevre = 2*dikdortgenKisaKenar + 2*dikdortgenUzunKenar;
        System.out.println("Alan : " + dikdorgenAlan);
        System.out.println("Cevre : " + dikdorgenCevre);

    }
}
