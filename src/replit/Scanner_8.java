package replit;

import java.util.Scanner;

public class Scanner_8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

        Örnek Çıktı:

        Verilen tamsayının rakamları toplamı 10'dur.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Uc basamakli bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        int basamaklarToplami = 0;
        int birlerBasamagi = 0;



        while (sayi > 0) {
            birlerBasamagi = sayi %10;
            basamaklarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("Verilen tamsayının rakamları toplamı " + basamaklarToplami + " dur.");


    }
}
