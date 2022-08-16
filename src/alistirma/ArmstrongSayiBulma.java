package alistirma;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        /*
        ARMSTRONG SAYI:
Bir sayının; ayrı ayrı her bir basamağının, o sayının basamak adeti kadar üssü alınarak toplanır.
Eğer bu toplam sonucu o sayıya eşit ise; sayı Armstrong Sayıdır.
Örnek1;  153 Sayısı. 3 basamaklıdır. Her bir basamağının küplerinin ( 3 basamaklı olduğu için ) toplamı
kendine eşit olduğu için ARMSTRONG sayıdır.
(1*1*1) + (5*5*5) + (3*3*3)  ===> 1 + 125 + 27 = 153
Örnek2: 1634 sayısı. 4 basamaklıdır. Her bir basamağının ayrı ayrı 4.kuvvetlerinin toplamı kendine eşittir.
1634 = (1*1*1*1) + (6*6*6*6)+ (3*3*3*3) + (4*4*4*4) ==> 1634 eder.

  Soru : 1 ile 99.999 sayıları dahil;  bu aralıkta olan sayılardan Armstrong sayiları yazdıran bir java kodu yazın.
         */

        int b1, b2, b3, b4, b5, sonuc;
        for (int i = 1; i <= 99999; i++) {
            if (i <= 9) {  // Tek basamaklı Sayı aralığı
                sonuc = i * i;
                if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
            } else if (i <= 99) {   // iki Basamaklı Sayı Aralığı
                b1 = (i / 10) % 10;
                b2 = i % 10;
                sonuc = (b1 * b1) + (b2 * b2);
                if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
            } else if (i <= 999) {  // 3 Basamaklı Sayı aralığı
                b1 = (i / 100) % 10;
                b2 = (i / 10) % 10;
                b3 = i % 10;
                sonuc = (b1 * b1 * b1) + (b2 * b2 * b2) + (b3 * b3 * b3);
                if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
            } else if (i <= 9999) {    // 4 Basamaklı Sayı Aralığı
                b1 = (i / 1000) % 10;
                b2 = (i / 100) % 10;
                b3 = (i / 10) % 10;
                b4 = i % 10;
                sonuc = (b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4);
                if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
            } else if (i <= 99999) {   // 5 Basamaklı Sayı aralığı
                b1 = (i / 10000) % 10;
                b2 = (i / 1000) % 10;
                b3 = (i / 100) % 10;
                b4 = (i / 10) % 10;
                b5 = i % 10;
                sonuc = (b1 * b1 * b1 * b1 * b1) + (b2 * b2 * b2 * b2 * b2) + (b3 * b3 * b3 * b3 * b3) + (b4 * b4 * b4 * b4 * b4) + (b5 * b5 * b5 * b5 * b5);
                if (sonuc == i) System.out.println(i + " Sayısı Armstrong Sayıdır");
            }
        }
    }
}
