package recap01;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {
         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz : ");
        int a = scan.nextInt();;
        System.out.println("Lutfen ikinci sayiyi giriniz : ");
        int b = scan.nextInt();
        System.out.println("Lutfen ucuncu sayiyi giriniz : ");
        int c = scan.nextInt();


        System.out.println("Sonuc : " + (((a*a)-(b*b))/(c*3)));




    }
}
