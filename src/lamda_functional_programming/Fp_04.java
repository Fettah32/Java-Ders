package lamda_functional_programming;

import java.util.stream.IntStream;

public class Fp_04 {

    public static void main(String[] args) {

        System.out.println("getYedidenYuzeToplam() = " + getYedidenYuzeToplam());

        System.out.println("getYedidenYuzeToplam02() = " + getYedidenYuzeToplam02());

        System.out.println("ikidenYediyeKadarSayilarinCarpimi() = " + ikidenYediyeKadarSayilarinCarpimi());

        System.out.println("faktoriyelHesapla(5) = " + faktoriyelHesapla(12));

        System.out.println("verilenIkiSayiAraindakiCiftSayilarinToplami = " + verilenIkiSayiAraindakiCiftSayilarinToplami(11, 5));

        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(23, 32));

    }

    // 1) 7'den 100'e kadar integer degerlerin toplamini bulan bir method olusturun.
    // 1.Yol

    public static int getYedidenYuzeToplam() {

        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();
    }

    public static int getYedidenYuzeToplam02() {

        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }

    // 2) 2'den 11'e kadar integer degerlerin carpimini bulan bir method olusturun.

    public static int ikidenYediyeKadarSayilarinCarpimi() {

        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

    // 3) Verilen bir sayinin faktoriyelini hesaplayan bir method olusturun.(5 factorial = 1*2*3*4*5 ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesapla(int x) {

        if (x > 0 && x < 13) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk bir deger giriniz.");

        return 0;
    }

    // 4) Verilen iki sayi arasindaki cift sayilarin toplamini bulan bir method olusturun.

    public static int verilenIkiSayiAraindakiCiftSayilarinToplami(int x, int y) {

        int z = 0;

        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).sum();
    }

    // 5) Verilen iki sayi arasindaki tum sayilarin rakamlarinin toplamini hesaplayan bir method olusturun.
    // 23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +  2+8  +  2+9  +  3+0  +  3+1  +  3+2  + ==> 68

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y) {

        int z = 0;

        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x, y).map(Utils::rakamlarToplaminiAl).sum();
    }

}
